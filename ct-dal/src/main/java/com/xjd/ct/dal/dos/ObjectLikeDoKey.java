package com.xjd.ct.dal.dos;

public class ObjectLikeDoKey extends BaseDo {
    private Long objectId;

    private Long userId;

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
}