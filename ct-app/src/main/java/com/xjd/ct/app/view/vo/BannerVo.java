package com.xjd.ct.app.view.vo;

//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class BannerVo {
	private Long bannerId;

	private String resId;

	private Byte bannerType;

	private String bannerContent;

	private String bannerDesc;

	private Long addTime;

	private Long updTime;

	//
	private ResourceVo resource;

	public Long getBannerId() {
		return bannerId;
	}

	public void setBannerId(Long bannerId) {
		this.bannerId = bannerId;
	}

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public Byte getBannerType() {
		return bannerType;
	}

	public void setBannerType(Byte bannerType) {
		this.bannerType = bannerType;
	}

	public String getBannerContent() {
		return bannerContent;
	}

	public void setBannerContent(String bannerContent) {
		this.bannerContent = bannerContent;
	}

	public String getBannerDesc() {
		return bannerDesc;
	}

	public void setBannerDesc(String bannerDesc) {
		this.bannerDesc = bannerDesc;
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

	public ResourceVo getResource() {
		return resource;
	}

	public void setResource(ResourceVo resource) {
		this.resource = resource;
	}
}