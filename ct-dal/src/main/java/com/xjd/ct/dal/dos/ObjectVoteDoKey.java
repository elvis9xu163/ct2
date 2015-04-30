package com.xjd.ct.dal.dos;

public class ObjectVoteDoKey extends BaseDo {
    private Long objectId;

    private Byte optCode;

    private Long userId;

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public Byte getOptCode() {
        return optCode;
    }

    public void setOptCode(Byte optCode) {
        this.optCode = optCode;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}