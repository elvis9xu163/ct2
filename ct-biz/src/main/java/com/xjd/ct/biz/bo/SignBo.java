package com.xjd.ct.biz.bo;

/**
 * @author elvis.xu
 * @since 2015-05-11 17:20
 */
public class SignBo extends BaseBo {
	private Long signId;

	private Long userId;

	private Integer pont;

	private Long addTime;

	public Long getSignId() {
		return signId;
	}

	public void setSignId(Long signId) {
		this.signId = signId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getPont() {
		return pont;
	}

	public void setPont(Integer pont) {
		this.pont = pont;
	}

	public Long getAddTime() {
		return addTime;
	}

	public void setAddTime(Long addTime) {
		this.addTime = addTime;
	}
}
