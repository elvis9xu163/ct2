package com.xjd.ct.app.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.xjd.ct.app.view.vo.*;
import com.xjd.ct.biz.bo.*;

/**
 * @author elvis.xu
 * @since 2015-05-01 11:02
 */
public abstract class BeanTransport {
	public static void copyTo(UserBo bo, UserInfoForSelfVo vo) {
		BeanUtils.copyProperties(bo, vo);
		if (bo.getResourceList() != null) {
			List<ResourceVo> resourceVoList = new ArrayList<ResourceVo>(bo.getResourceList().size());
			for (ResourceBo resourceBo : bo.getResourceList()) {
				ResourceVo resourceVo = new ResourceVo();
				BeanUtils.copyProperties(resourceBo, resourceVo);
				resourceVoList.add(resourceVo);
			}
			vo.setResourceList(resourceVoList);
		}
		if (bo.getBabyList() != null) {
			List<UserBabyForSelfVo> babyVoList = new ArrayList<UserBabyForSelfVo>(bo.getBabyList().size());
			for (UserBabyBo babyBo : bo.getBabyList()) {
				UserBabyForSelfVo babyVo = new UserBabyForSelfVo();
				BeanUtils.copyProperties(babyBo, babyVo);
				babyVoList.add(babyVo);
			}
			vo.setBabyList(babyVoList);
		}
		if (bo.getBindAccountList() != null) {
			List<UserBindAccountForSelfVo> actVoList = new ArrayList<UserBindAccountForSelfVo>(bo.getBindAccountList()
					.size());
			for (UserBindAccountBo actBo : bo.getBindAccountList()) {
				UserBindAccountForSelfVo actVo = new UserBindAccountForSelfVo();
				BeanUtils.copyProperties(actBo, actVo);
				actVoList.add(actVo);
			}
			vo.setBindAccountList(actVoList);
		}
	}

	public static void copyTo(UserBo bo, UserInfoForOtherVo vo) {
		BeanUtils.copyProperties(bo, vo);
		if (bo.getResourceList() != null) {
			List<ResourceVo> resourceVoList = new ArrayList<ResourceVo>(bo.getResourceList().size());
			for (ResourceBo resourceBo : bo.getResourceList()) {
				ResourceVo resourceVo = new ResourceVo();
				BeanUtils.copyProperties(resourceBo, resourceVo);
				resourceVoList.add(resourceVo);
			}
			vo.setResourceList(resourceVoList);
		}
		if (bo.getBabyList() != null) {
			List<UserBabyForOtherVo> babyVoList = new ArrayList<UserBabyForOtherVo>(bo.getBabyList().size());
			for (UserBabyBo babyBo : bo.getBabyList()) {
				UserBabyForOtherVo babyVo = new UserBabyForOtherVo();
				BeanUtils.copyProperties(babyBo, babyVo);
				babyVoList.add(babyVo);
			}
			vo.setBabyList(babyVoList);
		}
		if (bo.getBindAccountList() != null) {
			List<UserBindAccountForOtherVo> actVoList = new ArrayList<UserBindAccountForOtherVo>(bo
					.getBindAccountList().size());
			for (UserBindAccountBo actBo : bo.getBindAccountList()) {
				UserBindAccountForOtherVo actVo = new UserBindAccountForOtherVo();
				BeanUtils.copyProperties(actBo, actVo);
				actVoList.add(actVo);
			}
			vo.setBindAccountList(actVoList);
		}
	}

	public static void copyTo(UserBo bo, UserInfoSimplestVo vo) {
		BeanUtils.copyProperties(bo, vo);
		if (bo.getResourceList() != null) {
			List<ResourceVo> resourceVoList = new ArrayList<ResourceVo>(bo.getResourceList().size());
			for (ResourceBo resourceBo : bo.getResourceList()) {
				ResourceVo resourceVo = new ResourceVo();
				BeanUtils.copyProperties(resourceBo, resourceVo);
				resourceVoList.add(resourceVo);
			}
			vo.setResourceList(resourceVoList);
		}
	}

	public static void copyTo(ObjectBo bo, ObjectVo vo) {
		BeanUtils.copyProperties(bo, vo);
		if (bo.getResourceList() != null) {
			List<ResourceVo> resourceVoList = new ArrayList<ResourceVo>(bo.getResourceList().size());
			for (ResourceBo resourceBo : bo.getResourceList()) {
				ResourceVo resourceVo = new ResourceVo();
				BeanUtils.copyProperties(resourceBo, resourceVo);
				resourceVoList.add(resourceVo);
			}
		}
		if (bo.getUser() != null) {
			UserInfoSimplestVo userInfoSimplest = new UserInfoSimplestVo();
			copyTo(bo.getUser(), userInfoSimplest);
			vo.setUser(userInfoSimplest);
		}
	}

	public static void copyTo(BannerBo bo, BannerVo vo) {
		BeanUtils.copyProperties(bo, vo);
		if (bo.getResource() != null) {
			ResourceVo resourceVo = new ResourceVo();
			BeanUtils.copyProperties(bo.getResource(), resourceVo);
			vo.setResource(resourceVo);
		}
	}

	public static void copyTo(LaunchPicBo bo, LaunchPicVo vo) {
		BeanUtils.copyProperties(bo, vo);
		if (bo.getResource() != null) {
			ResourceVo resourceVo = new ResourceVo();
			BeanUtils.copyProperties(bo.getResource(), resourceVo);
			vo.setResource(resourceVo);
		}
	}

	public static void copyTo(ObjectCommentBo bo, ObjectCommentVo vo) {
		BeanUtils.copyProperties(bo, vo);
		if (bo.getUser() != null) {
			UserInfoSimplestVo userInfoSimplest = new UserInfoSimplestVo();
			BeanTransport.copyTo(bo.getUser(), userInfoSimplest);
			vo.setUser(userInfoSimplest);
		}
	}
}
