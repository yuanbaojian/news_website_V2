package com.ybj.news_website.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andT_user_idIsNull() {
            addCriterion("t_user_id is null");
            return (Criteria) this;
        }

        public Criteria andT_user_idIsNotNull() {
            addCriterion("t_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andT_user_idEqualTo(Integer value) {
            addCriterion("t_user_id =", value, "t_user_id");
            return (Criteria) this;
        }

        public Criteria andT_user_idNotEqualTo(Integer value) {
            addCriterion("t_user_id <>", value, "t_user_id");
            return (Criteria) this;
        }

        public Criteria andT_user_idGreaterThan(Integer value) {
            addCriterion("t_user_id >", value, "t_user_id");
            return (Criteria) this;
        }

        public Criteria andT_user_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_user_id >=", value, "t_user_id");
            return (Criteria) this;
        }

        public Criteria andT_user_idLessThan(Integer value) {
            addCriterion("t_user_id <", value, "t_user_id");
            return (Criteria) this;
        }

        public Criteria andT_user_idLessThanOrEqualTo(Integer value) {
            addCriterion("t_user_id <=", value, "t_user_id");
            return (Criteria) this;
        }

        public Criteria andT_user_idIn(List<Integer> values) {
            addCriterion("t_user_id in", values, "t_user_id");
            return (Criteria) this;
        }

        public Criteria andT_user_idNotIn(List<Integer> values) {
            addCriterion("t_user_id not in", values, "t_user_id");
            return (Criteria) this;
        }

        public Criteria andT_user_idBetween(Integer value1, Integer value2) {
            addCriterion("t_user_id between", value1, value2, "t_user_id");
            return (Criteria) this;
        }

        public Criteria andT_user_idNotBetween(Integer value1, Integer value2) {
            addCriterion("t_user_id not between", value1, value2, "t_user_id");
            return (Criteria) this;
        }

        public Criteria andT_article_idIsNull() {
            addCriterion("t_article_id is null");
            return (Criteria) this;
        }

        public Criteria andT_article_idIsNotNull() {
            addCriterion("t_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andT_article_idEqualTo(Integer value) {
            addCriterion("t_article_id =", value, "t_article_id");
            return (Criteria) this;
        }

        public Criteria andT_article_idNotEqualTo(Integer value) {
            addCriterion("t_article_id <>", value, "t_article_id");
            return (Criteria) this;
        }

        public Criteria andT_article_idGreaterThan(Integer value) {
            addCriterion("t_article_id >", value, "t_article_id");
            return (Criteria) this;
        }

        public Criteria andT_article_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_article_id >=", value, "t_article_id");
            return (Criteria) this;
        }

        public Criteria andT_article_idLessThan(Integer value) {
            addCriterion("t_article_id <", value, "t_article_id");
            return (Criteria) this;
        }

        public Criteria andT_article_idLessThanOrEqualTo(Integer value) {
            addCriterion("t_article_id <=", value, "t_article_id");
            return (Criteria) this;
        }

        public Criteria andT_article_idIn(List<Integer> values) {
            addCriterion("t_article_id in", values, "t_article_id");
            return (Criteria) this;
        }

        public Criteria andT_article_idNotIn(List<Integer> values) {
            addCriterion("t_article_id not in", values, "t_article_id");
            return (Criteria) this;
        }

        public Criteria andT_article_idBetween(Integer value1, Integer value2) {
            addCriterion("t_article_id between", value1, value2, "t_article_id");
            return (Criteria) this;
        }

        public Criteria andT_article_idNotBetween(Integer value1, Integer value2) {
            addCriterion("t_article_id not between", value1, value2, "t_article_id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andReply_user_idIsNull() {
            addCriterion("reply_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReply_user_idIsNotNull() {
            addCriterion("reply_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReply_user_idEqualTo(Integer value) {
            addCriterion("reply_user_id =", value, "reply_user_id");
            return (Criteria) this;
        }

        public Criteria andReply_user_idNotEqualTo(Integer value) {
            addCriterion("reply_user_id <>", value, "reply_user_id");
            return (Criteria) this;
        }

        public Criteria andReply_user_idGreaterThan(Integer value) {
            addCriterion("reply_user_id >", value, "reply_user_id");
            return (Criteria) this;
        }

        public Criteria andReply_user_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_user_id >=", value, "reply_user_id");
            return (Criteria) this;
        }

        public Criteria andReply_user_idLessThan(Integer value) {
            addCriterion("reply_user_id <", value, "reply_user_id");
            return (Criteria) this;
        }

        public Criteria andReply_user_idLessThanOrEqualTo(Integer value) {
            addCriterion("reply_user_id <=", value, "reply_user_id");
            return (Criteria) this;
        }

        public Criteria andReply_user_idIn(List<Integer> values) {
            addCriterion("reply_user_id in", values, "reply_user_id");
            return (Criteria) this;
        }

        public Criteria andReply_user_idNotIn(List<Integer> values) {
            addCriterion("reply_user_id not in", values, "reply_user_id");
            return (Criteria) this;
        }

        public Criteria andReply_user_idBetween(Integer value1, Integer value2) {
            addCriterion("reply_user_id between", value1, value2, "reply_user_id");
            return (Criteria) this;
        }

        public Criteria andReply_user_idNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_user_id not between", value1, value2, "reply_user_id");
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