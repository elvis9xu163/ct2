package com.xjd.ct.dal.dos;

public class ReportDo extends BaseDo {
    private Long reportId;

    private Long userId;

    private Byte refType;

    private Long refId;

    private Byte reportReasonType;

    private String reportReasonDetail;

    private Long addTime;

    private Long updTime;

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getRefType() {
        return refType;
    }

    public void setRefType(Byte refType) {
        this.refType = refType;
    }

    public Long getRefId() {
        return refId;
    }

    public void setRefId(Long refId) {
        this.refId = refId;
    }

    public Byte getReportReasonType() {
        return reportReasonType;
    }

    public void setReportReasonType(Byte reportReasonType) {
        this.reportReasonType = reportReasonType;
    }

    public String getReportReasonDetail() {
        return reportReasonDetail;
    }

    public void setReportReasonDetail(String reportReasonDetail) {
        this.reportReasonDetail = reportReasonDetail;
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