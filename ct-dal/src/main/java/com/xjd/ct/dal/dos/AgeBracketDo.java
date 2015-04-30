package com.xjd.ct.dal.dos;

public class AgeBracketDo extends BaseDo {
    private Long ageBracketId;

    private String ageBracketName;

    private String ageBracketDesc;

    private Byte ageStart;

    private Byte ageEnd;

    private Long addTime;

    private Long updTime;

    public Long getAgeBracketId() {
        return ageBracketId;
    }

    public void setAgeBracketId(Long ageBracketId) {
        this.ageBracketId = ageBracketId;
    }

    public String getAgeBracketName() {
        return ageBracketName;
    }

    public void setAgeBracketName(String ageBracketName) {
        this.ageBracketName = ageBracketName;
    }

    public String getAgeBracketDesc() {
        return ageBracketDesc;
    }

    public void setAgeBracketDesc(String ageBracketDesc) {
        this.ageBracketDesc = ageBracketDesc;
    }

    public Byte getAgeStart() {
        return ageStart;
    }

    public void setAgeStart(Byte ageStart) {
        this.ageStart = ageStart;
    }

    public Byte getAgeEnd() {
        return ageEnd;
    }

    public void setAgeEnd(Byte ageEnd) {
        this.ageEnd = ageEnd;
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