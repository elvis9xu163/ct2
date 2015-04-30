package com.xjd.ct.biz.bo;

public class TokenBo extends BaseBo {
	private String token;

	private String salt;

	private String userIp;

	private Long userId;

	private Long addTime;

	private Long updTime;

	/** @return the token */
	public String getToken() {
		return token;
	}

	/** @param token the token to set */
	public void setToken(String token) {
		this.token = token;
	}

	/** @return the salt */
	public String getSalt() {
		return salt;
	}

	/** @param salt the salt to set */
	public void setSalt(String salt) {
		this.salt = salt;
	}

	/** @return the userIp */
	public String getUserIp() {
		return userIp;
	}

	/** @param userIp the userIp to set */
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	/** @return the userId */
	public Long getUserId() {
		return userId;
	}

	/** @param userId the userId to set */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/** @return the addTime */
	public Long getAddTime() {
		return addTime;
	}

	/** @param addTime the addTime to set */
	public void setAddTime(Long addTime) {
		this.addTime = addTime;
	}

	/** @return the updTime */
	public Long getUpdTime() {
		return updTime;
	}

	/** @param updTime the updTime to set */
	public void setUpdTime(Long updTime) {
		this.updTime = updTime;
	}
}