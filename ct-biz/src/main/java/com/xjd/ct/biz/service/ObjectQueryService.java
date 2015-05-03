package com.xjd.ct.biz.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.biz.bo.BannerBo;
import com.xjd.ct.biz.bo.ObjectBo;
import com.xjd.ct.biz.bo.ResourceBo;
import com.xjd.ct.dal.dao.ObjectDao;
import com.xjd.ct.dal.dao.ResourceDao;
import com.xjd.ct.dal.dos.*;
import com.xjd.ct.utl.enums.EntityTypeEnum;
import com.xjd.ct.utl.enums.ObjectTypeEnum;

/**
 * <pre>
 * 业务对象查询服务
 * 
 * 根据不同的条件(包括订阅条件)查询数据
 * </pre>
 * @author elvis.xu
 * @since 2015-4-30 下午6:16:07
 */
@Service
public class ObjectQueryService {
	@Autowired
	ObjectDao objectDao;
	@Autowired
	ResourceService resourceService;
	@Autowired
	ResourceDao resourceDao;

	public List<ObjectBo> listObject(Long userId, long offset, int count) {
		List<ObjectDo> objectDoList = objectDao.selectObjectByUserIdAndPage(userId, offset, count);

		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectDo.getObjectId()));
			objectBoList.add(objectBo);
		}

		return objectBoList;
	}

	public List<ObjectBo> listFavors(Long userId, long offset, int count) {
		List<ObjectFavorDo> objectFavorDoList = objectDao.selectObjectFavorByUserIdAndPage(userId, offset, count);

		if (objectFavorDoList.isEmpty()) {
			return Collections.emptyList();
		}

		List<Long> objectIdList = new ArrayList<Long>(objectFavorDoList.size());
		for (ObjectFavorDo objectFavorDo : objectFavorDoList) {
			objectIdList.add(objectFavorDo.getObjectId());
		}

		List<ObjectDo> objectDoList = objectDao.selectObjectByObjectIdList(objectIdList);

		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectDo.getObjectId()));
			objectBoList.add(objectBo);
		}

		return objectBoList;

	}

	public List<ObjectBo> listLikes(Long userId, long offset, int count) {
		List<ObjectLikeDo> objectLikeDoList = objectDao.selectObjectLikeByUserIdAndPage(userId, offset, count);

		if (objectLikeDoList.isEmpty()) {
			return Collections.emptyList();
		}

		List<Long> objectIdList = new ArrayList<Long>(objectLikeDoList.size());
		for (ObjectLikeDo objectLikeDo : objectLikeDoList) {
			objectIdList.add(objectLikeDo.getObjectId());
		}

		List<ObjectDo> objectDoList = objectDao.selectObjectByObjectIdList(objectIdList);

		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectDo.getObjectId()));
			objectBoList.add(objectBo);
		}

		return objectBoList;
	}

	public List<BannerBo> listBanners() {
		List<BannerDo> bannerDoList = objectDao.selectBanner();

		if (CollectionUtils.isEmpty(bannerDoList)) {
			return Collections.emptyList();
		}

		List<BannerBo> bannerBoList = new ArrayList<BannerBo>(bannerDoList.size());
		for (BannerDo bannerDo : bannerDoList) {
			BannerBo bannerBo = new BannerBo();
			BeanUtils.copyProperties(bannerDo, bannerBo);

			ResourceDo resourceDo = resourceDao.selectResourceByResId(bannerBo.getResId());
			if (resourceDo != null) {
				ResourceBo resourceBo = new ResourceBo();
				BeanUtils.copyProperties(resourceDo, resourceBo);
				bannerBo.setResource(resourceBo);
			}
			bannerBoList.add(bannerBo);
		}

		return bannerBoList;
	}

	public List<ObjectBo> listRecommendObjects(Long date) {
		List<RecommendDo> recommendDoList = objectDao.selectRecommendByRecommendTime(date);

		if (CollectionUtils.isEmpty(recommendDoList)) {
			return Collections.emptyList();
		}

		List<Long> objectIdList = new ArrayList<Long>(recommendDoList.size());
		for (RecommendDo recommendDo : recommendDoList) {
			objectIdList.add(recommendDo.getObjectId());
		}

		List<ObjectDo> objectDoList = objectDao.selectObjectByObjectIdList(objectIdList);

		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectDo.getObjectId()));
			objectBoList.add(objectBo);
		}

		return objectBoList;
	}

	public List<ObjectBo> listArticles(Byte orderBy, Long offset, Integer count) {
		// 全部以时间倒序
		List<ObjectDo> objectDoList = objectDao.selectObjectByObjectTypeAndPageOrderByAddTimeDesc(
				ObjectTypeEnum.ARTICLE.getCode(), offset, count);

		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectDo.getObjectId()));
			objectBoList.add(objectBo);
		}

		return objectBoList;
	}

	public List<ObjectBo> listPublishs(Byte orderBy, Long offset, Integer count) {
		// 全部以时间倒序
		List<ObjectDo> objectDoList = objectDao.selectObjectByObjectTypeAndPageOrderByAddTimeDesc(
				ObjectTypeEnum.PUBLISH.getCode(), offset, count);

		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectDo.getObjectId()));
			objectBoList.add(objectBo);
		}

		return objectBoList;
	}

	public List<ObjectBo> listPublishs(Long userId, Byte orderBy, Long offset, Integer count) {
		List<ObjectDo> objectDoList = objectDao.selectIdolUserPublishByPageOrderByAddTimeDesc(userId, offset, count);

		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectDo.getObjectId()));
			objectBoList.add(objectBo);
		}

		return objectBoList;
	}
}
