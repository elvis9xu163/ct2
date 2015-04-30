package com.xjd.ct.app.view.vo;

import java.util.Date;

/**
 * @author elvis.xu
 * @since 2015-03-26 23:30
 */
public class ObjectVo {
	private Long objectId;

	private Byte objectType;

	private Long objectRefId;

	private Byte voteFlag;

	private Byte voteMultiFlag;

	private Byte likeYesFlag;

	private Integer likeYesCount;

	private Byte likeNoFlag;

	private Integer likeNoCount;

	private Byte commentFlag;

	private Integer commentCount;

	private Byte favorFlag;

	private Integer favorCount;

	private Date addTime;

	private Date updTime;

	public Long getObjectId() {
		return objectId;
	}

	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}

	public Byte getObjectType() {
		return objectType;
	}

	public void setObjectType(Byte objectType) {
		this.objectType = objectType;
	}

	public Long getObjectRefId() {
		return objectRefId;
	}

	public void setObjectRefId(Long objectRefId) {
		this.objectRefId = objectRefId;
	}

	public Byte getVoteFlag() {
		return voteFlag;
	}

	public void setVoteFlag(Byte voteFlag) {
		this.voteFlag = voteFlag;
	}

	public Byte getVoteMultiFlag() {
		return voteMultiFlag;
	}

	public void setVoteMultiFlag(Byte voteMultiFlag) {
		this.voteMultiFlag = voteMultiFlag;
	}

	public Byte getLikeYesFlag() {
		return likeYesFlag;
	}

	public void setLikeYesFlag(Byte likeYesFlag) {
		this.likeYesFlag = likeYesFlag;
	}

	public Integer getLikeYesCount() {
		return likeYesCount;
	}

	public void setLikeYesCount(Integer likeYesCount) {
		this.likeYesCount = likeYesCount;
	}

	public Byte getLikeNoFlag() {
		return likeNoFlag;
	}

	public void setLikeNoFlag(Byte likeNoFlag) {
		this.likeNoFlag = likeNoFlag;
	}

	public Integer getLikeNoCount() {
		return likeNoCount;
	}

	public void setLikeNoCount(Integer likeNoCount) {
		this.likeNoCount = likeNoCount;
	}

	public Byte getCommentFlag() {
		return commentFlag;
	}

	public void setCommentFlag(Byte commentFlag) {
		this.commentFlag = commentFlag;
	}

	public Integer getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	public Byte getFavorFlag() {
		return favorFlag;
	}

	public void setFavorFlag(Byte favorFlag) {
		this.favorFlag = favorFlag;
	}

	public Integer getFavorCount() {
		return favorCount;
	}

	public void setFavorCount(Integer favorCount) {
		this.favorCount = favorCount;
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
