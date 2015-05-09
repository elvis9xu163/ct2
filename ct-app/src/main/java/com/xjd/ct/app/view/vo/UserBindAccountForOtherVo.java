package com.xjd.ct.app.view.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author elvis.xu
 * @since 2015-04-30 23:45
 */
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class UserBindAccountForOtherVo {
	private Long accountId;

	private Long userId;

	private Byte accountType;

	private String openId;

	@JsonIgnore
	private String accessToken;

	@JsonIgnore
	private Long accessTokenExpireTime;

	private Long addTime;

	private Long updTime;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Byte getAccountType() {
		return accountType;
	}

	public void setAccountType(Byte accountType) {
		this.accountType = accountType;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Long getAccessTokenExpireTime() {
		return accessTokenExpireTime;
	}

	public void setAccessTokenExpireTime(Long accessTokenExpireTime) {
		this.accessTokenExpireTime = accessTokenExpireTime;
	}

	public Long getAddTime() {
		return addTime;
	}

	public void setAddTime(Long addTime) {
		this.addTime = addTime;
	}

	public Long getUpdTime() {
		return updTime;
	}

	public void setUpdTime(Long updTime) {
		this.updTime = updTime;
	}
}