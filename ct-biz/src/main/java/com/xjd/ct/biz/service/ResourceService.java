package com.xjd.ct.biz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.biz.bo.ResourceBo;
import com.xjd.ct.dal.dao.ResourceDao;
import com.xjd.ct.dal.dos.ObjectResourceDo;
import com.xjd.ct.dal.dos.ResourceDo;

/**
 * <pre>
 * 资源服务
 * 
 * 资源上传、下载、处理等
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-4-30 下午6:01:27
 */
@Service
public class ResourceService {
	@Autowired
	ResourceDao resourceDao;

	public List<ResourceBo> listResource(Byte entityType, Long entityId) {
		List<ObjectResourceDo> objectResourceDoList = resourceDao.selectObjectResourceByEntityTypeAndEntityId(
				entityType, entityId);

		List<ResourceBo> resourceBoList = new ArrayList<ResourceBo>(objectResourceDoList.size());
		for (ObjectResourceDo objectResourceDo : objectResourceDoList) {
			ResourceDo resourceDo = resourceDao.selectResourceByResId(objectResourceDo.getResId());

			ResourceBo resourceBo = new ResourceBo();
			BeanUtils.copyProperties(resourceDo, resourceBo);
			BeanUtils.copyProperties(objectResourceDo, resourceBo);
			resourceBoList.add(resourceBo);
		}
		return resourceBoList;
	}
}
