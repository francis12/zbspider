package com.zxm.spider.model;

import com.netfinworks.restx.persist.jdbc.QueryConditionBase;
import java.util.ArrayList;
import java.util.List;

public class DiyGameVOCondition extends QueryConditionBase {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiyGameVOCondition() {
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

        public Criteria andBasicidIsNull() {
            addCriterion("basicId is null");
            return (Criteria) this;
        }

        public Criteria andBasicidIsNotNull() {
            addCriterion("basicId is not null");
            return (Criteria) this;
        }

        public Criteria andBasicidEqualTo(Integer value) {
            addCriterion("basicId =", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidNotEqualTo(Integer value) {
            addCriterion("basicId <>", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidGreaterThan(Integer value) {
            addCriterion("basicId >", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("basicId >=", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidLessThan(Integer value) {
            addCriterion("basicId <", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidLessThanOrEqualTo(Integer value) {
            addCriterion("basicId <=", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidIn(List<Integer> values) {
            addCriterion("basicId in", values, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidNotIn(List<Integer> values) {
            addCriterion("basicId not in", values, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidBetween(Integer value1, Integer value2) {
            addCriterion("basicId between", value1, value2, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidNotBetween(Integer value1, Integer value2) {
            addCriterion("basicId not between", value1, value2, "basicid");
            return (Criteria) this;
        }

        public Criteria andHostIsNull() {
            addCriterion("host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andGuestIsNull() {
            addCriterion("guest is null");
            return (Criteria) this;
        }

        public Criteria andGuestIsNotNull() {
            addCriterion("guest is not null");
            return (Criteria) this;
        }

        public Criteria andGuestEqualTo(String value) {
            addCriterion("guest =", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestNotEqualTo(String value) {
            addCriterion("guest <>", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestGreaterThan(String value) {
            addCriterion("guest >", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestGreaterThanOrEqualTo(String value) {
            addCriterion("guest >=", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestLessThan(String value) {
            addCriterion("guest <", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestLessThanOrEqualTo(String value) {
            addCriterion("guest <=", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestLike(String value) {
            addCriterion("guest like", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestNotLike(String value) {
            addCriterion("guest not like", value, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestIn(List<String> values) {
            addCriterion("guest in", values, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestNotIn(List<String> values) {
            addCriterion("guest not in", values, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestBetween(String value1, String value2) {
            addCriterion("guest between", value1, value2, "guest");
            return (Criteria) this;
        }

        public Criteria andGuestNotBetween(String value1, String value2) {
            addCriterion("guest not between", value1, value2, "guest");
            return (Criteria) this;
        }

        public Criteria andGametimeIsNull() {
            addCriterion("gametime is null");
            return (Criteria) this;
        }

        public Criteria andGametimeIsNotNull() {
            addCriterion("gametime is not null");
            return (Criteria) this;
        }

        public Criteria andGametimeEqualTo(String value) {
            addCriterion("gametime =", value, "gametime");
            return (Criteria) this;
        }

        public Criteria andGametimeNotEqualTo(String value) {
            addCriterion("gametime <>", value, "gametime");
            return (Criteria) this;
        }

        public Criteria andGametimeGreaterThan(String value) {
            addCriterion("gametime >", value, "gametime");
            return (Criteria) this;
        }

        public Criteria andGametimeGreaterThanOrEqualTo(String value) {
            addCriterion("gametime >=", value, "gametime");
            return (Criteria) this;
        }

        public Criteria andGametimeLessThan(String value) {
            addCriterion("gametime <", value, "gametime");
            return (Criteria) this;
        }

        public Criteria andGametimeLessThanOrEqualTo(String value) {
            addCriterion("gametime <=", value, "gametime");
            return (Criteria) this;
        }

        public Criteria andGametimeLike(String value) {
            addCriterion("gametime like", value, "gametime");
            return (Criteria) this;
        }

        public Criteria andGametimeNotLike(String value) {
            addCriterion("gametime not like", value, "gametime");
            return (Criteria) this;
        }

        public Criteria andGametimeIn(List<String> values) {
            addCriterion("gametime in", values, "gametime");
            return (Criteria) this;
        }

        public Criteria andGametimeNotIn(List<String> values) {
            addCriterion("gametime not in", values, "gametime");
            return (Criteria) this;
        }

        public Criteria andGametimeBetween(String value1, String value2) {
            addCriterion("gametime between", value1, value2, "gametime");
            return (Criteria) this;
        }

        public Criteria andGametimeNotBetween(String value1, String value2) {
            addCriterion("gametime not between", value1, value2, "gametime");
            return (Criteria) this;
        }

        public Criteria andGametypeIsNull() {
            addCriterion("gametype is null");
            return (Criteria) this;
        }

        public Criteria andGametypeIsNotNull() {
            addCriterion("gametype is not null");
            return (Criteria) this;
        }

        public Criteria andGametypeEqualTo(String value) {
            addCriterion("gametype =", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeNotEqualTo(String value) {
            addCriterion("gametype <>", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeGreaterThan(String value) {
            addCriterion("gametype >", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeGreaterThanOrEqualTo(String value) {
            addCriterion("gametype >=", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeLessThan(String value) {
            addCriterion("gametype <", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeLessThanOrEqualTo(String value) {
            addCriterion("gametype <=", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeLike(String value) {
            addCriterion("gametype like", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeNotLike(String value) {
            addCriterion("gametype not like", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeIn(List<String> values) {
            addCriterion("gametype in", values, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeNotIn(List<String> values) {
            addCriterion("gametype not in", values, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeBetween(String value1, String value2) {
            addCriterion("gametype between", value1, value2, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeNotBetween(String value1, String value2) {
            addCriterion("gametype not between", value1, value2, "gametype");
            return (Criteria) this;
        }

        public Criteria andIshotIsNull() {
            addCriterion("ishot is null");
            return (Criteria) this;
        }

        public Criteria andIshotIsNotNull() {
            addCriterion("ishot is not null");
            return (Criteria) this;
        }

        public Criteria andIshotEqualTo(String value) {
            addCriterion("ishot =", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotEqualTo(String value) {
            addCriterion("ishot <>", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThan(String value) {
            addCriterion("ishot >", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThanOrEqualTo(String value) {
            addCriterion("ishot >=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThan(String value) {
            addCriterion("ishot <", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThanOrEqualTo(String value) {
            addCriterion("ishot <=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLike(String value) {
            addCriterion("ishot like", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotLike(String value) {
            addCriterion("ishot not like", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotIn(List<String> values) {
            addCriterion("ishot in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotIn(List<String> values) {
            addCriterion("ishot not in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotBetween(String value1, String value2) {
            addCriterion("ishot between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotBetween(String value1, String value2) {
            addCriterion("ishot not between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andLivetitleIsNull() {
            addCriterion("livetitle is null");
            return (Criteria) this;
        }

        public Criteria andLivetitleIsNotNull() {
            addCriterion("livetitle is not null");
            return (Criteria) this;
        }

        public Criteria andLivetitleEqualTo(String value) {
            addCriterion("livetitle =", value, "livetitle");
            return (Criteria) this;
        }

        public Criteria andLivetitleNotEqualTo(String value) {
            addCriterion("livetitle <>", value, "livetitle");
            return (Criteria) this;
        }

        public Criteria andLivetitleGreaterThan(String value) {
            addCriterion("livetitle >", value, "livetitle");
            return (Criteria) this;
        }

        public Criteria andLivetitleGreaterThanOrEqualTo(String value) {
            addCriterion("livetitle >=", value, "livetitle");
            return (Criteria) this;
        }

        public Criteria andLivetitleLessThan(String value) {
            addCriterion("livetitle <", value, "livetitle");
            return (Criteria) this;
        }

        public Criteria andLivetitleLessThanOrEqualTo(String value) {
            addCriterion("livetitle <=", value, "livetitle");
            return (Criteria) this;
        }

        public Criteria andLivetitleLike(String value) {
            addCriterion("livetitle like", value, "livetitle");
            return (Criteria) this;
        }

        public Criteria andLivetitleNotLike(String value) {
            addCriterion("livetitle not like", value, "livetitle");
            return (Criteria) this;
        }

        public Criteria andLivetitleIn(List<String> values) {
            addCriterion("livetitle in", values, "livetitle");
            return (Criteria) this;
        }

        public Criteria andLivetitleNotIn(List<String> values) {
            addCriterion("livetitle not in", values, "livetitle");
            return (Criteria) this;
        }

        public Criteria andLivetitleBetween(String value1, String value2) {
            addCriterion("livetitle between", value1, value2, "livetitle");
            return (Criteria) this;
        }

        public Criteria andLivetitleNotBetween(String value1, String value2) {
            addCriterion("livetitle not between", value1, value2, "livetitle");
            return (Criteria) this;
        }

        public Criteria andHostpicIsNull() {
            addCriterion("hostpic is null");
            return (Criteria) this;
        }

        public Criteria andHostpicIsNotNull() {
            addCriterion("hostpic is not null");
            return (Criteria) this;
        }

        public Criteria andHostpicEqualTo(String value) {
            addCriterion("hostpic =", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicNotEqualTo(String value) {
            addCriterion("hostpic <>", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicGreaterThan(String value) {
            addCriterion("hostpic >", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicGreaterThanOrEqualTo(String value) {
            addCriterion("hostpic >=", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicLessThan(String value) {
            addCriterion("hostpic <", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicLessThanOrEqualTo(String value) {
            addCriterion("hostpic <=", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicLike(String value) {
            addCriterion("hostpic like", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicNotLike(String value) {
            addCriterion("hostpic not like", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicIn(List<String> values) {
            addCriterion("hostpic in", values, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicNotIn(List<String> values) {
            addCriterion("hostpic not in", values, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicBetween(String value1, String value2) {
            addCriterion("hostpic between", value1, value2, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicNotBetween(String value1, String value2) {
            addCriterion("hostpic not between", value1, value2, "hostpic");
            return (Criteria) this;
        }

        public Criteria andGuestpicIsNull() {
            addCriterion("guestpic is null");
            return (Criteria) this;
        }

        public Criteria andGuestpicIsNotNull() {
            addCriterion("guestpic is not null");
            return (Criteria) this;
        }

        public Criteria andGuestpicEqualTo(String value) {
            addCriterion("guestpic =", value, "guestpic");
            return (Criteria) this;
        }

        public Criteria andGuestpicNotEqualTo(String value) {
            addCriterion("guestpic <>", value, "guestpic");
            return (Criteria) this;
        }

        public Criteria andGuestpicGreaterThan(String value) {
            addCriterion("guestpic >", value, "guestpic");
            return (Criteria) this;
        }

        public Criteria andGuestpicGreaterThanOrEqualTo(String value) {
            addCriterion("guestpic >=", value, "guestpic");
            return (Criteria) this;
        }

        public Criteria andGuestpicLessThan(String value) {
            addCriterion("guestpic <", value, "guestpic");
            return (Criteria) this;
        }

        public Criteria andGuestpicLessThanOrEqualTo(String value) {
            addCriterion("guestpic <=", value, "guestpic");
            return (Criteria) this;
        }

        public Criteria andGuestpicLike(String value) {
            addCriterion("guestpic like", value, "guestpic");
            return (Criteria) this;
        }

        public Criteria andGuestpicNotLike(String value) {
            addCriterion("guestpic not like", value, "guestpic");
            return (Criteria) this;
        }

        public Criteria andGuestpicIn(List<String> values) {
            addCriterion("guestpic in", values, "guestpic");
            return (Criteria) this;
        }

        public Criteria andGuestpicNotIn(List<String> values) {
            addCriterion("guestpic not in", values, "guestpic");
            return (Criteria) this;
        }

        public Criteria andGuestpicBetween(String value1, String value2) {
            addCriterion("guestpic between", value1, value2, "guestpic");
            return (Criteria) this;
        }

        public Criteria andGuestpicNotBetween(String value1, String value2) {
            addCriterion("guestpic not between", value1, value2, "guestpic");
            return (Criteria) this;
        }

        public Criteria andGamestateIsNull() {
            addCriterion("gamestate is null");
            return (Criteria) this;
        }

        public Criteria andGamestateIsNotNull() {
            addCriterion("gamestate is not null");
            return (Criteria) this;
        }

        public Criteria andGamestateEqualTo(String value) {
            addCriterion("gamestate =", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateNotEqualTo(String value) {
            addCriterion("gamestate <>", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateGreaterThan(String value) {
            addCriterion("gamestate >", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateGreaterThanOrEqualTo(String value) {
            addCriterion("gamestate >=", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateLessThan(String value) {
            addCriterion("gamestate <", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateLessThanOrEqualTo(String value) {
            addCriterion("gamestate <=", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateLike(String value) {
            addCriterion("gamestate like", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateNotLike(String value) {
            addCriterion("gamestate not like", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateIn(List<String> values) {
            addCriterion("gamestate in", values, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateNotIn(List<String> values) {
            addCriterion("gamestate not in", values, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateBetween(String value1, String value2) {
            addCriterion("gamestate between", value1, value2, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateNotBetween(String value1, String value2) {
            addCriterion("gamestate not between", value1, value2, "gamestate");
            return (Criteria) this;
        }

        public Criteria andLinkoneIsNull() {
            addCriterion("linkone is null");
            return (Criteria) this;
        }

        public Criteria andLinkoneIsNotNull() {
            addCriterion("linkone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkoneEqualTo(String value) {
            addCriterion("linkone =", value, "linkone");
            return (Criteria) this;
        }

        public Criteria andLinkoneNotEqualTo(String value) {
            addCriterion("linkone <>", value, "linkone");
            return (Criteria) this;
        }

        public Criteria andLinkoneGreaterThan(String value) {
            addCriterion("linkone >", value, "linkone");
            return (Criteria) this;
        }

        public Criteria andLinkoneGreaterThanOrEqualTo(String value) {
            addCriterion("linkone >=", value, "linkone");
            return (Criteria) this;
        }

        public Criteria andLinkoneLessThan(String value) {
            addCriterion("linkone <", value, "linkone");
            return (Criteria) this;
        }

        public Criteria andLinkoneLessThanOrEqualTo(String value) {
            addCriterion("linkone <=", value, "linkone");
            return (Criteria) this;
        }

        public Criteria andLinkoneLike(String value) {
            addCriterion("linkone like", value, "linkone");
            return (Criteria) this;
        }

        public Criteria andLinkoneNotLike(String value) {
            addCriterion("linkone not like", value, "linkone");
            return (Criteria) this;
        }

        public Criteria andLinkoneIn(List<String> values) {
            addCriterion("linkone in", values, "linkone");
            return (Criteria) this;
        }

        public Criteria andLinkoneNotIn(List<String> values) {
            addCriterion("linkone not in", values, "linkone");
            return (Criteria) this;
        }

        public Criteria andLinkoneBetween(String value1, String value2) {
            addCriterion("linkone between", value1, value2, "linkone");
            return (Criteria) this;
        }

        public Criteria andLinkoneNotBetween(String value1, String value2) {
            addCriterion("linkone not between", value1, value2, "linkone");
            return (Criteria) this;
        }

        public Criteria andLinktwoIsNull() {
            addCriterion("linktwo is null");
            return (Criteria) this;
        }

        public Criteria andLinktwoIsNotNull() {
            addCriterion("linktwo is not null");
            return (Criteria) this;
        }

        public Criteria andLinktwoEqualTo(String value) {
            addCriterion("linktwo =", value, "linktwo");
            return (Criteria) this;
        }

        public Criteria andLinktwoNotEqualTo(String value) {
            addCriterion("linktwo <>", value, "linktwo");
            return (Criteria) this;
        }

        public Criteria andLinktwoGreaterThan(String value) {
            addCriterion("linktwo >", value, "linktwo");
            return (Criteria) this;
        }

        public Criteria andLinktwoGreaterThanOrEqualTo(String value) {
            addCriterion("linktwo >=", value, "linktwo");
            return (Criteria) this;
        }

        public Criteria andLinktwoLessThan(String value) {
            addCriterion("linktwo <", value, "linktwo");
            return (Criteria) this;
        }

        public Criteria andLinktwoLessThanOrEqualTo(String value) {
            addCriterion("linktwo <=", value, "linktwo");
            return (Criteria) this;
        }

        public Criteria andLinktwoLike(String value) {
            addCriterion("linktwo like", value, "linktwo");
            return (Criteria) this;
        }

        public Criteria andLinktwoNotLike(String value) {
            addCriterion("linktwo not like", value, "linktwo");
            return (Criteria) this;
        }

        public Criteria andLinktwoIn(List<String> values) {
            addCriterion("linktwo in", values, "linktwo");
            return (Criteria) this;
        }

        public Criteria andLinktwoNotIn(List<String> values) {
            addCriterion("linktwo not in", values, "linktwo");
            return (Criteria) this;
        }

        public Criteria andLinktwoBetween(String value1, String value2) {
            addCriterion("linktwo between", value1, value2, "linktwo");
            return (Criteria) this;
        }

        public Criteria andLinktwoNotBetween(String value1, String value2) {
            addCriterion("linktwo not between", value1, value2, "linktwo");
            return (Criteria) this;
        }

        public Criteria andLinkthreeIsNull() {
            addCriterion("linkthree is null");
            return (Criteria) this;
        }

        public Criteria andLinkthreeIsNotNull() {
            addCriterion("linkthree is not null");
            return (Criteria) this;
        }

        public Criteria andLinkthreeEqualTo(String value) {
            addCriterion("linkthree =", value, "linkthree");
            return (Criteria) this;
        }

        public Criteria andLinkthreeNotEqualTo(String value) {
            addCriterion("linkthree <>", value, "linkthree");
            return (Criteria) this;
        }

        public Criteria andLinkthreeGreaterThan(String value) {
            addCriterion("linkthree >", value, "linkthree");
            return (Criteria) this;
        }

        public Criteria andLinkthreeGreaterThanOrEqualTo(String value) {
            addCriterion("linkthree >=", value, "linkthree");
            return (Criteria) this;
        }

        public Criteria andLinkthreeLessThan(String value) {
            addCriterion("linkthree <", value, "linkthree");
            return (Criteria) this;
        }

        public Criteria andLinkthreeLessThanOrEqualTo(String value) {
            addCriterion("linkthree <=", value, "linkthree");
            return (Criteria) this;
        }

        public Criteria andLinkthreeLike(String value) {
            addCriterion("linkthree like", value, "linkthree");
            return (Criteria) this;
        }

        public Criteria andLinkthreeNotLike(String value) {
            addCriterion("linkthree not like", value, "linkthree");
            return (Criteria) this;
        }

        public Criteria andLinkthreeIn(List<String> values) {
            addCriterion("linkthree in", values, "linkthree");
            return (Criteria) this;
        }

        public Criteria andLinkthreeNotIn(List<String> values) {
            addCriterion("linkthree not in", values, "linkthree");
            return (Criteria) this;
        }

        public Criteria andLinkthreeBetween(String value1, String value2) {
            addCriterion("linkthree between", value1, value2, "linkthree");
            return (Criteria) this;
        }

        public Criteria andLinkthreeNotBetween(String value1, String value2) {
            addCriterion("linkthree not between", value1, value2, "linkthree");
            return (Criteria) this;
        }

        public Criteria andHostLikeInsensitive(String value) {
            addCriterion("upper(host) like", value.toUpperCase(), "host");
            return (Criteria) this;
        }

        public Criteria andGuestLikeInsensitive(String value) {
            addCriterion("upper(guest) like", value.toUpperCase(), "guest");
            return (Criteria) this;
        }

        public Criteria andGametimeLikeInsensitive(String value) {
            addCriterion("upper(gametime) like", value.toUpperCase(), "gametime");
            return (Criteria) this;
        }

        public Criteria andGametypeLikeInsensitive(String value) {
            addCriterion("upper(gametype) like", value.toUpperCase(), "gametype");
            return (Criteria) this;
        }

        public Criteria andIshotLikeInsensitive(String value) {
            addCriterion("upper(ishot) like", value.toUpperCase(), "ishot");
            return (Criteria) this;
        }

        public Criteria andLivetitleLikeInsensitive(String value) {
            addCriterion("upper(livetitle) like", value.toUpperCase(), "livetitle");
            return (Criteria) this;
        }

        public Criteria andHostpicLikeInsensitive(String value) {
            addCriterion("upper(hostpic) like", value.toUpperCase(), "hostpic");
            return (Criteria) this;
        }

        public Criteria andGuestpicLikeInsensitive(String value) {
            addCriterion("upper(guestpic) like", value.toUpperCase(), "guestpic");
            return (Criteria) this;
        }

        public Criteria andGamestateLikeInsensitive(String value) {
            addCriterion("upper(gamestate) like", value.toUpperCase(), "gamestate");
            return (Criteria) this;
        }

        public Criteria andLinkoneLikeInsensitive(String value) {
            addCriterion("upper(linkone) like", value.toUpperCase(), "linkone");
            return (Criteria) this;
        }

        public Criteria andLinktwoLikeInsensitive(String value) {
            addCriterion("upper(linktwo) like", value.toUpperCase(), "linktwo");
            return (Criteria) this;
        }

        public Criteria andLinkthreeLikeInsensitive(String value) {
            addCriterion("upper(linkthree) like", value.toUpperCase(), "linkthree");
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