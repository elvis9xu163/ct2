package com.xjd.ct.biz.bo;

public class SubscribeBo extends BaseBo {
	private Long subscribeId;

	private String subscribeName;

	private String subscribeDesc;

	private Byte mustAgeStart;

	private Byte mustAgeEnd;

	private Long addTime;

	private Long updTime;

	public Long getSubscribeId() {
		return subscribeId;
	}

	public void setSubscribeId(Long subscribeId) {
		this.subscribeId = subscribeId;
	}

	public String getSubscribeName() {
		return subscribeName;
	}

	public void setSubscribeName(String subscribeName) {
		this.subscribeName = subscribeName;
	}

	public String getSubscribeDesc() {
		return subscribeDesc;
	}

	public void setSubscribeDesc(String subscribeDesc) {
		this.subscribeDesc = subscribeDesc;
	}

	public Byte getMustAgeStart() {
		return mustAgeStart;
	}

	public void setMustAgeStart(Byte mustAgeStart) {
		this.mustAgeStart = mustAgeStart;
	}

	public Byte getMustAgeEnd() {
		return mustAgeEnd;
	}

	public void setMustAgeEnd(Byte mustAgeEnd) {
		this.mustAgeEnd = mustAgeEnd;
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