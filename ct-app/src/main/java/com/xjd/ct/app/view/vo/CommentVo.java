package com.xjd.ct.app.view.vo;

import java.util.Date;

/**
 * @author elvis.xu
 * @since 2015-03-30 21:02
 */
public class CommentVo {
	private Long commentId;

	private Long objectId;

	private Long userId;

	private Long toCommentId;

	private String commentContent;

	private Byte acceptFlag;

	private Integer yesCount;

	private Integer noCount;

	private Date addTime;

	private Date updTime;

	private CommentVo toComment;

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

	public CommentVo getToComment() {
		return toComment;
	}

	public void setToComment(CommentVo toComment) {
		this.toComment = toComment;
	}
}
