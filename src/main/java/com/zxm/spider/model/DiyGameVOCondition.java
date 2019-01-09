package com.zxm.spider.model;

import java.util.ArrayList;
import java.util.List;

public class DiyGameVOCondition {
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

        public Criteria andLinknameaIsNull() {
            addCriterion("linknamea is null");
            return (Criteria) this;
        }

        public Criteria andLinknameaIsNotNull() {
            addCriterion("linknamea is not null");
            return (Criteria) this;
        }

        public Criteria andLinknameaEqualTo(String value) {
            addCriterion("linknamea =", value, "linknamea");
            return (Criteria) this;
        }

        public Criteria andLinknameaNotEqualTo(String value) {
            addCriterion("linknamea <>", value, "linknamea");
            return (Criteria) this;
        }

        public Criteria andLinknameaGreaterThan(String value) {
            addCriterion("linknamea >", value, "linknamea");
            return (Criteria) this;
        }

        public Criteria andLinknameaGreaterThanOrEqualTo(String value) {
            addCriterion("linknamea >=", value, "linknamea");
            return (Criteria) this;
        }

        public Criteria andLinknameaLessThan(String value) {
            addCriterion("linknamea <", value, "linknamea");
            return (Criteria) this;
        }

        public Criteria andLinknameaLessThanOrEqualTo(String value) {
            addCriterion("linknamea <=", value, "linknamea");
            return (Criteria) this;
        }

        public Criteria andLinknameaLike(String value) {
            addCriterion("linknamea like", value, "linknamea");
            return (Criteria) this;
        }

        public Criteria andLinknameaNotLike(String value) {
            addCriterion("linknamea not like", value, "linknamea");
            return (Criteria) this;
        }

        public Criteria andLinknameaIn(List<String> values) {
            addCriterion("linknamea in", values, "linknamea");
            return (Criteria) this;
        }

        public Criteria andLinknameaNotIn(List<String> values) {
            addCriterion("linknamea not in", values, "linknamea");
            return (Criteria) this;
        }

        public Criteria andLinknameaBetween(String value1, String value2) {
            addCriterion("linknamea between", value1, value2, "linknamea");
            return (Criteria) this;
        }

        public Criteria andLinknameaNotBetween(String value1, String value2) {
            addCriterion("linknamea not between", value1, value2, "linknamea");
            return (Criteria) this;
        }

        public Criteria andLinknamebIsNull() {
            addCriterion("linknameb is null");
            return (Criteria) this;
        }

        public Criteria andLinknamebIsNotNull() {
            addCriterion("linknameb is not null");
            return (Criteria) this;
        }

        public Criteria andLinknamebEqualTo(String value) {
            addCriterion("linknameb =", value, "linknameb");
            return (Criteria) this;
        }

        public Criteria andLinknamebNotEqualTo(String value) {
            addCriterion("linknameb <>", value, "linknameb");
            return (Criteria) this;
        }

        public Criteria andLinknamebGreaterThan(String value) {
            addCriterion("linknameb >", value, "linknameb");
            return (Criteria) this;
        }

        public Criteria andLinknamebGreaterThanOrEqualTo(String value) {
            addCriterion("linknameb >=", value, "linknameb");
            return (Criteria) this;
        }

        public Criteria andLinknamebLessThan(String value) {
            addCriterion("linknameb <", value, "linknameb");
            return (Criteria) this;
        }

        public Criteria andLinknamebLessThanOrEqualTo(String value) {
            addCriterion("linknameb <=", value, "linknameb");
            return (Criteria) this;
        }

        public Criteria andLinknamebLike(String value) {
            addCriterion("linknameb like", value, "linknameb");
            return (Criteria) this;
        }

        public Criteria andLinknamebNotLike(String value) {
            addCriterion("linknameb not like", value, "linknameb");
            return (Criteria) this;
        }

        public Criteria andLinknamebIn(List<String> values) {
            addCriterion("linknameb in", values, "linknameb");
            return (Criteria) this;
        }

        public Criteria andLinknamebNotIn(List<String> values) {
            addCriterion("linknameb not in", values, "linknameb");
            return (Criteria) this;
        }

        public Criteria andLinknamebBetween(String value1, String value2) {
            addCriterion("linknameb between", value1, value2, "linknameb");
            return (Criteria) this;
        }

        public Criteria andLinknamebNotBetween(String value1, String value2) {
            addCriterion("linknameb not between", value1, value2, "linknameb");
            return (Criteria) this;
        }

        public Criteria andLinknamecIsNull() {
            addCriterion("linknamec is null");
            return (Criteria) this;
        }

        public Criteria andLinknamecIsNotNull() {
            addCriterion("linknamec is not null");
            return (Criteria) this;
        }

        public Criteria andLinknamecEqualTo(String value) {
            addCriterion("linknamec =", value, "linknamec");
            return (Criteria) this;
        }

        public Criteria andLinknamecNotEqualTo(String value) {
            addCriterion("linknamec <>", value, "linknamec");
            return (Criteria) this;
        }

        public Criteria andLinknamecGreaterThan(String value) {
            addCriterion("linknamec >", value, "linknamec");
            return (Criteria) this;
        }

        public Criteria andLinknamecGreaterThanOrEqualTo(String value) {
            addCriterion("linknamec >=", value, "linknamec");
            return (Criteria) this;
        }

        public Criteria andLinknamecLessThan(String value) {
            addCriterion("linknamec <", value, "linknamec");
            return (Criteria) this;
        }

        public Criteria andLinknamecLessThanOrEqualTo(String value) {
            addCriterion("linknamec <=", value, "linknamec");
            return (Criteria) this;
        }

        public Criteria andLinknamecLike(String value) {
            addCriterion("linknamec like", value, "linknamec");
            return (Criteria) this;
        }

        public Criteria andLinknamecNotLike(String value) {
            addCriterion("linknamec not like", value, "linknamec");
            return (Criteria) this;
        }

        public Criteria andLinknamecIn(List<String> values) {
            addCriterion("linknamec in", values, "linknamec");
            return (Criteria) this;
        }

        public Criteria andLinknamecNotIn(List<String> values) {
            addCriterion("linknamec not in", values, "linknamec");
            return (Criteria) this;
        }

        public Criteria andLinknamecBetween(String value1, String value2) {
            addCriterion("linknamec between", value1, value2, "linknamec");
            return (Criteria) this;
        }

        public Criteria andLinknamecNotBetween(String value1, String value2) {
            addCriterion("linknamec not between", value1, value2, "linknamec");
            return (Criteria) this;
        }

        public Criteria andLinknamedIsNull() {
            addCriterion("linknamed is null");
            return (Criteria) this;
        }

        public Criteria andLinknamedIsNotNull() {
            addCriterion("linknamed is not null");
            return (Criteria) this;
        }

        public Criteria andLinknamedEqualTo(String value) {
            addCriterion("linknamed =", value, "linknamed");
            return (Criteria) this;
        }

        public Criteria andLinknamedNotEqualTo(String value) {
            addCriterion("linknamed <>", value, "linknamed");
            return (Criteria) this;
        }

        public Criteria andLinknamedGreaterThan(String value) {
            addCriterion("linknamed >", value, "linknamed");
            return (Criteria) this;
        }

        public Criteria andLinknamedGreaterThanOrEqualTo(String value) {
            addCriterion("linknamed >=", value, "linknamed");
            return (Criteria) this;
        }

        public Criteria andLinknamedLessThan(String value) {
            addCriterion("linknamed <", value, "linknamed");
            return (Criteria) this;
        }

        public Criteria andLinknamedLessThanOrEqualTo(String value) {
            addCriterion("linknamed <=", value, "linknamed");
            return (Criteria) this;
        }

        public Criteria andLinknamedLike(String value) {
            addCriterion("linknamed like", value, "linknamed");
            return (Criteria) this;
        }

        public Criteria andLinknamedNotLike(String value) {
            addCriterion("linknamed not like", value, "linknamed");
            return (Criteria) this;
        }

        public Criteria andLinknamedIn(List<String> values) {
            addCriterion("linknamed in", values, "linknamed");
            return (Criteria) this;
        }

        public Criteria andLinknamedNotIn(List<String> values) {
            addCriterion("linknamed not in", values, "linknamed");
            return (Criteria) this;
        }

        public Criteria andLinknamedBetween(String value1, String value2) {
            addCriterion("linknamed between", value1, value2, "linknamed");
            return (Criteria) this;
        }

        public Criteria andLinknamedNotBetween(String value1, String value2) {
            addCriterion("linknamed not between", value1, value2, "linknamed");
            return (Criteria) this;
        }

        public Criteria andLinknameeIsNull() {
            addCriterion("linknamee is null");
            return (Criteria) this;
        }

        public Criteria andLinknameeIsNotNull() {
            addCriterion("linknamee is not null");
            return (Criteria) this;
        }

        public Criteria andLinknameeEqualTo(String value) {
            addCriterion("linknamee =", value, "linknamee");
            return (Criteria) this;
        }

        public Criteria andLinknameeNotEqualTo(String value) {
            addCriterion("linknamee <>", value, "linknamee");
            return (Criteria) this;
        }

        public Criteria andLinknameeGreaterThan(String value) {
            addCriterion("linknamee >", value, "linknamee");
            return (Criteria) this;
        }

        public Criteria andLinknameeGreaterThanOrEqualTo(String value) {
            addCriterion("linknamee >=", value, "linknamee");
            return (Criteria) this;
        }

        public Criteria andLinknameeLessThan(String value) {
            addCriterion("linknamee <", value, "linknamee");
            return (Criteria) this;
        }

        public Criteria andLinknameeLessThanOrEqualTo(String value) {
            addCriterion("linknamee <=", value, "linknamee");
            return (Criteria) this;
        }

        public Criteria andLinknameeLike(String value) {
            addCriterion("linknamee like", value, "linknamee");
            return (Criteria) this;
        }

        public Criteria andLinknameeNotLike(String value) {
            addCriterion("linknamee not like", value, "linknamee");
            return (Criteria) this;
        }

        public Criteria andLinknameeIn(List<String> values) {
            addCriterion("linknamee in", values, "linknamee");
            return (Criteria) this;
        }

        public Criteria andLinknameeNotIn(List<String> values) {
            addCriterion("linknamee not in", values, "linknamee");
            return (Criteria) this;
        }

        public Criteria andLinknameeBetween(String value1, String value2) {
            addCriterion("linknamee between", value1, value2, "linknamee");
            return (Criteria) this;
        }

        public Criteria andLinknameeNotBetween(String value1, String value2) {
            addCriterion("linknamee not between", value1, value2, "linknamee");
            return (Criteria) this;
        }

        public Criteria andLinkdIsNull() {
            addCriterion("linkd is null");
            return (Criteria) this;
        }

        public Criteria andLinkdIsNotNull() {
            addCriterion("linkd is not null");
            return (Criteria) this;
        }

        public Criteria andLinkdEqualTo(String value) {
            addCriterion("linkd =", value, "linkd");
            return (Criteria) this;
        }

        public Criteria andLinkdNotEqualTo(String value) {
            addCriterion("linkd <>", value, "linkd");
            return (Criteria) this;
        }

        public Criteria andLinkdGreaterThan(String value) {
            addCriterion("linkd >", value, "linkd");
            return (Criteria) this;
        }

        public Criteria andLinkdGreaterThanOrEqualTo(String value) {
            addCriterion("linkd >=", value, "linkd");
            return (Criteria) this;
        }

        public Criteria andLinkdLessThan(String value) {
            addCriterion("linkd <", value, "linkd");
            return (Criteria) this;
        }

        public Criteria andLinkdLessThanOrEqualTo(String value) {
            addCriterion("linkd <=", value, "linkd");
            return (Criteria) this;
        }

        public Criteria andLinkdLike(String value) {
            addCriterion("linkd like", value, "linkd");
            return (Criteria) this;
        }

        public Criteria andLinkdNotLike(String value) {
            addCriterion("linkd not like", value, "linkd");
            return (Criteria) this;
        }

        public Criteria andLinkdIn(List<String> values) {
            addCriterion("linkd in", values, "linkd");
            return (Criteria) this;
        }

        public Criteria andLinkdNotIn(List<String> values) {
            addCriterion("linkd not in", values, "linkd");
            return (Criteria) this;
        }

        public Criteria andLinkdBetween(String value1, String value2) {
            addCriterion("linkd between", value1, value2, "linkd");
            return (Criteria) this;
        }

        public Criteria andLinkdNotBetween(String value1, String value2) {
            addCriterion("linkd not between", value1, value2, "linkd");
            return (Criteria) this;
        }

        public Criteria andLinkeIsNull() {
            addCriterion("linke is null");
            return (Criteria) this;
        }

        public Criteria andLinkeIsNotNull() {
            addCriterion("linke is not null");
            return (Criteria) this;
        }

        public Criteria andLinkeEqualTo(String value) {
            addCriterion("linke =", value, "linke");
            return (Criteria) this;
        }

        public Criteria andLinkeNotEqualTo(String value) {
            addCriterion("linke <>", value, "linke");
            return (Criteria) this;
        }

        public Criteria andLinkeGreaterThan(String value) {
            addCriterion("linke >", value, "linke");
            return (Criteria) this;
        }

        public Criteria andLinkeGreaterThanOrEqualTo(String value) {
            addCriterion("linke >=", value, "linke");
            return (Criteria) this;
        }

        public Criteria andLinkeLessThan(String value) {
            addCriterion("linke <", value, "linke");
            return (Criteria) this;
        }

        public Criteria andLinkeLessThanOrEqualTo(String value) {
            addCriterion("linke <=", value, "linke");
            return (Criteria) this;
        }

        public Criteria andLinkeLike(String value) {
            addCriterion("linke like", value, "linke");
            return (Criteria) this;
        }

        public Criteria andLinkeNotLike(String value) {
            addCriterion("linke not like", value, "linke");
            return (Criteria) this;
        }

        public Criteria andLinkeIn(List<String> values) {
            addCriterion("linke in", values, "linke");
            return (Criteria) this;
        }

        public Criteria andLinkeNotIn(List<String> values) {
            addCriterion("linke not in", values, "linke");
            return (Criteria) this;
        }

        public Criteria andLinkeBetween(String value1, String value2) {
            addCriterion("linke between", value1, value2, "linke");
            return (Criteria) this;
        }

        public Criteria andLinkeNotBetween(String value1, String value2) {
            addCriterion("linke not between", value1, value2, "linke");
            return (Criteria) this;
        }

        public Criteria andScorevisitIsNull() {
            addCriterion("scorevisit is null");
            return (Criteria) this;
        }

        public Criteria andScorevisitIsNotNull() {
            addCriterion("scorevisit is not null");
            return (Criteria) this;
        }

        public Criteria andScorevisitEqualTo(String value) {
            addCriterion("scorevisit =", value, "scorevisit");
            return (Criteria) this;
        }

        public Criteria andScorevisitNotEqualTo(String value) {
            addCriterion("scorevisit <>", value, "scorevisit");
            return (Criteria) this;
        }

        public Criteria andScorevisitGreaterThan(String value) {
            addCriterion("scorevisit >", value, "scorevisit");
            return (Criteria) this;
        }

        public Criteria andScorevisitGreaterThanOrEqualTo(String value) {
            addCriterion("scorevisit >=", value, "scorevisit");
            return (Criteria) this;
        }

        public Criteria andScorevisitLessThan(String value) {
            addCriterion("scorevisit <", value, "scorevisit");
            return (Criteria) this;
        }

        public Criteria andScorevisitLessThanOrEqualTo(String value) {
            addCriterion("scorevisit <=", value, "scorevisit");
            return (Criteria) this;
        }

        public Criteria andScorevisitLike(String value) {
            addCriterion("scorevisit like", value, "scorevisit");
            return (Criteria) this;
        }

        public Criteria andScorevisitNotLike(String value) {
            addCriterion("scorevisit not like", value, "scorevisit");
            return (Criteria) this;
        }

        public Criteria andScorevisitIn(List<String> values) {
            addCriterion("scorevisit in", values, "scorevisit");
            return (Criteria) this;
        }

        public Criteria andScorevisitNotIn(List<String> values) {
            addCriterion("scorevisit not in", values, "scorevisit");
            return (Criteria) this;
        }

        public Criteria andScorevisitBetween(String value1, String value2) {
            addCriterion("scorevisit between", value1, value2, "scorevisit");
            return (Criteria) this;
        }

        public Criteria andScorevisitNotBetween(String value1, String value2) {
            addCriterion("scorevisit not between", value1, value2, "scorevisit");
            return (Criteria) this;
        }

        public Criteria andScorehomeIsNull() {
            addCriterion("scorehome is null");
            return (Criteria) this;
        }

        public Criteria andScorehomeIsNotNull() {
            addCriterion("scorehome is not null");
            return (Criteria) this;
        }

        public Criteria andScorehomeEqualTo(String value) {
            addCriterion("scorehome =", value, "scorehome");
            return (Criteria) this;
        }

        public Criteria andScorehomeNotEqualTo(String value) {
            addCriterion("scorehome <>", value, "scorehome");
            return (Criteria) this;
        }

        public Criteria andScorehomeGreaterThan(String value) {
            addCriterion("scorehome >", value, "scorehome");
            return (Criteria) this;
        }

        public Criteria andScorehomeGreaterThanOrEqualTo(String value) {
            addCriterion("scorehome >=", value, "scorehome");
            return (Criteria) this;
        }

        public Criteria andScorehomeLessThan(String value) {
            addCriterion("scorehome <", value, "scorehome");
            return (Criteria) this;
        }

        public Criteria andScorehomeLessThanOrEqualTo(String value) {
            addCriterion("scorehome <=", value, "scorehome");
            return (Criteria) this;
        }

        public Criteria andScorehomeLike(String value) {
            addCriterion("scorehome like", value, "scorehome");
            return (Criteria) this;
        }

        public Criteria andScorehomeNotLike(String value) {
            addCriterion("scorehome not like", value, "scorehome");
            return (Criteria) this;
        }

        public Criteria andScorehomeIn(List<String> values) {
            addCriterion("scorehome in", values, "scorehome");
            return (Criteria) this;
        }

        public Criteria andScorehomeNotIn(List<String> values) {
            addCriterion("scorehome not in", values, "scorehome");
            return (Criteria) this;
        }

        public Criteria andScorehomeBetween(String value1, String value2) {
            addCriterion("scorehome between", value1, value2, "scorehome");
            return (Criteria) this;
        }

        public Criteria andScorehomeNotBetween(String value1, String value2) {
            addCriterion("scorehome not between", value1, value2, "scorehome");
            return (Criteria) this;
        }

        public Criteria andImgoneIsNull() {
            addCriterion("imgone is null");
            return (Criteria) this;
        }

        public Criteria andImgoneIsNotNull() {
            addCriterion("imgone is not null");
            return (Criteria) this;
        }

        public Criteria andImgoneEqualTo(String value) {
            addCriterion("imgone =", value, "imgone");
            return (Criteria) this;
        }

        public Criteria andImgoneNotEqualTo(String value) {
            addCriterion("imgone <>", value, "imgone");
            return (Criteria) this;
        }

        public Criteria andImgoneGreaterThan(String value) {
            addCriterion("imgone >", value, "imgone");
            return (Criteria) this;
        }

        public Criteria andImgoneGreaterThanOrEqualTo(String value) {
            addCriterion("imgone >=", value, "imgone");
            return (Criteria) this;
        }

        public Criteria andImgoneLessThan(String value) {
            addCriterion("imgone <", value, "imgone");
            return (Criteria) this;
        }

        public Criteria andImgoneLessThanOrEqualTo(String value) {
            addCriterion("imgone <=", value, "imgone");
            return (Criteria) this;
        }

        public Criteria andImgoneLike(String value) {
            addCriterion("imgone like", value, "imgone");
            return (Criteria) this;
        }

        public Criteria andImgoneNotLike(String value) {
            addCriterion("imgone not like", value, "imgone");
            return (Criteria) this;
        }

        public Criteria andImgoneIn(List<String> values) {
            addCriterion("imgone in", values, "imgone");
            return (Criteria) this;
        }

        public Criteria andImgoneNotIn(List<String> values) {
            addCriterion("imgone not in", values, "imgone");
            return (Criteria) this;
        }

        public Criteria andImgoneBetween(String value1, String value2) {
            addCriterion("imgone between", value1, value2, "imgone");
            return (Criteria) this;
        }

        public Criteria andImgoneNotBetween(String value1, String value2) {
            addCriterion("imgone not between", value1, value2, "imgone");
            return (Criteria) this;
        }

        public Criteria andImgtwoIsNull() {
            addCriterion("imgtwo is null");
            return (Criteria) this;
        }

        public Criteria andImgtwoIsNotNull() {
            addCriterion("imgtwo is not null");
            return (Criteria) this;
        }

        public Criteria andImgtwoEqualTo(String value) {
            addCriterion("imgtwo =", value, "imgtwo");
            return (Criteria) this;
        }

        public Criteria andImgtwoNotEqualTo(String value) {
            addCriterion("imgtwo <>", value, "imgtwo");
            return (Criteria) this;
        }

        public Criteria andImgtwoGreaterThan(String value) {
            addCriterion("imgtwo >", value, "imgtwo");
            return (Criteria) this;
        }

        public Criteria andImgtwoGreaterThanOrEqualTo(String value) {
            addCriterion("imgtwo >=", value, "imgtwo");
            return (Criteria) this;
        }

        public Criteria andImgtwoLessThan(String value) {
            addCriterion("imgtwo <", value, "imgtwo");
            return (Criteria) this;
        }

        public Criteria andImgtwoLessThanOrEqualTo(String value) {
            addCriterion("imgtwo <=", value, "imgtwo");
            return (Criteria) this;
        }

        public Criteria andImgtwoLike(String value) {
            addCriterion("imgtwo like", value, "imgtwo");
            return (Criteria) this;
        }

        public Criteria andImgtwoNotLike(String value) {
            addCriterion("imgtwo not like", value, "imgtwo");
            return (Criteria) this;
        }

        public Criteria andImgtwoIn(List<String> values) {
            addCriterion("imgtwo in", values, "imgtwo");
            return (Criteria) this;
        }

        public Criteria andImgtwoNotIn(List<String> values) {
            addCriterion("imgtwo not in", values, "imgtwo");
            return (Criteria) this;
        }

        public Criteria andImgtwoBetween(String value1, String value2) {
            addCriterion("imgtwo between", value1, value2, "imgtwo");
            return (Criteria) this;
        }

        public Criteria andImgtwoNotBetween(String value1, String value2) {
            addCriterion("imgtwo not between", value1, value2, "imgtwo");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlIsNull() {
            addCriterion("ztlhtml is null");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlIsNotNull() {
            addCriterion("ztlhtml is not null");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlEqualTo(String value) {
            addCriterion("ztlhtml =", value, "ztlhtml");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlNotEqualTo(String value) {
            addCriterion("ztlhtml <>", value, "ztlhtml");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlGreaterThan(String value) {
            addCriterion("ztlhtml >", value, "ztlhtml");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlGreaterThanOrEqualTo(String value) {
            addCriterion("ztlhtml >=", value, "ztlhtml");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlLessThan(String value) {
            addCriterion("ztlhtml <", value, "ztlhtml");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlLessThanOrEqualTo(String value) {
            addCriterion("ztlhtml <=", value, "ztlhtml");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlLike(String value) {
            addCriterion("ztlhtml like", value, "ztlhtml");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlNotLike(String value) {
            addCriterion("ztlhtml not like", value, "ztlhtml");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlIn(List<String> values) {
            addCriterion("ztlhtml in", values, "ztlhtml");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlNotIn(List<String> values) {
            addCriterion("ztlhtml not in", values, "ztlhtml");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlBetween(String value1, String value2) {
            addCriterion("ztlhtml between", value1, value2, "ztlhtml");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlNotBetween(String value1, String value2) {
            addCriterion("ztlhtml not between", value1, value2, "ztlhtml");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlIsNull() {
            addCriterion("ztdhtml is null");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlIsNotNull() {
            addCriterion("ztdhtml is not null");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlEqualTo(String value) {
            addCriterion("ztdhtml =", value, "ztdhtml");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlNotEqualTo(String value) {
            addCriterion("ztdhtml <>", value, "ztdhtml");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlGreaterThan(String value) {
            addCriterion("ztdhtml >", value, "ztdhtml");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlGreaterThanOrEqualTo(String value) {
            addCriterion("ztdhtml >=", value, "ztdhtml");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlLessThan(String value) {
            addCriterion("ztdhtml <", value, "ztdhtml");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlLessThanOrEqualTo(String value) {
            addCriterion("ztdhtml <=", value, "ztdhtml");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlLike(String value) {
            addCriterion("ztdhtml like", value, "ztdhtml");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlNotLike(String value) {
            addCriterion("ztdhtml not like", value, "ztdhtml");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlIn(List<String> values) {
            addCriterion("ztdhtml in", values, "ztdhtml");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlNotIn(List<String> values) {
            addCriterion("ztdhtml not in", values, "ztdhtml");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlBetween(String value1, String value2) {
            addCriterion("ztdhtml between", value1, value2, "ztdhtml");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlNotBetween(String value1, String value2) {
            addCriterion("ztdhtml not between", value1, value2, "ztdhtml");
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

        public Criteria andLinknameaLikeInsensitive(String value) {
            addCriterion("upper(linknamea) like", value.toUpperCase(), "linknamea");
            return (Criteria) this;
        }

        public Criteria andLinknamebLikeInsensitive(String value) {
            addCriterion("upper(linknameb) like", value.toUpperCase(), "linknameb");
            return (Criteria) this;
        }

        public Criteria andLinknamecLikeInsensitive(String value) {
            addCriterion("upper(linknamec) like", value.toUpperCase(), "linknamec");
            return (Criteria) this;
        }

        public Criteria andLinknamedLikeInsensitive(String value) {
            addCriterion("upper(linknamed) like", value.toUpperCase(), "linknamed");
            return (Criteria) this;
        }

        public Criteria andLinknameeLikeInsensitive(String value) {
            addCriterion("upper(linknamee) like", value.toUpperCase(), "linknamee");
            return (Criteria) this;
        }

        public Criteria andLinkdLikeInsensitive(String value) {
            addCriterion("upper(linkd) like", value.toUpperCase(), "linkd");
            return (Criteria) this;
        }

        public Criteria andLinkeLikeInsensitive(String value) {
            addCriterion("upper(linke) like", value.toUpperCase(), "linke");
            return (Criteria) this;
        }

        public Criteria andScorevisitLikeInsensitive(String value) {
            addCriterion("upper(scorevisit) like", value.toUpperCase(), "scorevisit");
            return (Criteria) this;
        }

        public Criteria andScorehomeLikeInsensitive(String value) {
            addCriterion("upper(scorehome) like", value.toUpperCase(), "scorehome");
            return (Criteria) this;
        }

        public Criteria andImgoneLikeInsensitive(String value) {
            addCriterion("upper(imgone) like", value.toUpperCase(), "imgone");
            return (Criteria) this;
        }

        public Criteria andImgtwoLikeInsensitive(String value) {
            addCriterion("upper(imgtwo) like", value.toUpperCase(), "imgtwo");
            return (Criteria) this;
        }

        public Criteria andZtlhtmlLikeInsensitive(String value) {
            addCriterion("upper(ztlhtml) like", value.toUpperCase(), "ztlhtml");
            return (Criteria) this;
        }

        public Criteria andZtdhtmlLikeInsensitive(String value) {
            addCriterion("upper(ztdhtml) like", value.toUpperCase(), "ztdhtml");
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