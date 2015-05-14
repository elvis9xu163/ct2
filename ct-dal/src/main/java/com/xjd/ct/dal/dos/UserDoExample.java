package com.xjd.ct.dal.dos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UserDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public UserDoExample() {
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

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andVerifyMobileFlagIsNull() {
            addCriterion("VERIFY_MOBILE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andVerifyMobileFlagIsNotNull() {
            addCriterion("VERIFY_MOBILE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyMobileFlagEqualTo(Byte value) {
            addCriterion("VERIFY_MOBILE_FLAG =", value, "verifyMobileFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyMobileFlagNotEqualTo(Byte value) {
            addCriterion("VERIFY_MOBILE_FLAG <>", value, "verifyMobileFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyMobileFlagGreaterThan(Byte value) {
            addCriterion("VERIFY_MOBILE_FLAG >", value, "verifyMobileFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyMobileFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("VERIFY_MOBILE_FLAG >=", value, "verifyMobileFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyMobileFlagLessThan(Byte value) {
            addCriterion("VERIFY_MOBILE_FLAG <", value, "verifyMobileFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyMobileFlagLessThanOrEqualTo(Byte value) {
            addCriterion("VERIFY_MOBILE_FLAG <=", value, "verifyMobileFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyMobileFlagIn(List<Byte> values) {
            addCriterion("VERIFY_MOBILE_FLAG in", values, "verifyMobileFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyMobileFlagNotIn(List<Byte> values) {
            addCriterion("VERIFY_MOBILE_FLAG not in", values, "verifyMobileFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyMobileFlagBetween(Byte value1, Byte value2) {
            addCriterion("VERIFY_MOBILE_FLAG between", value1, value2, "verifyMobileFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyMobileFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("VERIFY_MOBILE_FLAG not between", value1, value2, "verifyMobileFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyEmailFlagIsNull() {
            addCriterion("VERIFY_EMAIL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andVerifyEmailFlagIsNotNull() {
            addCriterion("VERIFY_EMAIL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyEmailFlagEqualTo(Byte value) {
            addCriterion("VERIFY_EMAIL_FLAG =", value, "verifyEmailFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyEmailFlagNotEqualTo(Byte value) {
            addCriterion("VERIFY_EMAIL_FLAG <>", value, "verifyEmailFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyEmailFlagGreaterThan(Byte value) {
            addCriterion("VERIFY_EMAIL_FLAG >", value, "verifyEmailFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyEmailFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("VERIFY_EMAIL_FLAG >=", value, "verifyEmailFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyEmailFlagLessThan(Byte value) {
            addCriterion("VERIFY_EMAIL_FLAG <", value, "verifyEmailFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyEmailFlagLessThanOrEqualTo(Byte value) {
            addCriterion("VERIFY_EMAIL_FLAG <=", value, "verifyEmailFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyEmailFlagIn(List<Byte> values) {
            addCriterion("VERIFY_EMAIL_FLAG in", values, "verifyEmailFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyEmailFlagNotIn(List<Byte> values) {
            addCriterion("VERIFY_EMAIL_FLAG not in", values, "verifyEmailFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyEmailFlagBetween(Byte value1, Byte value2) {
            addCriterion("VERIFY_EMAIL_FLAG between", value1, value2, "verifyEmailFlag");
            return (Criteria) this;
        }

        public Criteria andVerifyEmailFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("VERIFY_EMAIL_FLAG not between", value1, value2, "verifyEmailFlag");
            return (Criteria) this;
        }

        public Criteria andBindQqFlagIsNull() {
            addCriterion("BIND_QQ_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBindQqFlagIsNotNull() {
            addCriterion("BIND_QQ_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBindQqFlagEqualTo(Byte value) {
            addCriterion("BIND_QQ_FLAG =", value, "bindQqFlag");
            return (Criteria) this;
        }

        public Criteria andBindQqFlagNotEqualTo(Byte value) {
            addCriterion("BIND_QQ_FLAG <>", value, "bindQqFlag");
            return (Criteria) this;
        }

        public Criteria andBindQqFlagGreaterThan(Byte value) {
            addCriterion("BIND_QQ_FLAG >", value, "bindQqFlag");
            return (Criteria) this;
        }

        public Criteria andBindQqFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("BIND_QQ_FLAG >=", value, "bindQqFlag");
            return (Criteria) this;
        }

        public Criteria andBindQqFlagLessThan(Byte value) {
            addCriterion("BIND_QQ_FLAG <", value, "bindQqFlag");
            return (Criteria) this;
        }

        public Criteria andBindQqFlagLessThanOrEqualTo(Byte value) {
            addCriterion("BIND_QQ_FLAG <=", value, "bindQqFlag");
            return (Criteria) this;
        }

        public Criteria andBindQqFlagIn(List<Byte> values) {
            addCriterion("BIND_QQ_FLAG in", values, "bindQqFlag");
            return (Criteria) this;
        }

        public Criteria andBindQqFlagNotIn(List<Byte> values) {
            addCriterion("BIND_QQ_FLAG not in", values, "bindQqFlag");
            return (Criteria) this;
        }

        public Criteria andBindQqFlagBetween(Byte value1, Byte value2) {
            addCriterion("BIND_QQ_FLAG between", value1, value2, "bindQqFlag");
            return (Criteria) this;
        }

        public Criteria andBindQqFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("BIND_QQ_FLAG not between", value1, value2, "bindQqFlag");
            return (Criteria) this;
        }

        public Criteria andBindWeixinFlagIsNull() {
            addCriterion("BIND_WEIXIN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBindWeixinFlagIsNotNull() {
            addCriterion("BIND_WEIXIN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBindWeixinFlagEqualTo(Byte value) {
            addCriterion("BIND_WEIXIN_FLAG =", value, "bindWeixinFlag");
            return (Criteria) this;
        }

        public Criteria andBindWeixinFlagNotEqualTo(Byte value) {
            addCriterion("BIND_WEIXIN_FLAG <>", value, "bindWeixinFlag");
            return (Criteria) this;
        }

        public Criteria andBindWeixinFlagGreaterThan(Byte value) {
            addCriterion("BIND_WEIXIN_FLAG >", value, "bindWeixinFlag");
            return (Criteria) this;
        }

        public Criteria andBindWeixinFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("BIND_WEIXIN_FLAG >=", value, "bindWeixinFlag");
            return (Criteria) this;
        }

        public Criteria andBindWeixinFlagLessThan(Byte value) {
            addCriterion("BIND_WEIXIN_FLAG <", value, "bindWeixinFlag");
            return (Criteria) this;
        }

        public Criteria andBindWeixinFlagLessThanOrEqualTo(Byte value) {
            addCriterion("BIND_WEIXIN_FLAG <=", value, "bindWeixinFlag");
            return (Criteria) this;
        }

        public Criteria andBindWeixinFlagIn(List<Byte> values) {
            addCriterion("BIND_WEIXIN_FLAG in", values, "bindWeixinFlag");
            return (Criteria) this;
        }

        public Criteria andBindWeixinFlagNotIn(List<Byte> values) {
            addCriterion("BIND_WEIXIN_FLAG not in", values, "bindWeixinFlag");
            return (Criteria) this;
        }

        public Criteria andBindWeixinFlagBetween(Byte value1, Byte value2) {
            addCriterion("BIND_WEIXIN_FLAG between", value1, value2, "bindWeixinFlag");
            return (Criteria) this;
        }

        public Criteria andBindWeixinFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("BIND_WEIXIN_FLAG not between", value1, value2, "bindWeixinFlag");
            return (Criteria) this;
        }

        public Criteria andBindSinaWeiboFlagIsNull() {
            addCriterion("BIND_SINA_WEIBO_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBindSinaWeiboFlagIsNotNull() {
            addCriterion("BIND_SINA_WEIBO_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBindSinaWeiboFlagEqualTo(Byte value) {
            addCriterion("BIND_SINA_WEIBO_FLAG =", value, "bindSinaWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindSinaWeiboFlagNotEqualTo(Byte value) {
            addCriterion("BIND_SINA_WEIBO_FLAG <>", value, "bindSinaWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindSinaWeiboFlagGreaterThan(Byte value) {
            addCriterion("BIND_SINA_WEIBO_FLAG >", value, "bindSinaWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindSinaWeiboFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("BIND_SINA_WEIBO_FLAG >=", value, "bindSinaWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindSinaWeiboFlagLessThan(Byte value) {
            addCriterion("BIND_SINA_WEIBO_FLAG <", value, "bindSinaWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindSinaWeiboFlagLessThanOrEqualTo(Byte value) {
            addCriterion("BIND_SINA_WEIBO_FLAG <=", value, "bindSinaWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindSinaWeiboFlagIn(List<Byte> values) {
            addCriterion("BIND_SINA_WEIBO_FLAG in", values, "bindSinaWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindSinaWeiboFlagNotIn(List<Byte> values) {
            addCriterion("BIND_SINA_WEIBO_FLAG not in", values, "bindSinaWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindSinaWeiboFlagBetween(Byte value1, Byte value2) {
            addCriterion("BIND_SINA_WEIBO_FLAG between", value1, value2, "bindSinaWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindSinaWeiboFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("BIND_SINA_WEIBO_FLAG not between", value1, value2, "bindSinaWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindTecentWeiboFlagIsNull() {
            addCriterion("BIND_TECENT_WEIBO_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBindTecentWeiboFlagIsNotNull() {
            addCriterion("BIND_TECENT_WEIBO_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBindTecentWeiboFlagEqualTo(Byte value) {
            addCriterion("BIND_TECENT_WEIBO_FLAG =", value, "bindTecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindTecentWeiboFlagNotEqualTo(Byte value) {
            addCriterion("BIND_TECENT_WEIBO_FLAG <>", value, "bindTecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindTecentWeiboFlagGreaterThan(Byte value) {
            addCriterion("BIND_TECENT_WEIBO_FLAG >", value, "bindTecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindTecentWeiboFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("BIND_TECENT_WEIBO_FLAG >=", value, "bindTecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindTecentWeiboFlagLessThan(Byte value) {
            addCriterion("BIND_TECENT_WEIBO_FLAG <", value, "bindTecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindTecentWeiboFlagLessThanOrEqualTo(Byte value) {
            addCriterion("BIND_TECENT_WEIBO_FLAG <=", value, "bindTecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindTecentWeiboFlagIn(List<Byte> values) {
            addCriterion("BIND_TECENT_WEIBO_FLAG in", values, "bindTecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindTecentWeiboFlagNotIn(List<Byte> values) {
            addCriterion("BIND_TECENT_WEIBO_FLAG not in", values, "bindTecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindTecentWeiboFlagBetween(Byte value1, Byte value2) {
            addCriterion("BIND_TECENT_WEIBO_FLAG between", value1, value2, "bindTecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andBindTecentWeiboFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("BIND_TECENT_WEIBO_FLAG not between", value1, value2, "bindTecentWeiboFlag");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("REAL_NAME =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("REAL_NAME <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("REAL_NAME >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_NAME >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("REAL_NAME <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("REAL_NAME <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("REAL_NAME like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("REAL_NAME not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("REAL_NAME in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("REAL_NAME not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("REAL_NAME between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("REAL_NAME not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(Byte value) {
            addCriterion("CERT_TYPE =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(Byte value) {
            addCriterion("CERT_TYPE <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(Byte value) {
            addCriterion("CERT_TYPE >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("CERT_TYPE >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(Byte value) {
            addCriterion("CERT_TYPE <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(Byte value) {
            addCriterion("CERT_TYPE <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<Byte> values) {
            addCriterion("CERT_TYPE in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<Byte> values) {
            addCriterion("CERT_TYPE not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(Byte value1, Byte value2) {
            addCriterion("CERT_TYPE between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("CERT_TYPE not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNull() {
            addCriterion("CERT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("CERT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("CERT_NO =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("CERT_NO <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("CERT_NO >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_NO >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("CERT_NO <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("CERT_NO <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("CERT_NO like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("CERT_NO not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("CERT_NO in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("CERT_NO not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("CERT_NO between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("CERT_NO not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andFailTimesIsNull() {
            addCriterion("FAIL_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andFailTimesIsNotNull() {
            addCriterion("FAIL_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andFailTimesEqualTo(Short value) {
            addCriterion("FAIL_TIMES =", value, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesNotEqualTo(Short value) {
            addCriterion("FAIL_TIMES <>", value, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesGreaterThan(Short value) {
            addCriterion("FAIL_TIMES >", value, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("FAIL_TIMES >=", value, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesLessThan(Short value) {
            addCriterion("FAIL_TIMES <", value, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesLessThanOrEqualTo(Short value) {
            addCriterion("FAIL_TIMES <=", value, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesIn(List<Short> values) {
            addCriterion("FAIL_TIMES in", values, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesNotIn(List<Short> values) {
            addCriterion("FAIL_TIMES not in", values, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesBetween(Short value1, Short value2) {
            addCriterion("FAIL_TIMES between", value1, value2, "failTimes");
            return (Criteria) this;
        }

        public Criteria andFailTimesNotBetween(Short value1, Short value2) {
            addCriterion("FAIL_TIMES not between", value1, value2, "failTimes");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNull() {
            addCriterion("LAST_IP is null");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNotNull() {
            addCriterion("LAST_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLastIpEqualTo(String value) {
            addCriterion("LAST_IP =", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotEqualTo(String value) {
            addCriterion("LAST_IP <>", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThan(String value) {
            addCriterion("LAST_IP >", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_IP >=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThan(String value) {
            addCriterion("LAST_IP <", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThanOrEqualTo(String value) {
            addCriterion("LAST_IP <=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLike(String value) {
            addCriterion("LAST_IP like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotLike(String value) {
            addCriterion("LAST_IP not like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpIn(List<String> values) {
            addCriterion("LAST_IP in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotIn(List<String> values) {
            addCriterion("LAST_IP not in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpBetween(String value1, String value2) {
            addCriterion("LAST_IP between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotBetween(String value1, String value2) {
            addCriterion("LAST_IP not between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("LAST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("LAST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Long value) {
            addCriterion("LAST_TIME =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Long value) {
            addCriterion("LAST_TIME <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Long value) {
            addCriterion("LAST_TIME >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_TIME >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Long value) {
            addCriterion("LAST_TIME <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Long value) {
            addCriterion("LAST_TIME <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Long> values) {
            addCriterion("LAST_TIME in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Long> values) {
            addCriterion("LAST_TIME not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Long value1, Long value2) {
            addCriterion("LAST_TIME between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Long value1, Long value2) {
            addCriterion("LAST_TIME not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastLonIsNull() {
            addCriterion("LAST_LON is null");
            return (Criteria) this;
        }

        public Criteria andLastLonIsNotNull() {
            addCriterion("LAST_LON is not null");
            return (Criteria) this;
        }

        public Criteria andLastLonEqualTo(BigDecimal value) {
            addCriterion("LAST_LON =", value, "lastLon");
            return (Criteria) this;
        }

        public Criteria andLastLonNotEqualTo(BigDecimal value) {
            addCriterion("LAST_LON <>", value, "lastLon");
            return (Criteria) this;
        }

        public Criteria andLastLonGreaterThan(BigDecimal value) {
            addCriterion("LAST_LON >", value, "lastLon");
            return (Criteria) this;
        }

        public Criteria andLastLonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_LON >=", value, "lastLon");
            return (Criteria) this;
        }

        public Criteria andLastLonLessThan(BigDecimal value) {
            addCriterion("LAST_LON <", value, "lastLon");
            return (Criteria) this;
        }

        public Criteria andLastLonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_LON <=", value, "lastLon");
            return (Criteria) this;
        }

        public Criteria andLastLonIn(List<BigDecimal> values) {
            addCriterion("LAST_LON in", values, "lastLon");
            return (Criteria) this;
        }

        public Criteria andLastLonNotIn(List<BigDecimal> values) {
            addCriterion("LAST_LON not in", values, "lastLon");
            return (Criteria) this;
        }

        public Criteria andLastLonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_LON between", value1, value2, "lastLon");
            return (Criteria) this;
        }

        public Criteria andLastLonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_LON not between", value1, value2, "lastLon");
            return (Criteria) this;
        }

        public Criteria andLastLatIsNull() {
            addCriterion("LAST_LAT is null");
            return (Criteria) this;
        }

        public Criteria andLastLatIsNotNull() {
            addCriterion("LAST_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andLastLatEqualTo(BigDecimal value) {
            addCriterion("LAST_LAT =", value, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatNotEqualTo(BigDecimal value) {
            addCriterion("LAST_LAT <>", value, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatGreaterThan(BigDecimal value) {
            addCriterion("LAST_LAT >", value, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_LAT >=", value, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatLessThan(BigDecimal value) {
            addCriterion("LAST_LAT <", value, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_LAT <=", value, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatIn(List<BigDecimal> values) {
            addCriterion("LAST_LAT in", values, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatNotIn(List<BigDecimal> values) {
            addCriterion("LAST_LAT not in", values, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_LAT between", value1, value2, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_LAT not between", value1, value2, "lastLat");
            return (Criteria) this;
        }

        public Criteria andLastAddrIsNull() {
            addCriterion("LAST_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andLastAddrIsNotNull() {
            addCriterion("LAST_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andLastAddrEqualTo(String value) {
            addCriterion("LAST_ADDR =", value, "lastAddr");
            return (Criteria) this;
        }

        public Criteria andLastAddrNotEqualTo(String value) {
            addCriterion("LAST_ADDR <>", value, "lastAddr");
            return (Criteria) this;
        }

        public Criteria andLastAddrGreaterThan(String value) {
            addCriterion("LAST_ADDR >", value, "lastAddr");
            return (Criteria) this;
        }

        public Criteria andLastAddrGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_ADDR >=", value, "lastAddr");
            return (Criteria) this;
        }

        public Criteria andLastAddrLessThan(String value) {
            addCriterion("LAST_ADDR <", value, "lastAddr");
            return (Criteria) this;
        }

        public Criteria andLastAddrLessThanOrEqualTo(String value) {
            addCriterion("LAST_ADDR <=", value, "lastAddr");
            return (Criteria) this;
        }

        public Criteria andLastAddrLike(String value) {
            addCriterion("LAST_ADDR like", value, "lastAddr");
            return (Criteria) this;
        }

        public Criteria andLastAddrNotLike(String value) {
            addCriterion("LAST_ADDR not like", value, "lastAddr");
            return (Criteria) this;
        }

        public Criteria andLastAddrIn(List<String> values) {
            addCriterion("LAST_ADDR in", values, "lastAddr");
            return (Criteria) this;
        }

        public Criteria andLastAddrNotIn(List<String> values) {
            addCriterion("LAST_ADDR not in", values, "lastAddr");
            return (Criteria) this;
        }

        public Criteria andLastAddrBetween(String value1, String value2) {
            addCriterion("LAST_ADDR between", value1, value2, "lastAddr");
            return (Criteria) this;
        }

        public Criteria andLastAddrNotBetween(String value1, String value2) {
            addCriterion("LAST_ADDR not between", value1, value2, "lastAddr");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("USER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("USER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Byte value) {
            addCriterion("USER_STATUS =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Byte value) {
            addCriterion("USER_STATUS <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Byte value) {
            addCriterion("USER_STATUS >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("USER_STATUS >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Byte value) {
            addCriterion("USER_STATUS <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Byte value) {
            addCriterion("USER_STATUS <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Byte> values) {
            addCriterion("USER_STATUS in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Byte> values) {
            addCriterion("USER_STATUS not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Byte value1, Byte value2) {
            addCriterion("USER_STATUS between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("USER_STATUS not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Byte value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Byte value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Byte value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Byte value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Byte value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Byte> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Byte> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Byte value1, Byte value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andGradeExpIsNull() {
            addCriterion("GRADE_EXP is null");
            return (Criteria) this;
        }

        public Criteria andGradeExpIsNotNull() {
            addCriterion("GRADE_EXP is not null");
            return (Criteria) this;
        }

        public Criteria andGradeExpEqualTo(Integer value) {
            addCriterion("GRADE_EXP =", value, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpNotEqualTo(Integer value) {
            addCriterion("GRADE_EXP <>", value, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpGreaterThan(Integer value) {
            addCriterion("GRADE_EXP >", value, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRADE_EXP >=", value, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpLessThan(Integer value) {
            addCriterion("GRADE_EXP <", value, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpLessThanOrEqualTo(Integer value) {
            addCriterion("GRADE_EXP <=", value, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpIn(List<Integer> values) {
            addCriterion("GRADE_EXP in", values, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpNotIn(List<Integer> values) {
            addCriterion("GRADE_EXP not in", values, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_EXP between", value1, value2, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeExpNotBetween(Integer value1, Integer value2) {
            addCriterion("GRADE_EXP not between", value1, value2, "gradeExp");
            return (Criteria) this;
        }

        public Criteria andGradeLevelIsNull() {
            addCriterion("GRADE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andGradeLevelIsNotNull() {
            addCriterion("GRADE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andGradeLevelEqualTo(Byte value) {
            addCriterion("GRADE_LEVEL =", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelNotEqualTo(Byte value) {
            addCriterion("GRADE_LEVEL <>", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelGreaterThan(Byte value) {
            addCriterion("GRADE_LEVEL >", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("GRADE_LEVEL >=", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelLessThan(Byte value) {
            addCriterion("GRADE_LEVEL <", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelLessThanOrEqualTo(Byte value) {
            addCriterion("GRADE_LEVEL <=", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelIn(List<Byte> values) {
            addCriterion("GRADE_LEVEL in", values, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelNotIn(List<Byte> values) {
            addCriterion("GRADE_LEVEL not in", values, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelBetween(Byte value1, Byte value2) {
            addCriterion("GRADE_LEVEL between", value1, value2, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("GRADE_LEVEL not between", value1, value2, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("POINT is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("POINT is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("POINT =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("POINT <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("POINT >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("POINT >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("POINT <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("POINT <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Integer> values) {
            addCriterion("POINT in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Integer> values) {
            addCriterion("POINT not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("POINT between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("POINT not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NICKNAME =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NICKNAME <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NICKNAME like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NICKNAME not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NICKNAME in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Long value) {
            addCriterion("BIRTH =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Long value) {
            addCriterion("BIRTH <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Long value) {
            addCriterion("BIRTH >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Long value) {
            addCriterion("BIRTH >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Long value) {
            addCriterion("BIRTH <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Long value) {
            addCriterion("BIRTH <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Long> values) {
            addCriterion("BIRTH in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Long> values) {
            addCriterion("BIRTH not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Long value1, Long value2) {
            addCriterion("BIRTH between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Long value1, Long value2) {
            addCriterion("BIRTH not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andMoodWordsIsNull() {
            addCriterion("MOOD_WORDS is null");
            return (Criteria) this;
        }

        public Criteria andMoodWordsIsNotNull() {
            addCriterion("MOOD_WORDS is not null");
            return (Criteria) this;
        }

        public Criteria andMoodWordsEqualTo(String value) {
            addCriterion("MOOD_WORDS =", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsNotEqualTo(String value) {
            addCriterion("MOOD_WORDS <>", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsGreaterThan(String value) {
            addCriterion("MOOD_WORDS >", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsGreaterThanOrEqualTo(String value) {
            addCriterion("MOOD_WORDS >=", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsLessThan(String value) {
            addCriterion("MOOD_WORDS <", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsLessThanOrEqualTo(String value) {
            addCriterion("MOOD_WORDS <=", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsLike(String value) {
            addCriterion("MOOD_WORDS like", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsNotLike(String value) {
            addCriterion("MOOD_WORDS not like", value, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsIn(List<String> values) {
            addCriterion("MOOD_WORDS in", values, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsNotIn(List<String> values) {
            addCriterion("MOOD_WORDS not in", values, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsBetween(String value1, String value2) {
            addCriterion("MOOD_WORDS between", value1, value2, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsNotBetween(String value1, String value2) {
            addCriterion("MOOD_WORDS not between", value1, value2, "moodWords");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeIsNull() {
            addCriterion("MOOD_WORDS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeIsNotNull() {
            addCriterion("MOOD_WORDS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeEqualTo(Long value) {
            addCriterion("MOOD_WORDS_TIME =", value, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeNotEqualTo(Long value) {
            addCriterion("MOOD_WORDS_TIME <>", value, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeGreaterThan(Long value) {
            addCriterion("MOOD_WORDS_TIME >", value, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("MOOD_WORDS_TIME >=", value, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeLessThan(Long value) {
            addCriterion("MOOD_WORDS_TIME <", value, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeLessThanOrEqualTo(Long value) {
            addCriterion("MOOD_WORDS_TIME <=", value, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeIn(List<Long> values) {
            addCriterion("MOOD_WORDS_TIME in", values, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeNotIn(List<Long> values) {
            addCriterion("MOOD_WORDS_TIME not in", values, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeBetween(Long value1, Long value2) {
            addCriterion("MOOD_WORDS_TIME between", value1, value2, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andMoodWordsTimeNotBetween(Long value1, Long value2) {
            addCriterion("MOOD_WORDS_TIME not between", value1, value2, "moodWordsTime");
            return (Criteria) this;
        }

        public Criteria andCountInformIsNull() {
            addCriterion("COUNT_INFORM is null");
            return (Criteria) this;
        }

        public Criteria andCountInformIsNotNull() {
            addCriterion("COUNT_INFORM is not null");
            return (Criteria) this;
        }

        public Criteria andCountInformEqualTo(Integer value) {
            addCriterion("COUNT_INFORM =", value, "countInform");
            return (Criteria) this;
        }

        public Criteria andCountInformNotEqualTo(Integer value) {
            addCriterion("COUNT_INFORM <>", value, "countInform");
            return (Criteria) this;
        }

        public Criteria andCountInformGreaterThan(Integer value) {
            addCriterion("COUNT_INFORM >", value, "countInform");
            return (Criteria) this;
        }

        public Criteria andCountInformGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT_INFORM >=", value, "countInform");
            return (Criteria) this;
        }

        public Criteria andCountInformLessThan(Integer value) {
            addCriterion("COUNT_INFORM <", value, "countInform");
            return (Criteria) this;
        }

        public Criteria andCountInformLessThanOrEqualTo(Integer value) {
            addCriterion("COUNT_INFORM <=", value, "countInform");
            return (Criteria) this;
        }

        public Criteria andCountInformIn(List<Integer> values) {
            addCriterion("COUNT_INFORM in", values, "countInform");
            return (Criteria) this;
        }

        public Criteria andCountInformNotIn(List<Integer> values) {
            addCriterion("COUNT_INFORM not in", values, "countInform");
            return (Criteria) this;
        }

        public Criteria andCountInformBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_INFORM between", value1, value2, "countInform");
            return (Criteria) this;
        }

        public Criteria andCountInformNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_INFORM not between", value1, value2, "countInform");
            return (Criteria) this;
        }

        public Criteria andCountFavorIsNull() {
            addCriterion("COUNT_FAVOR is null");
            return (Criteria) this;
        }

        public Criteria andCountFavorIsNotNull() {
            addCriterion("COUNT_FAVOR is not null");
            return (Criteria) this;
        }

        public Criteria andCountFavorEqualTo(Integer value) {
            addCriterion("COUNT_FAVOR =", value, "countFavor");
            return (Criteria) this;
        }

        public Criteria andCountFavorNotEqualTo(Integer value) {
            addCriterion("COUNT_FAVOR <>", value, "countFavor");
            return (Criteria) this;
        }

        public Criteria andCountFavorGreaterThan(Integer value) {
            addCriterion("COUNT_FAVOR >", value, "countFavor");
            return (Criteria) this;
        }

        public Criteria andCountFavorGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT_FAVOR >=", value, "countFavor");
            return (Criteria) this;
        }

        public Criteria andCountFavorLessThan(Integer value) {
            addCriterion("COUNT_FAVOR <", value, "countFavor");
            return (Criteria) this;
        }

        public Criteria andCountFavorLessThanOrEqualTo(Integer value) {
            addCriterion("COUNT_FAVOR <=", value, "countFavor");
            return (Criteria) this;
        }

        public Criteria andCountFavorIn(List<Integer> values) {
            addCriterion("COUNT_FAVOR in", values, "countFavor");
            return (Criteria) this;
        }

        public Criteria andCountFavorNotIn(List<Integer> values) {
            addCriterion("COUNT_FAVOR not in", values, "countFavor");
            return (Criteria) this;
        }

        public Criteria andCountFavorBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_FAVOR between", value1, value2, "countFavor");
            return (Criteria) this;
        }

        public Criteria andCountFavorNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_FAVOR not between", value1, value2, "countFavor");
            return (Criteria) this;
        }

        public Criteria andCountPublishIsNull() {
            addCriterion("COUNT_PUBLISH is null");
            return (Criteria) this;
        }

        public Criteria andCountPublishIsNotNull() {
            addCriterion("COUNT_PUBLISH is not null");
            return (Criteria) this;
        }

        public Criteria andCountPublishEqualTo(Integer value) {
            addCriterion("COUNT_PUBLISH =", value, "countPublish");
            return (Criteria) this;
        }

        public Criteria andCountPublishNotEqualTo(Integer value) {
            addCriterion("COUNT_PUBLISH <>", value, "countPublish");
            return (Criteria) this;
        }

        public Criteria andCountPublishGreaterThan(Integer value) {
            addCriterion("COUNT_PUBLISH >", value, "countPublish");
            return (Criteria) this;
        }

        public Criteria andCountPublishGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT_PUBLISH >=", value, "countPublish");
            return (Criteria) this;
        }

        public Criteria andCountPublishLessThan(Integer value) {
            addCriterion("COUNT_PUBLISH <", value, "countPublish");
            return (Criteria) this;
        }

        public Criteria andCountPublishLessThanOrEqualTo(Integer value) {
            addCriterion("COUNT_PUBLISH <=", value, "countPublish");
            return (Criteria) this;
        }

        public Criteria andCountPublishIn(List<Integer> values) {
            addCriterion("COUNT_PUBLISH in", values, "countPublish");
            return (Criteria) this;
        }

        public Criteria andCountPublishNotIn(List<Integer> values) {
            addCriterion("COUNT_PUBLISH not in", values, "countPublish");
            return (Criteria) this;
        }

        public Criteria andCountPublishBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_PUBLISH between", value1, value2, "countPublish");
            return (Criteria) this;
        }

        public Criteria andCountPublishNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_PUBLISH not between", value1, value2, "countPublish");
            return (Criteria) this;
        }

        public Criteria andCountIdolIsNull() {
            addCriterion("COUNT_IDOL is null");
            return (Criteria) this;
        }

        public Criteria andCountIdolIsNotNull() {
            addCriterion("COUNT_IDOL is not null");
            return (Criteria) this;
        }

        public Criteria andCountIdolEqualTo(Integer value) {
            addCriterion("COUNT_IDOL =", value, "countIdol");
            return (Criteria) this;
        }

        public Criteria andCountIdolNotEqualTo(Integer value) {
            addCriterion("COUNT_IDOL <>", value, "countIdol");
            return (Criteria) this;
        }

        public Criteria andCountIdolGreaterThan(Integer value) {
            addCriterion("COUNT_IDOL >", value, "countIdol");
            return (Criteria) this;
        }

        public Criteria andCountIdolGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT_IDOL >=", value, "countIdol");
            return (Criteria) this;
        }

        public Criteria andCountIdolLessThan(Integer value) {
            addCriterion("COUNT_IDOL <", value, "countIdol");
            return (Criteria) this;
        }

        public Criteria andCountIdolLessThanOrEqualTo(Integer value) {
            addCriterion("COUNT_IDOL <=", value, "countIdol");
            return (Criteria) this;
        }

        public Criteria andCountIdolIn(List<Integer> values) {
            addCriterion("COUNT_IDOL in", values, "countIdol");
            return (Criteria) this;
        }

        public Criteria andCountIdolNotIn(List<Integer> values) {
            addCriterion("COUNT_IDOL not in", values, "countIdol");
            return (Criteria) this;
        }

        public Criteria andCountIdolBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_IDOL between", value1, value2, "countIdol");
            return (Criteria) this;
        }

        public Criteria andCountIdolNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_IDOL not between", value1, value2, "countIdol");
            return (Criteria) this;
        }

        public Criteria andCountFansIsNull() {
            addCriterion("COUNT_FANS is null");
            return (Criteria) this;
        }

        public Criteria andCountFansIsNotNull() {
            addCriterion("COUNT_FANS is not null");
            return (Criteria) this;
        }

        public Criteria andCountFansEqualTo(Integer value) {
            addCriterion("COUNT_FANS =", value, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansNotEqualTo(Integer value) {
            addCriterion("COUNT_FANS <>", value, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansGreaterThan(Integer value) {
            addCriterion("COUNT_FANS >", value, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT_FANS >=", value, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansLessThan(Integer value) {
            addCriterion("COUNT_FANS <", value, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansLessThanOrEqualTo(Integer value) {
            addCriterion("COUNT_FANS <=", value, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansIn(List<Integer> values) {
            addCriterion("COUNT_FANS in", values, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansNotIn(List<Integer> values) {
            addCriterion("COUNT_FANS not in", values, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_FANS between", value1, value2, "countFans");
            return (Criteria) this;
        }

        public Criteria andCountFansNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_FANS not between", value1, value2, "countFans");
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

        public Criteria andCountLikeYesIsNull() {
            addCriterion("COUNT_LIKE_YES is null");
            return (Criteria) this;
        }

        public Criteria andCountLikeYesIsNotNull() {
            addCriterion("COUNT_LIKE_YES is not null");
            return (Criteria) this;
        }

        public Criteria andCountLikeYesEqualTo(Integer value) {
            addCriterion("COUNT_LIKE_YES =", value, "countLikeYes");
            return (Criteria) this;
        }

        public Criteria andCountLikeYesNotEqualTo(Integer value) {
            addCriterion("COUNT_LIKE_YES <>", value, "countLikeYes");
            return (Criteria) this;
        }

        public Criteria andCountLikeYesGreaterThan(Integer value) {
            addCriterion("COUNT_LIKE_YES >", value, "countLikeYes");
            return (Criteria) this;
        }

        public Criteria andCountLikeYesGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT_LIKE_YES >=", value, "countLikeYes");
            return (Criteria) this;
        }

        public Criteria andCountLikeYesLessThan(Integer value) {
            addCriterion("COUNT_LIKE_YES <", value, "countLikeYes");
            return (Criteria) this;
        }

        public Criteria andCountLikeYesLessThanOrEqualTo(Integer value) {
            addCriterion("COUNT_LIKE_YES <=", value, "countLikeYes");
            return (Criteria) this;
        }

        public Criteria andCountLikeYesIn(List<Integer> values) {
            addCriterion("COUNT_LIKE_YES in", values, "countLikeYes");
            return (Criteria) this;
        }

        public Criteria andCountLikeYesNotIn(List<Integer> values) {
            addCriterion("COUNT_LIKE_YES not in", values, "countLikeYes");
            return (Criteria) this;
        }

        public Criteria andCountLikeYesBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_LIKE_YES between", value1, value2, "countLikeYes");
            return (Criteria) this;
        }

        public Criteria andCountLikeYesNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_LIKE_YES not between", value1, value2, "countLikeYes");
            return (Criteria) this;
        }

        public Criteria andCountLikeNoIsNull() {
            addCriterion("COUNT_LIKE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCountLikeNoIsNotNull() {
            addCriterion("COUNT_LIKE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCountLikeNoEqualTo(Integer value) {
            addCriterion("COUNT_LIKE_NO =", value, "countLikeNo");
            return (Criteria) this;
        }

        public Criteria andCountLikeNoNotEqualTo(Integer value) {
            addCriterion("COUNT_LIKE_NO <>", value, "countLikeNo");
            return (Criteria) this;
        }

        public Criteria andCountLikeNoGreaterThan(Integer value) {
            addCriterion("COUNT_LIKE_NO >", value, "countLikeNo");
            return (Criteria) this;
        }

        public Criteria andCountLikeNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT_LIKE_NO >=", value, "countLikeNo");
            return (Criteria) this;
        }

        public Criteria andCountLikeNoLessThan(Integer value) {
            addCriterion("COUNT_LIKE_NO <", value, "countLikeNo");
            return (Criteria) this;
        }

        public Criteria andCountLikeNoLessThanOrEqualTo(Integer value) {
            addCriterion("COUNT_LIKE_NO <=", value, "countLikeNo");
            return (Criteria) this;
        }

        public Criteria andCountLikeNoIn(List<Integer> values) {
            addCriterion("COUNT_LIKE_NO in", values, "countLikeNo");
            return (Criteria) this;
        }

        public Criteria andCountLikeNoNotIn(List<Integer> values) {
            addCriterion("COUNT_LIKE_NO not in", values, "countLikeNo");
            return (Criteria) this;
        }

        public Criteria andCountLikeNoBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_LIKE_NO between", value1, value2, "countLikeNo");
            return (Criteria) this;
        }

        public Criteria andCountLikeNoNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_LIKE_NO not between", value1, value2, "countLikeNo");
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