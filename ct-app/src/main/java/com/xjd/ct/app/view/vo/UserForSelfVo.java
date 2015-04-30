package com.xjd.ct.app.view.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户全量信息
 * 
 * @author elvis.xu
 * @since 2015-03-23 18:10
 */
public class UserForSelfVo extends UserForOtherVo {
	// User
	private String mobile;

	private String email;

	private String realName;

	private Byte certType;

	private String certNo;

	private String lastIp;

	private Date lastTime;

	private BigDecimal longitude;

	private BigDecimal latitude;

	private String address;

	private Byte userStatus;

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

	/** @return the lastIp */
	public String getLastIp() {
		return lastIp;
	}

	/** @param lastIp the lastIp to set */
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	/** @return the lastTime */
	public Date getLastTime() {
		return lastTime;
	}

	/** @param lastTime the lastTime to set */
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	/** @return the longitude */
	public BigDecimal getLongitude() {
		return longitude;
	}

	/** @param longitude the longitude to set */
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	/** @return the latitude */
	public BigDecimal getLatitude() {
		return latitude;
	}

	/** @param latitude the latitude to set */
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	/** @return the address */
	public String getAddress() {
		return address;
	}

	/** @param address the address to set */
	public void setAddress(String address) {
		this.address = address;
	}

	/** @return the userStatus */
	public Byte getUserStatus() {
		return userStatus;
	}

	/** @param userStatus the userStatus to set */
	public void setUserStatus(Byte userStatus) {
		this.userStatus = userStatus;
	}

}
