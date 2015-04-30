package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.List;

public class MsgInformDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public MsgInformDoExample() {
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

        public Criteria andInformIdIsNull() {
            addCriterion("INFORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andInformIdIsNotNull() {
            addCriterion("INFORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInformIdEqualTo(Long value) {
            addCriterion("INFORM_ID =", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdNotEqualTo(Long value) {
            addCriterion("INFORM_ID <>", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdGreaterThan(Long value) {
            addCriterion("INFORM_ID >", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdGreaterThanOrEqualTo(Long value) {
            addCriterion("INFORM_ID >=", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdLessThan(Long value) {
            addCriterion("INFORM_ID <", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdLessThanOrEqualTo(Long value) {
            addCriterion("INFORM_ID <=", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdIn(List<Long> values) {
            addCriterion("INFORM_ID in", values, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdNotIn(List<Long> values) {
            addCriterion("INFORM_ID not in", values, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdBetween(Long value1, Long value2) {
            addCriterion("INFORM_ID between", value1, value2, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdNotBetween(Long value1, Long value2) {
            addCriterion("INFORM_ID not between", value1, value2, "informId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andInformTypeIsNull() {
            addCriterion("INFORM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInformTypeIsNotNull() {
            addCriterion("INFORM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInformTypeEqualTo(Byte value) {
            addCriterion("INFORM_TYPE =", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeNotEqualTo(Byte value) {
            addCriterion("INFORM_TYPE <>", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeGreaterThan(Byte value) {
            addCriterion("INFORM_TYPE >", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("INFORM_TYPE >=", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeLessThan(Byte value) {
            addCriterion("INFORM_TYPE <", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeLessThanOrEqualTo(Byte value) {
            addCriterion("INFORM_TYPE <=", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeIn(List<Byte> values) {
            addCriterion("INFORM_TYPE in", values, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeNotIn(List<Byte> values) {
            addCriterion("INFORM_TYPE not in", values, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeBetween(Byte value1, Byte value2) {
            addCriterion("INFORM_TYPE between", value1, value2, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("INFORM_TYPE not between", value1, value2, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTitleIsNull() {
            addCriterion("INFORM_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andInformTitleIsNotNull() {
            addCriterion("INFORM_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andInformTitleEqualTo(String value) {
            addCriterion("INFORM_TITLE =", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleNotEqualTo(String value) {
            addCriterion("INFORM_TITLE <>", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleGreaterThan(String value) {
            addCriterion("INFORM_TITLE >", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleGreaterThanOrEqualTo(String value) {
            addCriterion("INFORM_TITLE >=", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleLessThan(String value) {
            addCriterion("INFORM_TITLE <", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleLessThanOrEqualTo(String value) {
            addCriterion("INFORM_TITLE <=", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleLike(String value) {
            addCriterion("INFORM_TITLE like", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleNotLike(String value) {
            addCriterion("INFORM_TITLE not like", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleIn(List<String> values) {
            addCriterion("INFORM_TITLE in", values, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleNotIn(List<String> values) {
            addCriterion("INFORM_TITLE not in", values, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleBetween(String value1, String value2) {
            addCriterion("INFORM_TITLE between", value1, value2, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleNotBetween(String value1, String value2) {
            addCriterion("INFORM_TITLE not between", value1, value2, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformDetailIsNull() {
            addCriterion("INFORM_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andInformDetailIsNotNull() {
            addCriterion("INFORM_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andInformDetailEqualTo(String value) {
            addCriterion("INFORM_DETAIL =", value, "informDetail");
            return (Criteria) this;
        }

        public Criteria andInformDetailNotEqualTo(String value) {
            addCriterion("INFORM_DETAIL <>", value, "informDetail");
            return (Criteria) this;
        }

        public Criteria andInformDetailGreaterThan(String value) {
            addCriterion("INFORM_DETAIL >", value, "informDetail");
            return (Criteria) this;
        }

        public Criteria andInformDetailGreaterThanOrEqualTo(String value) {
            addCriterion("INFORM_DETAIL >=", value, "informDetail");
            return (Criteria) this;
        }

        public Criteria andInformDetailLessThan(String value) {
            addCriterion("INFORM_DETAIL <", value, "informDetail");
            return (Criteria) this;
        }

        public Criteria andInformDetailLessThanOrEqualTo(String value) {
            addCriterion("INFORM_DETAIL <=", value, "informDetail");
            return (Criteria) this;
        }

        public Criteria andInformDetailLike(String value) {
            addCriterion("INFORM_DETAIL like", value, "informDetail");
            return (Criteria) this;
        }

        public Criteria andInformDetailNotLike(String value) {
            addCriterion("INFORM_DETAIL not like", value, "informDetail");
            return (Criteria) this;
        }

        public Criteria andInformDetailIn(List<String> values) {
            addCriterion("INFORM_DETAIL in", values, "informDetail");
            return (Criteria) this;
        }

        public Criteria andInformDetailNotIn(List<String> values) {
            addCriterion("INFORM_DETAIL not in", values, "informDetail");
            return (Criteria) this;
        }

        public Criteria andInformDetailBetween(String value1, String value2) {
            addCriterion("INFORM_DETAIL between", value1, value2, "informDetail");
            return (Criteria) this;
        }

        public Criteria andInformDetailNotBetween(String value1, String value2) {
            addCriterion("INFORM_DETAIL not between", value1, value2, "informDetail");
            return (Criteria) this;
        }

        public Criteria andInformInfoIsNull() {
            addCriterion("INFORM_INFO is null");
            return (Criteria) this;
        }

        public Criteria andInformInfoIsNotNull() {
            addCriterion("INFORM_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andInformInfoEqualTo(String value) {
            addCriterion("INFORM_INFO =", value, "informInfo");
            return (Criteria) this;
        }

        public Criteria andInformInfoNotEqualTo(String value) {
            addCriterion("INFORM_INFO <>", value, "informInfo");
            return (Criteria) this;
        }

        public Criteria andInformInfoGreaterThan(String value) {
            addCriterion("INFORM_INFO >", value, "informInfo");
            return (Criteria) this;
        }

        public Criteria andInformInfoGreaterThanOrEqualTo(String value) {
            addCriterion("INFORM_INFO >=", value, "informInfo");
            return (Criteria) this;
        }

        public Criteria andInformInfoLessThan(String value) {
            addCriterion("INFORM_INFO <", value, "informInfo");
            return (Criteria) this;
        }

        public Criteria andInformInfoLessThanOrEqualTo(String value) {
            addCriterion("INFORM_INFO <=", value, "informInfo");
            return (Criteria) this;
        }

        public Criteria andInformInfoLike(String value) {
            addCriterion("INFORM_INFO like", value, "informInfo");
            return (Criteria) this;
        }

        public Criteria andInformInfoNotLike(String value) {
            addCriterion("INFORM_INFO not like", value, "informInfo");
            return (Criteria) this;
        }

        public Criteria andInformInfoIn(List<String> values) {
            addCriterion("INFORM_INFO in", values, "informInfo");
            return (Criteria) this;
        }

        public Criteria andInformInfoNotIn(List<String> values) {
            addCriterion("INFORM_INFO not in", values, "informInfo");
            return (Criteria) this;
        }

        public Criteria andInformInfoBetween(String value1, String value2) {
            addCriterion("INFORM_INFO between", value1, value2, "informInfo");
            return (Criteria) this;
        }

        public Criteria andInformInfoNotBetween(String value1, String value2) {
            addCriterion("INFORM_INFO not between", value1, value2, "informInfo");
            return (Criteria) this;
        }

        public Criteria andReadFlagIsNull() {
            addCriterion("READ_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andReadFlagIsNotNull() {
            addCriterion("READ_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReadFlagEqualTo(Byte value) {
            addCriterion("READ_FLAG =", value, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagNotEqualTo(Byte value) {
            addCriterion("READ_FLAG <>", value, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagGreaterThan(Byte value) {
            addCriterion("READ_FLAG >", value, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("READ_FLAG >=", value, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagLessThan(Byte value) {
            addCriterion("READ_FLAG <", value, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagLessThanOrEqualTo(Byte value) {
            addCriterion("READ_FLAG <=", value, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagIn(List<Byte> values) {
            addCriterion("READ_FLAG in", values, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagNotIn(List<Byte> values) {
            addCriterion("READ_FLAG not in", values, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagBetween(Byte value1, Byte value2) {
            addCriterion("READ_FLAG between", value1, value2, "readFlag");
            return (Criteria) this;
        }

        public Criteria andReadFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("READ_FLAG not between", value1, value2, "readFlag");
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