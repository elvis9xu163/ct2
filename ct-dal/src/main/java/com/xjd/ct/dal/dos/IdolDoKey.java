package com.xjd.ct.dal.dos;

public class IdolDoKey extends BaseDo {
    private Long userId;

    private Long idolUserId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getIdolUserId() {
        return idolUserId;
    }

    public void setIdolUserId(Long idolUserId) {
        this.idolUserId = idolUserId;
    }
}