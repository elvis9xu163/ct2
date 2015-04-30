package com.xjd.ct.dal.dos;

public class ObjectVoteOptDoKey extends BaseDo {
    private Long objectId;

    private Byte optCode;

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
}