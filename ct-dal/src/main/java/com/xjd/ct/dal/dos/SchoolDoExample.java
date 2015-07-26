package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.List;

public class SchoolDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public SchoolDoExample() {
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

        public Criteria andSchoolShortNameIsNull() {
            addCriterion("SCHOOL_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSchoolShortNameIsNotNull() {
            addCriterion("SCHOOL_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolShortNameEqualTo(String value) {
            addCriterion("SCHOOL_SHORT_NAME =", value, "schoolShortName");
            return (Criteria) this;
        }

        public Criteria andSchoolShortNameNotEqualTo(String value) {
            addCriterion("SCHOOL_SHORT_NAME <>", value, "schoolShortName");
            return (Criteria) this;
        }

        public Criteria andSchoolShortNameGreaterThan(String value) {
            addCriterion("SCHOOL_SHORT_NAME >", value, "schoolShortName");
            return (Criteria) this;
        }

        public Criteria andSchoolShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_SHORT_NAME >=", value, "schoolShortName");
            return (Criteria) this;
        }

        public Criteria andSchoolShortNameLessThan(String value) {
            addCriterion("SCHOOL_SHORT_NAME <", value, "schoolShortName");
            return (Criteria) this;
        }

        public Criteria andSchoolShortNameLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_SHORT_NAME <=", value, "schoolShortName");
            return (Criteria) this;
        }

        public Criteria andSchoolShortNameLike(String value) {
            addCriterion("SCHOOL_SHORT_NAME like", value, "schoolShortName");
            return (Criteria) this;
        }

        public Criteria andSchoolShortNameNotLike(String value) {
            addCriterion("SCHOOL_SHORT_NAME not like", value, "schoolShortName");
            return (Criteria) this;
        }

        public Criteria andSchoolShortNameIn(List<String> values) {
            addCriterion("SCHOOL_SHORT_NAME in", values, "schoolShortName");
            return (Criteria) this;
        }

        public Criteria andSchoolShortNameNotIn(List<String> values) {
            addCriterion("SCHOOL_SHORT_NAME not in", values, "schoolShortName");
            return (Criteria) this;
        }

        public Criteria andSchoolShortNameBetween(String value1, String value2) {
            addCriterion("SCHOOL_SHORT_NAME between", value1, value2, "schoolShortName");
            return (Criteria) this;
        }

        public Criteria andSchoolShortNameNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_SHORT_NAME not between", value1, value2, "schoolShortName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNull() {
            addCriterion("SCHOOL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("SCHOOL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("SCHOOL_NAME =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("SCHOOL_NAME <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("SCHOOL_NAME >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_NAME >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("SCHOOL_NAME <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_NAME <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("SCHOOL_NAME like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("SCHOOL_NAME not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("SCHOOL_NAME in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("SCHOOL_NAME not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("SCHOOL_NAME between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_NAME not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneIsNull() {
            addCriterion("SCHOOL_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneIsNotNull() {
            addCriterion("SCHOOL_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneEqualTo(String value) {
            addCriterion("SCHOOL_PHONE =", value, "schoolPhone");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneNotEqualTo(String value) {
            addCriterion("SCHOOL_PHONE <>", value, "schoolPhone");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneGreaterThan(String value) {
            addCriterion("SCHOOL_PHONE >", value, "schoolPhone");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_PHONE >=", value, "schoolPhone");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneLessThan(String value) {
            addCriterion("SCHOOL_PHONE <", value, "schoolPhone");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_PHONE <=", value, "schoolPhone");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneLike(String value) {
            addCriterion("SCHOOL_PHONE like", value, "schoolPhone");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneNotLike(String value) {
            addCriterion("SCHOOL_PHONE not like", value, "schoolPhone");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneIn(List<String> values) {
            addCriterion("SCHOOL_PHONE in", values, "schoolPhone");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneNotIn(List<String> values) {
            addCriterion("SCHOOL_PHONE not in", values, "schoolPhone");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneBetween(String value1, String value2) {
            addCriterion("SCHOOL_PHONE between", value1, value2, "schoolPhone");
            return (Criteria) this;
        }

        public Criteria andSchoolPhoneNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_PHONE not between", value1, value2, "schoolPhone");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressIsNull() {
            addCriterion("SCHOOL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressIsNotNull() {
            addCriterion("SCHOOL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressEqualTo(String value) {
            addCriterion("SCHOOL_ADDRESS =", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressNotEqualTo(String value) {
            addCriterion("SCHOOL_ADDRESS <>", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressGreaterThan(String value) {
            addCriterion("SCHOOL_ADDRESS >", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_ADDRESS >=", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressLessThan(String value) {
            addCriterion("SCHOOL_ADDRESS <", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_ADDRESS <=", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressLike(String value) {
            addCriterion("SCHOOL_ADDRESS like", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressNotLike(String value) {
            addCriterion("SCHOOL_ADDRESS not like", value, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressIn(List<String> values) {
            addCriterion("SCHOOL_ADDRESS in", values, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressNotIn(List<String> values) {
            addCriterion("SCHOOL_ADDRESS not in", values, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressBetween(String value1, String value2) {
            addCriterion("SCHOOL_ADDRESS between", value1, value2, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolAddressNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_ADDRESS not between", value1, value2, "schoolAddress");
            return (Criteria) this;
        }

        public Criteria andSchoolLonIsNull() {
            addCriterion("SCHOOL_LON is null");
            return (Criteria) this;
        }

        public Criteria andSchoolLonIsNotNull() {
            addCriterion("SCHOOL_LON is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolLonEqualTo(Double value) {
            addCriterion("SCHOOL_LON =", value, "schoolLon");
            return (Criteria) this;
        }

        public Criteria andSchoolLonNotEqualTo(Double value) {
            addCriterion("SCHOOL_LON <>", value, "schoolLon");
            return (Criteria) this;
        }

        public Criteria andSchoolLonGreaterThan(Double value) {
            addCriterion("SCHOOL_LON >", value, "schoolLon");
            return (Criteria) this;
        }

        public Criteria andSchoolLonGreaterThanOrEqualTo(Double value) {
            addCriterion("SCHOOL_LON >=", value, "schoolLon");
            return (Criteria) this;
        }

        public Criteria andSchoolLonLessThan(Double value) {
            addCriterion("SCHOOL_LON <", value, "schoolLon");
            return (Criteria) this;
        }

        public Criteria andSchoolLonLessThanOrEqualTo(Double value) {
            addCriterion("SCHOOL_LON <=", value, "schoolLon");
            return (Criteria) this;
        }

        public Criteria andSchoolLonIn(List<Double> values) {
            addCriterion("SCHOOL_LON in", values, "schoolLon");
            return (Criteria) this;
        }

        public Criteria andSchoolLonNotIn(List<Double> values) {
            addCriterion("SCHOOL_LON not in", values, "schoolLon");
            return (Criteria) this;
        }

        public Criteria andSchoolLonBetween(Double value1, Double value2) {
            addCriterion("SCHOOL_LON between", value1, value2, "schoolLon");
            return (Criteria) this;
        }

        public Criteria andSchoolLonNotBetween(Double value1, Double value2) {
            addCriterion("SCHOOL_LON not between", value1, value2, "schoolLon");
            return (Criteria) this;
        }

        public Criteria andSchoolLatIsNull() {
            addCriterion("SCHOOL_LAT is null");
            return (Criteria) this;
        }

        public Criteria andSchoolLatIsNotNull() {
            addCriterion("SCHOOL_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolLatEqualTo(Double value) {
            addCriterion("SCHOOL_LAT =", value, "schoolLat");
            return (Criteria) this;
        }

        public Criteria andSchoolLatNotEqualTo(Double value) {
            addCriterion("SCHOOL_LAT <>", value, "schoolLat");
            return (Criteria) this;
        }

        public Criteria andSchoolLatGreaterThan(Double value) {
            addCriterion("SCHOOL_LAT >", value, "schoolLat");
            return (Criteria) this;
        }

        public Criteria andSchoolLatGreaterThanOrEqualTo(Double value) {
            addCriterion("SCHOOL_LAT >=", value, "schoolLat");
            return (Criteria) this;
        }

        public Criteria andSchoolLatLessThan(Double value) {
            addCriterion("SCHOOL_LAT <", value, "schoolLat");
            return (Criteria) this;
        }

        public Criteria andSchoolLatLessThanOrEqualTo(Double value) {
            addCriterion("SCHOOL_LAT <=", value, "schoolLat");
            return (Criteria) this;
        }

        public Criteria andSchoolLatIn(List<Double> values) {
            addCriterion("SCHOOL_LAT in", values, "schoolLat");
            return (Criteria) this;
        }

        public Criteria andSchoolLatNotIn(List<Double> values) {
            addCriterion("SCHOOL_LAT not in", values, "schoolLat");
            return (Criteria) this;
        }

        public Criteria andSchoolLatBetween(Double value1, Double value2) {
            addCriterion("SCHOOL_LAT between", value1, value2, "schoolLat");
            return (Criteria) this;
        }

        public Criteria andSchoolLatNotBetween(Double value1, Double value2) {
            addCriterion("SCHOOL_LAT not between", value1, value2, "schoolLat");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionIsNull() {
            addCriterion("SCHOOL_REGION is null");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionIsNotNull() {
            addCriterion("SCHOOL_REGION is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionEqualTo(String value) {
            addCriterion("SCHOOL_REGION =", value, "schoolRegion");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionNotEqualTo(String value) {
            addCriterion("SCHOOL_REGION <>", value, "schoolRegion");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionGreaterThan(String value) {
            addCriterion("SCHOOL_REGION >", value, "schoolRegion");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_REGION >=", value, "schoolRegion");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionLessThan(String value) {
            addCriterion("SCHOOL_REGION <", value, "schoolRegion");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_REGION <=", value, "schoolRegion");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionLike(String value) {
            addCriterion("SCHOOL_REGION like", value, "schoolRegion");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionNotLike(String value) {
            addCriterion("SCHOOL_REGION not like", value, "schoolRegion");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionIn(List<String> values) {
            addCriterion("SCHOOL_REGION in", values, "schoolRegion");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionNotIn(List<String> values) {
            addCriterion("SCHOOL_REGION not in", values, "schoolRegion");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionBetween(String value1, String value2) {
            addCriterion("SCHOOL_REGION between", value1, value2, "schoolRegion");
            return (Criteria) this;
        }

        public Criteria andSchoolRegionNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_REGION not between", value1, value2, "schoolRegion");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureIsNull() {
            addCriterion("SCHOOL_NATURE is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureIsNotNull() {
            addCriterion("SCHOOL_NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureEqualTo(Byte value) {
            addCriterion("SCHOOL_NATURE =", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureNotEqualTo(Byte value) {
            addCriterion("SCHOOL_NATURE <>", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureGreaterThan(Byte value) {
            addCriterion("SCHOOL_NATURE >", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureGreaterThanOrEqualTo(Byte value) {
            addCriterion("SCHOOL_NATURE >=", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureLessThan(Byte value) {
            addCriterion("SCHOOL_NATURE <", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureLessThanOrEqualTo(Byte value) {
            addCriterion("SCHOOL_NATURE <=", value, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureIn(List<Byte> values) {
            addCriterion("SCHOOL_NATURE in", values, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureNotIn(List<Byte> values) {
            addCriterion("SCHOOL_NATURE not in", values, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureBetween(Byte value1, Byte value2) {
            addCriterion("SCHOOL_NATURE between", value1, value2, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolNatureNotBetween(Byte value1, Byte value2) {
            addCriterion("SCHOOL_NATURE not between", value1, value2, "schoolNature");
            return (Criteria) this;
        }

        public Criteria andSchoolGradeIsNull() {
            addCriterion("SCHOOL_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andSchoolGradeIsNotNull() {
            addCriterion("SCHOOL_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolGradeEqualTo(Byte value) {
            addCriterion("SCHOOL_GRADE =", value, "schoolGrade");
            return (Criteria) this;
        }

        public Criteria andSchoolGradeNotEqualTo(Byte value) {
            addCriterion("SCHOOL_GRADE <>", value, "schoolGrade");
            return (Criteria) this;
        }

        public Criteria andSchoolGradeGreaterThan(Byte value) {
            addCriterion("SCHOOL_GRADE >", value, "schoolGrade");
            return (Criteria) this;
        }

        public Criteria andSchoolGradeGreaterThanOrEqualTo(Byte value) {
            addCriterion("SCHOOL_GRADE >=", value, "schoolGrade");
            return (Criteria) this;
        }

        public Criteria andSchoolGradeLessThan(Byte value) {
            addCriterion("SCHOOL_GRADE <", value, "schoolGrade");
            return (Criteria) this;
        }

        public Criteria andSchoolGradeLessThanOrEqualTo(Byte value) {
            addCriterion("SCHOOL_GRADE <=", value, "schoolGrade");
            return (Criteria) this;
        }

        public Criteria andSchoolGradeIn(List<Byte> values) {
            addCriterion("SCHOOL_GRADE in", values, "schoolGrade");
            return (Criteria) this;
        }

        public Criteria andSchoolGradeNotIn(List<Byte> values) {
            addCriterion("SCHOOL_GRADE not in", values, "schoolGrade");
            return (Criteria) this;
        }

        public Criteria andSchoolGradeBetween(Byte value1, Byte value2) {
            addCriterion("SCHOOL_GRADE between", value1, value2, "schoolGrade");
            return (Criteria) this;
        }

        public Criteria andSchoolGradeNotBetween(Byte value1, Byte value2) {
            addCriterion("SCHOOL_GRADE not between", value1, value2, "schoolGrade");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroIsNull() {
            addCriterion("SCHOOL_INTRO is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroIsNotNull() {
            addCriterion("SCHOOL_INTRO is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroEqualTo(String value) {
            addCriterion("SCHOOL_INTRO =", value, "schoolIntro");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroNotEqualTo(String value) {
            addCriterion("SCHOOL_INTRO <>", value, "schoolIntro");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroGreaterThan(String value) {
            addCriterion("SCHOOL_INTRO >", value, "schoolIntro");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_INTRO >=", value, "schoolIntro");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroLessThan(String value) {
            addCriterion("SCHOOL_INTRO <", value, "schoolIntro");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_INTRO <=", value, "schoolIntro");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroLike(String value) {
            addCriterion("SCHOOL_INTRO like", value, "schoolIntro");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroNotLike(String value) {
            addCriterion("SCHOOL_INTRO not like", value, "schoolIntro");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroIn(List<String> values) {
            addCriterion("SCHOOL_INTRO in", values, "schoolIntro");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroNotIn(List<String> values) {
            addCriterion("SCHOOL_INTRO not in", values, "schoolIntro");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroBetween(String value1, String value2) {
            addCriterion("SCHOOL_INTRO between", value1, value2, "schoolIntro");
            return (Criteria) this;
        }

        public Criteria andSchoolIntroNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_INTRO not between", value1, value2, "schoolIntro");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherIsNull() {
            addCriterion("SCHOOL_TEACHER is null");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherIsNotNull() {
            addCriterion("SCHOOL_TEACHER is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherEqualTo(String value) {
            addCriterion("SCHOOL_TEACHER =", value, "schoolTeacher");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherNotEqualTo(String value) {
            addCriterion("SCHOOL_TEACHER <>", value, "schoolTeacher");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherGreaterThan(String value) {
            addCriterion("SCHOOL_TEACHER >", value, "schoolTeacher");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_TEACHER >=", value, "schoolTeacher");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherLessThan(String value) {
            addCriterion("SCHOOL_TEACHER <", value, "schoolTeacher");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_TEACHER <=", value, "schoolTeacher");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherLike(String value) {
            addCriterion("SCHOOL_TEACHER like", value, "schoolTeacher");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherNotLike(String value) {
            addCriterion("SCHOOL_TEACHER not like", value, "schoolTeacher");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherIn(List<String> values) {
            addCriterion("SCHOOL_TEACHER in", values, "schoolTeacher");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherNotIn(List<String> values) {
            addCriterion("SCHOOL_TEACHER not in", values, "schoolTeacher");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherBetween(String value1, String value2) {
            addCriterion("SCHOOL_TEACHER between", value1, value2, "schoolTeacher");
            return (Criteria) this;
        }

        public Criteria andSchoolTeacherNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_TEACHER not between", value1, value2, "schoolTeacher");
            return (Criteria) this;
        }

        public Criteria andSchoolCostIsNull() {
            addCriterion("SCHOOL_COST is null");
            return (Criteria) this;
        }

        public Criteria andSchoolCostIsNotNull() {
            addCriterion("SCHOOL_COST is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolCostEqualTo(String value) {
            addCriterion("SCHOOL_COST =", value, "schoolCost");
            return (Criteria) this;
        }

        public Criteria andSchoolCostNotEqualTo(String value) {
            addCriterion("SCHOOL_COST <>", value, "schoolCost");
            return (Criteria) this;
        }

        public Criteria andSchoolCostGreaterThan(String value) {
            addCriterion("SCHOOL_COST >", value, "schoolCost");
            return (Criteria) this;
        }

        public Criteria andSchoolCostGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_COST >=", value, "schoolCost");
            return (Criteria) this;
        }

        public Criteria andSchoolCostLessThan(String value) {
            addCriterion("SCHOOL_COST <", value, "schoolCost");
            return (Criteria) this;
        }

        public Criteria andSchoolCostLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_COST <=", value, "schoolCost");
            return (Criteria) this;
        }

        public Criteria andSchoolCostLike(String value) {
            addCriterion("SCHOOL_COST like", value, "schoolCost");
            return (Criteria) this;
        }

        public Criteria andSchoolCostNotLike(String value) {
            addCriterion("SCHOOL_COST not like", value, "schoolCost");
            return (Criteria) this;
        }

        public Criteria andSchoolCostIn(List<String> values) {
            addCriterion("SCHOOL_COST in", values, "schoolCost");
            return (Criteria) this;
        }

        public Criteria andSchoolCostNotIn(List<String> values) {
            addCriterion("SCHOOL_COST not in", values, "schoolCost");
            return (Criteria) this;
        }

        public Criteria andSchoolCostBetween(String value1, String value2) {
            addCriterion("SCHOOL_COST between", value1, value2, "schoolCost");
            return (Criteria) this;
        }

        public Criteria andSchoolCostNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_COST not between", value1, value2, "schoolCost");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseIsNull() {
            addCriterion("SCHOOL_COURSE is null");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseIsNotNull() {
            addCriterion("SCHOOL_COURSE is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseEqualTo(String value) {
            addCriterion("SCHOOL_COURSE =", value, "schoolCourse");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseNotEqualTo(String value) {
            addCriterion("SCHOOL_COURSE <>", value, "schoolCourse");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseGreaterThan(String value) {
            addCriterion("SCHOOL_COURSE >", value, "schoolCourse");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_COURSE >=", value, "schoolCourse");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseLessThan(String value) {
            addCriterion("SCHOOL_COURSE <", value, "schoolCourse");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_COURSE <=", value, "schoolCourse");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseLike(String value) {
            addCriterion("SCHOOL_COURSE like", value, "schoolCourse");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseNotLike(String value) {
            addCriterion("SCHOOL_COURSE not like", value, "schoolCourse");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseIn(List<String> values) {
            addCriterion("SCHOOL_COURSE in", values, "schoolCourse");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseNotIn(List<String> values) {
            addCriterion("SCHOOL_COURSE not in", values, "schoolCourse");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseBetween(String value1, String value2) {
            addCriterion("SCHOOL_COURSE between", value1, value2, "schoolCourse");
            return (Criteria) this;
        }

        public Criteria andSchoolCourseNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_COURSE not between", value1, value2, "schoolCourse");
            return (Criteria) this;
        }

        public Criteria andSchoolRateIsNull() {
            addCriterion("SCHOOL_RATE is null");
            return (Criteria) this;
        }

        public Criteria andSchoolRateIsNotNull() {
            addCriterion("SCHOOL_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolRateEqualTo(String value) {
            addCriterion("SCHOOL_RATE =", value, "schoolRate");
            return (Criteria) this;
        }

        public Criteria andSchoolRateNotEqualTo(String value) {
            addCriterion("SCHOOL_RATE <>", value, "schoolRate");
            return (Criteria) this;
        }

        public Criteria andSchoolRateGreaterThan(String value) {
            addCriterion("SCHOOL_RATE >", value, "schoolRate");
            return (Criteria) this;
        }

        public Criteria andSchoolRateGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_RATE >=", value, "schoolRate");
            return (Criteria) this;
        }

        public Criteria andSchoolRateLessThan(String value) {
            addCriterion("SCHOOL_RATE <", value, "schoolRate");
            return (Criteria) this;
        }

        public Criteria andSchoolRateLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_RATE <=", value, "schoolRate");
            return (Criteria) this;
        }

        public Criteria andSchoolRateLike(String value) {
            addCriterion("SCHOOL_RATE like", value, "schoolRate");
            return (Criteria) this;
        }

        public Criteria andSchoolRateNotLike(String value) {
            addCriterion("SCHOOL_RATE not like", value, "schoolRate");
            return (Criteria) this;
        }

        public Criteria andSchoolRateIn(List<String> values) {
            addCriterion("SCHOOL_RATE in", values, "schoolRate");
            return (Criteria) this;
        }

        public Criteria andSchoolRateNotIn(List<String> values) {
            addCriterion("SCHOOL_RATE not in", values, "schoolRate");
            return (Criteria) this;
        }

        public Criteria andSchoolRateBetween(String value1, String value2) {
            addCriterion("SCHOOL_RATE between", value1, value2, "schoolRate");
            return (Criteria) this;
        }

        public Criteria andSchoolRateNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_RATE not between", value1, value2, "schoolRate");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionIsNull() {
            addCriterion("SCHOOL_REQUISITION is null");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionIsNotNull() {
            addCriterion("SCHOOL_REQUISITION is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionEqualTo(String value) {
            addCriterion("SCHOOL_REQUISITION =", value, "schoolRequisition");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionNotEqualTo(String value) {
            addCriterion("SCHOOL_REQUISITION <>", value, "schoolRequisition");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionGreaterThan(String value) {
            addCriterion("SCHOOL_REQUISITION >", value, "schoolRequisition");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_REQUISITION >=", value, "schoolRequisition");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionLessThan(String value) {
            addCriterion("SCHOOL_REQUISITION <", value, "schoolRequisition");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_REQUISITION <=", value, "schoolRequisition");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionLike(String value) {
            addCriterion("SCHOOL_REQUISITION like", value, "schoolRequisition");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionNotLike(String value) {
            addCriterion("SCHOOL_REQUISITION not like", value, "schoolRequisition");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionIn(List<String> values) {
            addCriterion("SCHOOL_REQUISITION in", values, "schoolRequisition");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionNotIn(List<String> values) {
            addCriterion("SCHOOL_REQUISITION not in", values, "schoolRequisition");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionBetween(String value1, String value2) {
            addCriterion("SCHOOL_REQUISITION between", value1, value2, "schoolRequisition");
            return (Criteria) this;
        }

        public Criteria andSchoolRequisitionNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_REQUISITION not between", value1, value2, "schoolRequisition");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowIsNull() {
            addCriterion("SCHOOL_FLOW is null");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowIsNotNull() {
            addCriterion("SCHOOL_FLOW is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowEqualTo(String value) {
            addCriterion("SCHOOL_FLOW =", value, "schoolFlow");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowNotEqualTo(String value) {
            addCriterion("SCHOOL_FLOW <>", value, "schoolFlow");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowGreaterThan(String value) {
            addCriterion("SCHOOL_FLOW >", value, "schoolFlow");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_FLOW >=", value, "schoolFlow");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowLessThan(String value) {
            addCriterion("SCHOOL_FLOW <", value, "schoolFlow");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_FLOW <=", value, "schoolFlow");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowLike(String value) {
            addCriterion("SCHOOL_FLOW like", value, "schoolFlow");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowNotLike(String value) {
            addCriterion("SCHOOL_FLOW not like", value, "schoolFlow");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowIn(List<String> values) {
            addCriterion("SCHOOL_FLOW in", values, "schoolFlow");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowNotIn(List<String> values) {
            addCriterion("SCHOOL_FLOW not in", values, "schoolFlow");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowBetween(String value1, String value2) {
            addCriterion("SCHOOL_FLOW between", value1, value2, "schoolFlow");
            return (Criteria) this;
        }

        public Criteria andSchoolFlowNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_FLOW not between", value1, value2, "schoolFlow");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("AUDIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("AUDIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Byte value) {
            addCriterion("AUDIT_STATUS =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Byte value) {
            addCriterion("AUDIT_STATUS <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Byte value) {
            addCriterion("AUDIT_STATUS >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("AUDIT_STATUS >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Byte value) {
            addCriterion("AUDIT_STATUS <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Byte value) {
            addCriterion("AUDIT_STATUS <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Byte> values) {
            addCriterion("AUDIT_STATUS in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Byte> values) {
            addCriterion("AUDIT_STATUS not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Byte value1, Byte value2) {
            addCriterion("AUDIT_STATUS between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("AUDIT_STATUS not between", value1, value2, "auditStatus");
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