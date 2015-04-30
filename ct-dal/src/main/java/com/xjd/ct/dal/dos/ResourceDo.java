package com.xjd.ct.dal.dos;

public class ResourceDo extends BaseDo {
    private String resId;

    private String contentType;

    private String resFormat;

    private Byte resForm;

    private String resPath;

    private String resMd5;

    private Long resLength;

    private String resSize;

    private String sourceId;

    private String sourceProcess;

    private Long addTime;

    private Long updTime;

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getResFormat() {
        return resFormat;
    }

    public void setResFormat(String resFormat) {
        this.resFormat = resFormat;
    }

    public Byte getResForm() {
        return resForm;
    }

    public void setResForm(Byte resForm) {
        this.resForm = resForm;
    }

    public String getResPath() {
        return resPath;
    }

    public void setResPath(String resPath) {
        this.resPath = resPath;
    }

    public String getResMd5() {
        return resMd5;
    }

    public void setResMd5(String resMd5) {
        this.resMd5 = resMd5;
    }

    public Long getResLength() {
        return resLength;
    }

    public void setResLength(Long resLength) {
        this.resLength = resLength;
    }

    public String getResSize() {
        return resSize;
    }

    public void setResSize(String resSize) {
        this.resSize = resSize;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceProcess() {
        return sourceProcess;
    }

    public void setSourceProcess(String sourceProcess) {
        this.sourceProcess = sourceProcess;
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