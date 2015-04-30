package com.xjd.ct.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.map.SequenceMapper;

/**
 * 序列管理Dao
 * 
 * @author elvis.xu
 * @since 2015-03-20 18:11
 */
@Repository
@Transactional
public class SequenceDao {

	public static final String SEQ_TEST = "SEQ_TEST";
	public static final String SEQ_SERVICE_LOG_ID = "SEQ_SERVICE_LOG_ID";
	public static final String SEQ_FEEDBACK_ID = "SEQ_FEEDBACK_ID";
	public static final String SEQ_USER_ID = "SEQ_USER_ID";
	public static final String SEQ_USER_BABY_ID = "SEQ_USER_BABY_ID";
	public static final String SEQ_USER_BIND_ACCOUNT_ID = "SEQ_USER_BIND_ACCOUNT_ID";
	public static final String SEQ_MSG_INFORM_ID = "SEQ_MSG_INFORM_ID";
	public static final String SEQ_REPORT_ID = "SEQ_REPORT_ID";
	public static final String SEQ_TAG_ID = "SEQ_TAG_ID";
	public static final String SEQ_OBJECT_ID = "SEQ_OBJECT_ID";
	public static final String SEQ_OBJECT_COMMENT_ID = "SEQ_OBJECT_COMMENT_ID";
	public static final String SEQ_BANNER_ID = "SEQ_BANNER_ID";
	public static final String SEQ_RECOMMEND_ID = "SEQ_RECOMMEND_ID";
	public static final String SEQ_SUBSCRIBE_ID = "SEQ_SUBSCRIBE_ID";
	public static final String SEQ_AGE_BRACKET_ID = "SEQ_AGE_BRACKET_ID";

	@Autowired
	SequenceMapper sequenceMapper;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Long getSequence(String seqName) {
		return sequenceMapper.getSequence(seqName);
	}
}
