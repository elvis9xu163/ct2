package com.xjd.ct.app.view.vo;

import java.util.Date;

/**
 * 系统消息
 * 
 * @author elvis.xu
 * @since 2015-03-26 21:38
 */
public class MsgInformVo {
	private Long informId;

	private Long userId;

	private Byte informType;

	private String informTitle;

	private String informDetail;

	private String informInfo;

	private Byte readFlag;

	private Date addTime;

	private Date updTime;

	public Long getInformId() {
		return informId;
	}

	public void setInformId(Long informId) {
		this.informId = informId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getInformTitle() {
		return informTitle;
	}

	public void setInformTitle(String informTitle) {
		this.informTitle = informTitle;
	}

	public String getInformDetail() {
		return informDetail;
	}

	public void setInformDetail(String informDetail) {
		this.informDetail = informDetail;
	}

	public String getInformInfo() {
		return informInfo;
	}

	public void setInformInfo(String informInfo) {
		this.informInfo = informInfo;
	}

	public Byte getReadFlag() {
		return readFlag;
	}

	public void setReadFlag(Byte readFlag) {
		this.readFlag = readFlag;
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

	public Byte getInformType() {
		return informType;
	}

	public void setInformType(Byte informType) {
		this.informType = informType;
	}
}
