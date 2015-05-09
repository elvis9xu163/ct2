package com.xjd.ct.app.view.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author elvis.xu
 * @since 2015-04-30 23:45
 */
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class UserInfoForSelfVo {
	private Long userId;

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

	//
	private List<ResourceVo> resourceList;

	private List<UserBabyForSelfVo> babyList;

	private List<UserBindAccountForSelfVo> bindAccountList;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Byte getVerifyMobileFlag() {
		return verifyMobileFlag;
	}

	public void setVerifyMobileFlag(Byte verifyMobileFlag) {
		this.verifyMobileFlag = verifyMobileFlag;
	}

	public Byte getVerifyEmailFlag() {
		return verifyEmailFlag;
	}

	public void setVerifyEmailFlag(Byte verifyEmailFlag) {
		this.verifyEmailFlag = verifyEmailFlag;
	}

	public Byte getBindQqFlag() {
		return bindQqFlag;
	}

	public void setBindQqFlag(Byte bindQqFlag) {
		this.bindQqFlag = bindQqFlag;
	}

	public Byte getBindWeixinFlag() {
		return bindWeixinFlag;
	}

	public void setBindWeixinFlag(Byte bindWeixinFlag) {
		this.bindWeixinFlag = bindWeixinFlag;
	}

	public Byte getBindSinaWeiboFlag() {
		return bindSinaWeiboFlag;
	}

	public void setBindSinaWeiboFlag(Byte bindSinaWeiboFlag) {
		this.bindSinaWeiboFlag = bindSinaWeiboFlag;
	}

	public Byte getBindTecentWeiboFlag() {
		return bindTecentWeiboFlag;
	}

	public void setBindTecentWeiboFlag(Byte bindTecentWeiboFlag) {
		this.bindTecentWeiboFlag = bindTecentWeiboFlag;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Byte getCertType() {
		return certType;
	}

	public void setCertType(Byte certType) {
		this.certType = certType;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public Short getFailTimes() {
		return failTimes;
	}

	public void setFailTimes(Short failTimes) {
		this.failTimes = failTimes;
	}

	public String getLastIp() {
		return lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	public Long getLastTime() {
		return lastTime;
	}

	public void setLastTime(Long lastTime) {
		this.lastTime = lastTime;
	}

	public BigDecimal getLastLon() {
		return lastLon;
	}

	public void setLastLon(BigDecimal lastLon) {
		this.lastLon = lastLon;
	}

	public BigDecimal getLastLat() {
		return lastLat;
	}

	public void setLastLat(BigDecimal lastLat) {
		this.lastLat = lastLat;
	}

	public String getLastAddr() {
		return lastAddr;
	}

	public void setLastAddr(String lastAddr) {
		this.lastAddr = lastAddr;
	}

	public Byte getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Byte userStatus) {
		this.userStatus = userStatus;
	}

	public Byte getUserType() {
		return userType;
	}

	public void setUserType(Byte userType) {
		this.userType = userType;
	}

	public Integer getGradeExp() {
		return gradeExp;
	}

	public void setGradeExp(Integer gradeExp) {
		this.gradeExp = gradeExp;
	}

	public Byte getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(Byte gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public Long getBirth() {
		return birth;
	}

	public void setBirth(Long birth) {
		this.birth = birth;
	}

	public String getMoodWords() {
		return moodWords;
	}

	public void setMoodWords(String moodWords) {
		this.moodWords = moodWords;
	}

	public Long getMoodWordsTime() {
		return moodWordsTime;
	}

	public void setMoodWordsTime(Long moodWordsTime) {
		this.moodWordsTime = moodWordsTime;
	}

	public Integer getCountInform() {
		return countInform;
	}

	public void setCountInform(Integer countInform) {
		this.countInform = countInform;
	}

	public Integer getCountFavor() {
		return countFavor;
	}

	public void setCountFavor(Integer countFavor) {
		this.countFavor = countFavor;
	}

	public Integer getCountPublish() {
		return countPublish;
	}

	public void setCountPublish(Integer countPublish) {
		this.countPublish = countPublish;
	}

	public Integer getCountIdol() {
		return countIdol;
	}

	public void setCountIdol(Integer countIdol) {
		this.countIdol = countIdol;
	}

	public Integer getCountFans() {
		return countFans;
	}

	public void setCountFans(Integer countFans) {
		this.countFans = countFans;
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

	public List<UserBabyForSelfVo> getBabyList() {
		return babyList;
	}

	public void setBabyList(List<UserBabyForSelfVo> babyList) {
		this.babyList = babyList;
	}

	public List<UserBindAccountForSelfVo> getBindAccountList() {
		return bindAccountList;
	}

	public void setBindAccountList(List<UserBindAccountForSelfVo> bindAccountList) {
		this.bindAccountList = bindAccountList;
	}

	public List<ResourceVo> getResourceList() {
		return resourceList;
	}

	public void setResourceList(List<ResourceVo> resourceList) {
		this.resourceList = resourceList;
	}
}
