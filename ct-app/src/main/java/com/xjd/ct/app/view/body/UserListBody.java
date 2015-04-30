package com.xjd.ct.app.view.body;

import java.util.List;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.UserForOtherVo;

public class UserListBody extends ViewBody {
	private List<UserForOtherVo> userInfoList;

	/** @return the userInfoList */
	public List<UserForOtherVo> getUserInfoList() {
		return userInfoList;
	}

	/** @param userInfoList the userInfoList to set */
	public void setUserInfoList(List<UserForOtherVo> userInfoList) {
		this.userInfoList = userInfoList;
	}

}
