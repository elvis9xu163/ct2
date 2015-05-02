package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.*;
import com.xjd.ct.dal.map.AgeBracketDoMapper;
import com.xjd.ct.dal.map.SubscribeDoMapper;
import com.xjd.ct.dal.map.UserAgeBracketDoMapper;
import com.xjd.ct.dal.map.UserSubscribeDoMapper;

/**
 * @author elvis.xu
 * @since 2015-05-01 15:07
 */
@Repository
@Transactional
public class SubscribeDao {
	@Autowired
	SubscribeDoMapper subscribeDoMapper;
	@Autowired
	AgeBracketDoMapper ageBracketDoMapper;
	@Autowired
	UserSubscribeDoMapper userSubscribeDoMapper;
	@Autowired
	UserAgeBracketDoMapper userAgeBracketDoMapper;

	public List<SubscribeDo> selectSubscribe() {
		return subscribeDoMapper.selectByExample(null);
	}

	public List<AgeBracketDo> selectAgeBracket() {
		return ageBracketDoMapper.selectByExample(null);
	}

	public List<UserSubscribeDo> selectUserSubscribeByUserId(Long userId) {
		UserSubscribeDoExample example = new UserSubscribeDoExample();
		example.or().andUserIdEqualTo(userId);
		return userSubscribeDoMapper.selectByExample(example);
	}

	public List<SubscribeDo> selectSubscribeBySubscribeIdList(List<Long> subIdList) {
		SubscribeDoExample example = new SubscribeDoExample();
		example.or().andSubscribeIdIn(subIdList);
		return subscribeDoMapper.selectByExample(example);
	}

	public List<UserAgeBracketDo> selectUserAgeBracketByUserId(Long userId) {
		UserAgeBracketDoExample example = new UserAgeBracketDoExample();
		example.or().andUserIdEqualTo(userId);
		return userAgeBracketDoMapper.selectByExample(example);
	}

	public List<AgeBracketDo> selectAgeBracketByAgeBracketIdList(List<Long> ageIdList) {
		AgeBracketDoExample example = new AgeBracketDoExample();
		example.or().andAgeBracketIdIn(ageIdList);
		return ageBracketDoMapper.selectByExample(example);
	}

	public SubscribeDo selectSubscribeBySubscribeId(Long subscribeId) {
		return subscribeDoMapper.selectByPrimaryKey(subscribeId);
	}

	public UserSubscribeDo selectUserSubscribeByUserIdAndSubscribeId(Long userId, Long subscribeId) {
		UserSubscribeDoKey key = new UserSubscribeDo();
		key.setUserId(userId);
		key.setSubscribeId(subscribeId);
		return userSubscribeDoMapper.selectByPrimaryKey(key);
	}

	public int insertUserSubscribe(UserSubscribeDo userSubscribeDo) {
		return userSubscribeDoMapper.insert(userSubscribeDo);
	}

	public int deleteUserSubscribeByUserIdAndSubscribeId(Long userId, Long subscribeId) {
		UserSubscribeDoKey key = new UserSubscribeDo();
		key.setUserId(userId);
		key.setSubscribeId(subscribeId);
		return userSubscribeDoMapper.deleteByPrimaryKey(key);
	}

	public AgeBracketDo selectAgeBracketByAgeBracketId(Long ageBracketId) {
		return ageBracketDoMapper.selectByPrimaryKey(ageBracketId);
	}

	public UserAgeBracketDo selectUserAgeBracketByUserIdAndAgeBracketId(Long userId, Long ageBracketId) {
		UserAgeBracketDoKey key = new UserAgeBracketDoKey();
		key.setUserId(userId);
		key.setAgeBracketId(ageBracketId);
		return userAgeBracketDoMapper.selectByPrimaryKey(key);
	}

	public int insertUserAgeBracket(UserAgeBracketDo userAgeBracketDo) {
		return userAgeBracketDoMapper.insert(userAgeBracketDo);
	}

	public int deleteUserAgeBracketByUserIdAndAgeBracketId(Long userId, Long ageBracketId) {
		UserAgeBracketDoKey key = new UserAgeBracketDoKey();
		key.setUserId(userId);
		key.setAgeBracketId(ageBracketId);
		return userAgeBracketDoMapper.deleteByPrimaryKey(key);
	}
}
