package com.xjd.ct.app.view.vo;

/**
 * 用户发表对象
 * 
 * @author elvis.xu
 * @since 2015-03-26 22:53
 */
public class PublishVo extends ObjectWithResourceVo {
	private Long publishId;

	private Long userId;

	private String publishTitle;

	private String publishText;

	public Long getPublishId() {
		return publishId;
	}

	public void setPublishId(Long publishId) {
		this.publishId = publishId;
	}

	public String getPublishTitle() {
		return publishTitle;
	}

	public void setPublishTitle(String publishTitle) {
		this.publishTitle = publishTitle;
	}

	public String getPublishText() {
		return publishText;
	}

	public void setPublishText(String publishText) {
		this.publishText = publishText;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
