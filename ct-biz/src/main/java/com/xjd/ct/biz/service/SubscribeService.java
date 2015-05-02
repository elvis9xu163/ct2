package com.xjd.ct.biz.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.biz.bo.AgeBracketBo;
import com.xjd.ct.biz.bo.SubscribeBo;
import com.xjd.ct.dal.dao.SubscribeDao;
import com.xjd.ct.dal.dos.AgeBracketDo;
import com.xjd.ct.dal.dos.SubscribeDo;
import com.xjd.ct.dal.dos.UserAgeBracketDo;
import com.xjd.ct.dal.dos.UserSubscribeDo;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * <pre>
 * 订阅配置服务
 * 
 * 订阅设置、年龄段设置
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-4-30 下午6:12:34
 */
@Service
public class SubscribeService {
	@Autowired
	SubscribeDao subscribeDao;

	public List<SubscribeBo> listSubscriptions() {
		List<SubscribeDo> subscribeDoList = subscribeDao.selectSubscribe();

		List<SubscribeBo> subscribeBoList = new ArrayList<SubscribeBo>(subscribeDoList.size());
		for (SubscribeDo subscribeDo : subscribeDoList) {
			SubscribeBo bo = new SubscribeBo();
			BeanUtils.copyProperties(subscribeDo, bo);
			subscribeBoList.add(bo);
		}
		return subscribeBoList;
	}

	public List<AgeBracketBo> listAgeBrackets() {
		List<AgeBracketDo> ageBracketDoList = subscribeDao.selectAgeBracket();

		List<AgeBracketBo> ageBracketBoList = new ArrayList<AgeBracketBo>(ageBracketDoList.size());
		for (AgeBracketDo ageBracketDo : ageBracketDoList) {
			AgeBracketBo bo = new AgeBracketBo();
			BeanUtils.copyProperties(ageBracketDo, bo);
			ageBracketBoList.add(bo);
		}
		return ageBracketBoList;
	}

	public List<SubscribeBo> listSubscriptionsOfUser(Long userId) {
		List<UserSubscribeDo> userSubscribeDoList = subscribeDao.selectUserSubscribeByUserId(userId);

		if (CollectionUtils.isEmpty(userSubscribeDoList)) {
			return Collections.emptyList();
		}

		List<Long> subIdList = new ArrayList<Long>(userSubscribeDoList.size());
		for (UserSubscribeDo userSubscribeDo : userSubscribeDoList) {
			subIdList.add(userSubscribeDo.getSubscribeId());
		}

		List<SubscribeDo> subscribeDoList = subscribeDao.selectSubscribeBySubscribeIdList(subIdList);

		List<SubscribeBo> subscribeBoList = new ArrayList<SubscribeBo>(subscribeDoList.size());
		for (SubscribeDo subscribeDo : subscribeDoList) {
			SubscribeBo bo = new SubscribeBo();
			BeanUtils.copyProperties(subscribeDo, bo);
			subscribeBoList.add(bo);
		}
		return subscribeBoList;
	}

	public List<AgeBracketBo> listAgeBracketsOfUser(Long userId) {
		List<UserAgeBracketDo> userAgeBracketDoList = subscribeDao.selectUserAgeBracketByUserId(userId);

		if (CollectionUtils.isEmpty(userAgeBracketDoList)) {
			return Collections.emptyList();
		}

		List<Long> ageIdList = new ArrayList<Long>(userAgeBracketDoList.size());
		for (UserAgeBracketDo userAgeBracketDo : userAgeBracketDoList) {
			ageIdList.add(userAgeBracketDo.getAgeBracketId());
		}

		List<AgeBracketDo> ageBracketDoList = subscribeDao.selectAgeBracketByAgeBracketIdList(ageIdList);

		List<AgeBracketBo> ageBracketBoList = new ArrayList<AgeBracketBo>(ageBracketDoList.size());
		for (AgeBracketDo ageBracketDo : ageBracketDoList) {
			AgeBracketBo bo = new AgeBracketBo();
			BeanUtils.copyProperties(ageBracketDo, bo);
			ageBracketBoList.add(bo);
		}
		return ageBracketBoList;
	}

	public void subscribe(Long userId, Long subscribeId) {
		// 判断
		SubscribeDo subscribeDo = subscribeDao.selectSubscribeBySubscribeId(subscribeId);
		if (subscribeDo == null) {
			throw new BusinessException(RespCode.RESP_0214);
		}

		UserSubscribeDo userSubscribeDo = subscribeDao.selectUserSubscribeByUserIdAndSubscribeId(userId, subscribeId);
		if (userSubscribeDo != null) {
			throw new BusinessException(RespCode.RESP_0215);
		}

		// 订阅
		userSubscribeDo = new UserSubscribeDo();
		userSubscribeDo.setUserId(userId);
		userSubscribeDo.setSubscribeId(subscribeId);
		userSubscribeDo.setAddTime(DateUtil.nowInMilliseconds());
		subscribeDao.insertUserSubscribe(userSubscribeDo);
	}

	public void unsubscribe(Long userId, Long subscribeId) {
		// 判断
		UserSubscribeDo userSubscribeDo = subscribeDao.selectUserSubscribeByUserIdAndSubscribeId(userId, subscribeId);
		if (userSubscribeDo == null) {
			throw new BusinessException(RespCode.RESP_0216);
		}

		// 取消
		subscribeDao.deleteUserSubscribeByUserIdAndSubscribeId(userId, subscribeId);
	}

	public void setAgeBracket(Long userId, Long ageBracketId) {
		// 判断
		AgeBracketDo ageBracketDo = subscribeDao.selectAgeBracketByAgeBracketId(ageBracketId);
		if (ageBracketDo == null) {
			throw new BusinessException(RespCode.RESP_0217);
		}

		UserAgeBracketDo userAgeBracketDo = subscribeDao.selectUserAgeBracketByUserIdAndAgeBracketId(userId,
				ageBracketId);
		if (userAgeBracketDo != null) {
			throw new BusinessException(RespCode.RESP_0218);
		}

		// 订阅
		userAgeBracketDo = new UserAgeBracketDo();
		userAgeBracketDo.setUserId(userId);
		userAgeBracketDo.setAgeBracketId(ageBracketId);
		userAgeBracketDo.setAddTime(DateUtil.nowInMilliseconds());
		subscribeDao.insertUserAgeBracket(userAgeBracketDo);
	}

	public void unsetAgeBracket(Long userId, Long ageBracketId) {
		// 判断
		UserAgeBracketDo userAgeBracketDo = subscribeDao.selectUserAgeBracketByUserIdAndAgeBracketId(userId,
				ageBracketId);
		if (userAgeBracketDo == null) {
			throw new BusinessException(RespCode.RESP_0219);
		}

		// 取消
		subscribeDao.deleteUserAgeBracketByUserIdAndAgeBracketId(userId, ageBracketId);
	}
}
