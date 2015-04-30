package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.List;

public class ObjectDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ObjectDoExample() {
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

        public Criteria andObjectTypeIsNull() {
            addCriterion("OBJECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIsNotNull() {
            addCriterion("OBJECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andObjectTypeEqualTo(Byte value) {
            addCriterion("OBJECT_TYPE =", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotEqualTo(Byte value) {
            addCriterion("OBJECT_TYPE <>", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeGreaterThan(Byte value) {
            addCriterion("OBJECT_TYPE >", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("OBJECT_TYPE >=", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLessThan(Byte value) {
            addCriterion("OBJECT_TYPE <", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLessThanOrEqualTo(Byte value) {
            addCriterion("OBJECT_TYPE <=", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIn(List<Byte> values) {
            addCriterion("OBJECT_TYPE in", values, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotIn(List<Byte> values) {
            addCriterion("OBJECT_TYPE not in", values, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeBetween(Byte value1, Byte value2) {
            addCriterion("OBJECT_TYPE between", value1, value2, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("OBJECT_TYPE not between", value1, value2, "objectType");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("SUMMARY is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("SUMMARY is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("SUMMARY =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("SUMMARY <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("SUMMARY >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMARY >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("SUMMARY <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("SUMMARY <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("SUMMARY like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("SUMMARY not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("SUMMARY in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("SUMMARY not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("SUMMARY between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("SUMMARY not between", value1, value2, "summary");
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

        public Criteria andContentTypeEqualTo(Byte value) {
            addCriterion("CONTENT_TYPE =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(Byte value) {
            addCriterion("CONTENT_TYPE <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(Byte value) {
            addCriterion("CONTENT_TYPE >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("CONTENT_TYPE >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(Byte value) {
            addCriterion("CONTENT_TYPE <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(Byte value) {
            addCriterion("CONTENT_TYPE <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<Byte> values) {
            addCriterion("CONTENT_TYPE in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<Byte> values) {
            addCriterion("CONTENT_TYPE not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(Byte value1, Byte value2) {
            addCriterion("CONTENT_TYPE between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("CONTENT_TYPE not between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andVoteFlagIsNull() {
            addCriterion("VOTE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andVoteFlagIsNotNull() {
            addCriterion("VOTE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andVoteFlagEqualTo(Byte value) {
            addCriterion("VOTE_FLAG =", value, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagNotEqualTo(Byte value) {
            addCriterion("VOTE_FLAG <>", value, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagGreaterThan(Byte value) {
            addCriterion("VOTE_FLAG >", value, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("VOTE_FLAG >=", value, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagLessThan(Byte value) {
            addCriterion("VOTE_FLAG <", value, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagLessThanOrEqualTo(Byte value) {
            addCriterion("VOTE_FLAG <=", value, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagIn(List<Byte> values) {
            addCriterion("VOTE_FLAG in", values, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagNotIn(List<Byte> values) {
            addCriterion("VOTE_FLAG not in", values, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagBetween(Byte value1, Byte value2) {
            addCriterion("VOTE_FLAG between", value1, value2, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("VOTE_FLAG not between", value1, value2, "voteFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagIsNull() {
            addCriterion("VOTE_MULTI_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagIsNotNull() {
            addCriterion("VOTE_MULTI_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagEqualTo(Byte value) {
            addCriterion("VOTE_MULTI_FLAG =", value, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagNotEqualTo(Byte value) {
            addCriterion("VOTE_MULTI_FLAG <>", value, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagGreaterThan(Byte value) {
            addCriterion("VOTE_MULTI_FLAG >", value, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("VOTE_MULTI_FLAG >=", value, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagLessThan(Byte value) {
            addCriterion("VOTE_MULTI_FLAG <", value, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagLessThanOrEqualTo(Byte value) {
            addCriterion("VOTE_MULTI_FLAG <=", value, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagIn(List<Byte> values) {
            addCriterion("VOTE_MULTI_FLAG in", values, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagNotIn(List<Byte> values) {
            addCriterion("VOTE_MULTI_FLAG not in", values, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagBetween(Byte value1, Byte value2) {
            addCriterion("VOTE_MULTI_FLAG between", value1, value2, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andVoteMultiFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("VOTE_MULTI_FLAG not between", value1, value2, "voteMultiFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagIsNull() {
            addCriterion("LIKE_YES_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagIsNotNull() {
            addCriterion("LIKE_YES_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagEqualTo(Byte value) {
            addCriterion("LIKE_YES_FLAG =", value, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagNotEqualTo(Byte value) {
            addCriterion("LIKE_YES_FLAG <>", value, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagGreaterThan(Byte value) {
            addCriterion("LIKE_YES_FLAG >", value, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("LIKE_YES_FLAG >=", value, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagLessThan(Byte value) {
            addCriterion("LIKE_YES_FLAG <", value, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagLessThanOrEqualTo(Byte value) {
            addCriterion("LIKE_YES_FLAG <=", value, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagIn(List<Byte> values) {
            addCriterion("LIKE_YES_FLAG in", values, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagNotIn(List<Byte> values) {
            addCriterion("LIKE_YES_FLAG not in", values, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagBetween(Byte value1, Byte value2) {
            addCriterion("LIKE_YES_FLAG between", value1, value2, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("LIKE_YES_FLAG not between", value1, value2, "likeYesFlag");
            return (Criteria) this;
        }

        public Criteria andLikeYesCountIsNull() {
            addCriterion("LIKE_YES_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLikeYesCountIsNotNull() {
            addCriterion("LIKE_YES_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLikeYesCountEqualTo(Integer value) {
            addCriterion("LIKE_YES_COUNT =", value, "likeYesCount");
            return (Criteria) this;
        }

        public Criteria andLikeYesCountNotEqualTo(Integer value) {
            addCriterion("LIKE_YES_COUNT <>", value, "likeYesCount");
            return (Criteria) this;
        }

        public Criteria andLikeYesCountGreaterThan(Integer value) {
            addCriterion("LIKE_YES_COUNT >", value, "likeYesCount");
            return (Criteria) this;
        }

        public Criteria andLikeYesCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIKE_YES_COUNT >=", value, "likeYesCount");
            return (Criteria) this;
        }

        public Criteria andLikeYesCountLessThan(Integer value) {
            addCriterion("LIKE_YES_COUNT <", value, "likeYesCount");
            return (Criteria) this;
        }

        public Criteria andLikeYesCountLessThanOrEqualTo(Integer value) {
            addCriterion("LIKE_YES_COUNT <=", value, "likeYesCount");
            return (Criteria) this;
        }

        public Criteria andLikeYesCountIn(List<Integer> values) {
            addCriterion("LIKE_YES_COUNT in", values, "likeYesCount");
            return (Criteria) this;
        }

        public Criteria andLikeYesCountNotIn(List<Integer> values) {
            addCriterion("LIKE_YES_COUNT not in", values, "likeYesCount");
            return (Criteria) this;
        }

        public Criteria andLikeYesCountBetween(Integer value1, Integer value2) {
            addCriterion("LIKE_YES_COUNT between", value1, value2, "likeYesCount");
            return (Criteria) this;
        }

        public Criteria andLikeYesCountNotBetween(Integer value1, Integer value2) {
            addCriterion("LIKE_YES_COUNT not between", value1, value2, "likeYesCount");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagIsNull() {
            addCriterion("LIKE_NO_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagIsNotNull() {
            addCriterion("LIKE_NO_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagEqualTo(Byte value) {
            addCriterion("LIKE_NO_FLAG =", value, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagNotEqualTo(Byte value) {
            addCriterion("LIKE_NO_FLAG <>", value, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagGreaterThan(Byte value) {
            addCriterion("LIKE_NO_FLAG >", value, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("LIKE_NO_FLAG >=", value, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagLessThan(Byte value) {
            addCriterion("LIKE_NO_FLAG <", value, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagLessThanOrEqualTo(Byte value) {
            addCriterion("LIKE_NO_FLAG <=", value, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagIn(List<Byte> values) {
            addCriterion("LIKE_NO_FLAG in", values, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagNotIn(List<Byte> values) {
            addCriterion("LIKE_NO_FLAG not in", values, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagBetween(Byte value1, Byte value2) {
            addCriterion("LIKE_NO_FLAG between", value1, value2, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("LIKE_NO_FLAG not between", value1, value2, "likeNoFlag");
            return (Criteria) this;
        }

        public Criteria andLikeNoCountIsNull() {
            addCriterion("LIKE_NO_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLikeNoCountIsNotNull() {
            addCriterion("LIKE_NO_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLikeNoCountEqualTo(Integer value) {
            addCriterion("LIKE_NO_COUNT =", value, "likeNoCount");
            return (Criteria) this;
        }

        public Criteria andLikeNoCountNotEqualTo(Integer value) {
            addCriterion("LIKE_NO_COUNT <>", value, "likeNoCount");
            return (Criteria) this;
        }

        public Criteria andLikeNoCountGreaterThan(Integer value) {
            addCriterion("LIKE_NO_COUNT >", value, "likeNoCount");
            return (Criteria) this;
        }

        public Criteria andLikeNoCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIKE_NO_COUNT >=", value, "likeNoCount");
            return (Criteria) this;
        }

        public Criteria andLikeNoCountLessThan(Integer value) {
            addCriterion("LIKE_NO_COUNT <", value, "likeNoCount");
            return (Criteria) this;
        }

        public Criteria andLikeNoCountLessThanOrEqualTo(Integer value) {
            addCriterion("LIKE_NO_COUNT <=", value, "likeNoCount");
            return (Criteria) this;
        }

        public Criteria andLikeNoCountIn(List<Integer> values) {
            addCriterion("LIKE_NO_COUNT in", values, "likeNoCount");
            return (Criteria) this;
        }

        public Criteria andLikeNoCountNotIn(List<Integer> values) {
            addCriterion("LIKE_NO_COUNT not in", values, "likeNoCount");
            return (Criteria) this;
        }

        public Criteria andLikeNoCountBetween(Integer value1, Integer value2) {
            addCriterion("LIKE_NO_COUNT between", value1, value2, "likeNoCount");
            return (Criteria) this;
        }

        public Criteria andLikeNoCountNotBetween(Integer value1, Integer value2) {
            addCriterion("LIKE_NO_COUNT not between", value1, value2, "likeNoCount");
            return (Criteria) this;
        }

        public Criteria andCommentFlagIsNull() {
            addCriterion("COMMENT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCommentFlagIsNotNull() {
            addCriterion("COMMENT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCommentFlagEqualTo(Byte value) {
            addCriterion("COMMENT_FLAG =", value, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagNotEqualTo(Byte value) {
            addCriterion("COMMENT_FLAG <>", value, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagGreaterThan(Byte value) {
            addCriterion("COMMENT_FLAG >", value, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("COMMENT_FLAG >=", value, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagLessThan(Byte value) {
            addCriterion("COMMENT_FLAG <", value, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagLessThanOrEqualTo(Byte value) {
            addCriterion("COMMENT_FLAG <=", value, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagIn(List<Byte> values) {
            addCriterion("COMMENT_FLAG in", values, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagNotIn(List<Byte> values) {
            addCriterion("COMMENT_FLAG not in", values, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagBetween(Byte value1, Byte value2) {
            addCriterion("COMMENT_FLAG between", value1, value2, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("COMMENT_FLAG not between", value1, value2, "commentFlag");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("COMMENT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("COMMENT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("COMMENT_COUNT =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("COMMENT_COUNT <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("COMMENT_COUNT >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_COUNT >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("COMMENT_COUNT <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_COUNT <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("COMMENT_COUNT in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("COMMENT_COUNT not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_COUNT between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_COUNT not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andFavorFlagIsNull() {
            addCriterion("FAVOR_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFavorFlagIsNotNull() {
            addCriterion("FAVOR_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFavorFlagEqualTo(Byte value) {
            addCriterion("FAVOR_FLAG =", value, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagNotEqualTo(Byte value) {
            addCriterion("FAVOR_FLAG <>", value, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagGreaterThan(Byte value) {
            addCriterion("FAVOR_FLAG >", value, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("FAVOR_FLAG >=", value, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagLessThan(Byte value) {
            addCriterion("FAVOR_FLAG <", value, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagLessThanOrEqualTo(Byte value) {
            addCriterion("FAVOR_FLAG <=", value, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagIn(List<Byte> values) {
            addCriterion("FAVOR_FLAG in", values, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagNotIn(List<Byte> values) {
            addCriterion("FAVOR_FLAG not in", values, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagBetween(Byte value1, Byte value2) {
            addCriterion("FAVOR_FLAG between", value1, value2, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("FAVOR_FLAG not between", value1, value2, "favorFlag");
            return (Criteria) this;
        }

        public Criteria andFavorCountIsNull() {
            addCriterion("FAVOR_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andFavorCountIsNotNull() {
            addCriterion("FAVOR_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFavorCountEqualTo(Integer value) {
            addCriterion("FAVOR_COUNT =", value, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountNotEqualTo(Integer value) {
            addCriterion("FAVOR_COUNT <>", value, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountGreaterThan(Integer value) {
            addCriterion("FAVOR_COUNT >", value, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAVOR_COUNT >=", value, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountLessThan(Integer value) {
            addCriterion("FAVOR_COUNT <", value, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountLessThanOrEqualTo(Integer value) {
            addCriterion("FAVOR_COUNT <=", value, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountIn(List<Integer> values) {
            addCriterion("FAVOR_COUNT in", values, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountNotIn(List<Integer> values) {
            addCriterion("FAVOR_COUNT not in", values, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountBetween(Integer value1, Integer value2) {
            addCriterion("FAVOR_COUNT between", value1, value2, "favorCount");
            return (Criteria) this;
        }

        public Criteria andFavorCountNotBetween(Integer value1, Integer value2) {
            addCriterion("FAVOR_COUNT not between", value1, value2, "favorCount");
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