package com.xjd.ct.biz.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjd.ct.biz.bo.*;
import com.xjd.ct.dal.dao.ObjectDao;
import com.xjd.ct.dal.dao.ResourceDao;
import com.xjd.ct.dal.dos.*;
import com.xjd.ct.utl.enums.EntityTypeEnum;
import com.xjd.ct.utl.enums.ObjectTypeEnum;
import com.xjd.ct.utl.enums.OrderByEnum;

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

	/**
	 * 1.0老接口服务, 在强升后去除
	 * 
	 * @param userId
	 * @param offset
	 * @param count
	 * @return
	 */
	public List<ObjectBo> listRecommendObjects(Long userId, Long offset, Integer count) {
		List<ObjectBo> objectBoList = listRecommendObjects11(userId, offset, count);

		for (int i = objectBoList.size() - 1; i >= 0; i--) {
			ObjectBo objectBo = objectBoList.get(i);
			if (ObjectTypeEnum.valueOfCode(objectBo.getObjectType()) == ObjectTypeEnum.SCHOOL) {
				objectBoList.remove(i);
			}
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
		OrderByEnum orderByEnum = OrderByEnum.valueOfCode(orderBy);
		List<ObjectDo> objectDoList;
		if (orderByEnum == OrderByEnum.HOT_DESC) { // 以热度排序
			objectDoList = objectDao.selectObjectByObjectTypeListAndPageOrderByLikeYesCountDesc(
					Arrays.asList(ObjectTypeEnum.PUBLISH.getCode(), ObjectTypeEnum.TOPIC.getCode()), offset, count);
		} else {
			// 全部以时间倒序
			objectDoList = objectDao.selectObjectByObjectTypeListAndPageOrderByAddTimeDesc(
					Arrays.asList(ObjectTypeEnum.PUBLISH.getCode(), ObjectTypeEnum.TOPIC.getCode()), offset, count);
		}
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

	public List<ObjectBo> listSchools(Long userId, Long objectId, Integer count, Boolean turnDown) {
		List<ObjectDo> objectDoList = objectDao.selectObjectPageByObjectId(
				Arrays.asList(ObjectTypeEnum.SCHOOL.getCode()), objectId, count, turnDown);

		// 全部以ID倒序
		if (!turnDown) {
			Collections.reverse(objectDoList);
		}
		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(objectDoList.size());
		for (ObjectDo objectDo : objectDoList) {
			ObjectBo objectBo = new ObjectBo();
			BeanUtils.copyProperties(objectDo, objectBo);
			objectBo = processObjectWithAllInfo(objectBo, userId);
			objectBoList.add(objectBo);
		}
		return objectBoList;
	}

	public List<ObjectBo> listRecommendObjects11(Long userId, Long offset, Integer count) {
		// 查出推荐对象
		List<RecommendDo> recommendDoList = objectDao.selectRecommendByPageOrderByAddTimeDesc(offset, count);
		if (CollectionUtils.isEmpty(recommendDoList)) {
			return Collections.emptyList();
		}

		List<ObjectBo> objectBoList = new ArrayList<ObjectBo>(recommendDoList.size());
		for (RecommendDo recommendDo : recommendDoList) {
			objectBoList.add(getObjectWithAllInfo(recommendDo.getObjectId(), userId));
		}

		return objectBoList;
	}

	public ObjectBo getObjectWithAllInfo(Long objectId, Long userId) {
		return getObject(objectId, userId, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE);
	}

	public ObjectBo processObjectWithAllInfo(ObjectBo objectBo, Long userId) {
		return processObject(objectBo, userId, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE);
	}

	/**
	 * 获取对象
	 * 
	 * @param objectId
	 * @param userId 非空时表示要查询对象与用户的关系(是否点赞、是否收藏等)
	 * @param withResource 是否查询对象资源
	 * @param withUser 是否查询对象所有者
	 * @param withBizInfo 是否查询对象业务信息
	 * @return
	 */
	public ObjectBo getObject(Long objectId, Long userId, Boolean withResource, Boolean withUser, Boolean withBizInfo) {
		ObjectDo objectDo = objectDao.selectObjectByObjectId(objectId);
		if (objectDo == null) {
			return null;
		}
		ObjectBo objectBo = new ObjectBo();
		BeanUtils.copyProperties(objectDo, objectBo);

		objectBo = processObject(objectBo, userId, withResource, withUser, withBizInfo);
		return objectBo;
	}

	/**
	 *
	 * @param objectBo
	 * @param userId 非空时表示要查询对象与用户的关系(是否点赞、是否收藏等)
	 * @param withResource 是否查询对象资源
	 * @param withUser 是否查询对象所有者
	 * @param withBizInfo 是否查询对象业务信息
	 * @return
	 */
	public ObjectBo processObject(ObjectBo objectBo, Long userId, Boolean withResource, Boolean withUser,
			Boolean withBizInfo) {
		if (objectBo == null) {
			return objectBo;
		}

		// 转换成指定的业务对象
		if (ObjectTypeEnum.valueOfCode(objectBo.getObjectType()) == ObjectTypeEnum.SCHOOL) {
			SchoolObjectBo schoolBo = new SchoolObjectBo();
			BeanUtils.copyProperties(objectBo, schoolBo);
			objectBo = schoolBo;
		}
		// 查询用户与对象的关系信息
		if (userId != null) {
			processLikeFavor(userId, objectBo);
		}
		// 查询对象的资源信息
		if (withResource != null && withResource) {
			objectBo.setResourceList(resourceService.listResource(EntityTypeEnum.OBJECT.getCode(),
					objectBo.getObjectId()));
		}
		// 查询对象的所有者信息
		if (withUser != null && withUser) {
			objectBo.setUser(userService.getUserInfoSimple(objectBo.getUserId()));
		}
		// 查询对象的具体业务属性
		if (withBizInfo != null && withBizInfo) {
			if (objectBo instanceof SchoolObjectBo) { // 学校业务对象
				SchoolObjectBo schoolObjectBo = (SchoolObjectBo) objectBo;
				schoolObjectBo.setSchool(getSchoolByObjectId(schoolObjectBo.getObjectId()));
			}
		}
		return objectBo;
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

	/**
	 *
	 * @param objectId
	 * @return
	 */
	public SchoolBo getSchoolByObjectId(Long objectId) {
		SchoolDo schoolDo = objectDao.selectSchoolByObjectId(objectId);
		if (schoolDo != null) {
			SchoolBo schoolBo = new SchoolBo();
			BeanUtils.copyProperties(schoolDo, schoolBo);
			return schoolBo;
		}
		return null;
	}
}
