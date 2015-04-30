package com.xjd.ct.app.view.vo;

import java.util.Date;

/**
 * @author elvis.xu
 * @since 2015-03-23 18:11
 */
public class UserBindAccountForOtherVo {
	private Long accountId;

	private Long userId;

	private Byte accountType;

	private Date addTime;

	private Date updTime;

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

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getUpdTime() {
		return updTime;
	}

	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
}
