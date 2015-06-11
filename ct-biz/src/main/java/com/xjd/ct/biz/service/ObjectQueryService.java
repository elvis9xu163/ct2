package com.xjd.ct.biz.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.biz.bo.BannerBo;
import com.xjd.ct.biz.bo.LaunchPicBo;
import com.xjd.ct.biz.bo.ObjectBo;
import com.xjd.ct.biz.bo.UserBo;
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
 * 
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
	@Autowired
	UserService userService;

	public List<ObjectBo> listObject(Long userId, long offset, int count) {
		List<ObjectDo> objectDoList = objectDao.selectObjectByUserIdAndPage(userId, offset, count);

		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectDo.getObjectId()));
			processLikeFavor(userId, objectBo);
			objectBo.setUser(userService.getUserInfoSimple(objectBo.getUserId()));
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
			processLikeFavor(userId, objectBo);
			objectBo.setUser(userService.getUserInfoSimple(objectBo.getUserId()));
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
			processLikeFavor(userId, objectBo);
			objectBo.setUser(userService.getUserInfoSimple(objectBo.getUserId()));
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
			bannerBo.setResource(resourceService.queryResource(bannerBo.getResId()));
			bannerBoList.add(bannerBo);
		}

		return bannerBoList;
	}

	public List<ObjectBo> listRecommendObjects(Long userId, Long offset, Integer count) {
		List<RecommendDo> recommendDoList = objectDao.selectRecommendByPageOrderByAddTimeDesc(offset, count);

		if (CollectionUtils.isEmpty(recommendDoList)) {
			return Collections.emptyList();
		}

		List<Long> objectIdList = new ArrayList<Long>(recommendDoList.size());
		for (RecommendDo recommendDo : recommendDoList) {
			objectIdList.add(recommendDo.getObjectId());
		}

		List<ObjectDo> objectDoList = objectDao.selectObjectByObjectIdList(objectIdList);

		// 先排序
		List<ObjectDo> orderedList = new ArrayList<ObjectDo>(objectDoList.size());
		for (Long objId : objectIdList) {
			for (ObjectDo objectDo : objectDoList) {
				if (objId.equals(objectDo.getObjectId())) {
					orderedList.add(objectDo);
					break;
				}
			}
		}
		objectDoList = orderedList;

		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectDo.getObjectId()));
			processLikeFavor(userId, objectBo);
			objectBo.setUser(userService.getUserInfoSimple(objectBo.getUserId()));
			objectBoList.add(objectBo);
		}

		return objectBoList;
	}

	public List<ObjectBo> listArticles(Byte orderBy, Long offset, Integer count, Long userId) {
		// 全部以时间倒序
		List<ObjectDo> objectDoList = objectDao.selectObjectByObjectTypeListAndPageOrderByAddTimeDesc(
				Arrays.asList(ObjectTypeEnum.ARTICLE.getCode(), ObjectTypeEnum.TOPIC.getCode()), offset, count);

		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectDo.getObjectId()));
			processLikeFavor(userId, objectBo);
			objectBo.setUser(userService.getUserInfoSimple(objectBo.getUserId()));
			objectBoList.add(objectBo);
		}

		return objectBoList;
	}

	public List<ObjectBo> listAllPublishs(Byte orderBy, Long offset, Integer count, Long userId) {
		// 全部以时间倒序
		List<ObjectDo> objectDoList = objectDao.selectObjectByObjectTypeListAndPageOrderByAddTimeDesc(
				Arrays.asList(ObjectTypeEnum.PUBLISH.getCode(), ObjectTypeEnum.TOPIC.getCode()), offset, count);

		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectDo.getObjectId()));
			processLikeFavor(userId, objectBo);
			objectBo.setUser(userService.getUserInfoSimple(objectBo.getUserId()));
			objectBoList.add(objectBo);
		}

		return objectBoList;
	}

	public List<ObjectBo> listIdolPublishs(Long userId, Byte orderBy, Long offset, Integer count) {
		List<ObjectDo> objectDoList = objectDao.selectIdolUserPublishByPageOrderByAddTimeDesc(userId, offset, count);

		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectDo.getObjectId()));
			processLikeFavor(userId, objectBo);
			objectBo.setUser(userService.getUserInfoSimple(objectBo.getUserId()));
			objectBoList.add(objectBo);
		}

		return objectBoList;
	}

	public List<ObjectBo> listUserPublishs(Long ofUserId, Byte orderBy, Long offset, Integer count, Long userId) {
		// 全部以时间倒序
		List<ObjectDo> objectDoList = objectDao.selectObjectByObjectTypeAndUserIdAndPageOrderByAddTimeDesc(
				ObjectTypeEnum.PUBLISH.getCode(), ofUserId, offset, count);

		UserBo userBo = userService.getUserInfoSimple(ofUserId);
		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectDo.getObjectId()));
			processLikeFavor(userId, objectBo);
			objectBo.setUser(userBo);
			objectBoList.add(objectBo);
		}

		return objectBoList;
	}

	protected void processLikeFavor(Long userId, ObjectBo objectBo) {
		if (userId != null) {
			objectBo.setLiked(isLike(userId, objectBo.getObjectId()) ? (byte) 1 : (byte) 0);
			objectBo.setFavored(isFavor(userId, objectBo.getObjectId()) ? (byte) 1 : (byte) 0);
		} else {
			objectBo.setLiked((byte) 0);
			objectBo.setFavored((byte) 0);
		}
	}

	protected boolean isLike(Long userId, Long objectId) {
		if (objectDao.selectObjectLikeByObjectIdAndUserId(objectId, userId) != null) {
			return true;
		}
		return false;
	}

	protected boolean isFavor(Long userId, Long objectId) {
		if (objectDao.selectObjectFavorByObjectIdAndUserId(objectId, userId) != null) {
			return true;
		}
		return false;
	}

	public List<LaunchPicBo> getLaunchPic(Long lastTime) {
		List<LaunchPicDo> doList = objectDao.selectLaunchPicNewerThen(lastTime);

		List<LaunchPicBo> boList = new ArrayList<LaunchPicBo>(doList.size());
		for (LaunchPicDo picDo : doList) {
			LaunchPicBo bo = new LaunchPicBo();
			BeanUtils.copyProperties(picDo, bo);
			bo.setResourceList(resourceService.listResource(EntityTypeEnum.LAUNCH_PIC.getCode(), picDo.getLaunchId()));
			boList.add(bo);
		}
		return boList;
	}
}
