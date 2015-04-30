package com.xjd.ct.dal.dos;

public class RecommendDo extends BaseDo {
    private Long recommendId;

    private Long objectId;

    private Long recommendTime;

    private Long addTime;

    private Long updTime;

    public Long getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(Long recommendId) {
        this.recommendId = recommendId;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public Long getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(Long recommendTime) {
        this.recommendTime = recommendTime;
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