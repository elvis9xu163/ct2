package com.xjd.ct.biz.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.biz.bo.ObjectBo;
import com.xjd.ct.biz.bo.UserBo;
import com.xjd.ct.dal.dao.ObjectDao;
import com.xjd.ct.dal.dao.ResourceDao;
import com.xjd.ct.dal.dao.SequenceDao;
import com.xjd.ct.dal.dao.UserDao;
import com.xjd.ct.dal.dos.ObjectDo;
import com.xjd.ct.dal.dos.ObjectResourceDo;
import com.xjd.ct.dal.dos.RecommendDo;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.enums.*;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * <pre>
 * 业务对象更新服务
 * 
 * 文章、话题、UGC等的添加和编辑
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-4-30 下午6:10:56
 */
@Service
public class ObjectUpdateService {
	@Autowired
	SequenceDao sequenceDao;
	@Autowired
	ObjectDao objectDao;
	@Autowired
	ResourceDao resourceDao;
	@Autowired
	UserDao userDao;
	@Autowired
	ResourceService resourceService;
	@Autowired
	UserService userService;

	@Transactional
	public ObjectBo addPublish(Long userId, String title, String content, String resources) {
		ObjectDo objectDo = new ObjectDo();
		objectDo.setObjectId(generateObjectId());
		objectDo.setUserId(userId);
		objectDo.setObjectType(ObjectTypeEnum.PUBLISH.getCode());
		objectDo.setTitle(title);
		objectDo.setSummary(null);
		objectDo.setContentType(ObjectContentTypeEnum.TEXT.getCode());
		objectDo.setContent(content);
		objectDo.setVoteFlag(BoolEnum.FALSE.getCode());
		objectDo.setVoteMultiFlag(BoolEnum.FALSE.getCode());
		objectDo.setLikeYesFlag(BoolEnum.TRUE.getCode());
		objectDo.setLikeYesCount(0);
		objectDo.setLikeNoFlag(BoolEnum.FALSE.getCode());
		objectDo.setLikeNoCount(0);
		objectDo.setCommentFlag(BoolEnum.TRUE.getCode());
		objectDo.setCommentCount(0);
		objectDo.setFavorFlag(BoolEnum.TRUE.getCode());
		objectDo.setFavorCount(0);
		Long now = DateUtil.nowInMilliseconds();
		objectDo.setAddTime(now);
		objectDo.setUpdTime(now);

		List<ObjectResourceDo> objectResourceDoList = new ArrayList<ObjectResourceDo>();
		if (StringUtils.isNotBlank(resources)) {
			String[] resourceArray = resources.split(";");
			for (String resource : resourceArray) {
				resource = StringUtils.trim(resource);
				if (StringUtils.isEmpty(resource)) {
					continue;
				}
				String[] parts = resource.split(":");

				// 校验资源ID是否存在
				if (resourceDao.selectResourceByResId(parts[0]) == null) {
					throw new BusinessException(RespCode.RESP_0221, new Object[] { parts[0] });
				}

				ObjectResourceDo objectResourceDo = new ObjectResourceDo();
				objectResourceDo.setResId(parts[0]);
				objectResourceDo.setEntityType(EntityTypeEnum.OBJECT.getCode());
				objectResourceDo.setEntityId(objectDo.getObjectId());
				objectResourceDo.setForClass(parts.length > 1 ? Byte.valueOf(parts[1]) : null);
				objectResourceDo.setForSubclass(parts.length > 2 ? parts[2] : "");
				objectResourceDo.setFinishProcess(BoolEnum.FALSE.getCode());
				objectResourceDo.setAddTime(now);
				objectResourceDo.setUpdTime(now);
				objectResourceDoList.add(objectResourceDo);
			}
		}

		objectDao.insertObject(objectDo);
		for (ObjectResourceDo objectResourceDo : objectResourceDoList) {
			resourceDao.insertObjectResource(objectResourceDo);
		}

		ObjectBo objectBo = new ObjectBo();
		BeanUtils.copyProperties(objectDo, objectBo);
		objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(), objectDo.getObjectId()));

		// 用户countPublish +1
		userDao.increasePublishCount(userId);

		objectBo.setUser(userService.getUserInfoSimple(userId));

		return objectBo;
	}

	/**
	 * 生成一个新的UserId
	 * 
	 * @return
	 */
	protected Long generateObjectId() {
		String day = DateUtil.format(DateUtil.now(), DateUtil.PATTERN_YEAR2DAY);
		String seq = sequenceDao.getSequence(SequenceDao.SEQ_OBJECT_ID) + "";
		String rt = day + StringUtils.leftPad(seq, 10, '0');
		return Long.valueOf(rt);
	}


	@Transactional
	public ObjectBo addArticle(Long userId, String title, String summary, String listImg, String link) {
		ObjectDo objectDo = new ObjectDo();
		objectDo.setObjectId(generateObjectId());
		objectDo.setUserId(userId);
		objectDo.setObjectType(ObjectTypeEnum.ARTICLE.getCode());
		objectDo.setTitle(title);
		objectDo.setSummary(summary);
		objectDo.setContentType(ObjectContentTypeEnum.LINK.getCode());
		objectDo.setContent(link);
		objectDo.setVoteFlag(BoolEnum.FALSE.getCode());
		objectDo.setVoteMultiFlag(BoolEnum.FALSE.getCode());
		objectDo.setLikeYesFlag(BoolEnum.TRUE.getCode());
		objectDo.setLikeYesCount(0);
		objectDo.setLikeNoFlag(BoolEnum.FALSE.getCode());
		objectDo.setLikeNoCount(0);
		objectDo.setCommentFlag(BoolEnum.TRUE.getCode());
		objectDo.setCommentCount(0);
		objectDo.setFavorFlag(BoolEnum.TRUE.getCode());
		objectDo.setFavorCount(0);
		Long now = DateUtil.nowInMilliseconds();
		objectDo.setAddTime(now);
		objectDo.setUpdTime(now);

		List<ObjectResourceDo> objectResourceDoList = new ArrayList<ObjectResourceDo>();
		if (StringUtils.isNotBlank(listImg)) {
			// 校验资源ID是否存在
			if (resourceDao.selectResourceByResId(listImg) == null) {
				throw new BusinessException(RespCode.RESP_0221, new Object[] { listImg });
			}

			ObjectResourceDo objectResourceDo = new ObjectResourceDo();
			objectResourceDo.setResId(listImg);
			objectResourceDo.setEntityType(EntityTypeEnum.OBJECT.getCode());
			objectResourceDo.setEntityId(objectDo.getObjectId());
			objectResourceDo.setForClass(ResForClassEnum.LIST_IMG.getCode());
			objectResourceDo.setForSubclass("");
			objectResourceDo.setFinishProcess(BoolEnum.TRUE.getCode());
			objectResourceDo.setAddTime(now);
			objectResourceDo.setUpdTime(now);
			objectResourceDoList.add(objectResourceDo);
		}

		objectDao.insertObject(objectDo);
		for (ObjectResourceDo objectResourceDo : objectResourceDoList) {
			resourceDao.insertObjectResource(objectResourceDo);
		}

		ObjectBo objectBo = new ObjectBo();
		BeanUtils.copyProperties(objectDo, objectBo);
		objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(), objectDo.getObjectId()));

		// 用户countPublish +1
		userDao.increasePublishCount(userId);

		objectBo.setUser(userService.getUserInfoSimple(userId));

		return objectBo;
	}

	@Transactional
	public void delObject(Long userId, Long objectId) {
		ObjectDo objectDo = objectDao.selectObjectByObjectId(objectId);
		if (objectDo == null) {
			throw new BusinessException(RespCode.RESP_0222);
		}

		if (!objectDo.getUserId().equals(userId)) {
			throw new BusinessException(RespCode.RESP_0223);
		}

		objectDao.deleteObjectByObjectId(objectId);

		if (ObjectTypeEnum.valueOfCode(objectDo.getObjectType()) == ObjectTypeEnum.PUBLISH) {
			// 发果是发表，要减用户的发表数量
			userDao.decreasePublishCount(userId);
		}
	}

	public void recommendObject(Long userId, Long objectId) {
		UserBo userBo = userService.queryUserByUserId(userId);
		if (userBo == null) {
			throw new BusinessException(RespCode.RESP_0110);
		}

		if (UserTypeEnum.valueOfCode(userBo.getUserType()) != UserTypeEnum.ADMIN) {
			throw new BusinessException(RespCode.RESP_0116);
		}

		ObjectDo objectDo = objectDao.selectObjectByObjectId(objectId);
		if (objectDo == null) {
			throw new BusinessException(RespCode.RESP_0222);
		}

		Long now = DateUtil.nowInMilliseconds();
		RecommendDo recommendDo = new RecommendDo();
		recommendDo.setRecommendId(sequenceDao.getSequence(SequenceDao.SEQ_RECOMMEND_ID));
		recommendDo.setObjectId(objectId);
		recommendDo.setRecommendTime(now);
		recommendDo.setAddTime(now);
		recommendDo.setUpdTime(now);
		objectDao.insertRecommend(recommendDo);
	}
}
