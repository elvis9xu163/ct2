package com.xjd.ct.dal.dos;

public class ObjectVoteDo extends ObjectVoteDoKey {
    private Byte yesNo;

    private Long addTime;

    private Long updTime;

    public Byte getYesNo() {
        return yesNo;
    }

    public void setYesNo(Byte yesNo) {
        this.yesNo = yesNo;
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
}