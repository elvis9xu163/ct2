package com.xjd.ct.dal.dos;

public class AppVersionDoKey extends BaseDo {
    private Byte appType;

    private Short verCode;

    public Byte getAppType() {
        return appType;
    }

    public void setAppType(Byte appType) {
        this.appType = appType;
    }

    public Short getVerCode() {
        return verCode;
    }

    public void setVerCode(Short verCode) {
        this.verCode = verCode;
    }
}