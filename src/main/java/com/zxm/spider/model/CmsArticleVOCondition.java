package com.zxm.spider.model;

import java.util.ArrayList;
import java.util.List;

public class CmsArticleVOCondition  {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsArticleVOCondition() {
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

        public Criteria andArticleBasicidIsNull() {
            addCriterion("article_basicid is null");
            return (Criteria) this;
        }

        public Criteria andArticleBasicidIsNotNull() {
            addCriterion("article_basicid is not null");
            return (Criteria) this;
        }

        public Criteria andArticleBasicidEqualTo(Integer value) {
            addCriterion("article_basicid =", value, "articleBasicid");
            return (Criteria) this;
        }

        public Criteria andArticleBasicidNotEqualTo(Integer value) {
            addCriterion("article_basicid <>", value, "articleBasicid");
            return (Criteria) this;
        }

        public Criteria andArticleBasicidGreaterThan(Integer value) {
            addCriterion("article_basicid >", value, "articleBasicid");
            return (Criteria) this;
        }

        public Criteria andArticleBasicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_basicid >=", value, "articleBasicid");
            return (Criteria) this;
        }

        public Criteria andArticleBasicidLessThan(Integer value) {
            addCriterion("article_basicid <", value, "articleBasicid");
            return (Criteria) this;
        }

        public Criteria andArticleBasicidLessThanOrEqualTo(Integer value) {
            addCriterion("article_basicid <=", value, "articleBasicid");
            return (Criteria) this;
        }

        public Criteria andArticleBasicidIn(List<Integer> values) {
            addCriterion("article_basicid in", values, "articleBasicid");
            return (Criteria) this;
        }

        public Criteria andArticleBasicidNotIn(List<Integer> values) {
            addCriterion("article_basicid not in", values, "articleBasicid");
            return (Criteria) this;
        }

        public Criteria andArticleBasicidBetween(Integer value1, Integer value2) {
            addCriterion("article_basicid between", value1, value2, "articleBasicid");
            return (Criteria) this;
        }

        public Criteria andArticleBasicidNotBetween(Integer value1, Integer value2) {
            addCriterion("article_basicid not between", value1, value2, "articleBasicid");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIsNull() {
            addCriterion("article_author is null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIsNotNull() {
            addCriterion("article_author is not null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEqualTo(String value) {
            addCriterion("article_author =", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotEqualTo(String value) {
            addCriterion("article_author <>", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorGreaterThan(String value) {
            addCriterion("article_author >", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("article_author >=", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLessThan(String value) {
            addCriterion("article_author <", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLessThanOrEqualTo(String value) {
            addCriterion("article_author <=", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLike(String value) {
            addCriterion("article_author like", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotLike(String value) {
            addCriterion("article_author not like", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIn(List<String> values) {
            addCriterion("article_author in", values, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotIn(List<String> values) {
            addCriterion("article_author not in", values, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorBetween(String value1, String value2) {
            addCriterion("article_author between", value1, value2, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotBetween(String value1, String value2) {
            addCriterion("article_author not between", value1, value2, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNull() {
            addCriterion("article_type is null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNotNull() {
            addCriterion("article_type is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeEqualTo(String value) {
            addCriterion("article_type =", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotEqualTo(String value) {
            addCriterion("article_type <>", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThan(String value) {
            addCriterion("article_type >", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("article_type >=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThan(String value) {
            addCriterion("article_type <", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThanOrEqualTo(String value) {
            addCriterion("article_type <=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLike(String value) {
            addCriterion("article_type like", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotLike(String value) {
            addCriterion("article_type not like", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIn(List<String> values) {
            addCriterion("article_type in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotIn(List<String> values) {
            addCriterion("article_type not in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeBetween(String value1, String value2) {
            addCriterion("article_type between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotBetween(String value1, String value2) {
            addCriterion("article_type not between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleSourceIsNull() {
            addCriterion("article_source is null");
            return (Criteria) this;
        }

        public Criteria andArticleSourceIsNotNull() {
            addCriterion("article_source is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSourceEqualTo(String value) {
            addCriterion("article_source =", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceNotEqualTo(String value) {
            addCriterion("article_source <>", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceGreaterThan(String value) {
            addCriterion("article_source >", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceGreaterThanOrEqualTo(String value) {
            addCriterion("article_source >=", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceLessThan(String value) {
            addCriterion("article_source <", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceLessThanOrEqualTo(String value) {
            addCriterion("article_source <=", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceLike(String value) {
            addCriterion("article_source like", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceNotLike(String value) {
            addCriterion("article_source not like", value, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceIn(List<String> values) {
            addCriterion("article_source in", values, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceNotIn(List<String> values) {
            addCriterion("article_source not in", values, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceBetween(String value1, String value2) {
            addCriterion("article_source between", value1, value2, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleSourceNotBetween(String value1, String value2) {
            addCriterion("article_source not between", value1, value2, "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIsNull() {
            addCriterion("article_url is null");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIsNotNull() {
            addCriterion("article_url is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUrlEqualTo(String value) {
            addCriterion("article_url =", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotEqualTo(String value) {
            addCriterion("article_url <>", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlGreaterThan(String value) {
            addCriterion("article_url >", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlGreaterThanOrEqualTo(String value) {
            addCriterion("article_url >=", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLessThan(String value) {
            addCriterion("article_url <", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLessThanOrEqualTo(String value) {
            addCriterion("article_url <=", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLike(String value) {
            addCriterion("article_url like", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotLike(String value) {
            addCriterion("article_url not like", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIn(List<String> values) {
            addCriterion("article_url in", values, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotIn(List<String> values) {
            addCriterion("article_url not in", values, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlBetween(String value1, String value2) {
            addCriterion("article_url between", value1, value2, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotBetween(String value1, String value2) {
            addCriterion("article_url not between", value1, value2, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordIsNull() {
            addCriterion("article_keyword is null");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordIsNotNull() {
            addCriterion("article_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordEqualTo(String value) {
            addCriterion("article_keyword =", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordNotEqualTo(String value) {
            addCriterion("article_keyword <>", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordGreaterThan(String value) {
            addCriterion("article_keyword >", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("article_keyword >=", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordLessThan(String value) {
            addCriterion("article_keyword <", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordLessThanOrEqualTo(String value) {
            addCriterion("article_keyword <=", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordLike(String value) {
            addCriterion("article_keyword like", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordNotLike(String value) {
            addCriterion("article_keyword not like", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordIn(List<String> values) {
            addCriterion("article_keyword in", values, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordNotIn(List<String> values) {
            addCriterion("article_keyword not in", values, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordBetween(String value1, String value2) {
            addCriterion("article_keyword between", value1, value2, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordNotBetween(String value1, String value2) {
            addCriterion("article_keyword not between", value1, value2, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleFreeorderIsNull() {
            addCriterion("article_freeorder is null");
            return (Criteria) this;
        }

        public Criteria andArticleFreeorderIsNotNull() {
            addCriterion("article_freeorder is not null");
            return (Criteria) this;
        }

        public Criteria andArticleFreeorderEqualTo(Integer value) {
            addCriterion("article_freeorder =", value, "articleFreeorder");
            return (Criteria) this;
        }

        public Criteria andArticleFreeorderNotEqualTo(Integer value) {
            addCriterion("article_freeorder <>", value, "articleFreeorder");
            return (Criteria) this;
        }

        public Criteria andArticleFreeorderGreaterThan(Integer value) {
            addCriterion("article_freeorder >", value, "articleFreeorder");
            return (Criteria) this;
        }

        public Criteria andArticleFreeorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_freeorder >=", value, "articleFreeorder");
            return (Criteria) this;
        }

        public Criteria andArticleFreeorderLessThan(Integer value) {
            addCriterion("article_freeorder <", value, "articleFreeorder");
            return (Criteria) this;
        }

        public Criteria andArticleFreeorderLessThanOrEqualTo(Integer value) {
            addCriterion("article_freeorder <=", value, "articleFreeorder");
            return (Criteria) this;
        }

        public Criteria andArticleFreeorderIn(List<Integer> values) {
            addCriterion("article_freeorder in", values, "articleFreeorder");
            return (Criteria) this;
        }

        public Criteria andArticleFreeorderNotIn(List<Integer> values) {
            addCriterion("article_freeorder not in", values, "articleFreeorder");
            return (Criteria) this;
        }

        public Criteria andArticleFreeorderBetween(Integer value1, Integer value2) {
            addCriterion("article_freeorder between", value1, value2, "articleFreeorder");
            return (Criteria) this;
        }

        public Criteria andArticleFreeorderNotBetween(Integer value1, Integer value2) {
            addCriterion("article_freeorder not between", value1, value2, "articleFreeorder");
            return (Criteria) this;
        }

        public Criteria andArticleWebidIsNull() {
            addCriterion("article_webid is null");
            return (Criteria) this;
        }

        public Criteria andArticleWebidIsNotNull() {
            addCriterion("article_webid is not null");
            return (Criteria) this;
        }

        public Criteria andArticleWebidEqualTo(Integer value) {
            addCriterion("article_webid =", value, "articleWebid");
            return (Criteria) this;
        }

        public Criteria andArticleWebidNotEqualTo(Integer value) {
            addCriterion("article_webid <>", value, "articleWebid");
            return (Criteria) this;
        }

        public Criteria andArticleWebidGreaterThan(Integer value) {
            addCriterion("article_webid >", value, "articleWebid");
            return (Criteria) this;
        }

        public Criteria andArticleWebidGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_webid >=", value, "articleWebid");
            return (Criteria) this;
        }

        public Criteria andArticleWebidLessThan(Integer value) {
            addCriterion("article_webid <", value, "articleWebid");
            return (Criteria) this;
        }

        public Criteria andArticleWebidLessThanOrEqualTo(Integer value) {
            addCriterion("article_webid <=", value, "articleWebid");
            return (Criteria) this;
        }

        public Criteria andArticleWebidIn(List<Integer> values) {
            addCriterion("article_webid in", values, "articleWebid");
            return (Criteria) this;
        }

        public Criteria andArticleWebidNotIn(List<Integer> values) {
            addCriterion("article_webid not in", values, "articleWebid");
            return (Criteria) this;
        }

        public Criteria andArticleWebidBetween(Integer value1, Integer value2) {
            addCriterion("article_webid between", value1, value2, "articleWebid");
            return (Criteria) this;
        }

        public Criteria andArticleWebidNotBetween(Integer value1, Integer value2) {
            addCriterion("article_webid not between", value1, value2, "articleWebid");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLikeInsensitive(String value) {
            addCriterion("upper(article_author) like", value.toUpperCase(), "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLikeInsensitive(String value) {
            addCriterion("upper(article_type) like", value.toUpperCase(), "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleSourceLikeInsensitive(String value) {
            addCriterion("upper(article_source) like", value.toUpperCase(), "articleSource");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLikeInsensitive(String value) {
            addCriterion("upper(article_url) like", value.toUpperCase(), "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordLikeInsensitive(String value) {
            addCriterion("upper(article_keyword) like", value.toUpperCase(), "articleKeyword");
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