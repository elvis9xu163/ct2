package com.xjd.ct.biz.bo;

/**
 * @author elvis.xu
 * @since 2015-05-12 11:34
 */
public class AppVersionResultBo extends BaseBo {
	private Short verCode;

	private String verName;

	private String verDesc;

	private String downLink;

	private Long addTime;

	private Long updTime;

	private Byte mandatory;

	public Short getVerCode() {
		return verCode;
	}

	public void setVerCode(Short verCode) {
		this.verCode = verCode;
	}

	public String getVerName() {
		return verName;
	}

	public void setVerName(String verName) {
		this.verName = verName;
	}

	public String getVerDesc() {
		return verDesc;
	}

	public void setVerDesc(String verDesc) {
		this.verDesc = verDesc;
	}

	public String getDownLink() {
		return downLink;
	}

	public void setDownLink(String downLink) {
		this.downLink = downLink;
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

	public Byte getMandatory() {
		return mandatory;
	}

	public void setMandatory(Byte mandatory) {
		this.mandatory = mandatory;
	}
}
