package com.xjd.ct.app.view.vo;

import java.util.Date;

/**
 * @author elvis.xu
 * @since 2015-03-30 23:07
 */
public class SubscribeVo {
	private Long subscribeId;

	private String subscribeName;

	private String subscribeDesc;

	private Byte mustAgeStart;

	private Byte mustAgeEnd;

	private Date addTime;

	private Date updTime;

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
}
