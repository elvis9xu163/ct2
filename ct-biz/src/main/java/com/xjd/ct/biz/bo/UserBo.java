package com.xjd.ct.biz.bo;

import java.math.BigDecimal;
import java.util.Date;

public class UserBo extends BaseBo {
	private Long userId;

	private String password;

	private String mobile;

	private String email;

	private Byte verifyMobileFlag;

	private Byte verifyEmailFlag;

	private Byte bindQqFlag;

	private Byte bindWeixinFlag;

	private Byte bindSinaWeiboFlag;

	private Byte bindTecentWeiboFlag;

	private String realName;

	private Byte certType;

	private String certNo;

	private Short failTimes;

	private String lastIp;

	private Long lastTime;

	private BigDecimal lastLon;

	private BigDecimal lastLat;

	private String lastAddr;

	private Byte userStatus;

	private Byte userType;

	private Integer gradeExp;

	private Byte gradeLevel;

	private Integer point;

	private String nickname;

	private Byte sex;

	private Long birth;

	private String moodWords;

	private Long moodWordsTime;

	private Integer countInform;

	private Integer countFavor;

	private Integer countPublish;

	private Integer countIdol;

	private Integer countFans;

	private Long addTime;

	private Long updTime;

	/** @return the userId */
	public Long getUserId() {
		return userId;
	}

	/** @param userId the userId to set */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/** @return the password */
	public String getPassword() {
		return password;
	}

	/** @param password the password to set */
	public void setPassword(String password) {
		this.password = password;
	}

	/** @return the mobile */
	public String getMobile() {
		return mobile;
	}

	/** @param mobile the mobile to set */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/** @return the email */
	public String getEmail() {
		return email;
	}

	/** @param email the email to set */
	public void setEmail(String email) {
		this.email = email;
	}

	/** @return the verifyMobileFlag */
	public Byte getVerifyMobileFlag() {
		return verifyMobileFlag;
	}

	/** @param verifyMobileFlag the verifyMobileFlag to set */
	public void setVerifyMobileFlag(Byte verifyMobileFlag) {
		this.verifyMobileFlag = verifyMobileFlag;
	}

	/** @return the verifyEmailFlag */
	public Byte getVerifyEmailFlag() {
		return verifyEmailFlag;
	}

	/** @param verifyEmailFlag the verifyEmailFlag to set */
	public void setVerifyEmailFlag(Byte verifyEmailFlag) {
		this.verifyEmailFlag = verifyEmailFlag;
	}

	/** @return the bindQqFlag */
	public Byte getBindQqFlag() {
		return bindQqFlag;
	}

	/** @param bindQqFlag the bindQqFlag to set */
	public void setBindQqFlag(Byte bindQqFlag) {
		this.bindQqFlag = bindQqFlag;
	}

	/** @return the bindWeixinFlag */
	public Byte getBindWeixinFlag() {
		return bindWeixinFlag;
	}

	/** @param bindWeixinFlag the bindWeixinFlag to set */
	public void setBindWeixinFlag(Byte bindWeixinFlag) {
		this.bindWeixinFlag = bindWeixinFlag;
	}

	/** @return the bindSinaWeiboFlag */
	public Byte getBindSinaWeiboFlag() {
		return bindSinaWeiboFlag;
	}

	/** @param bindSinaWeiboFlag the bindSinaWeiboFlag to set */
	public void setBindSinaWeiboFlag(Byte bindSinaWeiboFlag) {
		this.bindSinaWeiboFlag = bindSinaWeiboFlag;
	}

	/** @return the bindTecentWeiboFlag */
	public Byte getBindTecentWeiboFlag() {
		return bindTecentWeiboFlag;
	}

	/** @param bindTecentWeiboFlag the bindTecentWeiboFlag to set */
	public void setBindTecentWeiboFlag(Byte bindTecentWeiboFlag) {
		this.bindTecentWeiboFlag = bindTecentWeiboFlag;
	}

	/** @return the realName */
	public String getRealName() {
		return realName;
	}

	/** @param realName the realName to set */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/** @return the certType */
	public Byte getCertType() {
		return certType;
	}

	/** @param certType the certType to set */
	public void setCertType(Byte certType) {
		this.certType = certType;
	}

	/** @return the certNo */
	public String getCertNo() {
		return certNo;
	}

	/** @param certNo the certNo to set */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	/** @return the failTimes */
	public Short getFailTimes() {
		return failTimes;
	}

	/** @param failTimes the failTimes to set */
	public void setFailTimes(Short failTimes) {
		this.failTimes = failTimes;
	}

	/** @return the lastIp */
	public String getLastIp() {
		return lastIp;
	}

	/** @param lastIp the lastIp to set */
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	/** @return the lastTime */
	public Long getLastTime() {
		return lastTime;
	}

	/** @param lastTime the lastTime to set */
	public void setLastTime(Long lastTime) {
		this.lastTime = lastTime;
	}

	/** @return the lastLon */
	public BigDecimal getLastLon() {
		return lastLon;
	}

	/** @param lastLon the lastLon to set */
	public void setLastLon(BigDecimal lastLon) {
		this.lastLon = lastLon;
	}

	/** @return the lastLat */
	public BigDecimal getLastLat() {
		return lastLat;
	}

	/** @param lastLat the lastLat to set */
	public void setLastLat(BigDecimal lastLat) {
		this.lastLat = lastLat;
	}

	/** @return the lastAddr */
	public String getLastAddr() {
		return lastAddr;
	}

	/** @param lastAddr the lastAddr to set */
	public void setLastAddr(String lastAddr) {
		this.lastAddr = lastAddr;
	}

	/** @return the userStatus */
	public Byte getUserStatus() {
		return userStatus;
	}

	/** @param userStatus the userStatus to set */
	public void setUserStatus(Byte userStatus) {
		this.userStatus = userStatus;
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

	/** @return the sex */
	public Byte getSex() {
		return sex;
	}

	/** @param sex the sex to set */
	public void setSex(Byte sex) {
		this.sex = sex;
	}

	/** @return the birth */
	public Long getBirth() {
		return birth;
	}

	/** @param birth the birth to set */
	public void setBirth(Long birth) {
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
	public Long getMoodWordsTime() {
		return moodWordsTime;
	}

	/** @param moodWordsTime the moodWordsTime to set */
	public void setMoodWordsTime(Long moodWordsTime) {
		this.moodWordsTime = moodWordsTime;
	}

	/** @return the countInform */
	public Integer getCountInform() {
		return countInform;
	}

	/** @param countInform the countInform to set */
	public void setCountInform(Integer countInform) {
		this.countInform = countInform;
	}

	/** @return the countFavor */
	public Integer getCountFavor() {
		return countFavor;
	}

	/** @param countFavor the countFavor to set */
	public void setCountFavor(Integer countFavor) {
		this.countFavor = countFavor;
	}

	/** @return the countPublish */
	public Integer getCountPublish() {
		return countPublish;
	}

	/** @param countPublish the countPublish to set */
	public void setCountPublish(Integer countPublish) {
		this.countPublish = countPublish;
	}

	/** @return the countIdol */
	public Integer getCountIdol() {
		return countIdol;
	}

	/** @param countIdol the countIdol to set */
	public void setCountIdol(Integer countIdol) {
		this.countIdol = countIdol;
	}

	/** @return the countFans */
	public Integer getCountFans() {
		return countFans;
	}

	/** @param countFans the countFans to set */
	public void setCountFans(Integer countFans) {
		this.countFans = countFans;
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