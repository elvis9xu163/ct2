package com.xjd.ct.dal.dos;

public class UserSubscribeDoKey extends BaseDo {
    private Long userId;

    private Long subscribeId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSubscribeId() {
        return subscribeId;
    }

    public void setSubscribeId(Long subscribeId) {
        this.subscribeId = subscribeId;
    }
}