package com.xjd.ct.app.view.vo;

import java.util.Date;

/**
 * 资源对象
 * 
 * @author elvis.xu
 * @since 2015-03-26 22:54
 */
public class ResourceVo {
	private String resId;

	private String resContentType;

	private String resFormat;

	private Byte resForm;

	private String resPath;

	private String resMd5;

	private Long resSize;

	private String sourceId;

	private String sourceProcess;

	private Date addTime;

	private Date updTime;

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public String getResContentType() {
		return resContentType;
	}

	public void setResContentType(String resContentType) {
		this.resContentType = resContentType;
	}

	public String getResFormat() {
		return resFormat;
	}

	public void setResFormat(String resFormat) {
		this.resFormat = resFormat;
	}

	public Byte getResForm() {
		return resForm;
	}

	public void setResForm(Byte resForm) {
		this.resForm = resForm;
	}

	public String getResPath() {
		return resPath;
	}

	public void setResPath(String resPath) {
		this.resPath = resPath;
	}

	public String getResMd5() {
		return resMd5;
	}

	public void setResMd5(String resMd5) {
		this.resMd5 = resMd5;
	}

	public Long getResSize() {
		return resSize;
	}

	public void setResSize(Long resSize) {
		this.resSize = resSize;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceProcess() {
		return sourceProcess;
	}

	public void setSourceProcess(String sourceProcess) {
		this.sourceProcess = sourceProcess;
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
