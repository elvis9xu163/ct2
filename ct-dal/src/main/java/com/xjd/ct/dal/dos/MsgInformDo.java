package com.xjd.ct.dal.dos;

public class MsgInformDo extends BaseDo {
    private Long informId;

    private Long userId;

    private Byte informType;

    private String informTitle;

    private String informDetail;

    private String informInfo;

    private Byte readFlag;

    private Long addTime;

    private Long updTime;

    public Long getInformId() {
        return informId;
    }

    public void setInformId(Long informId) {
        this.informId = informId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getInformType() {
        return informType;
    }

    public void setInformType(Byte informType) {
        this.informType = informType;
    }

    public String getInformTitle() {
        return informTitle;
    }

    public void setInformTitle(String informTitle) {
        this.informTitle = informTitle;
    }

    public String getInformDetail() {
        return informDetail;
    }

    public void setInformDetail(String informDetail) {
        this.informDetail = informDetail;
    }

    public String getInformInfo() {
        return informInfo;
    }

    public void setInformInfo(String informInfo) {
        this.informInfo = informInfo;
    }

    public Byte getReadFlag() {
        return readFlag;
    }

    public void setReadFlag(Byte readFlag) {
        this.readFlag = readFlag;
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