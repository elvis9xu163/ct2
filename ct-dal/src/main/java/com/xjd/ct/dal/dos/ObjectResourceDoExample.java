package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.List;

public class ObjectResourceDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ObjectResourceDoExample() {
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

        public Criteria andEntityIdIsNull() {
            addCriterion("ENTITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNotNull() {
            addCriterion("ENTITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntityIdEqualTo(Long value) {
            addCriterion("ENTITY_ID =", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotEqualTo(Long value) {
            addCriterion("ENTITY_ID <>", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThan(Long value) {
            addCriterion("ENTITY_ID >", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ENTITY_ID >=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThan(Long value) {
            addCriterion("ENTITY_ID <", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThanOrEqualTo(Long value) {
            addCriterion("ENTITY_ID <=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIn(List<Long> values) {
            addCriterion("ENTITY_ID in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotIn(List<Long> values) {
            addCriterion("ENTITY_ID not in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdBetween(Long value1, Long value2) {
            addCriterion("ENTITY_ID between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotBetween(Long value1, Long value2) {
            addCriterion("ENTITY_ID not between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNull() {
            addCriterion("ENTITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNotNull() {
            addCriterion("ENTITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeEqualTo(Byte value) {
            addCriterion("ENTITY_TYPE =", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotEqualTo(Byte value) {
            addCriterion("ENTITY_TYPE <>", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThan(Byte value) {
            addCriterion("ENTITY_TYPE >", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ENTITY_TYPE >=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThan(Byte value) {
            addCriterion("ENTITY_TYPE <", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThanOrEqualTo(Byte value) {
            addCriterion("ENTITY_TYPE <=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIn(List<Byte> values) {
            addCriterion("ENTITY_TYPE in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotIn(List<Byte> values) {
            addCriterion("ENTITY_TYPE not in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeBetween(Byte value1, Byte value2) {
            addCriterion("ENTITY_TYPE between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("ENTITY_TYPE not between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andForClassIsNull() {
            addCriterion("FOR_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andForClassIsNotNull() {
            addCriterion("FOR_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andForClassEqualTo(Byte value) {
            addCriterion("FOR_CLASS =", value, "forClass");
            return (Criteria) this;
        }

        public Criteria andForClassNotEqualTo(Byte value) {
            addCriterion("FOR_CLASS <>", value, "forClass");
            return (Criteria) this;
        }

        public Criteria andForClassGreaterThan(Byte value) {
            addCriterion("FOR_CLASS >", value, "forClass");
            return (Criteria) this;
        }

        public Criteria andForClassGreaterThanOrEqualTo(Byte value) {
            addCriterion("FOR_CLASS >=", value, "forClass");
            return (Criteria) this;
        }

        public Criteria andForClassLessThan(Byte value) {
            addCriterion("FOR_CLASS <", value, "forClass");
            return (Criteria) this;
        }

        public Criteria andForClassLessThanOrEqualTo(Byte value) {
            addCriterion("FOR_CLASS <=", value, "forClass");
            return (Criteria) this;
        }

        public Criteria andForClassIn(List<Byte> values) {
            addCriterion("FOR_CLASS in", values, "forClass");
            return (Criteria) this;
        }

        public Criteria andForClassNotIn(List<Byte> values) {
            addCriterion("FOR_CLASS not in", values, "forClass");
            return (Criteria) this;
        }

        public Criteria andForClassBetween(Byte value1, Byte value2) {
            addCriterion("FOR_CLASS between", value1, value2, "forClass");
            return (Criteria) this;
        }

        public Criteria andForClassNotBetween(Byte value1, Byte value2) {
            addCriterion("FOR_CLASS not between", value1, value2, "forClass");
            return (Criteria) this;
        }

        public Criteria andForSubclassIsNull() {
            addCriterion("FOR_SUBCLASS is null");
            return (Criteria) this;
        }

        public Criteria andForSubclassIsNotNull() {
            addCriterion("FOR_SUBCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andForSubclassEqualTo(String value) {
            addCriterion("FOR_SUBCLASS =", value, "forSubclass");
            return (Criteria) this;
        }

        public Criteria andForSubclassNotEqualTo(String value) {
            addCriterion("FOR_SUBCLASS <>", value, "forSubclass");
            return (Criteria) this;
        }

        public Criteria andForSubclassGreaterThan(String value) {
            addCriterion("FOR_SUBCLASS >", value, "forSubclass");
            return (Criteria) this;
        }

        public Criteria andForSubclassGreaterThanOrEqualTo(String value) {
            addCriterion("FOR_SUBCLASS >=", value, "forSubclass");
            return (Criteria) this;
        }

        public Criteria andForSubclassLessThan(String value) {
            addCriterion("FOR_SUBCLASS <", value, "forSubclass");
            return (Criteria) this;
        }

        public Criteria andForSubclassLessThanOrEqualTo(String value) {
            addCriterion("FOR_SUBCLASS <=", value, "forSubclass");
            return (Criteria) this;
        }

        public Criteria andForSubclassLike(String value) {
            addCriterion("FOR_SUBCLASS like", value, "forSubclass");
            return (Criteria) this;
        }

        public Criteria andForSubclassNotLike(String value) {
            addCriterion("FOR_SUBCLASS not like", value, "forSubclass");
            return (Criteria) this;
        }

        public Criteria andForSubclassIn(List<String> values) {
            addCriterion("FOR_SUBCLASS in", values, "forSubclass");
            return (Criteria) this;
        }

        public Criteria andForSubclassNotIn(List<String> values) {
            addCriterion("FOR_SUBCLASS not in", values, "forSubclass");
            return (Criteria) this;
        }

        public Criteria andForSubclassBetween(String value1, String value2) {
            addCriterion("FOR_SUBCLASS between", value1, value2, "forSubclass");
            return (Criteria) this;
        }

        public Criteria andForSubclassNotBetween(String value1, String value2) {
            addCriterion("FOR_SUBCLASS not between", value1, value2, "forSubclass");
            return (Criteria) this;
        }

        public Criteria andFinishProcessIsNull() {
            addCriterion("FINISH_PROCESS is null");
            return (Criteria) this;
        }

        public Criteria andFinishProcessIsNotNull() {
            addCriterion("FINISH_PROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andFinishProcessEqualTo(Byte value) {
            addCriterion("FINISH_PROCESS =", value, "finishProcess");
            return (Criteria) this;
        }

        public Criteria andFinishProcessNotEqualTo(Byte value) {
            addCriterion("FINISH_PROCESS <>", value, "finishProcess");
            return (Criteria) this;
        }

        public Criteria andFinishProcessGreaterThan(Byte value) {
            addCriterion("FINISH_PROCESS >", value, "finishProcess");
            return (Criteria) this;
        }

        public Criteria andFinishProcessGreaterThanOrEqualTo(Byte value) {
            addCriterion("FINISH_PROCESS >=", value, "finishProcess");
            return (Criteria) this;
        }

        public Criteria andFinishProcessLessThan(Byte value) {
            addCriterion("FINISH_PROCESS <", value, "finishProcess");
            return (Criteria) this;
        }

        public Criteria andFinishProcessLessThanOrEqualTo(Byte value) {
            addCriterion("FINISH_PROCESS <=", value, "finishProcess");
            return (Criteria) this;
        }

        public Criteria andFinishProcessIn(List<Byte> values) {
            addCriterion("FINISH_PROCESS in", values, "finishProcess");
            return (Criteria) this;
        }

        public Criteria andFinishProcessNotIn(List<Byte> values) {
            addCriterion("FINISH_PROCESS not in", values, "finishProcess");
            return (Criteria) this;
        }

        public Criteria andFinishProcessBetween(Byte value1, Byte value2) {
            addCriterion("FINISH_PROCESS between", value1, value2, "finishProcess");
            return (Criteria) this;
        }

        public Criteria andFinishProcessNotBetween(Byte value1, Byte value2) {
            addCriterion("FINISH_PROCESS not between", value1, value2, "finishProcess");
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