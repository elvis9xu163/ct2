package com.xjd.ct.dal.dos;

public class ObjectVoteOptDo extends ObjectVoteOptDoKey {
    private String optTitle;

    private String optDesc;

    private Byte yesFlag;

    private Integer yesCount;

    private Byte noFlag;

    private Integer noCount;

    private Long addTime;

    private Long updTime;

    public String getOptTitle() {
        return optTitle;
    }

    public void setOptTitle(String optTitle) {
        this.optTitle = optTitle;
    }

    public String getOptDesc() {
        return optDesc;
    }

    public void setOptDesc(String optDesc) {
        this.optDesc = optDesc;
    }

    public Byte getYesFlag() {
        return yesFlag;
    }

    public void setYesFlag(Byte yesFlag) {
        this.yesFlag = yesFlag;
    }

    public Integer getYesCount() {
        return yesCount;
    }

    public void setYesCount(Integer yesCount) {
        this.yesCount = yesCount;
    }

    public Byte getNoFlag() {
        return noFlag;
    }

    public void setNoFlag(Byte noFlag) {
        this.noFlag = noFlag;
    }

    public Integer getNoCount() {
        return noCount;
    }

    public void setNoCount(Integer noCount) {
        this.noCount = noCount;
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