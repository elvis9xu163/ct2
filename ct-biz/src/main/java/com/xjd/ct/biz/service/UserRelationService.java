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

	public List<UserBo> listIdols(Long userId, long offset, int count) {

		// TODO 优化
		List<IdolDo> idolDoList = idolDao.selectUserIdolByUserIdAndPage(userId, offset, count);
		List<UserBo> userBoList = new ArrayList<UserBo>(idolDoList.size());
		for (IdolDo idolDo : idolDoList) {
			UserBo userBo = userService.getUserInfo(idolDo.getIdolUserId());
			userBoList.add(userBo);
		}

		return userBoList;
	}
}
