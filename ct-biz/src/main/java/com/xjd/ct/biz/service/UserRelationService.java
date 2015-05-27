package com.xjd.ct.biz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.biz.bo.UserBo;
import com.xjd.ct.dal.dao.IdolDao;
import com.xjd.ct.dal.dao.SequenceDao;
import com.xjd.ct.dal.dao.UserDao;
import com.xjd.ct.dal.dos.IdolDo;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.enums.BoolEnum;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * <pre>
 * 用户关系服务
 * 
 * 好友，关注，粉丝等
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-4-30 下午5:59:27
 */
@Service
public class UserRelationService {
	@Autowired
	SequenceDao sequenceDao;
	@Autowired
	IdolDao idolDao;
	@Autowired
	UserDao userDao;

	@Autowired
	UserService userService;

	/**
	 * 关注用户
	 *
	 * @param userId
	 * @param idolUserId
	 */
	@Transactional
	public void addIdol(Long userId, Long idolUserId) {
		if (userId.equals(idolUserId)) {
			throw new BusinessException(RespCode.RESP_0132);
		}

		// 判断是否已关注
		IdolDo idolDo = idolDao.selectUserIdolByUserIdAndIdolUserId(userId, idolUserId);
		if (idolDo != null) {
			throw new BusinessException(RespCode.RESP_0130);
		}

		// 关注
		idolDo = new IdolDo();
		idolDo.setUserId(userId);
		idolDo.setIdolUserId(idolUserId);
		idolDo.setAddTime(DateUtil.nowInMilliseconds());
		idolDao.insertUserIdol(idolDo);

		// 关注记数
		userDao.increaseIdolCountByUserId(userId);

		// 粉丝记数
		userDao.increaseFansCountByUserId(idolUserId);

		// 生成消息 TODO
	}

	/**
	 * 取消关注
	 *
	 * @param userId
	 * @param idolUserId
	 */
	@Transactional
	public void cancelIdol(Long userId, Long idolUserId) {
		if (userId.equals(idolUserId)) {
			throw new BusinessException(RespCode.RESP_0132);
		}

		// 判断是否已关注
		IdolDo idolDo = idolDao.selectUserIdolByUserIdAndIdolUserId(userId, idolUserId);
		if (idolDo == null) {
			throw new BusinessException(RespCode.RESP_0131);
		}

		// 取消关注
		idolDao.deleteUserIdolByUserIdAndIdolUserId(userId, idolUserId);

		// 关注记数
		userDao.decreaseIdolCountByUserId(userId);

		// 粉丝记数
		userDao.decreaseFansCountByUserId(idolUserId);

		// 生成消息 TODO
	}


	// TODO 性能优化
	/**
	 * 获取指定用户[userId]的关注用户列表[listIdol=TRUE]或者粉丝用户列表[listIdol=FALSE],
	 * 同时获取列表用户与当前用户[currentUserId]的关注关系
	 * @param userId
	 * @param offset
	 * @param count
	 * @param currentUserId
	 * @return
	 */
	public List<UserBo> listIdolsOrFans(Boolean listIdol, Long userId, Long offset, Integer count, Long currentUserId) {
		List<IdolDo> list;
		if (listIdol) {
			list = idolDao.selectUserIdolByUserIdAndPage(userId, offset, count);
		} else {
			list = idolDao.selectUserIdolByIdolUserIdAndPage(userId, offset, count);
		}
		List<UserBo> userBoList = new ArrayList<UserBo>(list.size());
		for (IdolDo idolDo : list) {
			UserBo userBo = userService.getUserInfoSimple(idolDo.getIdolUserId());

			if (currentUserId == null) {
				userBo.setFansFlag(BoolEnum.FALSE.getCode());
				userBo.setIdolFlag(BoolEnum.FALSE.getCode());
			} else {
				if (currentUserId.equals(userId)) {
					if (listIdol) {
						userBo.setIdolFlag(BoolEnum.TRUE.getCode());
						userBo.setFansFlag(isIdol(userBo.getUserId(), currentUserId) ? BoolEnum.TRUE.getCode() : BoolEnum.FALSE.getCode());
					} else {
						userBo.setFansFlag(BoolEnum.TRUE.getCode());
						userBo.setIdolFlag(isIdol(currentUserId, userBo.getUserId()) ? BoolEnum.TRUE.getCode() : BoolEnum.FALSE.getCode());
					}
				} else {
					userBo.setFansFlag(isIdol(userBo.getUserId(), currentUserId) ? BoolEnum.TRUE.getCode() : BoolEnum.FALSE.getCode());
					userBo.setIdolFlag(isIdol(currentUserId, userBo.getUserId()) ? BoolEnum.TRUE.getCode() : BoolEnum.FALSE.getCode());
				}
			}

			userBoList.add(userBo);
		}

		return userBoList;
	}

	public boolean isIdol(Long userId, Long idolUserId) {
		if (userId == null || idolUserId == null) {
			return false;
		}
		return idolDao.selectUserIdolByUserIdAndIdolUserId(userId, idolUserId) != null;
	}

}
