package com.xjd.ct.biz.bo;

import java.util.List;

public class ObjectBo extends BaseBo {
	private Long objectId;

	private Long userId;

	private Byte objectType;

	private String title;

	private String summary;

	private Byte contentType;

	private String content;

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

	private Long addTime;

	private Long updTime;

	//
	private List<ResourceBo> resourceList;

	private Byte liked;

	private Byte favored;

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

	public Byte getObjectType() {
		return objectType;
	}

	public void setObjectType(Byte objectType) {
		this.objectType = objectType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Byte getContentType() {
		return contentType;
	}

	public void setContentType(Byte contentType) {
		this.contentType = contentType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public List<ResourceBo> getResourceList() {
		return resourceList;
	}

	public void setResourceList(List<ResourceBo> resourceList) {
		this.resourceList = resourceList;
	}

	public Byte getLiked() {
		return liked;
	}

	public void setLiked(Byte liked) {
		this.liked = liked;
	}

	public Byte getFavored() {
		return favored;
	}

	public void setFavored(Byte favored) {
		this.favored = favored;
	}
}