package com.xjd.ct.app.view.vo;

import java.util.Date;

/**
 * @author elvis.xu
 * @since 2015-03-23 18:11
 */
public class UserBabyForOtherVo {
	private Long babyId;

	private Long userId;

	private String babyNickname;

	private Byte babySex;

	private Date babyBirth;

	private Date addTime;

	private Date updTime;

	public Long getBabyId() {
		return babyId;
	}

	public void setBabyId(Long babyId) {
		this.babyId = babyId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getBabyNickname() {
		return babyNickname;
	}

	public void setBabyNickname(String babyNickname) {
		this.babyNickname = babyNickname;
	}

	public Byte getBabySex() {
		return babySex;
	}

	public void setBabySex(Byte babySex) {
		this.babySex = babySex;
	}

	public Date getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(Date babyBirth) {
		this.babyBirth = babyBirth;
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
