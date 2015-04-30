package com.xjd.ct.dal.dos;

public class UserResourceDoKey extends BaseDo {
    private Long userId;

    private String resId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }
}