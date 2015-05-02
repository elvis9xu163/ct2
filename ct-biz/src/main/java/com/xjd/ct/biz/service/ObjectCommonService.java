package com.xjd.ct.biz.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.biz.bo.ObjectCommentBo;
import com.xjd.ct.dal.dao.ObjectDao;
import com.xjd.ct.dal.dao.SequenceDao;
import com.xjd.ct.dal.dao.UserDao;
import com.xjd.ct.dal.dos.ObjectCommentDo;
import com.xjd.ct.dal.dos.ObjectDo;
import com.xjd.ct.dal.dos.ObjectFavorDo;
import com.xjd.ct.dal.dos.ObjectLikeDo;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.enums.BoolEnum;
import com.xjd.ct.utl.enums.YesNoEnum;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * <pre>
 * 业务对象共有服务
 * 
 * 投票、点赞、评论、收藏
 * </pre>
 * @author elvis.xu
 * @since 2015-4-30 下午6:03:49
 */
@Service
public class ObjectCommonService {

	@Autowired
	ObjectDao objectDao;
	@Autowired
	UserDao userDao;
	@Autowired
	SequenceDao sequenceDao;

	public void likeYes(Long userId, Long objectId, Byte like) {
		if (BoolEnum.valueOfCode(like) == BoolEnum.TRUE) {
			addLike(userId, objectId, YesNoEnum.YES.getCode());
		} else {
			removeLike(userId, objectId, YesNoEnum.YES.getCode());
		}
	}

	@Transactional
	public void addLike(Long userId, Long objectId, Byte yesOrNo) {
		// 先判断
		ObjectDo objectDo = objectDao.selectObjectByObjectId(objectId);
		if (objectDo == null) {
			throw new BusinessException(RespCode.RESP_0201);
		}

		if (YesNoEnum.valueOfCode(yesOrNo) == YesNoEnum.YES && !BoolEnum.parseCode(objectDo.getLikeYesFlag())) {
			// 不支持点赞
			throw new BusinessException(RespCode.RESP_0203);
		} else if (YesNoEnum.valueOfCode(yesOrNo) == YesNoEnum.NO && !BoolEnum.parseCode(objectDo.getLikeNoFlag())) {
			// 不支持鄙视
			throw new BusinessException(RespCode.RESP_0204);
		}

		ObjectLikeDo objectLikeDo = objectDao.selectObjectLikeByObjectIdAndUserId(objectDo.getObjectId(), userId);
		if (objectLikeDo != null) {
			throw new BusinessException(RespCode.RESP_0202);
		}

		// 插入评论
		objectLikeDo = new ObjectLikeDo();
		objectLikeDo.setObjectId(objectDo.getObjectId());
		objectLikeDo.setUserId(userId);
		objectLikeDo.setYesNo(yesOrNo);
		Long now = DateUtil.nowInMilliseconds();
		objectLikeDo.setAddTime(now);
		objectLikeDo.setUpdTime(now);
		objectDao.insertObjectLike(objectLikeDo);

		// 点赞记数
		if (YesNoEnum.valueOfCode(yesOrNo) == YesNoEnum.YES) {
			objectDao.increaseLikeYesCount(objectDo.getObjectId());

		} else if (YesNoEnum.valueOfCode(yesOrNo) == YesNoEnum.NO) {
			objectDao.increaseLikeNoCount(objectDo.getObjectId());
		}
	}

	@Transactional
	public void removeLike(Long userId, Long objectId, Byte yesOrNo) {
		// 先判断
		ObjectDo objectDo = objectDao.selectObjectByObjectId(objectId);
		if (objectDo == null) {
			throw new BusinessException(RespCode.RESP_0201);
		}

		ObjectLikeDo objectLikeDo = objectDao.selectObjectLikeByObjectIdAndUserId(objectDo.getObjectId(), userId);
		if (objectLikeDo == null) {
			throw new BusinessException(RespCode.RESP_0205);
		}

		if (!objectLikeDo.getYesNo().equals(yesOrNo)) {
			throw new BusinessException(RespCode.RESP_0206);
		}

		// 删除
		objectDao.deleteObjectLikeByObjectIdAndUserId(objectDo.getObjectId(), userId);

		// 点赞记数
		if (YesNoEnum.valueOfCode(yesOrNo) == YesNoEnum.YES) {
			objectDao.decreaseLikeYesCount(objectDo.getObjectId());

		} else if (YesNoEnum.valueOfCode(yesOrNo) == YesNoEnum.NO) {
			objectDao.decreaseLikeNoCount(objectDo.getObjectId());
		}
	}

	public void favor(Long userId, Long objectId, Byte favor) {
		if (BoolEnum.valueOfCode(favor) == BoolEnum.TRUE) {
			addFavor(userId, objectId);
		} else {
			removeFavor(userId, objectId);
		}
	}

	/**
	 * @param userId
	 * @param objectId
	 */
	@Transactional
	public void addFavor(Long userId, Long objectId) {
		// 先判断
		ObjectDo objectDo = objectDao.selectObjectByObjectId(objectId);
		if (objectDo == null) {
			throw new BusinessException(RespCode.RESP_0201);
		}

		if (!BoolEnum.parseCode(objectDo.getFavorFlag())) {
			throw new BusinessException(RespCode.RESP_0208);
		}

		ObjectFavorDo objectFavorDo = objectDao.selectObjectFavorByObjectIdAndUserId(objectId, userId);
		if (objectFavorDo != null) {
			throw new BusinessException(RespCode.RESP_0207);
		}

		// 收藏
		objectFavorDo = new ObjectFavorDo();
		objectFavorDo.setObjectId(objectDo.getObjectId());
		objectFavorDo.setUserId(userId);
		objectFavorDo.setAddTime(DateUtil.nowInMilliseconds());
		objectDao.insertObjectFavor(objectFavorDo);

		// 记数
		objectDao.increaseFavorCount(objectDo.getObjectId());
		userDao.increaseFavorCount(userId);
	}

	/**
	 * @param userId
	 * @param objectId
	 */
	@Transactional
	public void removeFavor(Long userId, Long objectId) {
		// 先判断
		ObjectDo objectDo = objectDao.selectObjectByObjectId(objectId);
		if (objectDo == null) {
			throw new BusinessException(RespCode.RESP_0201);
		}

		ObjectFavorDo objectFavorDo = objectDao.selectObjectFavorByObjectIdAndUserId(objectId, userId);
		if (objectFavorDo == null) {
			throw new BusinessException(RespCode.RESP_0209);
		}

		// 删除
		objectDao.deleteObjectFavorByObjectIdAndUserId(objectId, userId);

		// 记数
		objectDao.decreaseFavorCount(objectId);
		userDao.decreaseFavorCount(userId);
	}

	public ObjectCommentBo addComment(Long userId, Long objectId, String comment, Long toCommentId) {
		// 先判断对象
		ObjectDo objectDo = objectDao.selectObjectByObjectId(objectId);
		if (objectDo == null) {
			throw new BusinessException(RespCode.RESP_0201);
		}
		if (!BoolEnum.parseCode(objectDo.getCommentFlag())) {
			throw new BusinessException(RespCode.RESP_0210);
		}

		// 判断目标评论
		if (toCommentId != null) {
			ObjectCommentDo toCommentDo = objectDao.selectObjectCommentByCommentId(toCommentId);
			if (toCommentDo == null) {
				throw new BusinessException(RespCode.RESP_0211);
			}
			if (!objectId.equals(toCommentDo.getObjectId())) {
				throw new BusinessException(RespCode.RESP_0212);
			}
		}

		// 插入评论
		ObjectCommentDo objectCommentDo = new ObjectCommentDo();
		objectCommentDo.setCommentId(generateCommentId());
		objectCommentDo.setObjectId(objectId);
		objectCommentDo.setUserId(userId);
		objectCommentDo.setToCommentId(toCommentId);
		objectCommentDo.setCommentContent(comment);
		objectCommentDo.setAcceptFlag(BoolEnum.FALSE.getCode());
		objectCommentDo.setYesCount(0);
		objectCommentDo.setNoCount(0);
		Long now = DateUtil.nowInMilliseconds();
		objectCommentDo.setAddTime(now);
		objectCommentDo.setUpdTime(now);
		objectDao.insertObjectComment(objectCommentDo);

		// 记数
		objectDao.increaseCommentCount(objectId);

		ObjectCommentBo objectCommentBo = new ObjectCommentBo();
		BeanUtils.copyProperties(objectCommentDo, objectCommentBo);

		return objectCommentBo;
	}

	public void removeComment(Long userId, Long commentId) {
		// 先判断
		ObjectCommentDo commentDo = objectDao.selectObjectCommentByCommentId(commentId);
		if (commentDo == null) {
			throw new BusinessException(RespCode.RESP_0211);
		}
		if (!userId.equals(commentDo.getUserId())) {
			throw new BusinessException(RespCode.RESP_0213);
		}

		// 删除评论
		objectDao.deleteObjectCommentByCommentId(commentId);

		// 记数
		objectDao.decreaseCommentCount(commentDo.getObjectId());
	}

	protected Long generateCommentId() {
		String day = DateUtil.format(DateUtil.now(), DateUtil.PATTERN_YEAR2DAY);
		String seq = sequenceDao.getSequence(SequenceDao.SEQ_OBJECT_COMMENT_ID) + "";
		String rt = day + StringUtils.leftPad(seq, 10, '0');
		return Long.valueOf(rt);
	}

	public List<ObjectCommentBo> listComments(Long objectId) {
		List<ObjectCommentDo> commentDoList = objectDao.selectObjectCommentByObjectId(objectId);

		List<ObjectCommentBo> commentBoList = new ArrayList<ObjectCommentBo>(commentDoList.size());
		for (ObjectCommentDo commentDo : commentDoList) {
			ObjectCommentBo commentBo = new ObjectCommentBo();
			BeanUtils.copyProperties(commentDo, commentBo);
			commentBoList.add(commentBo);
		}

		return commentBoList;
	}
}
