package com.xjd.ct.biz.bo;

/**
 * @author elvis.xu
 * @since 2015-04-30 23:54
 */
public class UserBabyBo {
	private Long babyId;

	private Long userId;

	private String babyNickname;

	private Byte babySex;

	private Long babyBirth;

	private String babyRealname;

	private Long addTime;

	private Long updTime;

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

	public Long getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(Long babyBirth) {
		this.babyBirth = babyBirth;
	}

	public String getBabyRealname() {
		return babyRealname;
	}

	public void setBabyRealname(String babyRealname) {
		this.babyRealname = babyRealname;
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
