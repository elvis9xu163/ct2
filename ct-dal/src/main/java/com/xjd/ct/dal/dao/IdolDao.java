package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.IdolDo;
import com.xjd.ct.dal.dos.IdolDoExample;
import com.xjd.ct.dal.dos.IdolDoKey;
import com.xjd.ct.dal.map.IdolDoMapper;

/**
 * @author elvis.xu
 * @since 2015-05-01 10:42
 */
@Repository
@Transactional
public class IdolDao {
	@Autowired
	IdolDoMapper idolDoMapper;

	/**
	 * 查询关注信息
	 *
	 * @param userId
	 * @param idolUserId
	 * @return
	 */
	public IdolDo selectUserIdolByUserIdAndIdolUserId(Long userId, Long idolUserId) {
		IdolDoKey key = new IdolDoKey();
		key.setUserId(userId);
		key.setIdolUserId(idolUserId);

		return idolDoMapper.selectByPrimaryKey(key);
	}

	/**
	 * 插入一条关注信息
	 *
	 * @param idolDo
	 * @return
	 */
	public int insertUserIdol(IdolDo idolDo) {
		return idolDoMapper.insert(idolDo);
	}

	/**
	 * 删除一条关注信息
	 *
	 * @param userId
	 * @param idolUserId
	 * @return
	 */
	public int deleteUserIdolByUserIdAndIdolUserId(Long userId, Long idolUserId) {
		IdolDoKey key = new IdolDoKey();
		key.setUserId(userId);
		key.setIdolUserId(idolUserId);
		return idolDoMapper.deleteByPrimaryKey(key);
	}

	/**
	 * 查询用户的所有关注信息
	 *
	 * @param userId
	 * @return
	 */
	public List<IdolDo> selectUserIdolByUserIdAndPage(Long userId, long offset, int limit) {
		IdolDoExample example = new IdolDoExample();
		example.or().andUserIdEqualTo(userId);
		example.setOrderByClause("add_time desc");
		example.setOffsetAndLimit(offset - 1, limit);

		return idolDoMapper.selectByExample(example);
	}
}
