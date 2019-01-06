package com.zxm.spider.model;

import com.netfinworks.restx.persist.jdbc.QueryConditionBase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasicVOCondition extends QueryConditionBase {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasicVOCondition() {
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

        public Criteria andBasicIdIsNull() {
            addCriterion("basic_id is null");
            return (Criteria) this;
        }

        public Criteria andBasicIdIsNotNull() {
            addCriterion("basic_id is not null");
            return (Criteria) this;
        }

        public Criteria andBasicIdEqualTo(Integer value) {
            addCriterion("basic_id =", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotEqualTo(Integer value) {
            addCriterion("basic_id <>", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdGreaterThan(Integer value) {
            addCriterion("basic_id >", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_id >=", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdLessThan(Integer value) {
            addCriterion("basic_id <", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdLessThanOrEqualTo(Integer value) {
            addCriterion("basic_id <=", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdIn(List<Integer> values) {
            addCriterion("basic_id in", values, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotIn(List<Integer> values) {
            addCriterion("basic_id not in", values, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdBetween(Integer value1, Integer value2) {
            addCriterion("basic_id between", value1, value2, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_id not between", value1, value2, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicTitleIsNull() {
            addCriterion("basic_title is null");
            return (Criteria) this;
        }

        public Criteria andBasicTitleIsNotNull() {
            addCriterion("basic_title is not null");
            return (Criteria) this;
        }

        public Criteria andBasicTitleEqualTo(String value) {
            addCriterion("basic_title =", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleNotEqualTo(String value) {
            addCriterion("basic_title <>", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleGreaterThan(String value) {
            addCriterion("basic_title >", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleGreaterThanOrEqualTo(String value) {
            addCriterion("basic_title >=", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleLessThan(String value) {
            addCriterion("basic_title <", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleLessThanOrEqualTo(String value) {
            addCriterion("basic_title <=", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleLike(String value) {
            addCriterion("basic_title like", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleNotLike(String value) {
            addCriterion("basic_title not like", value, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleIn(List<String> values) {
            addCriterion("basic_title in", values, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleNotIn(List<String> values) {
            addCriterion("basic_title not in", values, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleBetween(String value1, String value2) {
            addCriterion("basic_title between", value1, value2, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicTitleNotBetween(String value1, String value2) {
            addCriterion("basic_title not between", value1, value2, "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsIsNull() {
            addCriterion("basic_thumbnails is null");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsIsNotNull() {
            addCriterion("basic_thumbnails is not null");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsEqualTo(String value) {
            addCriterion("basic_thumbnails =", value, "basicThumbnails");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsNotEqualTo(String value) {
            addCriterion("basic_thumbnails <>", value, "basicThumbnails");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsGreaterThan(String value) {
            addCriterion("basic_thumbnails >", value, "basicThumbnails");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsGreaterThanOrEqualTo(String value) {
            addCriterion("basic_thumbnails >=", value, "basicThumbnails");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsLessThan(String value) {
            addCriterion("basic_thumbnails <", value, "basicThumbnails");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsLessThanOrEqualTo(String value) {
            addCriterion("basic_thumbnails <=", value, "basicThumbnails");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsLike(String value) {
            addCriterion("basic_thumbnails like", value, "basicThumbnails");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsNotLike(String value) {
            addCriterion("basic_thumbnails not like", value, "basicThumbnails");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsIn(List<String> values) {
            addCriterion("basic_thumbnails in", values, "basicThumbnails");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsNotIn(List<String> values) {
            addCriterion("basic_thumbnails not in", values, "basicThumbnails");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsBetween(String value1, String value2) {
            addCriterion("basic_thumbnails between", value1, value2, "basicThumbnails");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsNotBetween(String value1, String value2) {
            addCriterion("basic_thumbnails not between", value1, value2, "basicThumbnails");
            return (Criteria) this;
        }

        public Criteria andBasicHitIsNull() {
            addCriterion("basic_hit is null");
            return (Criteria) this;
        }

        public Criteria andBasicHitIsNotNull() {
            addCriterion("basic_hit is not null");
            return (Criteria) this;
        }

        public Criteria andBasicHitEqualTo(Long value) {
            addCriterion("basic_hit =", value, "basicHit");
            return (Criteria) this;
        }

        public Criteria andBasicHitNotEqualTo(Long value) {
            addCriterion("basic_hit <>", value, "basicHit");
            return (Criteria) this;
        }

        public Criteria andBasicHitGreaterThan(Long value) {
            addCriterion("basic_hit >", value, "basicHit");
            return (Criteria) this;
        }

        public Criteria andBasicHitGreaterThanOrEqualTo(Long value) {
            addCriterion("basic_hit >=", value, "basicHit");
            return (Criteria) this;
        }

        public Criteria andBasicHitLessThan(Long value) {
            addCriterion("basic_hit <", value, "basicHit");
            return (Criteria) this;
        }

        public Criteria andBasicHitLessThanOrEqualTo(Long value) {
            addCriterion("basic_hit <=", value, "basicHit");
            return (Criteria) this;
        }

        public Criteria andBasicHitIn(List<Long> values) {
            addCriterion("basic_hit in", values, "basicHit");
            return (Criteria) this;
        }

        public Criteria andBasicHitNotIn(List<Long> values) {
            addCriterion("basic_hit not in", values, "basicHit");
            return (Criteria) this;
        }

        public Criteria andBasicHitBetween(Long value1, Long value2) {
            addCriterion("basic_hit between", value1, value2, "basicHit");
            return (Criteria) this;
        }

        public Criteria andBasicHitNotBetween(Long value1, Long value2) {
            addCriterion("basic_hit not between", value1, value2, "basicHit");
            return (Criteria) this;
        }

        public Criteria andBasicSortIsNull() {
            addCriterion("basic_sort is null");
            return (Criteria) this;
        }

        public Criteria andBasicSortIsNotNull() {
            addCriterion("basic_sort is not null");
            return (Criteria) this;
        }

        public Criteria andBasicSortEqualTo(Integer value) {
            addCriterion("basic_sort =", value, "basicSort");
            return (Criteria) this;
        }

        public Criteria andBasicSortNotEqualTo(Integer value) {
            addCriterion("basic_sort <>", value, "basicSort");
            return (Criteria) this;
        }

        public Criteria andBasicSortGreaterThan(Integer value) {
            addCriterion("basic_sort >", value, "basicSort");
            return (Criteria) this;
        }

        public Criteria andBasicSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_sort >=", value, "basicSort");
            return (Criteria) this;
        }

        public Criteria andBasicSortLessThan(Integer value) {
            addCriterion("basic_sort <", value, "basicSort");
            return (Criteria) this;
        }

        public Criteria andBasicSortLessThanOrEqualTo(Integer value) {
            addCriterion("basic_sort <=", value, "basicSort");
            return (Criteria) this;
        }

        public Criteria andBasicSortIn(List<Integer> values) {
            addCriterion("basic_sort in", values, "basicSort");
            return (Criteria) this;
        }

        public Criteria andBasicSortNotIn(List<Integer> values) {
            addCriterion("basic_sort not in", values, "basicSort");
            return (Criteria) this;
        }

        public Criteria andBasicSortBetween(Integer value1, Integer value2) {
            addCriterion("basic_sort between", value1, value2, "basicSort");
            return (Criteria) this;
        }

        public Criteria andBasicSortNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_sort not between", value1, value2, "basicSort");
            return (Criteria) this;
        }

        public Criteria andBasicDatetimeIsNull() {
            addCriterion("basic_datetime is null");
            return (Criteria) this;
        }

        public Criteria andBasicDatetimeIsNotNull() {
            addCriterion("basic_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andBasicDatetimeEqualTo(Date value) {
            addCriterion("basic_datetime =", value, "basicDatetime");
            return (Criteria) this;
        }

        public Criteria andBasicDatetimeNotEqualTo(Date value) {
            addCriterion("basic_datetime <>", value, "basicDatetime");
            return (Criteria) this;
        }

        public Criteria andBasicDatetimeGreaterThan(Date value) {
            addCriterion("basic_datetime >", value, "basicDatetime");
            return (Criteria) this;
        }

        public Criteria andBasicDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("basic_datetime >=", value, "basicDatetime");
            return (Criteria) this;
        }

        public Criteria andBasicDatetimeLessThan(Date value) {
            addCriterion("basic_datetime <", value, "basicDatetime");
            return (Criteria) this;
        }

        public Criteria andBasicDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("basic_datetime <=", value, "basicDatetime");
            return (Criteria) this;
        }

        public Criteria andBasicDatetimeIn(List<Date> values) {
            addCriterion("basic_datetime in", values, "basicDatetime");
            return (Criteria) this;
        }

        public Criteria andBasicDatetimeNotIn(List<Date> values) {
            addCriterion("basic_datetime not in", values, "basicDatetime");
            return (Criteria) this;
        }

        public Criteria andBasicDatetimeBetween(Date value1, Date value2) {
            addCriterion("basic_datetime between", value1, value2, "basicDatetime");
            return (Criteria) this;
        }

        public Criteria andBasicDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("basic_datetime not between", value1, value2, "basicDatetime");
            return (Criteria) this;
        }

        public Criteria andBasicUpdatetimeIsNull() {
            addCriterion("basic_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andBasicUpdatetimeIsNotNull() {
            addCriterion("basic_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andBasicUpdatetimeEqualTo(Date value) {
            addCriterion("basic_updatetime =", value, "basicUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBasicUpdatetimeNotEqualTo(Date value) {
            addCriterion("basic_updatetime <>", value, "basicUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBasicUpdatetimeGreaterThan(Date value) {
            addCriterion("basic_updatetime >", value, "basicUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBasicUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("basic_updatetime >=", value, "basicUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBasicUpdatetimeLessThan(Date value) {
            addCriterion("basic_updatetime <", value, "basicUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBasicUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("basic_updatetime <=", value, "basicUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBasicUpdatetimeIn(List<Date> values) {
            addCriterion("basic_updatetime in", values, "basicUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBasicUpdatetimeNotIn(List<Date> values) {
            addCriterion("basic_updatetime not in", values, "basicUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBasicUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("basic_updatetime between", value1, value2, "basicUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBasicUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("basic_updatetime not between", value1, value2, "basicUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBasicPeopleidIsNull() {
            addCriterion("basic_peopleid is null");
            return (Criteria) this;
        }

        public Criteria andBasicPeopleidIsNotNull() {
            addCriterion("basic_peopleid is not null");
            return (Criteria) this;
        }

        public Criteria andBasicPeopleidEqualTo(Integer value) {
            addCriterion("basic_peopleid =", value, "basicPeopleid");
            return (Criteria) this;
        }

        public Criteria andBasicPeopleidNotEqualTo(Integer value) {
            addCriterion("basic_peopleid <>", value, "basicPeopleid");
            return (Criteria) this;
        }

        public Criteria andBasicPeopleidGreaterThan(Integer value) {
            addCriterion("basic_peopleid >", value, "basicPeopleid");
            return (Criteria) this;
        }

        public Criteria andBasicPeopleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_peopleid >=", value, "basicPeopleid");
            return (Criteria) this;
        }

        public Criteria andBasicPeopleidLessThan(Integer value) {
            addCriterion("basic_peopleid <", value, "basicPeopleid");
            return (Criteria) this;
        }

        public Criteria andBasicPeopleidLessThanOrEqualTo(Integer value) {
            addCriterion("basic_peopleid <=", value, "basicPeopleid");
            return (Criteria) this;
        }

        public Criteria andBasicPeopleidIn(List<Integer> values) {
            addCriterion("basic_peopleid in", values, "basicPeopleid");
            return (Criteria) this;
        }

        public Criteria andBasicPeopleidNotIn(List<Integer> values) {
            addCriterion("basic_peopleid not in", values, "basicPeopleid");
            return (Criteria) this;
        }

        public Criteria andBasicPeopleidBetween(Integer value1, Integer value2) {
            addCriterion("basic_peopleid between", value1, value2, "basicPeopleid");
            return (Criteria) this;
        }

        public Criteria andBasicPeopleidNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_peopleid not between", value1, value2, "basicPeopleid");
            return (Criteria) this;
        }

        public Criteria andBasicCategoryidIsNull() {
            addCriterion("basic_categoryid is null");
            return (Criteria) this;
        }

        public Criteria andBasicCategoryidIsNotNull() {
            addCriterion("basic_categoryid is not null");
            return (Criteria) this;
        }

        public Criteria andBasicCategoryidEqualTo(Integer value) {
            addCriterion("basic_categoryid =", value, "basicCategoryid");
            return (Criteria) this;
        }

        public Criteria andBasicCategoryidNotEqualTo(Integer value) {
            addCriterion("basic_categoryid <>", value, "basicCategoryid");
            return (Criteria) this;
        }

        public Criteria andBasicCategoryidGreaterThan(Integer value) {
            addCriterion("basic_categoryid >", value, "basicCategoryid");
            return (Criteria) this;
        }

        public Criteria andBasicCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_categoryid >=", value, "basicCategoryid");
            return (Criteria) this;
        }

        public Criteria andBasicCategoryidLessThan(Integer value) {
            addCriterion("basic_categoryid <", value, "basicCategoryid");
            return (Criteria) this;
        }

        public Criteria andBasicCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("basic_categoryid <=", value, "basicCategoryid");
            return (Criteria) this;
        }

        public Criteria andBasicCategoryidIn(List<Integer> values) {
            addCriterion("basic_categoryid in", values, "basicCategoryid");
            return (Criteria) this;
        }

        public Criteria andBasicCategoryidNotIn(List<Integer> values) {
            addCriterion("basic_categoryid not in", values, "basicCategoryid");
            return (Criteria) this;
        }

        public Criteria andBasicCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("basic_categoryid between", value1, value2, "basicCategoryid");
            return (Criteria) this;
        }

        public Criteria andBasicCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_categoryid not between", value1, value2, "basicCategoryid");
            return (Criteria) this;
        }

        public Criteria andBasicAppidIsNull() {
            addCriterion("basic_appid is null");
            return (Criteria) this;
        }

        public Criteria andBasicAppidIsNotNull() {
            addCriterion("basic_appid is not null");
            return (Criteria) this;
        }

        public Criteria andBasicAppidEqualTo(Integer value) {
            addCriterion("basic_appid =", value, "basicAppid");
            return (Criteria) this;
        }

        public Criteria andBasicAppidNotEqualTo(Integer value) {
            addCriterion("basic_appid <>", value, "basicAppid");
            return (Criteria) this;
        }

        public Criteria andBasicAppidGreaterThan(Integer value) {
            addCriterion("basic_appid >", value, "basicAppid");
            return (Criteria) this;
        }

        public Criteria andBasicAppidGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_appid >=", value, "basicAppid");
            return (Criteria) this;
        }

        public Criteria andBasicAppidLessThan(Integer value) {
            addCriterion("basic_appid <", value, "basicAppid");
            return (Criteria) this;
        }

        public Criteria andBasicAppidLessThanOrEqualTo(Integer value) {
            addCriterion("basic_appid <=", value, "basicAppid");
            return (Criteria) this;
        }

        public Criteria andBasicAppidIn(List<Integer> values) {
            addCriterion("basic_appid in", values, "basicAppid");
            return (Criteria) this;
        }

        public Criteria andBasicAppidNotIn(List<Integer> values) {
            addCriterion("basic_appid not in", values, "basicAppid");
            return (Criteria) this;
        }

        public Criteria andBasicAppidBetween(Integer value1, Integer value2) {
            addCriterion("basic_appid between", value1, value2, "basicAppid");
            return (Criteria) this;
        }

        public Criteria andBasicAppidNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_appid not between", value1, value2, "basicAppid");
            return (Criteria) this;
        }

        public Criteria andBasicModelidIsNull() {
            addCriterion("basic_modelid is null");
            return (Criteria) this;
        }

        public Criteria andBasicModelidIsNotNull() {
            addCriterion("basic_modelid is not null");
            return (Criteria) this;
        }

        public Criteria andBasicModelidEqualTo(Integer value) {
            addCriterion("basic_modelid =", value, "basicModelid");
            return (Criteria) this;
        }

        public Criteria andBasicModelidNotEqualTo(Integer value) {
            addCriterion("basic_modelid <>", value, "basicModelid");
            return (Criteria) this;
        }

        public Criteria andBasicModelidGreaterThan(Integer value) {
            addCriterion("basic_modelid >", value, "basicModelid");
            return (Criteria) this;
        }

        public Criteria andBasicModelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_modelid >=", value, "basicModelid");
            return (Criteria) this;
        }

        public Criteria andBasicModelidLessThan(Integer value) {
            addCriterion("basic_modelid <", value, "basicModelid");
            return (Criteria) this;
        }

        public Criteria andBasicModelidLessThanOrEqualTo(Integer value) {
            addCriterion("basic_modelid <=", value, "basicModelid");
            return (Criteria) this;
        }

        public Criteria andBasicModelidIn(List<Integer> values) {
            addCriterion("basic_modelid in", values, "basicModelid");
            return (Criteria) this;
        }

        public Criteria andBasicModelidNotIn(List<Integer> values) {
            addCriterion("basic_modelid not in", values, "basicModelid");
            return (Criteria) this;
        }

        public Criteria andBasicModelidBetween(Integer value1, Integer value2) {
            addCriterion("basic_modelid between", value1, value2, "basicModelid");
            return (Criteria) this;
        }

        public Criteria andBasicModelidNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_modelid not between", value1, value2, "basicModelid");
            return (Criteria) this;
        }

        public Criteria andBasicCommentIsNull() {
            addCriterion("basic_comment is null");
            return (Criteria) this;
        }

        public Criteria andBasicCommentIsNotNull() {
            addCriterion("basic_comment is not null");
            return (Criteria) this;
        }

        public Criteria andBasicCommentEqualTo(Integer value) {
            addCriterion("basic_comment =", value, "basicComment");
            return (Criteria) this;
        }

        public Criteria andBasicCommentNotEqualTo(Integer value) {
            addCriterion("basic_comment <>", value, "basicComment");
            return (Criteria) this;
        }

        public Criteria andBasicCommentGreaterThan(Integer value) {
            addCriterion("basic_comment >", value, "basicComment");
            return (Criteria) this;
        }

        public Criteria andBasicCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_comment >=", value, "basicComment");
            return (Criteria) this;
        }

        public Criteria andBasicCommentLessThan(Integer value) {
            addCriterion("basic_comment <", value, "basicComment");
            return (Criteria) this;
        }

        public Criteria andBasicCommentLessThanOrEqualTo(Integer value) {
            addCriterion("basic_comment <=", value, "basicComment");
            return (Criteria) this;
        }

        public Criteria andBasicCommentIn(List<Integer> values) {
            addCriterion("basic_comment in", values, "basicComment");
            return (Criteria) this;
        }

        public Criteria andBasicCommentNotIn(List<Integer> values) {
            addCriterion("basic_comment not in", values, "basicComment");
            return (Criteria) this;
        }

        public Criteria andBasicCommentBetween(Integer value1, Integer value2) {
            addCriterion("basic_comment between", value1, value2, "basicComment");
            return (Criteria) this;
        }

        public Criteria andBasicCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_comment not between", value1, value2, "basicComment");
            return (Criteria) this;
        }

        public Criteria andBasicCollectIsNull() {
            addCriterion("basic_collect is null");
            return (Criteria) this;
        }

        public Criteria andBasicCollectIsNotNull() {
            addCriterion("basic_collect is not null");
            return (Criteria) this;
        }

        public Criteria andBasicCollectEqualTo(Integer value) {
            addCriterion("basic_collect =", value, "basicCollect");
            return (Criteria) this;
        }

        public Criteria andBasicCollectNotEqualTo(Integer value) {
            addCriterion("basic_collect <>", value, "basicCollect");
            return (Criteria) this;
        }

        public Criteria andBasicCollectGreaterThan(Integer value) {
            addCriterion("basic_collect >", value, "basicCollect");
            return (Criteria) this;
        }

        public Criteria andBasicCollectGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_collect >=", value, "basicCollect");
            return (Criteria) this;
        }

        public Criteria andBasicCollectLessThan(Integer value) {
            addCriterion("basic_collect <", value, "basicCollect");
            return (Criteria) this;
        }

        public Criteria andBasicCollectLessThanOrEqualTo(Integer value) {
            addCriterion("basic_collect <=", value, "basicCollect");
            return (Criteria) this;
        }

        public Criteria andBasicCollectIn(List<Integer> values) {
            addCriterion("basic_collect in", values, "basicCollect");
            return (Criteria) this;
        }

        public Criteria andBasicCollectNotIn(List<Integer> values) {
            addCriterion("basic_collect not in", values, "basicCollect");
            return (Criteria) this;
        }

        public Criteria andBasicCollectBetween(Integer value1, Integer value2) {
            addCriterion("basic_collect between", value1, value2, "basicCollect");
            return (Criteria) this;
        }

        public Criteria andBasicCollectNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_collect not between", value1, value2, "basicCollect");
            return (Criteria) this;
        }

        public Criteria andBasicShareIsNull() {
            addCriterion("basic_share is null");
            return (Criteria) this;
        }

        public Criteria andBasicShareIsNotNull() {
            addCriterion("basic_share is not null");
            return (Criteria) this;
        }

        public Criteria andBasicShareEqualTo(Integer value) {
            addCriterion("basic_share =", value, "basicShare");
            return (Criteria) this;
        }

        public Criteria andBasicShareNotEqualTo(Integer value) {
            addCriterion("basic_share <>", value, "basicShare");
            return (Criteria) this;
        }

        public Criteria andBasicShareGreaterThan(Integer value) {
            addCriterion("basic_share >", value, "basicShare");
            return (Criteria) this;
        }

        public Criteria andBasicShareGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_share >=", value, "basicShare");
            return (Criteria) this;
        }

        public Criteria andBasicShareLessThan(Integer value) {
            addCriterion("basic_share <", value, "basicShare");
            return (Criteria) this;
        }

        public Criteria andBasicShareLessThanOrEqualTo(Integer value) {
            addCriterion("basic_share <=", value, "basicShare");
            return (Criteria) this;
        }

        public Criteria andBasicShareIn(List<Integer> values) {
            addCriterion("basic_share in", values, "basicShare");
            return (Criteria) this;
        }

        public Criteria andBasicShareNotIn(List<Integer> values) {
            addCriterion("basic_share not in", values, "basicShare");
            return (Criteria) this;
        }

        public Criteria andBasicShareBetween(Integer value1, Integer value2) {
            addCriterion("basic_share between", value1, value2, "basicShare");
            return (Criteria) this;
        }

        public Criteria andBasicShareNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_share not between", value1, value2, "basicShare");
            return (Criteria) this;
        }

        public Criteria andBasicTypeIsNull() {
            addCriterion("basic_type is null");
            return (Criteria) this;
        }

        public Criteria andBasicTypeIsNotNull() {
            addCriterion("basic_type is not null");
            return (Criteria) this;
        }

        public Criteria andBasicTypeEqualTo(String value) {
            addCriterion("basic_type =", value, "basicType");
            return (Criteria) this;
        }

        public Criteria andBasicTypeNotEqualTo(String value) {
            addCriterion("basic_type <>", value, "basicType");
            return (Criteria) this;
        }

        public Criteria andBasicTypeGreaterThan(String value) {
            addCriterion("basic_type >", value, "basicType");
            return (Criteria) this;
        }

        public Criteria andBasicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("basic_type >=", value, "basicType");
            return (Criteria) this;
        }

        public Criteria andBasicTypeLessThan(String value) {
            addCriterion("basic_type <", value, "basicType");
            return (Criteria) this;
        }

        public Criteria andBasicTypeLessThanOrEqualTo(String value) {
            addCriterion("basic_type <=", value, "basicType");
            return (Criteria) this;
        }

        public Criteria andBasicTypeLike(String value) {
            addCriterion("basic_type like", value, "basicType");
            return (Criteria) this;
        }

        public Criteria andBasicTypeNotLike(String value) {
            addCriterion("basic_type not like", value, "basicType");
            return (Criteria) this;
        }

        public Criteria andBasicTypeIn(List<String> values) {
            addCriterion("basic_type in", values, "basicType");
            return (Criteria) this;
        }

        public Criteria andBasicTypeNotIn(List<String> values) {
            addCriterion("basic_type not in", values, "basicType");
            return (Criteria) this;
        }

        public Criteria andBasicTypeBetween(String value1, String value2) {
            addCriterion("basic_type between", value1, value2, "basicType");
            return (Criteria) this;
        }

        public Criteria andBasicTypeNotBetween(String value1, String value2) {
            addCriterion("basic_type not between", value1, value2, "basicType");
            return (Criteria) this;
        }

        public Criteria andBasicDisplayIsNull() {
            addCriterion("basic_display is null");
            return (Criteria) this;
        }

        public Criteria andBasicDisplayIsNotNull() {
            addCriterion("basic_display is not null");
            return (Criteria) this;
        }

        public Criteria andBasicDisplayEqualTo(Integer value) {
            addCriterion("basic_display =", value, "basicDisplay");
            return (Criteria) this;
        }

        public Criteria andBasicDisplayNotEqualTo(Integer value) {
            addCriterion("basic_display <>", value, "basicDisplay");
            return (Criteria) this;
        }

        public Criteria andBasicDisplayGreaterThan(Integer value) {
            addCriterion("basic_display >", value, "basicDisplay");
            return (Criteria) this;
        }

        public Criteria andBasicDisplayGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_display >=", value, "basicDisplay");
            return (Criteria) this;
        }

        public Criteria andBasicDisplayLessThan(Integer value) {
            addCriterion("basic_display <", value, "basicDisplay");
            return (Criteria) this;
        }

        public Criteria andBasicDisplayLessThanOrEqualTo(Integer value) {
            addCriterion("basic_display <=", value, "basicDisplay");
            return (Criteria) this;
        }

        public Criteria andBasicDisplayIn(List<Integer> values) {
            addCriterion("basic_display in", values, "basicDisplay");
            return (Criteria) this;
        }

        public Criteria andBasicDisplayNotIn(List<Integer> values) {
            addCriterion("basic_display not in", values, "basicDisplay");
            return (Criteria) this;
        }

        public Criteria andBasicDisplayBetween(Integer value1, Integer value2) {
            addCriterion("basic_display between", value1, value2, "basicDisplay");
            return (Criteria) this;
        }

        public Criteria andBasicDisplayNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_display not between", value1, value2, "basicDisplay");
            return (Criteria) this;
        }

        public Criteria andBasicTitleLikeInsensitive(String value) {
            addCriterion("upper(basic_title) like", value.toUpperCase(), "basicTitle");
            return (Criteria) this;
        }

        public Criteria andBasicThumbnailsLikeInsensitive(String value) {
            addCriterion("upper(basic_thumbnails) like", value.toUpperCase(), "basicThumbnails");
            return (Criteria) this;
        }

        public Criteria andBasicTypeLikeInsensitive(String value) {
            addCriterion("upper(basic_type) like", value.toUpperCase(), "basicType");
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
}