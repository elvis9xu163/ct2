package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.TokenDo;
import com.xjd.ct.dal.dos.TokenDoExample;
import com.xjd.ct.dal.map.TokenDoMapper;
import com.xjd.ct.utl.QueryResultUtil;

@Repository
@Transactional
public class TokenDao {

	@Autowired
	TokenDoMapper tokenDoMapper;

	/**
	 * 
	 * @param userIp
	 * @param userId
	 * @return
	 */
	public TokenDo selectByUserIpAndUserId(String userIp, Long userId) {
		TokenDoExample example = new TokenDoExample();
		example.or().andUserIpEqualTo(userIp).andUserIdEqualTo(userId);
		List<TokenDo> list = tokenDoMapper.selectByExample(example);

		QueryResultUtil.assertMaxOne(list, userIp, userId);
		return list.size() == 0 ? null : list.get(0);
	}

	/**
	 * 
	 * @param userIp
	 * @param userId
	 */
	public int deleteByUserIpAndUserId(String userIp, Long userId) {
		TokenDoExample example = new TokenDoExample();
		example.or().andUserIpEqualTo(userIp).andUserIdEqualTo(userId);
		return tokenDoMapper.deleteByExample(example);
	}

	/**
	 * 插入新的TOKEN记录
	 * 
	 * @param tokenDo
	 * @return
	 */
	public int insert(TokenDo tokenDo) {
		return tokenDoMapper.insert(tokenDo);
	}

	/**
	 * 
	 * @param userId
	 * @return
	 */
	public TokenDo selectByUserId(Long userId) {
		TokenDoExample example = new TokenDoExample();
		example.or().andUserIdEqualTo(userId);
		List<TokenDo> list = tokenDoMapper.selectByExample(example);

		QueryResultUtil.assertMaxOne(list, userId);
		return list.size() == 0 ? null : list.get(0);
	}

	/**
	 * 
	 * @param userId
	 * @return
	 */
	public int deleteByUserId(Long userId) {
		TokenDoExample example = new TokenDoExample();
		example.or().andUserIdEqualTo(userId);
		return tokenDoMapper.deleteByExample(example);
	}

	/**
	 * 
	 * @param token
	 * @return
	 */
	public TokenDo selectByToken(String token) {
		return tokenDoMapper.selectByPrimaryKey(token);
	}

	/**
	 * 更新token的upd_time字段
	 * 
	 * @param time
	 * @param token
	 * @return
	 */
	public int updateUpdTimeByToken(Long time, String token) {
		TokenDo tokenDo = new TokenDo();
		tokenDo.setToken(token);
		tokenDo.setUpdTime(time);

		return tokenDoMapper.updateByPrimaryKeySelective(tokenDo);
	}

	/**
	 * 通过token删除记录
	 * 
	 * @param token
	 * @return
	 */
	public int deleteByToken(String token) {
		return tokenDoMapper.deleteByPrimaryKey(token);
	}
}
