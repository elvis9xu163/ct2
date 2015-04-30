package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.List;

public class SubscribeDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public SubscribeDoExample() {
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

        public Criteria andSubscribeIdIsNull() {
            addCriterion("SUBSCRIBE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeIdIsNotNull() {
            addCriterion("SUBSCRIBE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeIdEqualTo(Long value) {
            addCriterion("SUBSCRIBE_ID =", value, "subscribeId");
            return (Criteria) this;
        }

        public Criteria andSubscribeIdNotEqualTo(Long value) {
            addCriterion("SUBSCRIBE_ID <>", value, "subscribeId");
            return (Criteria) this;
        }

        public Criteria andSubscribeIdGreaterThan(Long value) {
            addCriterion("SUBSCRIBE_ID >", value, "subscribeId");
            return (Criteria) this;
        }

        public Criteria andSubscribeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUBSCRIBE_ID >=", value, "subscribeId");
            return (Criteria) this;
        }

        public Criteria andSubscribeIdLessThan(Long value) {
            addCriterion("SUBSCRIBE_ID <", value, "subscribeId");
            return (Criteria) this;
        }

        public Criteria andSubscribeIdLessThanOrEqualTo(Long value) {
            addCriterion("SUBSCRIBE_ID <=", value, "subscribeId");
            return (Criteria) this;
        }

        public Criteria andSubscribeIdIn(List<Long> values) {
            addCriterion("SUBSCRIBE_ID in", values, "subscribeId");
            return (Criteria) this;
        }

        public Criteria andSubscribeIdNotIn(List<Long> values) {
            addCriterion("SUBSCRIBE_ID not in", values, "subscribeId");
            return (Criteria) this;
        }

        public Criteria andSubscribeIdBetween(Long value1, Long value2) {
            addCriterion("SUBSCRIBE_ID between", value1, value2, "subscribeId");
            return (Criteria) this;
        }

        public Criteria andSubscribeIdNotBetween(Long value1, Long value2) {
            addCriterion("SUBSCRIBE_ID not between", value1, value2, "subscribeId");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameIsNull() {
            addCriterion("SUBSCRIBE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameIsNotNull() {
            addCriterion("SUBSCRIBE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameEqualTo(String value) {
            addCriterion("SUBSCRIBE_NAME =", value, "subscribeName");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameNotEqualTo(String value) {
            addCriterion("SUBSCRIBE_NAME <>", value, "subscribeName");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameGreaterThan(String value) {
            addCriterion("SUBSCRIBE_NAME >", value, "subscribeName");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBSCRIBE_NAME >=", value, "subscribeName");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameLessThan(String value) {
            addCriterion("SUBSCRIBE_NAME <", value, "subscribeName");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameLessThanOrEqualTo(String value) {
            addCriterion("SUBSCRIBE_NAME <=", value, "subscribeName");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameLike(String value) {
            addCriterion("SUBSCRIBE_NAME like", value, "subscribeName");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameNotLike(String value) {
            addCriterion("SUBSCRIBE_NAME not like", value, "subscribeName");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameIn(List<String> values) {
            addCriterion("SUBSCRIBE_NAME in", values, "subscribeName");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameNotIn(List<String> values) {
            addCriterion("SUBSCRIBE_NAME not in", values, "subscribeName");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameBetween(String value1, String value2) {
            addCriterion("SUBSCRIBE_NAME between", value1, value2, "subscribeName");
            return (Criteria) this;
        }

        public Criteria andSubscribeNameNotBetween(String value1, String value2) {
            addCriterion("SUBSCRIBE_NAME not between", value1, value2, "subscribeName");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescIsNull() {
            addCriterion("SUBSCRIBE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescIsNotNull() {
            addCriterion("SUBSCRIBE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescEqualTo(String value) {
            addCriterion("SUBSCRIBE_DESC =", value, "subscribeDesc");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescNotEqualTo(String value) {
            addCriterion("SUBSCRIBE_DESC <>", value, "subscribeDesc");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescGreaterThan(String value) {
            addCriterion("SUBSCRIBE_DESC >", value, "subscribeDesc");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescGreaterThanOrEqualTo(String value) {
            addCriterion("SUBSCRIBE_DESC >=", value, "subscribeDesc");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescLessThan(String value) {
            addCriterion("SUBSCRIBE_DESC <", value, "subscribeDesc");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescLessThanOrEqualTo(String value) {
            addCriterion("SUBSCRIBE_DESC <=", value, "subscribeDesc");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescLike(String value) {
            addCriterion("SUBSCRIBE_DESC like", value, "subscribeDesc");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescNotLike(String value) {
            addCriterion("SUBSCRIBE_DESC not like", value, "subscribeDesc");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescIn(List<String> values) {
            addCriterion("SUBSCRIBE_DESC in", values, "subscribeDesc");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescNotIn(List<String> values) {
            addCriterion("SUBSCRIBE_DESC not in", values, "subscribeDesc");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescBetween(String value1, String value2) {
            addCriterion("SUBSCRIBE_DESC between", value1, value2, "subscribeDesc");
            return (Criteria) this;
        }

        public Criteria andSubscribeDescNotBetween(String value1, String value2) {
            addCriterion("SUBSCRIBE_DESC not between", value1, value2, "subscribeDesc");
            return (Criteria) this;
        }

        public Criteria andMustAgeStartIsNull() {
            addCriterion("MUST_AGE_START is null");
            return (Criteria) this;
        }

        public Criteria andMustAgeStartIsNotNull() {
            addCriterion("MUST_AGE_START is not null");
            return (Criteria) this;
        }

        public Criteria andMustAgeStartEqualTo(Byte value) {
            addCriterion("MUST_AGE_START =", value, "mustAgeStart");
            return (Criteria) this;
        }

        public Criteria andMustAgeStartNotEqualTo(Byte value) {
            addCriterion("MUST_AGE_START <>", value, "mustAgeStart");
            return (Criteria) this;
        }

        public Criteria andMustAgeStartGreaterThan(Byte value) {
            addCriterion("MUST_AGE_START >", value, "mustAgeStart");
            return (Criteria) this;
        }

        public Criteria andMustAgeStartGreaterThanOrEqualTo(Byte value) {
            addCriterion("MUST_AGE_START >=", value, "mustAgeStart");
            return (Criteria) this;
        }

        public Criteria andMustAgeStartLessThan(Byte value) {
            addCriterion("MUST_AGE_START <", value, "mustAgeStart");
            return (Criteria) this;
        }

        public Criteria andMustAgeStartLessThanOrEqualTo(Byte value) {
            addCriterion("MUST_AGE_START <=", value, "mustAgeStart");
            return (Criteria) this;
        }

        public Criteria andMustAgeStartIn(List<Byte> values) {
            addCriterion("MUST_AGE_START in", values, "mustAgeStart");
            return (Criteria) this;
        }

        public Criteria andMustAgeStartNotIn(List<Byte> values) {
            addCriterion("MUST_AGE_START not in", values, "mustAgeStart");
            return (Criteria) this;
        }

        public Criteria andMustAgeStartBetween(Byte value1, Byte value2) {
            addCriterion("MUST_AGE_START between", value1, value2, "mustAgeStart");
            return (Criteria) this;
        }

        public Criteria andMustAgeStartNotBetween(Byte value1, Byte value2) {
            addCriterion("MUST_AGE_START not between", value1, value2, "mustAgeStart");
            return (Criteria) this;
        }

        public Criteria andMustAgeEndIsNull() {
            addCriterion("MUST_AGE_END is null");
            return (Criteria) this;
        }

        public Criteria andMustAgeEndIsNotNull() {
            addCriterion("MUST_AGE_END is not null");
            return (Criteria) this;
        }

        public Criteria andMustAgeEndEqualTo(Byte value) {
            addCriterion("MUST_AGE_END =", value, "mustAgeEnd");
            return (Criteria) this;
        }

        public Criteria andMustAgeEndNotEqualTo(Byte value) {
            addCriterion("MUST_AGE_END <>", value, "mustAgeEnd");
            return (Criteria) this;
        }

        public Criteria andMustAgeEndGreaterThan(Byte value) {
            addCriterion("MUST_AGE_END >", value, "mustAgeEnd");
            return (Criteria) this;
        }

        public Criteria andMustAgeEndGreaterThanOrEqualTo(Byte value) {
            addCriterion("MUST_AGE_END >=", value, "mustAgeEnd");
            return (Criteria) this;
        }

        public Criteria andMustAgeEndLessThan(Byte value) {
            addCriterion("MUST_AGE_END <", value, "mustAgeEnd");
            return (Criteria) this;
        }

        public Criteria andMustAgeEndLessThanOrEqualTo(Byte value) {
            addCriterion("MUST_AGE_END <=", value, "mustAgeEnd");
            return (Criteria) this;
        }

        public Criteria andMustAgeEndIn(List<Byte> values) {
            addCriterion("MUST_AGE_END in", values, "mustAgeEnd");
            return (Criteria) this;
        }

        public Criteria andMustAgeEndNotIn(List<Byte> values) {
            addCriterion("MUST_AGE_END not in", values, "mustAgeEnd");
            return (Criteria) this;
        }

        public Criteria andMustAgeEndBetween(Byte value1, Byte value2) {
            addCriterion("MUST_AGE_END between", value1, value2, "mustAgeEnd");
            return (Criteria) this;
        }

        public Criteria andMustAgeEndNotBetween(Byte value1, Byte value2) {
            addCriterion("MUST_AGE_END not between", value1, value2, "mustAgeEnd");
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