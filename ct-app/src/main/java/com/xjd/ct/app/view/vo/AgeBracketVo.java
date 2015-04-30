package com.xjd.ct.app.view.vo;

import java.util.Date;

/**
 * @author elvis.xu
 * @since 2015-03-30 23:11
 */
public class AgeBracketVo {
	private Long ageBracketId;

	private String ageBracketName;

	private String ageBracketDesc;

	private Byte ageStart;

	private Byte ageEnd;

	private Date addTime;

	private Date updTime;

	public Long getAgeBracketId() {
		return ageBracketId;
	}

	public void setAgeBracketId(Long ageBracketId) {
		this.ageBracketId = ageBracketId;
	}

	public String getAgeBracketName() {
		return ageBracketName;
	}

	public void setAgeBracketName(String ageBracketName) {
		this.ageBracketName = ageBracketName;
	}

	public String getAgeBracketDesc() {
		return ageBracketDesc;
	}

	public void setAgeBracketDesc(String ageBracketDesc) {
		this.ageBracketDesc = ageBracketDesc;
	}

	public Byte getAgeStart() {
		return ageStart;
	}

	public void setAgeStart(Byte ageStart) {
		this.ageStart = ageStart;
	}

	public Byte getAgeEnd() {
		return ageEnd;
	}

	public void setAgeEnd(Byte ageEnd) {
		this.ageEnd = ageEnd;
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
