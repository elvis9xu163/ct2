package com.xjd.ct.biz.bo;

public class ObjectCommentBo extends BaseBo {
	private Long commentId;

	private Long objectId;

	private Long userId;

	private Long toCommentId;

	private String commentContent;

	private Byte acceptFlag;

	private Integer yesCount;

	private Integer noCount;

	private Long addTime;

	private Long updTime;

	//
	private UserBo user;

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Long getObjectId() {
		return objectId;
	}

	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getToCommentId() {
		return toCommentId;
	}

	public void setToCommentId(Long toCommentId) {
		this.toCommentId = toCommentId;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Byte getAcceptFlag() {
		return acceptFlag;
	}

	public void setAcceptFlag(Byte acceptFlag) {
		this.acceptFlag = acceptFlag;
	}

	public Integer getYesCount() {
		return yesCount;
	}

	public void setYesCount(Integer yesCount) {
		this.yesCount = yesCount;
	}

	public Integer getNoCount() {
		return noCount;
	}

	public void setNoCount(Integer noCount) {
		this.noCount = noCount;
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

	public UserBo getUser() {
		return user;
	}

	public void setUser(UserBo user) {
		this.user = user;
	}
}