package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.List;

public class ReportDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ReportDoExample() {
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

        public Criteria andReportIdIsNull() {
            addCriterion("REPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("REPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(Long value) {
            addCriterion("REPORT_ID =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(Long value) {
            addCriterion("REPORT_ID <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(Long value) {
            addCriterion("REPORT_ID >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REPORT_ID >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(Long value) {
            addCriterion("REPORT_ID <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(Long value) {
            addCriterion("REPORT_ID <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<Long> values) {
            addCriterion("REPORT_ID in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<Long> values) {
            addCriterion("REPORT_ID not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(Long value1, Long value2) {
            addCriterion("REPORT_ID between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(Long value1, Long value2) {
            addCriterion("REPORT_ID not between", value1, value2, "reportId");
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

        public Criteria andRefTypeIsNull() {
            addCriterion("REF_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRefTypeIsNotNull() {
            addCriterion("REF_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRefTypeEqualTo(Byte value) {
            addCriterion("REF_TYPE =", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeNotEqualTo(Byte value) {
            addCriterion("REF_TYPE <>", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeGreaterThan(Byte value) {
            addCriterion("REF_TYPE >", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("REF_TYPE >=", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeLessThan(Byte value) {
            addCriterion("REF_TYPE <", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeLessThanOrEqualTo(Byte value) {
            addCriterion("REF_TYPE <=", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeIn(List<Byte> values) {
            addCriterion("REF_TYPE in", values, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeNotIn(List<Byte> values) {
            addCriterion("REF_TYPE not in", values, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeBetween(Byte value1, Byte value2) {
            addCriterion("REF_TYPE between", value1, value2, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("REF_TYPE not between", value1, value2, "refType");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNull() {
            addCriterion("REF_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("REF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(Long value) {
            addCriterion("REF_ID =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(Long value) {
            addCriterion("REF_ID <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(Long value) {
            addCriterion("REF_ID >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REF_ID >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(Long value) {
            addCriterion("REF_ID <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(Long value) {
            addCriterion("REF_ID <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<Long> values) {
            addCriterion("REF_ID in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<Long> values) {
            addCriterion("REF_ID not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(Long value1, Long value2) {
            addCriterion("REF_ID between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(Long value1, Long value2) {
            addCriterion("REF_ID not between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andReportReasonTypeIsNull() {
            addCriterion("REPORT_REASON_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReportReasonTypeIsNotNull() {
            addCriterion("REPORT_REASON_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReportReasonTypeEqualTo(Byte value) {
            addCriterion("REPORT_REASON_TYPE =", value, "reportReasonType");
            return (Criteria) this;
        }

        public Criteria andReportReasonTypeNotEqualTo(Byte value) {
            addCriterion("REPORT_REASON_TYPE <>", value, "reportReasonType");
            return (Criteria) this;
        }

        public Criteria andReportReasonTypeGreaterThan(Byte value) {
            addCriterion("REPORT_REASON_TYPE >", value, "reportReasonType");
            return (Criteria) this;
        }

        public Criteria andReportReasonTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("REPORT_REASON_TYPE >=", value, "reportReasonType");
            return (Criteria) this;
        }

        public Criteria andReportReasonTypeLessThan(Byte value) {
            addCriterion("REPORT_REASON_TYPE <", value, "reportReasonType");
            return (Criteria) this;
        }

        public Criteria andReportReasonTypeLessThanOrEqualTo(Byte value) {
            addCriterion("REPORT_REASON_TYPE <=", value, "reportReasonType");
            return (Criteria) this;
        }

        public Criteria andReportReasonTypeIn(List<Byte> values) {
            addCriterion("REPORT_REASON_TYPE in", values, "reportReasonType");
            return (Criteria) this;
        }

        public Criteria andReportReasonTypeNotIn(List<Byte> values) {
            addCriterion("REPORT_REASON_TYPE not in", values, "reportReasonType");
            return (Criteria) this;
        }

        public Criteria andReportReasonTypeBetween(Byte value1, Byte value2) {
            addCriterion("REPORT_REASON_TYPE between", value1, value2, "reportReasonType");
            return (Criteria) this;
        }

        public Criteria andReportReasonTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("REPORT_REASON_TYPE not between", value1, value2, "reportReasonType");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailIsNull() {
            addCriterion("REPORT_REASON_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailIsNotNull() {
            addCriterion("REPORT_REASON_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailEqualTo(String value) {
            addCriterion("REPORT_REASON_DETAIL =", value, "reportReasonDetail");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailNotEqualTo(String value) {
            addCriterion("REPORT_REASON_DETAIL <>", value, "reportReasonDetail");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailGreaterThan(String value) {
            addCriterion("REPORT_REASON_DETAIL >", value, "reportReasonDetail");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_REASON_DETAIL >=", value, "reportReasonDetail");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailLessThan(String value) {
            addCriterion("REPORT_REASON_DETAIL <", value, "reportReasonDetail");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailLessThanOrEqualTo(String value) {
            addCriterion("REPORT_REASON_DETAIL <=", value, "reportReasonDetail");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailLike(String value) {
            addCriterion("REPORT_REASON_DETAIL like", value, "reportReasonDetail");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailNotLike(String value) {
            addCriterion("REPORT_REASON_DETAIL not like", value, "reportReasonDetail");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailIn(List<String> values) {
            addCriterion("REPORT_REASON_DETAIL in", values, "reportReasonDetail");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailNotIn(List<String> values) {
            addCriterion("REPORT_REASON_DETAIL not in", values, "reportReasonDetail");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailBetween(String value1, String value2) {
            addCriterion("REPORT_REASON_DETAIL between", value1, value2, "reportReasonDetail");
            return (Criteria) this;
        }

        public Criteria andReportReasonDetailNotBetween(String value1, String value2) {
            addCriterion("REPORT_REASON_DETAIL not between", value1, value2, "reportReasonDetail");
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