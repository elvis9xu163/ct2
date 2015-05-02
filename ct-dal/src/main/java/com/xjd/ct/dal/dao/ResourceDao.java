package com.xjd.ct.dal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.*;
import com.xjd.ct.dal.map.ObjectResourceDoMapper;
import com.xjd.ct.dal.map.ResourceDoMapper;
import com.xjd.ct.dal.map.UserResourceDoMapper;
import com.xjd.ct.utl.QueryResultUtil;

/**
 * @author elvis.xu
 * @since 2015-05-01 00:45
 */
@Repository
@Transactional
public class ResourceDao {
	@Autowired
	ObjectResourceDoMapper objectResourceDoMapper;
	@Autowired
	ResourceDoMapper resourceDoMapper;
	@Autowired
	UserResourceDoMapper userResourceDoMapper;

	// public List<ObjectResourceDo> selectObjectResourceByAndAll(String resId, Byte entityType, Long entityId,
	// Byte forClass) {
	// ObjectResourceDoExample example = new ObjectResourceDoExample();
	// example.or().andResIdEqualTo(resId).andEntityTypeEqualTo(entityType).andEntityIdEqualTo(entityId)
	// .andForClassEqualTo(forClass);
	//
	// return objectResourceDoMapper.selectByExample(example);
	// }

	public int deleteObjectResourceByEntityTypeAndEntityIdAndForClass(Byte entityType, Long entityId, Byte forClass) {
		ObjectResourceDoExample example = new ObjectResourceDoExample();
		example.or().andEntityTypeEqualTo(entityType).andEntityIdEqualTo(entityId).andForClassEqualTo(forClass);

		return objectResourceDoMapper.deleteByExample(example);
	}

	public int insertObjectResource(ObjectResourceDo objectResourceDo) {
		return objectResourceDoMapper.insert(objectResourceDo);
	}

	public List<ObjectResourceDo> selectObjectResourceByEntityTypeAndEntityId(Byte entityType, Long entityId) {
		ObjectResourceDoExample example = new ObjectResourceDoExample();
		example.or().andEntityTypeEqualTo(entityType).andEntityIdEqualTo(entityId);

		return objectResourceDoMapper.selectByExample(example);
	}

	public ResourceDo selectResourceByResId(String resId) {
		return resourceDoMapper.selectByPrimaryKey(resId);
	}

	public ResourceDo selectResourceByMd5AndFormat(String md5, String format) {
		ResourceDoExample example = new ResourceDoExample();
		example.or().andResMd5EqualTo(md5).andResFormatEqualTo(format);

		List<ResourceDo> list = resourceDoMapper.selectByExample(example);
		QueryResultUtil.assertMaxOne(list, md5, format);

		return list.isEmpty() ? null : list.get(0);
	}

	public int insertResource(ResourceDo resourceDo) {
		return resourceDoMapper.insert(resourceDo);
	}

	public UserResourceDo selectUserResourceByUserIdAndResId(Long userId, String resId) {
		UserResourceDoExample example = new UserResourceDoExample();
		example.or().andUserIdEqualTo(userId).andResIdEqualTo(resId);

		List<UserResourceDo> list = userResourceDoMapper.selectByExample(example);
		QueryResultUtil.assertMaxOne(list, userId, resId);

		return list.isEmpty() ? null : list.get(0);
	}

	public int insertUserResource(UserResourceDo userResourceDo) {
		return userResourceDoMapper.insert(userResourceDo);
	}
}
