package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.List;

public class AgeBracketDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public AgeBracketDoExample() {
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

        public Criteria andAgeBracketIdIsNull() {
            addCriterion("AGE_BRACKET_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgeBracketIdIsNotNull() {
            addCriterion("AGE_BRACKET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgeBracketIdEqualTo(Long value) {
            addCriterion("AGE_BRACKET_ID =", value, "ageBracketId");
            return (Criteria) this;
        }

        public Criteria andAgeBracketIdNotEqualTo(Long value) {
            addCriterion("AGE_BRACKET_ID <>", value, "ageBracketId");
            return (Criteria) this;
        }

        public Criteria andAgeBracketIdGreaterThan(Long value) {
            addCriterion("AGE_BRACKET_ID >", value, "ageBracketId");
            return (Criteria) this;
        }

        public Criteria andAgeBracketIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AGE_BRACKET_ID >=", value, "ageBracketId");
            return (Criteria) this;
        }

        public Criteria andAgeBracketIdLessThan(Long value) {
            addCriterion("AGE_BRACKET_ID <", value, "ageBracketId");
            return (Criteria) this;
        }

        public Criteria andAgeBracketIdLessThanOrEqualTo(Long value) {
            addCriterion("AGE_BRACKET_ID <=", value, "ageBracketId");
            return (Criteria) this;
        }

        public Criteria andAgeBracketIdIn(List<Long> values) {
            addCriterion("AGE_BRACKET_ID in", values, "ageBracketId");
            return (Criteria) this;
        }

        public Criteria andAgeBracketIdNotIn(List<Long> values) {
            addCriterion("AGE_BRACKET_ID not in", values, "ageBracketId");
            return (Criteria) this;
        }

        public Criteria andAgeBracketIdBetween(Long value1, Long value2) {
            addCriterion("AGE_BRACKET_ID between", value1, value2, "ageBracketId");
            return (Criteria) this;
        }

        public Criteria andAgeBracketIdNotBetween(Long value1, Long value2) {
            addCriterion("AGE_BRACKET_ID not between", value1, value2, "ageBracketId");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameIsNull() {
            addCriterion("AGE_BRACKET_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameIsNotNull() {
            addCriterion("AGE_BRACKET_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameEqualTo(String value) {
            addCriterion("AGE_BRACKET_NAME =", value, "ageBracketName");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameNotEqualTo(String value) {
            addCriterion("AGE_BRACKET_NAME <>", value, "ageBracketName");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameGreaterThan(String value) {
            addCriterion("AGE_BRACKET_NAME >", value, "ageBracketName");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameGreaterThanOrEqualTo(String value) {
            addCriterion("AGE_BRACKET_NAME >=", value, "ageBracketName");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameLessThan(String value) {
            addCriterion("AGE_BRACKET_NAME <", value, "ageBracketName");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameLessThanOrEqualTo(String value) {
            addCriterion("AGE_BRACKET_NAME <=", value, "ageBracketName");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameLike(String value) {
            addCriterion("AGE_BRACKET_NAME like", value, "ageBracketName");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameNotLike(String value) {
            addCriterion("AGE_BRACKET_NAME not like", value, "ageBracketName");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameIn(List<String> values) {
            addCriterion("AGE_BRACKET_NAME in", values, "ageBracketName");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameNotIn(List<String> values) {
            addCriterion("AGE_BRACKET_NAME not in", values, "ageBracketName");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameBetween(String value1, String value2) {
            addCriterion("AGE_BRACKET_NAME between", value1, value2, "ageBracketName");
            return (Criteria) this;
        }

        public Criteria andAgeBracketNameNotBetween(String value1, String value2) {
            addCriterion("AGE_BRACKET_NAME not between", value1, value2, "ageBracketName");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescIsNull() {
            addCriterion("AGE_BRACKET_DESC is null");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescIsNotNull() {
            addCriterion("AGE_BRACKET_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescEqualTo(String value) {
            addCriterion("AGE_BRACKET_DESC =", value, "ageBracketDesc");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescNotEqualTo(String value) {
            addCriterion("AGE_BRACKET_DESC <>", value, "ageBracketDesc");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescGreaterThan(String value) {
            addCriterion("AGE_BRACKET_DESC >", value, "ageBracketDesc");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescGreaterThanOrEqualTo(String value) {
            addCriterion("AGE_BRACKET_DESC >=", value, "ageBracketDesc");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescLessThan(String value) {
            addCriterion("AGE_BRACKET_DESC <", value, "ageBracketDesc");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescLessThanOrEqualTo(String value) {
            addCriterion("AGE_BRACKET_DESC <=", value, "ageBracketDesc");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescLike(String value) {
            addCriterion("AGE_BRACKET_DESC like", value, "ageBracketDesc");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescNotLike(String value) {
            addCriterion("AGE_BRACKET_DESC not like", value, "ageBracketDesc");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescIn(List<String> values) {
            addCriterion("AGE_BRACKET_DESC in", values, "ageBracketDesc");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescNotIn(List<String> values) {
            addCriterion("AGE_BRACKET_DESC not in", values, "ageBracketDesc");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescBetween(String value1, String value2) {
            addCriterion("AGE_BRACKET_DESC between", value1, value2, "ageBracketDesc");
            return (Criteria) this;
        }

        public Criteria andAgeBracketDescNotBetween(String value1, String value2) {
            addCriterion("AGE_BRACKET_DESC not between", value1, value2, "ageBracketDesc");
            return (Criteria) this;
        }

        public Criteria andAgeStartIsNull() {
            addCriterion("AGE_START is null");
            return (Criteria) this;
        }

        public Criteria andAgeStartIsNotNull() {
            addCriterion("AGE_START is not null");
            return (Criteria) this;
        }

        public Criteria andAgeStartEqualTo(Byte value) {
            addCriterion("AGE_START =", value, "ageStart");
            return (Criteria) this;
        }

        public Criteria andAgeStartNotEqualTo(Byte value) {
            addCriterion("AGE_START <>", value, "ageStart");
            return (Criteria) this;
        }

        public Criteria andAgeStartGreaterThan(Byte value) {
            addCriterion("AGE_START >", value, "ageStart");
            return (Criteria) this;
        }

        public Criteria andAgeStartGreaterThanOrEqualTo(Byte value) {
            addCriterion("AGE_START >=", value, "ageStart");
            return (Criteria) this;
        }

        public Criteria andAgeStartLessThan(Byte value) {
            addCriterion("AGE_START <", value, "ageStart");
            return (Criteria) this;
        }

        public Criteria andAgeStartLessThanOrEqualTo(Byte value) {
            addCriterion("AGE_START <=", value, "ageStart");
            return (Criteria) this;
        }

        public Criteria andAgeStartIn(List<Byte> values) {
            addCriterion("AGE_START in", values, "ageStart");
            return (Criteria) this;
        }

        public Criteria andAgeStartNotIn(List<Byte> values) {
            addCriterion("AGE_START not in", values, "ageStart");
            return (Criteria) this;
        }

        public Criteria andAgeStartBetween(Byte value1, Byte value2) {
            addCriterion("AGE_START between", value1, value2, "ageStart");
            return (Criteria) this;
        }

        public Criteria andAgeStartNotBetween(Byte value1, Byte value2) {
            addCriterion("AGE_START not between", value1, value2, "ageStart");
            return (Criteria) this;
        }

        public Criteria andAgeEndIsNull() {
            addCriterion("AGE_END is null");
            return (Criteria) this;
        }

        public Criteria andAgeEndIsNotNull() {
            addCriterion("AGE_END is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEndEqualTo(Byte value) {
            addCriterion("AGE_END =", value, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndNotEqualTo(Byte value) {
            addCriterion("AGE_END <>", value, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndGreaterThan(Byte value) {
            addCriterion("AGE_END >", value, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndGreaterThanOrEqualTo(Byte value) {
            addCriterion("AGE_END >=", value, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndLessThan(Byte value) {
            addCriterion("AGE_END <", value, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndLessThanOrEqualTo(Byte value) {
            addCriterion("AGE_END <=", value, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndIn(List<Byte> values) {
            addCriterion("AGE_END in", values, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndNotIn(List<Byte> values) {
            addCriterion("AGE_END not in", values, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndBetween(Byte value1, Byte value2) {
            addCriterion("AGE_END between", value1, value2, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndNotBetween(Byte value1, Byte value2) {
            addCriterion("AGE_END not between", value1, value2, "ageEnd");
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