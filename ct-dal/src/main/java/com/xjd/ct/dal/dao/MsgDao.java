package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.MsgInformDo;
import com.xjd.ct.dal.dos.MsgInformDoExample;
import com.xjd.ct.dal.map.MsgInformDoMapper;

/**
 * @author elvis.xu
 * @since 2015-05-01 11:09
 */
@Repository
@Transactional
public class MsgDao {
	@Autowired
	MsgInformDoMapper msgInformDoMapper;

	public List<MsgInformDo> selectMsgInformByUserIdAndPage(Long userId, long offset, int limit) {
		MsgInformDoExample example = new MsgInformDoExample();
		example.or().andUserIdEqualTo(userId);
		example.setOrderByClause("inform_id desc");
		example.setOffsetAndLimit(offset - 1, limit); // mysql的offset从0开始

		return msgInformDoMapper.selectByExample(example);
	}
}
