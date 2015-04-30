package com.xjd.ct.dal.dos;

public class ObjectCommentLikeDoKey extends BaseDo {
    private Long commentId;

    private Long userId;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}