package com.xjd.ct.app.view.vo;

import java.util.Date;

/**
 * @author elvis.xu
 * @since 2015-03-31 22:58
 */
public class BannerVo {
	private Long bannerId;

	private Byte bannerType;

	private Byte objectType;

	private Long refId;

	private String bannerContent;

	private Date addTime;

	private Date updTime;

	private ResourceVo resource;

	public Long getBannerId() {
		return bannerId;
	}

	public void setBannerId(Long bannerId) {
		this.bannerId = bannerId;
	}

	public Byte getBannerType() {
		return bannerType;
	}

	public void setBannerType(Byte bannerType) {
		this.bannerType = bannerType;
	}

	public Byte getObjectType() {
		return objectType;
	}

	public void setObjectType(Byte objectType) {
		this.objectType = objectType;
	}

	public Long getRefId() {
		return refId;
	}

	public void setRefId(Long refId) {
		this.refId = refId;
	}

	public String getBannerContent() {
		return bannerContent;
	}

	public void setBannerContent(String bannerContent) {
		this.bannerContent = bannerContent;
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

	public ResourceVo getResource() {
		return resource;
	}

	public void setResource(ResourceVo resource) {
		this.resource = resource;
	}
}
