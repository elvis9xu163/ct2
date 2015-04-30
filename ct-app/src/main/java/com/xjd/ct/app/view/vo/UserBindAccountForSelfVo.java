package com.xjd.ct.app.view.vo;

import java.util.Date;

/**
 * @author elvis.xu
 * @since 2015-03-23 18:11
 */
public class UserBindAccountForSelfVo extends UserBindAccountForOtherVo {
	private String openId;

	private String accessToken;

	private Date accessTokenExpireTime;

	/** @return the openId */
	public String getOpenId() {
		return openId;
	}

	/** @param openId the openId to set */
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/** @return the accessToken */
	public String getAccessToken() {
		return accessToken;
	}

	/** @param accessToken the accessToken to set */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/** @return the accessTokenExpireTime */
	public Date getAccessTokenExpireTime() {
		return accessTokenExpireTime;
	}

	/** @param accessTokenExpireTime the accessTokenExpireTime to set */
	public void setAccessTokenExpireTime(Date accessTokenExpireTime) {
		this.accessTokenExpireTime = accessTokenExpireTime;
	}

}
