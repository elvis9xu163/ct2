package com.xjd.ct.dal.dos;

public class ObjectResourceDo extends ObjectResourceDoKey {
    private Byte finishProcess;

    private Long addTime;

    private Long updTime;

    public Byte getFinishProcess() {
        return finishProcess;
    }

    public void setFinishProcess(Byte finishProcess) {
        this.finishProcess = finishProcess;
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