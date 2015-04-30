package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.List;

public class ObjectVoteOptDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ObjectVoteOptDoExample() {
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

        public Criteria andObjectIdIsNull() {
            addCriterion("OBJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andObjectIdIsNotNull() {
            addCriterion("OBJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andObjectIdEqualTo(Long value) {
            addCriterion("OBJECT_ID =", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotEqualTo(Long value) {
            addCriterion("OBJECT_ID <>", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThan(Long value) {
            addCriterion("OBJECT_ID >", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OBJECT_ID >=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThan(Long value) {
            addCriterion("OBJECT_ID <", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThanOrEqualTo(Long value) {
            addCriterion("OBJECT_ID <=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdIn(List<Long> values) {
            addCriterion("OBJECT_ID in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotIn(List<Long> values) {
            addCriterion("OBJECT_ID not in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdBetween(Long value1, Long value2) {
            addCriterion("OBJECT_ID between", value1, value2, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotBetween(Long value1, Long value2) {
            addCriterion("OBJECT_ID not between", value1, value2, "objectId");
            return (Criteria) this;
        }

        public Criteria andOptCodeIsNull() {
            addCriterion("OPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOptCodeIsNotNull() {
            addCriterion("OPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOptCodeEqualTo(Byte value) {
            addCriterion("OPT_CODE =", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeNotEqualTo(Byte value) {
            addCriterion("OPT_CODE <>", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeGreaterThan(Byte value) {
            addCriterion("OPT_CODE >", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("OPT_CODE >=", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeLessThan(Byte value) {
            addCriterion("OPT_CODE <", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeLessThanOrEqualTo(Byte value) {
            addCriterion("OPT_CODE <=", value, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeIn(List<Byte> values) {
            addCriterion("OPT_CODE in", values, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeNotIn(List<Byte> values) {
            addCriterion("OPT_CODE not in", values, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeBetween(Byte value1, Byte value2) {
            addCriterion("OPT_CODE between", value1, value2, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptCodeNotBetween(Byte value1, Byte value2) {
            addCriterion("OPT_CODE not between", value1, value2, "optCode");
            return (Criteria) this;
        }

        public Criteria andOptTitleIsNull() {
            addCriterion("OPT_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andOptTitleIsNotNull() {
            addCriterion("OPT_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andOptTitleEqualTo(String value) {
            addCriterion("OPT_TITLE =", value, "optTitle");
            return (Criteria) this;
        }

        public Criteria andOptTitleNotEqualTo(String value) {
            addCriterion("OPT_TITLE <>", value, "optTitle");
            return (Criteria) this;
        }

        public Criteria andOptTitleGreaterThan(String value) {
            addCriterion("OPT_TITLE >", value, "optTitle");
            return (Criteria) this;
        }

        public Criteria andOptTitleGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_TITLE >=", value, "optTitle");
            return (Criteria) this;
        }

        public Criteria andOptTitleLessThan(String value) {
            addCriterion("OPT_TITLE <", value, "optTitle");
            return (Criteria) this;
        }

        public Criteria andOptTitleLessThanOrEqualTo(String value) {
            addCriterion("OPT_TITLE <=", value, "optTitle");
            return (Criteria) this;
        }

        public Criteria andOptTitleLike(String value) {
            addCriterion("OPT_TITLE like", value, "optTitle");
            return (Criteria) this;
        }

        public Criteria andOptTitleNotLike(String value) {
            addCriterion("OPT_TITLE not like", value, "optTitle");
            return (Criteria) this;
        }

        public Criteria andOptTitleIn(List<String> values) {
            addCriterion("OPT_TITLE in", values, "optTitle");
            return (Criteria) this;
        }

        public Criteria andOptTitleNotIn(List<String> values) {
            addCriterion("OPT_TITLE not in", values, "optTitle");
            return (Criteria) this;
        }

        public Criteria andOptTitleBetween(String value1, String value2) {
            addCriterion("OPT_TITLE between", value1, value2, "optTitle");
            return (Criteria) this;
        }

        public Criteria andOptTitleNotBetween(String value1, String value2) {
            addCriterion("OPT_TITLE not between", value1, value2, "optTitle");
            return (Criteria) this;
        }

        public Criteria andOptDescIsNull() {
            addCriterion("OPT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andOptDescIsNotNull() {
            addCriterion("OPT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andOptDescEqualTo(String value) {
            addCriterion("OPT_DESC =", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescNotEqualTo(String value) {
            addCriterion("OPT_DESC <>", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescGreaterThan(String value) {
            addCriterion("OPT_DESC >", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_DESC >=", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescLessThan(String value) {
            addCriterion("OPT_DESC <", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescLessThanOrEqualTo(String value) {
            addCriterion("OPT_DESC <=", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescLike(String value) {
            addCriterion("OPT_DESC like", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescNotLike(String value) {
            addCriterion("OPT_DESC not like", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescIn(List<String> values) {
            addCriterion("OPT_DESC in", values, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescNotIn(List<String> values) {
            addCriterion("OPT_DESC not in", values, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescBetween(String value1, String value2) {
            addCriterion("OPT_DESC between", value1, value2, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescNotBetween(String value1, String value2) {
            addCriterion("OPT_DESC not between", value1, value2, "optDesc");
            return (Criteria) this;
        }

        public Criteria andYesFlagIsNull() {
            addCriterion("YES_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andYesFlagIsNotNull() {
            addCriterion("YES_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andYesFlagEqualTo(Byte value) {
            addCriterion("YES_FLAG =", value, "yesFlag");
            return (Criteria) this;
        }

        public Criteria andYesFlagNotEqualTo(Byte value) {
            addCriterion("YES_FLAG <>", value, "yesFlag");
            return (Criteria) this;
        }

        public Criteria andYesFlagGreaterThan(Byte value) {
            addCriterion("YES_FLAG >", value, "yesFlag");
            return (Criteria) this;
        }

        public Criteria andYesFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("YES_FLAG >=", value, "yesFlag");
            return (Criteria) this;
        }

        public Criteria andYesFlagLessThan(Byte value) {
            addCriterion("YES_FLAG <", value, "yesFlag");
            return (Criteria) this;
        }

        public Criteria andYesFlagLessThanOrEqualTo(Byte value) {
            addCriterion("YES_FLAG <=", value, "yesFlag");
            return (Criteria) this;
        }

        public Criteria andYesFlagIn(List<Byte> values) {
            addCriterion("YES_FLAG in", values, "yesFlag");
            return (Criteria) this;
        }

        public Criteria andYesFlagNotIn(List<Byte> values) {
            addCriterion("YES_FLAG not in", values, "yesFlag");
            return (Criteria) this;
        }

        public Criteria andYesFlagBetween(Byte value1, Byte value2) {
            addCriterion("YES_FLAG between", value1, value2, "yesFlag");
            return (Criteria) this;
        }

        public Criteria andYesFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("YES_FLAG not between", value1, value2, "yesFlag");
            return (Criteria) this;
        }

        public Criteria andYesCountIsNull() {
            addCriterion("YES_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andYesCountIsNotNull() {
            addCriterion("YES_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andYesCountEqualTo(Integer value) {
            addCriterion("YES_COUNT =", value, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountNotEqualTo(Integer value) {
            addCriterion("YES_COUNT <>", value, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountGreaterThan(Integer value) {
            addCriterion("YES_COUNT >", value, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("YES_COUNT >=", value, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountLessThan(Integer value) {
            addCriterion("YES_COUNT <", value, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountLessThanOrEqualTo(Integer value) {
            addCriterion("YES_COUNT <=", value, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountIn(List<Integer> values) {
            addCriterion("YES_COUNT in", values, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountNotIn(List<Integer> values) {
            addCriterion("YES_COUNT not in", values, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountBetween(Integer value1, Integer value2) {
            addCriterion("YES_COUNT between", value1, value2, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountNotBetween(Integer value1, Integer value2) {
            addCriterion("YES_COUNT not between", value1, value2, "yesCount");
            return (Criteria) this;
        }

        public Criteria andNoFlagIsNull() {
            addCriterion("NO_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andNoFlagIsNotNull() {
            addCriterion("NO_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andNoFlagEqualTo(Byte value) {
            addCriterion("NO_FLAG =", value, "noFlag");
            return (Criteria) this;
        }

        public Criteria andNoFlagNotEqualTo(Byte value) {
            addCriterion("NO_FLAG <>", value, "noFlag");
            return (Criteria) this;
        }

        public Criteria andNoFlagGreaterThan(Byte value) {
            addCriterion("NO_FLAG >", value, "noFlag");
            return (Criteria) this;
        }

        public Criteria andNoFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("NO_FLAG >=", value, "noFlag");
            return (Criteria) this;
        }

        public Criteria andNoFlagLessThan(Byte value) {
            addCriterion("NO_FLAG <", value, "noFlag");
            return (Criteria) this;
        }

        public Criteria andNoFlagLessThanOrEqualTo(Byte value) {
            addCriterion("NO_FLAG <=", value, "noFlag");
            return (Criteria) this;
        }

        public Criteria andNoFlagIn(List<Byte> values) {
            addCriterion("NO_FLAG in", values, "noFlag");
            return (Criteria) this;
        }

        public Criteria andNoFlagNotIn(List<Byte> values) {
            addCriterion("NO_FLAG not in", values, "noFlag");
            return (Criteria) this;
        }

        public Criteria andNoFlagBetween(Byte value1, Byte value2) {
            addCriterion("NO_FLAG between", value1, value2, "noFlag");
            return (Criteria) this;
        }

        public Criteria andNoFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("NO_FLAG not between", value1, value2, "noFlag");
            return (Criteria) this;
        }

        public Criteria andNoCountIsNull() {
            addCriterion("NO_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andNoCountIsNotNull() {
            addCriterion("NO_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNoCountEqualTo(Integer value) {
            addCriterion("NO_COUNT =", value, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountNotEqualTo(Integer value) {
            addCriterion("NO_COUNT <>", value, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountGreaterThan(Integer value) {
            addCriterion("NO_COUNT >", value, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("NO_COUNT >=", value, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountLessThan(Integer value) {
            addCriterion("NO_COUNT <", value, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountLessThanOrEqualTo(Integer value) {
            addCriterion("NO_COUNT <=", value, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountIn(List<Integer> values) {
            addCriterion("NO_COUNT in", values, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountNotIn(List<Integer> values) {
            addCriterion("NO_COUNT not in", values, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountBetween(Integer value1, Integer value2) {
            addCriterion("NO_COUNT between", value1, value2, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountNotBetween(Integer value1, Integer value2) {
            addCriterion("NO_COUNT not between", value1, value2, "noCount");
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