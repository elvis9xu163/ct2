package com.xjd.ct.app.view.body;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.UserInfoForSelfVo;

/**
 * 用户信息
 * 
 * @author elvis.xu
 * @since 2015-03-23 18:34
 */
public class UserInfoForSelfBody extends ViewBody {
	private UserInfoForSelfVo userInfo;

	public UserInfoForSelfVo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfoForSelfVo userInfo) {
		this.userInfo = userInfo;
	}
}
