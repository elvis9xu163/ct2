package com.xjd.ct.app.view.vo;

import java.util.Date;
import java.util.List;

public class UserForOtherVo {
	// User
	private Long userId;

	private Byte mobileVerifyFlag;

	private Byte emailVerifyFlag;

	private Byte qqBindFlag;

	private Byte weixinBindFlag;

	private Byte sinaWeiboBindFlag;

	private Byte tecentWeiboFlag;

	private Date addTime;

	// User Info
	private Byte userType;

	private Integer gradeExp;

	private Byte gradeLevel;

	private Integer point;

	private String nickname;

	private String headImgRes;

	private Byte sex;

	private Date birth;

	private String moodWords;

	private Date moodWordsTime;

	// User Summary
	private Integer informCount;

	private Integer favorCount;

	private Integer publishCount;

	private Integer idolCount;

	private Integer fansCount;

	// Babys
	private List<? extends UserBabyForOtherVo> babyList;

	// BindAccounts
	private List<? extends UserBindAccountForOtherVo> bindAccountList;

	/** @return the userId */
	public Long getUserId() {
		return userId;
	}

	/** @param userId the userId to set */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/** @return the mobileVerifyFlag */
	public Byte getMobileVerifyFlag() {
		return mobileVerifyFlag;
	}

	/** @param mobileVerifyFlag the mobileVerifyFlag to set */
	public void setMobileVerifyFlag(Byte mobileVerifyFlag) {
		this.mobileVerifyFlag = mobileVerifyFlag;
	}

	/** @return the emailVerifyFlag */
	public Byte getEmailVerifyFlag() {
		return emailVerifyFlag;
	}

	/** @param emailVerifyFlag the emailVerifyFlag to set */
	public void setEmailVerifyFlag(Byte emailVerifyFlag) {
		this.emailVerifyFlag = emailVerifyFlag;
	}

	/** @return the qqBindFlag */
	public Byte getQqBindFlag() {
		return qqBindFlag;
	}

	/** @param qqBindFlag the qqBindFlag to set */
	public void setQqBindFlag(Byte qqBindFlag) {
		this.qqBindFlag = qqBindFlag;
	}

	/** @return the weixinBindFlag */
	public Byte getWeixinBindFlag() {
		return weixinBindFlag;
	}

	/** @param weixinBindFlag the weixinBindFlag to set */
	public void setWeixinBindFlag(Byte weixinBindFlag) {
		this.weixinBindFlag = weixinBindFlag;
	}

	/** @return the sinaWeiboBindFlag */
	public Byte getSinaWeiboBindFlag() {
		return sinaWeiboBindFlag;
	}

	/** @param sinaWeiboBindFlag the sinaWeiboBindFlag to set */
	public void setSinaWeiboBindFlag(Byte sinaWeiboBindFlag) {
		this.sinaWeiboBindFlag = sinaWeiboBindFlag;
	}

	/** @return the tecentWeiboFlag */
	public Byte getTecentWeiboFlag() {
		return tecentWeiboFlag;
	}

	/** @param tecentWeiboFlag the tecentWeiboFlag to set */
	public void setTecentWeiboFlag(Byte tecentWeiboFlag) {
		this.tecentWeiboFlag = tecentWeiboFlag;
	}

	/** @return the addTime */
	public Date getAddTime() {
		return addTime;
	}

	/** @param addTime the addTime to set */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	/** @return the userType */
	public Byte getUserType() {
		return userType;
	}

	/** @param userType the userType to set */
	public void setUserType(Byte userType) {
		this.userType = userType;
	}

	/** @return the gradeExp */
	public Integer getGradeExp() {
		return gradeExp;
	}

	/** @param gradeExp the gradeExp to set */
	public void setGradeExp(Integer gradeExp) {
		this.gradeExp = gradeExp;
	}

	/** @return the gradeLevel */
	public Byte getGradeLevel() {
		return gradeLevel;
	}

	/** @param gradeLevel the gradeLevel to set */
	public void setGradeLevel(Byte gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	/** @return the point */
	public Integer getPoint() {
		return point;
	}

	/** @param point the point to set */
	public void setPoint(Integer point) {
		this.point = point;
	}

	/** @return the nickname */
	public String getNickname() {
		return nickname;
	}

	/** @param nickname the nickname to set */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/** @return the headImgRes */
	public String getHeadImgRes() {
		return headImgRes;
	}

	/** @param headImgRes the headImgRes to set */
	public void setHeadImgRes(String headImgRes) {
		this.headImgRes = headImgRes;
	}

	/** @return the sex */
	public Byte getSex() {
		return sex;
	}

	/** @param sex the sex to set */
	public void setSex(Byte sex) {
		this.sex = sex;
	}

	/** @return the birth */
	public Date getBirth() {
		return birth;
	}

	/** @param birth the birth to set */
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	/** @return the moodWords */
	public String getMoodWords() {
		return moodWords;
	}

	/** @param moodWords the moodWords to set */
	public void setMoodWords(String moodWords) {
		this.moodWords = moodWords;
	}

	/** @return the moodWordsTime */
	public Date getMoodWordsTime() {
		return moodWordsTime;
	}

	/** @param moodWordsTime the moodWordsTime to set */
	public void setMoodWordsTime(Date moodWordsTime) {
		this.moodWordsTime = moodWordsTime;
	}

	/** @return the informCount */
	public Integer getInformCount() {
		return informCount;
	}

	/** @param informCount the informCount to set */
	public void setInformCount(Integer informCount) {
		this.informCount = informCount;
	}

	/** @return the favorCount */
	public Integer getFavorCount() {
		return favorCount;
	}

	/** @param favorCount the favorCount to set */
	public void setFavorCount(Integer favorCount) {
		this.favorCount = favorCount;
	}

	/** @return the publishCount */
	public Integer getPublishCount() {
		return publishCount;
	}

	/** @param publishCount the publishCount to set */
	public void setPublishCount(Integer publishCount) {
		this.publishCount = publishCount;
	}

	/** @return the idolCount */
	public Integer getIdolCount() {
		return idolCount;
	}

	/** @param idolCount the idolCount to set */
	public void setIdolCount(Integer idolCount) {
		this.idolCount = idolCount;
	}

	/** @return the fansCount */
	public Integer getFansCount() {
		return fansCount;
	}

	/** @param fansCount the fansCount to set */
	public void setFansCount(Integer fansCount) {
		this.fansCount = fansCount;
	}

	/** @return the babyList */
	public List<? extends UserBabyForOtherVo> getBabyList() {
		return babyList;
	}

	/** @param babyList the babyList to set */
	public void setBabyList(List<? extends UserBabyForOtherVo> babyList) {
		this.babyList = babyList;
	}

	/** @return the bindAccountList */
	public List<? extends UserBindAccountForOtherVo> getBindAccountList() {
		return bindAccountList;
	}

	/** @param bindAccountList the bindAccountList to set */
	public void setBindAccountList(List<? extends UserBindAccountForOtherVo> bindAccountList) {
		this.bindAccountList = bindAccountList;
	}

}
