package com.xjd.ct.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.ObjectResourceDo;
import com.xjd.ct.dal.dos.ObjectResourceDoExample;
import com.xjd.ct.dal.map.ObjectResourceDoMapper;

/**
 * @author elvis.xu
 * @since 2015-05-01 00:45
 */
@Repository
@Transactional
public class ResourceDao {
	@Autowired
	ObjectResourceDoMapper objectResourceDoMapper;

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

}
