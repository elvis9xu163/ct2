package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.List;

public class AppVersionDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public AppVersionDoExample() {
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

        public Criteria andAppTypeIsNull() {
            addCriterion("APP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNotNull() {
            addCriterion("APP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAppTypeEqualTo(Byte value) {
            addCriterion("APP_TYPE =", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotEqualTo(Byte value) {
            addCriterion("APP_TYPE <>", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThan(Byte value) {
            addCriterion("APP_TYPE >", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("APP_TYPE >=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThan(Byte value) {
            addCriterion("APP_TYPE <", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThanOrEqualTo(Byte value) {
            addCriterion("APP_TYPE <=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeIn(List<Byte> values) {
            addCriterion("APP_TYPE in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotIn(List<Byte> values) {
            addCriterion("APP_TYPE not in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeBetween(Byte value1, Byte value2) {
            addCriterion("APP_TYPE between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("APP_TYPE not between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andVerCodeIsNull() {
            addCriterion("VER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVerCodeIsNotNull() {
            addCriterion("VER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVerCodeEqualTo(Short value) {
            addCriterion("VER_CODE =", value, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeNotEqualTo(Short value) {
            addCriterion("VER_CODE <>", value, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeGreaterThan(Short value) {
            addCriterion("VER_CODE >", value, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("VER_CODE >=", value, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeLessThan(Short value) {
            addCriterion("VER_CODE <", value, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeLessThanOrEqualTo(Short value) {
            addCriterion("VER_CODE <=", value, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeIn(List<Short> values) {
            addCriterion("VER_CODE in", values, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeNotIn(List<Short> values) {
            addCriterion("VER_CODE not in", values, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeBetween(Short value1, Short value2) {
            addCriterion("VER_CODE between", value1, value2, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeNotBetween(Short value1, Short value2) {
            addCriterion("VER_CODE not between", value1, value2, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerNameIsNull() {
            addCriterion("VER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVerNameIsNotNull() {
            addCriterion("VER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVerNameEqualTo(String value) {
            addCriterion("VER_NAME =", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameNotEqualTo(String value) {
            addCriterion("VER_NAME <>", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameGreaterThan(String value) {
            addCriterion("VER_NAME >", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameGreaterThanOrEqualTo(String value) {
            addCriterion("VER_NAME >=", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameLessThan(String value) {
            addCriterion("VER_NAME <", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameLessThanOrEqualTo(String value) {
            addCriterion("VER_NAME <=", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameLike(String value) {
            addCriterion("VER_NAME like", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameNotLike(String value) {
            addCriterion("VER_NAME not like", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameIn(List<String> values) {
            addCriterion("VER_NAME in", values, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameNotIn(List<String> values) {
            addCriterion("VER_NAME not in", values, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameBetween(String value1, String value2) {
            addCriterion("VER_NAME between", value1, value2, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameNotBetween(String value1, String value2) {
            addCriterion("VER_NAME not between", value1, value2, "verName");
            return (Criteria) this;
        }

        public Criteria andVerDescIsNull() {
            addCriterion("VER_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVerDescIsNotNull() {
            addCriterion("VER_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVerDescEqualTo(String value) {
            addCriterion("VER_DESC =", value, "verDesc");
            return (Criteria) this;
        }

        public Criteria andVerDescNotEqualTo(String value) {
            addCriterion("VER_DESC <>", value, "verDesc");
            return (Criteria) this;
        }

        public Criteria andVerDescGreaterThan(String value) {
            addCriterion("VER_DESC >", value, "verDesc");
            return (Criteria) this;
        }

        public Criteria andVerDescGreaterThanOrEqualTo(String value) {
            addCriterion("VER_DESC >=", value, "verDesc");
            return (Criteria) this;
        }

        public Criteria andVerDescLessThan(String value) {
            addCriterion("VER_DESC <", value, "verDesc");
            return (Criteria) this;
        }

        public Criteria andVerDescLessThanOrEqualTo(String value) {
            addCriterion("VER_DESC <=", value, "verDesc");
            return (Criteria) this;
        }

        public Criteria andVerDescLike(String value) {
            addCriterion("VER_DESC like", value, "verDesc");
            return (Criteria) this;
        }

        public Criteria andVerDescNotLike(String value) {
            addCriterion("VER_DESC not like", value, "verDesc");
            return (Criteria) this;
        }

        public Criteria andVerDescIn(List<String> values) {
            addCriterion("VER_DESC in", values, "verDesc");
            return (Criteria) this;
        }

        public Criteria andVerDescNotIn(List<String> values) {
            addCriterion("VER_DESC not in", values, "verDesc");
            return (Criteria) this;
        }

        public Criteria andVerDescBetween(String value1, String value2) {
            addCriterion("VER_DESC between", value1, value2, "verDesc");
            return (Criteria) this;
        }

        public Criteria andVerDescNotBetween(String value1, String value2) {
            addCriterion("VER_DESC not between", value1, value2, "verDesc");
            return (Criteria) this;
        }

        public Criteria andDownLinkIsNull() {
            addCriterion("DOWN_LINK is null");
            return (Criteria) this;
        }

        public Criteria andDownLinkIsNotNull() {
            addCriterion("DOWN_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andDownLinkEqualTo(String value) {
            addCriterion("DOWN_LINK =", value, "downLink");
            return (Criteria) this;
        }

        public Criteria andDownLinkNotEqualTo(String value) {
            addCriterion("DOWN_LINK <>", value, "downLink");
            return (Criteria) this;
        }

        public Criteria andDownLinkGreaterThan(String value) {
            addCriterion("DOWN_LINK >", value, "downLink");
            return (Criteria) this;
        }

        public Criteria andDownLinkGreaterThanOrEqualTo(String value) {
            addCriterion("DOWN_LINK >=", value, "downLink");
            return (Criteria) this;
        }

        public Criteria andDownLinkLessThan(String value) {
            addCriterion("DOWN_LINK <", value, "downLink");
            return (Criteria) this;
        }

        public Criteria andDownLinkLessThanOrEqualTo(String value) {
            addCriterion("DOWN_LINK <=", value, "downLink");
            return (Criteria) this;
        }

        public Criteria andDownLinkLike(String value) {
            addCriterion("DOWN_LINK like", value, "downLink");
            return (Criteria) this;
        }

        public Criteria andDownLinkNotLike(String value) {
            addCriterion("DOWN_LINK not like", value, "downLink");
            return (Criteria) this;
        }

        public Criteria andDownLinkIn(List<String> values) {
            addCriterion("DOWN_LINK in", values, "downLink");
            return (Criteria) this;
        }

        public Criteria andDownLinkNotIn(List<String> values) {
            addCriterion("DOWN_LINK not in", values, "downLink");
            return (Criteria) this;
        }

        public Criteria andDownLinkBetween(String value1, String value2) {
            addCriterion("DOWN_LINK between", value1, value2, "downLink");
            return (Criteria) this;
        }

        public Criteria andDownLinkNotBetween(String value1, String value2) {
            addCriterion("DOWN_LINK not between", value1, value2, "downLink");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSupportFlagIsNull() {
            addCriterion("SUPPORT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSupportFlagIsNotNull() {
            addCriterion("SUPPORT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSupportFlagEqualTo(Byte value) {
            addCriterion("SUPPORT_FLAG =", value, "supportFlag");
            return (Criteria) this;
        }

        public Criteria andSupportFlagNotEqualTo(Byte value) {
            addCriterion("SUPPORT_FLAG <>", value, "supportFlag");
            return (Criteria) this;
        }

        public Criteria andSupportFlagGreaterThan(Byte value) {
            addCriterion("SUPPORT_FLAG >", value, "supportFlag");
            return (Criteria) this;
        }

        public Criteria andSupportFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("SUPPORT_FLAG >=", value, "supportFlag");
            return (Criteria) this;
        }

        public Criteria andSupportFlagLessThan(Byte value) {
            addCriterion("SUPPORT_FLAG <", value, "supportFlag");
            return (Criteria) this;
        }

        public Criteria andSupportFlagLessThanOrEqualTo(Byte value) {
            addCriterion("SUPPORT_FLAG <=", value, "supportFlag");
            return (Criteria) this;
        }

        public Criteria andSupportFlagIn(List<Byte> values) {
            addCriterion("SUPPORT_FLAG in", values, "supportFlag");
            return (Criteria) this;
        }

        public Criteria andSupportFlagNotIn(List<Byte> values) {
            addCriterion("SUPPORT_FLAG not in", values, "supportFlag");
            return (Criteria) this;
        }

        public Criteria andSupportFlagBetween(Byte value1, Byte value2) {
            addCriterion("SUPPORT_FLAG between", value1, value2, "supportFlag");
            return (Criteria) this;
        }

        public Criteria andSupportFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("SUPPORT_FLAG not between", value1, value2, "supportFlag");
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