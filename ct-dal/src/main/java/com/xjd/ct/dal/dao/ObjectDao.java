package com.xjd.ct.dal.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dos.*;
import com.xjd.ct.dal.map.*;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.enums.ObjectTypeEnum;

/**
 * @author elvis.xu
 * @since 2015-05-01 12:01
 */
@Repository
@Transactional
public class ObjectDao {
	@Autowired
	ObjectDoMapper objectDoMapper;
	@Autowired
	ObjectFavorDoMapper objectFavorDoMapper;
	@Autowired
	ObjectLikeDoMapper objectLikeDoMapper;
	@Autowired
	ObjectCommentDoMapper objectCommentDoMapper;
	@Autowired
	BannerDoMapper bannerDoMapper;
	@Autowired
	RecommendDoMapper recommendDoMapper;
	@Autowired
	IdolDoMapper idolDoMapper;
	@Autowired
	LaunchPicDoMapper launchPicDoMapper;
	@Autowired
	SchoolDoMapper schoolDoMapper;

	public List<ObjectDo> selectObjectByUserIdAndPage(Long userId, long offset, int count) {
		ObjectDoExample example = new ObjectDoExample();
		example.or().andUserIdEqualTo(userId);
		example.setOrderByClause("object_id desc");
		example.setOffsetAndLimit(offset - 1, count);

		return objectDoMapper.selectByExample(example);
	}

	public List<ObjectFavorDo> selectObjectFavorByUserIdAndPage(Long userId, long offset, int count) {
		ObjectFavorDoExample example = new ObjectFavorDoExample();
		example.or().andUserIdEqualTo(userId);
		example.setOrderByClause("add_time desc");
		example.setOffsetAndLimit(offset - 1, count);

		return objectFavorDoMapper.selectByExample(example);
	}

	public List<ObjectDo> selectObjectByObjectIdList(List<Long> objectIdList) {
		ObjectDoExample example = new ObjectDoExample();
		example.or().andObjectIdIn(objectIdList);

		return objectDoMapper.selectByExample(example);
	}

	public List<ObjectLikeDo> selectObjectLikeByUserIdAndPage(Long userId, long offset, int count) {
		ObjectLikeDoExample example = new ObjectLikeDoExample();
		example.or().andUserIdEqualTo(userId);
		example.setOrderByClause("add_time desc");
		example.setOffsetAndLimit(offset - 1, count);

		return objectLikeDoMapper.selectByExample(example);
	}

	public ObjectDo selectObjectByObjectId(Long objectId) {
		return objectDoMapper.selectByPrimaryKey(objectId);
	}

	public ObjectLikeDo selectObjectLikeByObjectIdAndUserId(Long objectId, Long userId) {
		ObjectLikeDoKey key = new ObjectLikeDo();
		key.setObjectId(objectId);
		key.setUserId(userId);
		return objectLikeDoMapper.selectByPrimaryKey(key);
	}

	public int insertObjectLike(ObjectLikeDo objectLikeDo) {
		return objectLikeDoMapper.insert(objectLikeDo);
	}

	public int increaseLikeYesCount(Long objectId) {
		ObjectDo objectDo = selectObjectByObjectId(objectId);

		ObjectDo upd = new ObjectDo();
		upd.setObjectId(objectId);
		upd.setLikeYesCount(objectDo.getLikeYesCount() + 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return objectDoMapper.updateByPrimaryKeySelective(upd);
	}

	public int increaseLikeNoCount(Long objectId) {
		ObjectDo objectDo = selectObjectByObjectId(objectId);

		ObjectDo upd = new ObjectDo();
		upd.setObjectId(objectId);
		upd.setLikeNoCount(objectDo.getLikeNoCount() + 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return objectDoMapper.updateByPrimaryKeySelective(upd);
	}

	public int deleteObjectLikeByObjectIdAndUserId(Long objectId, Long userId) {
		ObjectLikeDoKey key = new ObjectLikeDo();
		key.setObjectId(objectId);
		key.setUserId(userId);
		return objectLikeDoMapper.deleteByPrimaryKey(key);
	}

	public int decreaseLikeYesCount(Long objectId) {
		ObjectDo objectDo = selectObjectByObjectId(objectId);

		ObjectDo upd = new ObjectDo();
		upd.setObjectId(objectId);
		upd.setLikeYesCount(objectDo.getLikeYesCount() - 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return objectDoMapper.updateByPrimaryKeySelective(upd);
	}

	public int decreaseLikeNoCount(Long objectId) {
		ObjectDo objectDo = selectObjectByObjectId(objectId);

		ObjectDo upd = new ObjectDo();
		upd.setObjectId(objectId);
		upd.setLikeNoCount(objectDo.getLikeNoCount() - 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return objectDoMapper.updateByPrimaryKeySelective(upd);
	}

	public ObjectFavorDo selectObjectFavorByObjectIdAndUserId(Long objectId, Long userId) {
		ObjectFavorDoKey key = new ObjectFavorDoKey();
		key.setObjectId(objectId);
		key.setUserId(userId);
		return objectFavorDoMapper.selectByPrimaryKey(key);
	}

	public int insertObjectFavor(ObjectFavorDo objectFavorDo) {
		return objectFavorDoMapper.insert(objectFavorDo);
	}

	public int increaseFavorCount(Long objectId) {
		ObjectDo objectDo = selectObjectByObjectId(objectId);

		ObjectDo upd = new ObjectDo();
		upd.setObjectId(objectId);
		upd.setFavorCount(objectDo.getFavorCount() + 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return objectDoMapper.updateByPrimaryKeySelective(upd);
	}

	public int decreaseFavorCount(Long objectId) {
		ObjectDo objectDo = selectObjectByObjectId(objectId);

		ObjectDo upd = new ObjectDo();
		upd.setObjectId(objectId);
		upd.setFavorCount(objectDo.getFavorCount() - 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return objectDoMapper.updateByPrimaryKeySelective(upd);
	}

	public int deleteObjectFavorByObjectIdAndUserId(Long objectId, Long userId) {
		ObjectFavorDoKey key = new ObjectFavorDoKey();
		key.setObjectId(objectId);
		key.setUserId(userId);
		return objectFavorDoMapper.deleteByPrimaryKey(key);
	}

	public ObjectCommentDo selectObjectCommentByCommentId(Long commentId) {
		return objectCommentDoMapper.selectByPrimaryKey(commentId);
	}

	public int insertObjectComment(ObjectCommentDo objectCommentDo) {
		return objectCommentDoMapper.insert(objectCommentDo);
	}

	public int deleteObjectCommentByCommentId(Long commentId) {
		return objectCommentDoMapper.deleteByPrimaryKey(commentId);
	}

	public int increaseCommentCount(Long objectId) {
		ObjectDo objectDo = selectObjectByObjectId(objectId);

		ObjectDo upd = new ObjectDo();
		upd.setObjectId(objectId);
		upd.setCommentCount(objectDo.getCommentCount() + 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return objectDoMapper.updateByPrimaryKeySelective(upd);
	}

	public int decreaseCommentCount(Long objectId) {
		ObjectDo objectDo = selectObjectByObjectId(objectId);

		ObjectDo upd = new ObjectDo();
		upd.setObjectId(objectId);
		upd.setCommentCount(objectDo.getCommentCount() - 1);
		upd.setUpdTime(DateUtil.nowInMilliseconds());

		return objectDoMapper.updateByPrimaryKeySelective(upd);
	}

	public List<ObjectCommentDo> selectObjectCommentByObjectId(Long objectId) {
		ObjectCommentDoExample example = new ObjectCommentDoExample();
		example.or().andObjectIdEqualTo(objectId);
		example.setOrderByClause("comment_id asc");

		return objectCommentDoMapper.selectByExample(example);
	}

	public List<BannerDo> selectBanner() {
		return bannerDoMapper.selectByExample(null);
	}

	public List<RecommendDo> selectRecommendByPageOrderByAddTimeDesc(Long offset, Integer count) {
		RecommendDoExample example = new RecommendDoExample();
		example.setOrderByClause("ADD_TIME desc");
		example.setOffsetAndLimit(offset - 1, count);

		return recommendDoMapper.selectByExample(example);
	}

	public List<ObjectDo> selectObjectByObjectTypeListAndPageOrderByAddTimeDesc(List<Byte> objectTypeList, Long offset,
			Integer count) {
		ObjectDoExample example = new ObjectDoExample();
		example.or().andObjectTypeIn(objectTypeList);
		example.setOrderByClause("ADD_TIME desc");
		example.setOffsetAndLimit(offset - 1, count);
		return objectDoMapper.selectByExample(example);
	}

	public List<ObjectDo> selectObjectByObjectTypeListAndPageOrderByLikeYesCountDesc(List<Byte> objectTypeList,
			Long offset, Integer count) {
		ObjectDoExample example = new ObjectDoExample();
		example.or().andObjectTypeIn(objectTypeList);
		example.setOrderByClause("like_yes_count desc");
		example.setOffsetAndLimit(offset - 1, count);
		return objectDoMapper.selectByExample(example);
	}

	public List<ObjectDo> selectIdolUserPublishByPageOrderByAddTimeDesc(Long userId, Long offset, Integer count) {
		// TODO 优化
		List<Long> uidList = new ArrayList<Long>();

		IdolDoExample idolDoExample = new IdolDoExample();
		idolDoExample.or().andUserIdEqualTo(userId);
		List<IdolDo> idolDoList = idolDoMapper.selectByExample(idolDoExample);
		for (IdolDo idolDo : idolDoList) {
			uidList.add(idolDo.getIdolUserId());
		}

//		idolDoExample = new IdolDoExample();
//		idolDoExample.or().andIdolUserIdEqualTo(userId);
//		idolDoList = idolDoMapper.selectByExample(idolDoExample);
//		for (IdolDo idolDo : idolDoList) {
//			uidList.add(idolDo.getUserId());
//		}

		if (uidList.isEmpty()) {
			return Collections.emptyList();
		}

		ObjectDoExample example = new ObjectDoExample();
		example.or().andObjectTypeEqualTo(ObjectTypeEnum.PUBLISH.getCode()).andUserIdIn(uidList);
		example.setOrderByClause("ADD_TIME desc");
		example.setOffsetAndLimit(offset - 1, count);
		return objectDoMapper.selectByExample(example);
	}

	public int insertObject(ObjectDo objectDo) {
		return objectDoMapper.insert(objectDo);
	}

	public List<ObjectDo> selectObjectByObjectTypeAndUserIdAndPageOrderByAddTimeDesc(byte objectType, Long userId, Long offset, Integer count) {
		ObjectDoExample example = new ObjectDoExample();
		example.or().andObjectTypeEqualTo(objectType).andUserIdEqualTo(userId);
		example.setOrderByClause("ADD_TIME desc");
		example.setOffsetAndLimit(offset - 1, count);
		return objectDoMapper.selectByExample(example);
	}

	public List<LaunchPicDo> selectLaunchPicNewerThen(Long lastTime) {
		LaunchPicDoExample example = new LaunchPicDoExample();
		if (lastTime != null) {
			example.or().andAddTimeGreaterThan(lastTime);
		}

		return launchPicDoMapper.selectByExample(example);
	}

	public int deleteObjectByObjectId(Long objectId) {
		return objectDoMapper.deleteByPrimaryKey(objectId);
	}

	public int insertRecommend(RecommendDo recommendDo) {
		return recommendDoMapper.insert(recommendDo);
	}

	public int deleteAllLaunchPic() {
		return launchPicDoMapper.deleteByExample(null);
	}

	public int insertLaunchPic(LaunchPicDo launchPicDo) {
		return launchPicDoMapper.insert(launchPicDo);
	}

	public int insertBanner(BannerDo bannerDo) {
		return bannerDoMapper.insert(bannerDo);
	}

	/**
	 * 找出objectId周边(上翻则找出>objectId的记录, 下翻则找出<objectId的记录)
	 * 注: 无论上翻还是下翻找出的都是最靠近objectId的count条记录，排序也是不一样的，越靠近objectId的记录越靠前
	 * @param objectTypeList
	 * @param objectId
	 * @param count
	 * @param turnDown
	 * @return
	 */
	public List<ObjectDo> selectObjectPageByObjectId(List<Byte> objectTypeList, Long objectId, Integer count, Boolean turnDown) {
		ObjectDoExample example = new ObjectDoExample();
		ObjectDoExample.Criteria criteria = example.or();
		criteria.andObjectTypeIn(objectTypeList);

		if (turnDown) {
			if (objectId != null) {
				criteria.andObjectIdLessThan(objectId);
			}
			example.setOrderByClause("OBJECT_ID desc");
		} else {
			if (objectId != null) {
				criteria.andObjectIdGreaterThan(objectId);
			}
			example.setOrderByClause("OBJECT_ID");
		}
		example.setOffsetAndLimit(0, count);

		return objectDoMapper.selectByExample(example);
	}

	/**
	 * @param objectId
	 * @return
	 */
	public SchoolDo selectSchoolByObjectId(Long objectId) {
		return schoolDoMapper.selectByPrimaryKey(objectId);
	}

	public int insertSchool(SchoolDo schoolDo) {
		return schoolDoMapper.insert(schoolDo);
	}

	public int updateObjectByObjectIdSelective(ObjectDo objectDo) {
		return objectDoMapper.updateByPrimaryKeySelective(objectDo);
	}

	public int updateSchoolByObjectIdSelective(SchoolDo schoolDo) {
		return schoolDoMapper.updateByPrimaryKeySelective(schoolDo);
	}
}
