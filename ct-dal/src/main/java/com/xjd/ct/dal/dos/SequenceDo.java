package com.xjd.ct.dal.dos;

public class SequenceDo extends BaseDo {
    private String seqName;

    private Long curval;

    private Short increment;

    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName;
    }

    public Long getCurval() {
        return curval;
    }

    public void setCurval(Long curval) {
        this.curval = curval;
    }

    public Short getIncrement() {
        return increment;
    }

    public void setIncrement(Short increment) {
        this.increment = increment;
    }
}