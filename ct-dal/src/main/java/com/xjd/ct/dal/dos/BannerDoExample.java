package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.List;

public class BannerDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public BannerDoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public void setOffsetAndLimit(long offset, int limit) {
        Page page = new Page();
        page.setOffset(offset);
        page.setLimit(limit);
        this.setPage(page);
    }

    public void setBeginAndEnd(long begin, long end) {
        Page page = new Page();
        page.setOffset(begin);
        page.setEnd(end);
        this.setPage(page);
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBannerIdIsNull() {
            addCriterion("BANNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBannerIdIsNotNull() {
            addCriterion("BANNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBannerIdEqualTo(Long value) {
            addCriterion("BANNER_ID =", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotEqualTo(Long value) {
            addCriterion("BANNER_ID <>", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThan(Long value) {
            addCriterion("BANNER_ID >", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BANNER_ID >=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThan(Long value) {
            addCriterion("BANNER_ID <", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThanOrEqualTo(Long value) {
            addCriterion("BANNER_ID <=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdIn(List<Long> values) {
            addCriterion("BANNER_ID in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotIn(List<Long> values) {
            addCriterion("BANNER_ID not in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdBetween(Long value1, Long value2) {
            addCriterion("BANNER_ID between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotBetween(Long value1, Long value2) {
            addCriterion("BANNER_ID not between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andResIdIsNull() {
            addCriterion("RES_ID is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("RES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(String value) {
            addCriterion("RES_ID =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(String value) {
            addCriterion("RES_ID <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(String value) {
            addCriterion("RES_ID >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(String value) {
            addCriterion("RES_ID >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(String value) {
            addCriterion("RES_ID <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(String value) {
            addCriterion("RES_ID <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLike(String value) {
            addCriterion("RES_ID like", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotLike(String value) {
            addCriterion("RES_ID not like", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<String> values) {
            addCriterion("RES_ID in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<String> values) {
            addCriterion("RES_ID not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(String value1, String value2) {
            addCriterion("RES_ID between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(String value1, String value2) {
            addCriterion("RES_ID not between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIsNull() {
            addCriterion("BANNER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIsNotNull() {
            addCriterion("BANNER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBannerTypeEqualTo(Byte value) {
            addCriterion("BANNER_TYPE =", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotEqualTo(Byte value) {
            addCriterion("BANNER_TYPE <>", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeGreaterThan(Byte value) {
            addCriterion("BANNER_TYPE >", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("BANNER_TYPE >=", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeLessThan(Byte value) {
            addCriterion("BANNER_TYPE <", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeLessThanOrEqualTo(Byte value) {
            addCriterion("BANNER_TYPE <=", value, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeIn(List<Byte> values) {
            addCriterion("BANNER_TYPE in", values, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotIn(List<Byte> values) {
            addCriterion("BANNER_TYPE not in", values, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeBetween(Byte value1, Byte value2) {
            addCriterion("BANNER_TYPE between", value1, value2, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("BANNER_TYPE not between", value1, value2, "bannerType");
            return (Criteria) this;
        }

        public Criteria andBannerContentIsNull() {
            addCriterion("BANNER_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andBannerContentIsNotNull() {
            addCriterion("BANNER_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andBannerContentEqualTo(String value) {
            addCriterion("BANNER_CONTENT =", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentNotEqualTo(String value) {
            addCriterion("BANNER_CONTENT <>", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentGreaterThan(String value) {
            addCriterion("BANNER_CONTENT >", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentGreaterThanOrEqualTo(String value) {
            addCriterion("BANNER_CONTENT >=", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentLessThan(String value) {
            addCriterion("BANNER_CONTENT <", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentLessThanOrEqualTo(String value) {
            addCriterion("BANNER_CONTENT <=", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentLike(String value) {
            addCriterion("BANNER_CONTENT like", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentNotLike(String value) {
            addCriterion("BANNER_CONTENT not like", value, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentIn(List<String> values) {
            addCriterion("BANNER_CONTENT in", values, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentNotIn(List<String> values) {
            addCriterion("BANNER_CONTENT not in", values, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentBetween(String value1, String value2) {
            addCriterion("BANNER_CONTENT between", value1, value2, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerContentNotBetween(String value1, String value2) {
            addCriterion("BANNER_CONTENT not between", value1, value2, "bannerContent");
            return (Criteria) this;
        }

        public Criteria andBannerDescIsNull() {
            addCriterion("BANNER_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBannerDescIsNotNull() {
            addCriterion("BANNER_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBannerDescEqualTo(String value) {
            addCriterion("BANNER_DESC =", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescNotEqualTo(String value) {
            addCriterion("BANNER_DESC <>", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescGreaterThan(String value) {
            addCriterion("BANNER_DESC >", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescGreaterThanOrEqualTo(String value) {
            addCriterion("BANNER_DESC >=", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescLessThan(String value) {
            addCriterion("BANNER_DESC <", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescLessThanOrEqualTo(String value) {
            addCriterion("BANNER_DESC <=", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescLike(String value) {
            addCriterion("BANNER_DESC like", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescNotLike(String value) {
            addCriterion("BANNER_DESC not like", value, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescIn(List<String> values) {
            addCriterion("BANNER_DESC in", values, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescNotIn(List<String> values) {
            addCriterion("BANNER_DESC not in", values, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescBetween(String value1, String value2) {
            addCriterion("BANNER_DESC between", value1, value2, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andBannerDescNotBetween(String value1, String value2) {
            addCriterion("BANNER_DESC not between", value1, value2, "bannerDesc");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ADD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Long value) {
            addCriterion("ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Long value) {
            addCriterion("ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Long value) {
            addCriterion("ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Long value) {
            addCriterion("ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Long value) {
            addCriterion("ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Long> values) {
            addCriterion("ADD_TIME in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Long> values) {
            addCriterion("ADD_TIME not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Long value1, Long value2) {
            addCriterion("ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Long value1, Long value2) {
            addCriterion("ADD_TIME not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("UPD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("UPD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(Long value) {
            addCriterion("UPD_TIME =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Long value) {
            addCriterion("UPD_TIME <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Long value) {
            addCriterion("UPD_TIME >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("UPD_TIME >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Long value) {
            addCriterion("UPD_TIME <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Long value) {
            addCriterion("UPD_TIME <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<Long> values) {
            addCriterion("UPD_TIME in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<Long> values) {
            addCriterion("UPD_TIME not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(Long value1, Long value2) {
            addCriterion("UPD_TIME between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(Long value1, Long value2) {
            addCriterion("UPD_TIME not between", value1, value2, "updTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public static class Page {
        protected long offset;

        protected int limit;

        protected long end;

        public long getOffset() {
            return offset;
        }

        public int getLimit() {
            return limit;
        }

        public long getEnd() {
            return end;
        }

        public void setOffset(long offset) {
            this.offset = offset;
            end = (offset + limit - 1);
        }

        public void setLimit(int limit) {
            this.limit = limit;
            end = (offset + limit - 1);
        }

        public void setEnd(long end) {
            this.end = end;
            limit = (int) (end - offset + 1);
        }
    }
}