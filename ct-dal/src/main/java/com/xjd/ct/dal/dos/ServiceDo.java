package com.xjd.ct.dal.dos;

public class ServiceDo extends ServiceDoKey {
    private Byte needLoginFlag;

    private Byte inMaintainFlag;

    private String maintainMsg;

    private Byte validFlag;

    private Long addTime;

    private Long updTime;

    public Byte getNeedLoginFlag() {
        return needLoginFlag;
    }

    public void setNeedLoginFlag(Byte needLoginFlag) {
        this.needLoginFlag = needLoginFlag;
    }

    public Byte getInMaintainFlag() {
        return inMaintainFlag;
    }

    public void setInMaintainFlag(Byte inMaintainFlag) {
        this.inMaintainFlag = inMaintainFlag;
    }

    public String getMaintainMsg() {
        return maintainMsg;
    }

    public void setMaintainMsg(String maintainMsg) {
        this.maintainMsg = maintainMsg;
    }

    public Byte getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(Byte validFlag) {
        this.validFlag = validFlag;
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