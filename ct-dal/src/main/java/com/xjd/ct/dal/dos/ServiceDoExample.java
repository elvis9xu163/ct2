package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.List;

public class ServiceDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ServiceDoExample() {
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

        public Criteria andServiceNameIsNull() {
            addCriterion("SERVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("SERVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("SERVICE_NAME =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("SERVICE_NAME <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("SERVICE_NAME >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("SERVICE_NAME <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("SERVICE_NAME like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("SERVICE_NAME not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("SERVICE_NAME in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("SERVICE_NAME not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceVersionIsNull() {
            addCriterion("SERVICE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andServiceVersionIsNotNull() {
            addCriterion("SERVICE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andServiceVersionEqualTo(String value) {
            addCriterion("SERVICE_VERSION =", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionNotEqualTo(String value) {
            addCriterion("SERVICE_VERSION <>", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionGreaterThan(String value) {
            addCriterion("SERVICE_VERSION >", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_VERSION >=", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionLessThan(String value) {
            addCriterion("SERVICE_VERSION <", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_VERSION <=", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionLike(String value) {
            addCriterion("SERVICE_VERSION like", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionNotLike(String value) {
            addCriterion("SERVICE_VERSION not like", value, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionIn(List<String> values) {
            addCriterion("SERVICE_VERSION in", values, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionNotIn(List<String> values) {
            addCriterion("SERVICE_VERSION not in", values, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionBetween(String value1, String value2) {
            addCriterion("SERVICE_VERSION between", value1, value2, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andServiceVersionNotBetween(String value1, String value2) {
            addCriterion("SERVICE_VERSION not between", value1, value2, "serviceVersion");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagIsNull() {
            addCriterion("NEED_LOGIN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagIsNotNull() {
            addCriterion("NEED_LOGIN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagEqualTo(Byte value) {
            addCriterion("NEED_LOGIN_FLAG =", value, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagNotEqualTo(Byte value) {
            addCriterion("NEED_LOGIN_FLAG <>", value, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagGreaterThan(Byte value) {
            addCriterion("NEED_LOGIN_FLAG >", value, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("NEED_LOGIN_FLAG >=", value, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagLessThan(Byte value) {
            addCriterion("NEED_LOGIN_FLAG <", value, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagLessThanOrEqualTo(Byte value) {
            addCriterion("NEED_LOGIN_FLAG <=", value, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagIn(List<Byte> values) {
            addCriterion("NEED_LOGIN_FLAG in", values, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagNotIn(List<Byte> values) {
            addCriterion("NEED_LOGIN_FLAG not in", values, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagBetween(Byte value1, Byte value2) {
            addCriterion("NEED_LOGIN_FLAG between", value1, value2, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andNeedLoginFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("NEED_LOGIN_FLAG not between", value1, value2, "needLoginFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagIsNull() {
            addCriterion("IN_MAINTAIN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagIsNotNull() {
            addCriterion("IN_MAINTAIN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagEqualTo(Byte value) {
            addCriterion("IN_MAINTAIN_FLAG =", value, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagNotEqualTo(Byte value) {
            addCriterion("IN_MAINTAIN_FLAG <>", value, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagGreaterThan(Byte value) {
            addCriterion("IN_MAINTAIN_FLAG >", value, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("IN_MAINTAIN_FLAG >=", value, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagLessThan(Byte value) {
            addCriterion("IN_MAINTAIN_FLAG <", value, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagLessThanOrEqualTo(Byte value) {
            addCriterion("IN_MAINTAIN_FLAG <=", value, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagIn(List<Byte> values) {
            addCriterion("IN_MAINTAIN_FLAG in", values, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagNotIn(List<Byte> values) {
            addCriterion("IN_MAINTAIN_FLAG not in", values, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagBetween(Byte value1, Byte value2) {
            addCriterion("IN_MAINTAIN_FLAG between", value1, value2, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andInMaintainFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("IN_MAINTAIN_FLAG not between", value1, value2, "inMaintainFlag");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgIsNull() {
            addCriterion("MAINTAIN_MSG is null");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgIsNotNull() {
            addCriterion("MAINTAIN_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgEqualTo(String value) {
            addCriterion("MAINTAIN_MSG =", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgNotEqualTo(String value) {
            addCriterion("MAINTAIN_MSG <>", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgGreaterThan(String value) {
            addCriterion("MAINTAIN_MSG >", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgGreaterThanOrEqualTo(String value) {
            addCriterion("MAINTAIN_MSG >=", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgLessThan(String value) {
            addCriterion("MAINTAIN_MSG <", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgLessThanOrEqualTo(String value) {
            addCriterion("MAINTAIN_MSG <=", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgLike(String value) {
            addCriterion("MAINTAIN_MSG like", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgNotLike(String value) {
            addCriterion("MAINTAIN_MSG not like", value, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgIn(List<String> values) {
            addCriterion("MAINTAIN_MSG in", values, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgNotIn(List<String> values) {
            addCriterion("MAINTAIN_MSG not in", values, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgBetween(String value1, String value2) {
            addCriterion("MAINTAIN_MSG between", value1, value2, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andMaintainMsgNotBetween(String value1, String value2) {
            addCriterion("MAINTAIN_MSG not between", value1, value2, "maintainMsg");
            return (Criteria) this;
        }

        public Criteria andValidFlagIsNull() {
            addCriterion("VALID_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andValidFlagIsNotNull() {
            addCriterion("VALID_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andValidFlagEqualTo(Byte value) {
            addCriterion("VALID_FLAG =", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotEqualTo(Byte value) {
            addCriterion("VALID_FLAG <>", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThan(Byte value) {
            addCriterion("VALID_FLAG >", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("VALID_FLAG >=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThan(Byte value) {
            addCriterion("VALID_FLAG <", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThanOrEqualTo(Byte value) {
            addCriterion("VALID_FLAG <=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagIn(List<Byte> values) {
            addCriterion("VALID_FLAG in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotIn(List<Byte> values) {
            addCriterion("VALID_FLAG not in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagBetween(Byte value1, Byte value2) {
            addCriterion("VALID_FLAG between", value1, value2, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("VALID_FLAG not between", value1, value2, "validFlag");
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