package com.xjd.ct.biz.bo;

import java.util.List;

public class LaunchPicBo extends BaseBo {
	private Long launchId;

	private String title;

	private String content;

	private Long addTime;

	private Long updTime;

	//
	private List<ResourceBo> resourceList;

	public Long getLaunchId() {
		return launchId;
	}

	public void setLaunchId(Long launchId) {
		this.launchId = launchId;
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

	public Long getUpdTime() {
		return updTime;
	}

	public void setUpdTime(Long updTime) {
		this.updTime = updTime;
	}

	public List<ResourceBo> getResourceList() {
		return resourceList;
	}

	public void setResourceList(List<ResourceBo> resourceList) {
		this.resourceList = resourceList;
	}

}