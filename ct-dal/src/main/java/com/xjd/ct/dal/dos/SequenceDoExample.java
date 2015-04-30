package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.List;

public class SequenceDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public SequenceDoExample() {
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

        public Criteria andSeqNameIsNull() {
            addCriterion("SEQ_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSeqNameIsNotNull() {
            addCriterion("SEQ_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNameEqualTo(String value) {
            addCriterion("SEQ_NAME =", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameNotEqualTo(String value) {
            addCriterion("SEQ_NAME <>", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameGreaterThan(String value) {
            addCriterion("SEQ_NAME >", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameGreaterThanOrEqualTo(String value) {
            addCriterion("SEQ_NAME >=", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameLessThan(String value) {
            addCriterion("SEQ_NAME <", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameLessThanOrEqualTo(String value) {
            addCriterion("SEQ_NAME <=", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameLike(String value) {
            addCriterion("SEQ_NAME like", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameNotLike(String value) {
            addCriterion("SEQ_NAME not like", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameIn(List<String> values) {
            addCriterion("SEQ_NAME in", values, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameNotIn(List<String> values) {
            addCriterion("SEQ_NAME not in", values, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameBetween(String value1, String value2) {
            addCriterion("SEQ_NAME between", value1, value2, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameNotBetween(String value1, String value2) {
            addCriterion("SEQ_NAME not between", value1, value2, "seqName");
            return (Criteria) this;
        }

        public Criteria andCurvalIsNull() {
            addCriterion("CURVAL is null");
            return (Criteria) this;
        }

        public Criteria andCurvalIsNotNull() {
            addCriterion("CURVAL is not null");
            return (Criteria) this;
        }

        public Criteria andCurvalEqualTo(Long value) {
            addCriterion("CURVAL =", value, "curval");
            return (Criteria) this;
        }

        public Criteria andCurvalNotEqualTo(Long value) {
            addCriterion("CURVAL <>", value, "curval");
            return (Criteria) this;
        }

        public Criteria andCurvalGreaterThan(Long value) {
            addCriterion("CURVAL >", value, "curval");
            return (Criteria) this;
        }

        public Criteria andCurvalGreaterThanOrEqualTo(Long value) {
            addCriterion("CURVAL >=", value, "curval");
            return (Criteria) this;
        }

        public Criteria andCurvalLessThan(Long value) {
            addCriterion("CURVAL <", value, "curval");
            return (Criteria) this;
        }

        public Criteria andCurvalLessThanOrEqualTo(Long value) {
            addCriterion("CURVAL <=", value, "curval");
            return (Criteria) this;
        }

        public Criteria andCurvalIn(List<Long> values) {
            addCriterion("CURVAL in", values, "curval");
            return (Criteria) this;
        }

        public Criteria andCurvalNotIn(List<Long> values) {
            addCriterion("CURVAL not in", values, "curval");
            return (Criteria) this;
        }

        public Criteria andCurvalBetween(Long value1, Long value2) {
            addCriterion("CURVAL between", value1, value2, "curval");
            return (Criteria) this;
        }

        public Criteria andCurvalNotBetween(Long value1, Long value2) {
            addCriterion("CURVAL not between", value1, value2, "curval");
            return (Criteria) this;
        }

        public Criteria andIncrementIsNull() {
            addCriterion("INCREMENT is null");
            return (Criteria) this;
        }

        public Criteria andIncrementIsNotNull() {
            addCriterion("INCREMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIncrementEqualTo(Short value) {
            addCriterion("INCREMENT =", value, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementNotEqualTo(Short value) {
            addCriterion("INCREMENT <>", value, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementGreaterThan(Short value) {
            addCriterion("INCREMENT >", value, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementGreaterThanOrEqualTo(Short value) {
            addCriterion("INCREMENT >=", value, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementLessThan(Short value) {
            addCriterion("INCREMENT <", value, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementLessThanOrEqualTo(Short value) {
            addCriterion("INCREMENT <=", value, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementIn(List<Short> values) {
            addCriterion("INCREMENT in", values, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementNotIn(List<Short> values) {
            addCriterion("INCREMENT not in", values, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementBetween(Short value1, Short value2) {
            addCriterion("INCREMENT between", value1, value2, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementNotBetween(Short value1, Short value2) {
            addCriterion("INCREMENT not between", value1, value2, "increment");
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