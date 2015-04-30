package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.List;

public class ResourceDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ResourceDoExample() {
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

        public Criteria andContentTypeIsNull() {
            addCriterion("CONTENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("CONTENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(String value) {
            addCriterion("CONTENT_TYPE =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(String value) {
            addCriterion("CONTENT_TYPE <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(String value) {
            addCriterion("CONTENT_TYPE >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(String value) {
            addCriterion("CONTENT_TYPE <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLike(String value) {
            addCriterion("CONTENT_TYPE like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotLike(String value) {
            addCriterion("CONTENT_TYPE not like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<String> values) {
            addCriterion("CONTENT_TYPE in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<String> values) {
            addCriterion("CONTENT_TYPE not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE not between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andResFormatIsNull() {
            addCriterion("RES_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andResFormatIsNotNull() {
            addCriterion("RES_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andResFormatEqualTo(String value) {
            addCriterion("RES_FORMAT =", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatNotEqualTo(String value) {
            addCriterion("RES_FORMAT <>", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatGreaterThan(String value) {
            addCriterion("RES_FORMAT >", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatGreaterThanOrEqualTo(String value) {
            addCriterion("RES_FORMAT >=", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatLessThan(String value) {
            addCriterion("RES_FORMAT <", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatLessThanOrEqualTo(String value) {
            addCriterion("RES_FORMAT <=", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatLike(String value) {
            addCriterion("RES_FORMAT like", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatNotLike(String value) {
            addCriterion("RES_FORMAT not like", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatIn(List<String> values) {
            addCriterion("RES_FORMAT in", values, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatNotIn(List<String> values) {
            addCriterion("RES_FORMAT not in", values, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatBetween(String value1, String value2) {
            addCriterion("RES_FORMAT between", value1, value2, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatNotBetween(String value1, String value2) {
            addCriterion("RES_FORMAT not between", value1, value2, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormIsNull() {
            addCriterion("RES_FORM is null");
            return (Criteria) this;
        }

        public Criteria andResFormIsNotNull() {
            addCriterion("RES_FORM is not null");
            return (Criteria) this;
        }

        public Criteria andResFormEqualTo(Byte value) {
            addCriterion("RES_FORM =", value, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormNotEqualTo(Byte value) {
            addCriterion("RES_FORM <>", value, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormGreaterThan(Byte value) {
            addCriterion("RES_FORM >", value, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormGreaterThanOrEqualTo(Byte value) {
            addCriterion("RES_FORM >=", value, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormLessThan(Byte value) {
            addCriterion("RES_FORM <", value, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormLessThanOrEqualTo(Byte value) {
            addCriterion("RES_FORM <=", value, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormIn(List<Byte> values) {
            addCriterion("RES_FORM in", values, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormNotIn(List<Byte> values) {
            addCriterion("RES_FORM not in", values, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormBetween(Byte value1, Byte value2) {
            addCriterion("RES_FORM between", value1, value2, "resForm");
            return (Criteria) this;
        }

        public Criteria andResFormNotBetween(Byte value1, Byte value2) {
            addCriterion("RES_FORM not between", value1, value2, "resForm");
            return (Criteria) this;
        }

        public Criteria andResPathIsNull() {
            addCriterion("RES_PATH is null");
            return (Criteria) this;
        }

        public Criteria andResPathIsNotNull() {
            addCriterion("RES_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andResPathEqualTo(String value) {
            addCriterion("RES_PATH =", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathNotEqualTo(String value) {
            addCriterion("RES_PATH <>", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathGreaterThan(String value) {
            addCriterion("RES_PATH >", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathGreaterThanOrEqualTo(String value) {
            addCriterion("RES_PATH >=", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathLessThan(String value) {
            addCriterion("RES_PATH <", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathLessThanOrEqualTo(String value) {
            addCriterion("RES_PATH <=", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathLike(String value) {
            addCriterion("RES_PATH like", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathNotLike(String value) {
            addCriterion("RES_PATH not like", value, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathIn(List<String> values) {
            addCriterion("RES_PATH in", values, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathNotIn(List<String> values) {
            addCriterion("RES_PATH not in", values, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathBetween(String value1, String value2) {
            addCriterion("RES_PATH between", value1, value2, "resPath");
            return (Criteria) this;
        }

        public Criteria andResPathNotBetween(String value1, String value2) {
            addCriterion("RES_PATH not between", value1, value2, "resPath");
            return (Criteria) this;
        }

        public Criteria andResMd5IsNull() {
            addCriterion("RES_MD5 is null");
            return (Criteria) this;
        }

        public Criteria andResMd5IsNotNull() {
            addCriterion("RES_MD5 is not null");
            return (Criteria) this;
        }

        public Criteria andResMd5EqualTo(String value) {
            addCriterion("RES_MD5 =", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5NotEqualTo(String value) {
            addCriterion("RES_MD5 <>", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5GreaterThan(String value) {
            addCriterion("RES_MD5 >", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5GreaterThanOrEqualTo(String value) {
            addCriterion("RES_MD5 >=", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5LessThan(String value) {
            addCriterion("RES_MD5 <", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5LessThanOrEqualTo(String value) {
            addCriterion("RES_MD5 <=", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5Like(String value) {
            addCriterion("RES_MD5 like", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5NotLike(String value) {
            addCriterion("RES_MD5 not like", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5In(List<String> values) {
            addCriterion("RES_MD5 in", values, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5NotIn(List<String> values) {
            addCriterion("RES_MD5 not in", values, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5Between(String value1, String value2) {
            addCriterion("RES_MD5 between", value1, value2, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5NotBetween(String value1, String value2) {
            addCriterion("RES_MD5 not between", value1, value2, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResLengthIsNull() {
            addCriterion("RES_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andResLengthIsNotNull() {
            addCriterion("RES_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andResLengthEqualTo(Long value) {
            addCriterion("RES_LENGTH =", value, "resLength");
            return (Criteria) this;
        }

        public Criteria andResLengthNotEqualTo(Long value) {
            addCriterion("RES_LENGTH <>", value, "resLength");
            return (Criteria) this;
        }

        public Criteria andResLengthGreaterThan(Long value) {
            addCriterion("RES_LENGTH >", value, "resLength");
            return (Criteria) this;
        }

        public Criteria andResLengthGreaterThanOrEqualTo(Long value) {
            addCriterion("RES_LENGTH >=", value, "resLength");
            return (Criteria) this;
        }

        public Criteria andResLengthLessThan(Long value) {
            addCriterion("RES_LENGTH <", value, "resLength");
            return (Criteria) this;
        }

        public Criteria andResLengthLessThanOrEqualTo(Long value) {
            addCriterion("RES_LENGTH <=", value, "resLength");
            return (Criteria) this;
        }

        public Criteria andResLengthIn(List<Long> values) {
            addCriterion("RES_LENGTH in", values, "resLength");
            return (Criteria) this;
        }

        public Criteria andResLengthNotIn(List<Long> values) {
            addCriterion("RES_LENGTH not in", values, "resLength");
            return (Criteria) this;
        }

        public Criteria andResLengthBetween(Long value1, Long value2) {
            addCriterion("RES_LENGTH between", value1, value2, "resLength");
            return (Criteria) this;
        }

        public Criteria andResLengthNotBetween(Long value1, Long value2) {
            addCriterion("RES_LENGTH not between", value1, value2, "resLength");
            return (Criteria) this;
        }

        public Criteria andResSizeIsNull() {
            addCriterion("RES_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andResSizeIsNotNull() {
            addCriterion("RES_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andResSizeEqualTo(String value) {
            addCriterion("RES_SIZE =", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeNotEqualTo(String value) {
            addCriterion("RES_SIZE <>", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeGreaterThan(String value) {
            addCriterion("RES_SIZE >", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeGreaterThanOrEqualTo(String value) {
            addCriterion("RES_SIZE >=", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeLessThan(String value) {
            addCriterion("RES_SIZE <", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeLessThanOrEqualTo(String value) {
            addCriterion("RES_SIZE <=", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeLike(String value) {
            addCriterion("RES_SIZE like", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeNotLike(String value) {
            addCriterion("RES_SIZE not like", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeIn(List<String> values) {
            addCriterion("RES_SIZE in", values, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeNotIn(List<String> values) {
            addCriterion("RES_SIZE not in", values, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeBetween(String value1, String value2) {
            addCriterion("RES_SIZE between", value1, value2, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeNotBetween(String value1, String value2) {
            addCriterion("RES_SIZE not between", value1, value2, "resSize");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNull() {
            addCriterion("SOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("SOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualTo(String value) {
            addCriterion("SOURCE_ID =", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualTo(String value) {
            addCriterion("SOURCE_ID <>", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThan(String value) {
            addCriterion("SOURCE_ID >", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_ID >=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThan(String value) {
            addCriterion("SOURCE_ID <", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_ID <=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLike(String value) {
            addCriterion("SOURCE_ID like", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotLike(String value) {
            addCriterion("SOURCE_ID not like", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdIn(List<String> values) {
            addCriterion("SOURCE_ID in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotIn(List<String> values) {
            addCriterion("SOURCE_ID not in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdBetween(String value1, String value2) {
            addCriterion("SOURCE_ID between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotBetween(String value1, String value2) {
            addCriterion("SOURCE_ID not between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceProcessIsNull() {
            addCriterion("SOURCE_PROCESS is null");
            return (Criteria) this;
        }

        public Criteria andSourceProcessIsNotNull() {
            addCriterion("SOURCE_PROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andSourceProcessEqualTo(String value) {
            addCriterion("SOURCE_PROCESS =", value, "sourceProcess");
            return (Criteria) this;
        }

        public Criteria andSourceProcessNotEqualTo(String value) {
            addCriterion("SOURCE_PROCESS <>", value, "sourceProcess");
            return (Criteria) this;
        }

        public Criteria andSourceProcessGreaterThan(String value) {
            addCriterion("SOURCE_PROCESS >", value, "sourceProcess");
            return (Criteria) this;
        }

        public Criteria andSourceProcessGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_PROCESS >=", value, "sourceProcess");
            return (Criteria) this;
        }

        public Criteria andSourceProcessLessThan(String value) {
            addCriterion("SOURCE_PROCESS <", value, "sourceProcess");
            return (Criteria) this;
        }

        public Criteria andSourceProcessLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_PROCESS <=", value, "sourceProcess");
            return (Criteria) this;
        }

        public Criteria andSourceProcessLike(String value) {
            addCriterion("SOURCE_PROCESS like", value, "sourceProcess");
            return (Criteria) this;
        }

        public Criteria andSourceProcessNotLike(String value) {
            addCriterion("SOURCE_PROCESS not like", value, "sourceProcess");
            return (Criteria) this;
        }

        public Criteria andSourceProcessIn(List<String> values) {
            addCriterion("SOURCE_PROCESS in", values, "sourceProcess");
            return (Criteria) this;
        }

        public Criteria andSourceProcessNotIn(List<String> values) {
            addCriterion("SOURCE_PROCESS not in", values, "sourceProcess");
            return (Criteria) this;
        }

        public Criteria andSourceProcessBetween(String value1, String value2) {
            addCriterion("SOURCE_PROCESS between", value1, value2, "sourceProcess");
            return (Criteria) this;
        }

        public Criteria andSourceProcessNotBetween(String value1, String value2) {
            addCriterion("SOURCE_PROCESS not between", value1, value2, "sourceProcess");
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