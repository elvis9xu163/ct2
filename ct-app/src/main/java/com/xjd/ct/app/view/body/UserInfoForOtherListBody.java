package com.xjd.ct.app.view.body;

import java.util.List;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.UserInfoForOtherVo;

public class UserInfoForOtherListBody extends ViewBody {
	private List<UserInfoForOtherVo> userInfoList;

	public List<UserInfoForOtherVo> getUserInfoList() {
		return userInfoList;
	}

	public void setUserInfoList(List<UserInfoForOtherVo> userInfoList) {
		this.userInfoList = userInfoList;
	}
}
