package com.xjd.ct.dal.dos;

public class ObjectResourceDoKey extends BaseDo {
    private String resId;

    private Long entityId;

    private Byte entityType;

    private Byte forClass;

    private String forSubclass;

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Byte getEntityType() {
        return entityType;
    }

    public void setEntityType(Byte entityType) {
        this.entityType = entityType;
    }

    public Byte getForClass() {
        return forClass;
    }

    public void setForClass(Byte forClass) {
        this.forClass = forClass;
    }

    public String getForSubclass() {
        return forSubclass;
    }

    public void setForSubclass(String forSubclass) {
        this.forSubclass = forSubclass;
    }
}