package com.xjd.ct.app.view.body;

import com.xjd.ct.app.view.ViewBody;
import com.xjd.ct.app.view.vo.UserForOtherVo;

/**
 * 用户信息
 * 
 * @author elvis.xu
 * @since 2015-03-23 18:34
 */
public class UserInfoBody extends ViewBody {
	private UserForOtherVo userInfo;

	/** @return the userInfo */
	public UserForOtherVo getUserInfo() {
		return userInfo;
	}

	/** @param userInfo the userInfo to set */
	public void setUserInfo(UserForOtherVo userInfo) {
		this.userInfo = userInfo;
	}

}
