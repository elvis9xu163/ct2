package com.xjd.ct.biz.bo;

public class LaunchPicBo extends BaseBo {
	private Long launchId;

	private String resId;

	private String title;

	private String content;

	private Long addTime;

	//
	private ResourceBo resource;

	public Long getLaunchId() {
		return launchId;
	}

	public void setLaunchId(Long launchId) {
		this.launchId = launchId;
	}

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getAddTime() {
		return addTime;
	}

	public void setAddTime(Long addTime) {
		this.addTime = addTime;
	}

	public ResourceBo getResource() {
		return resource;
	}

	public void setResource(ResourceBo resource) {
		this.resource = resource;
	}
}