package com.xjd.ct.biz.bo;

public class ServiceBo extends BaseBo {
	private String serviceName;

	private String serviceVersion;

	private Byte needLoginFlag;

	private Byte inMaintainFlag;

	private String maintainMsg;

	private Byte validFlag;

	private Long addTime;

	private Long updTime;

	/** @return the serviceName */
	public String getServiceName() {
		return serviceName;
	}

	/** @param serviceName the serviceName to set */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/** @return the serviceVersion */
	public String getServiceVersion() {
		return serviceVersion;
	}

	/** @param serviceVersion the serviceVersion to set */
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

	/** @return the needLoginFlag */
	public Byte getNeedLoginFlag() {
		return needLoginFlag;
	}

	/** @param needLoginFlag the needLoginFlag to set */
	public void setNeedLoginFlag(Byte needLoginFlag) {
		this.needLoginFlag = needLoginFlag;
	}

	/** @return the inMaintainFlag */
	public Byte getInMaintainFlag() {
		return inMaintainFlag;
	}

	/** @param inMaintainFlag the inMaintainFlag to set */
	public void setInMaintainFlag(Byte inMaintainFlag) {
		this.inMaintainFlag = inMaintainFlag;
	}

	/** @return the maintainMsg */
	public String getMaintainMsg() {
		return maintainMsg;
	}

	/** @param maintainMsg the maintainMsg to set */
	public void setMaintainMsg(String maintainMsg) {
		this.maintainMsg = maintainMsg;
	}

	/** @return the validFlag */
	public Byte getValidFlag() {
		return validFlag;
	}

	/** @param validFlag the validFlag to set */
	public void setValidFlag(Byte validFlag) {
		this.validFlag = validFlag;
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