package com.ybj.news_website.model;

import java.util.ArrayList;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andReply_idIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReply_idIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReply_idEqualTo(Integer value) {
            addCriterion("reply_id =", value, "reply_id");
            return (Criteria) this;
        }

        public Criteria andReply_idNotEqualTo(Integer value) {
            addCriterion("reply_id <>", value, "reply_id");
            return (Criteria) this;
        }

        public Criteria andReply_idGreaterThan(Integer value) {
            addCriterion("reply_id >", value, "reply_id");
            return (Criteria) this;
        }

        public Criteria andReply_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_id >=", value, "reply_id");
            return (Criteria) this;
        }

        public Criteria andReply_idLessThan(Integer value) {
            addCriterion("reply_id <", value, "reply_id");
            return (Criteria) this;
        }

        public Criteria andReply_idLessThanOrEqualTo(Integer value) {
            addCriterion("reply_id <=", value, "reply_id");
            return (Criteria) this;
        }

        public Criteria andReply_idIn(List<Integer> values) {
            addCriterion("reply_id in", values, "reply_id");
            return (Criteria) this;
        }

        public Criteria andReply_idNotIn(List<Integer> values) {
            addCriterion("reply_id not in", values, "reply_id");
            return (Criteria) this;
        }

        public Criteria andReply_idBetween(Integer value1, Integer value2) {
            addCriterion("reply_id between", value1, value2, "reply_id");
            return (Criteria) this;
        }

        public Criteria andReply_idNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_id not between", value1, value2, "reply_id");
            return (Criteria) this;
        }

        public Criteria andFrom_user_idIsNull() {
            addCriterion("from_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFrom_user_idIsNotNull() {
            addCriterion("from_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFrom_user_idEqualTo(Integer value) {
            addCriterion("from_user_id =", value, "from_user_id");
            return (Criteria) this;
        }

        public Criteria andFrom_user_idNotEqualTo(Integer value) {
            addCriterion("from_user_id <>", value, "from_user_id");
            return (Criteria) this;
        }

        public Criteria andFrom_user_idGreaterThan(Integer value) {
            addCriterion("from_user_id >", value, "from_user_id");
            return (Criteria) this;
        }

        public Criteria andFrom_user_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_user_id >=", value, "from_user_id");
            return (Criteria) this;
        }

        public Criteria andFrom_user_idLessThan(Integer value) {
            addCriterion("from_user_id <", value, "from_user_id");
            return (Criteria) this;
        }

        public Criteria andFrom_user_idLessThanOrEqualTo(Integer value) {
            addCriterion("from_user_id <=", value, "from_user_id");
            return (Criteria) this;
        }

        public Criteria andFrom_user_idIn(List<Integer> values) {
            addCriterion("from_user_id in", values, "from_user_id");
            return (Criteria) this;
        }

        public Criteria andFrom_user_idNotIn(List<Integer> values) {
            addCriterion("from_user_id not in", values, "from_user_id");
            return (Criteria) this;
        }

        public Criteria andFrom_user_idBetween(Integer value1, Integer value2) {
            addCriterion("from_user_id between", value1, value2, "from_user_id");
            return (Criteria) this;
        }

        public Criteria andFrom_user_idNotBetween(Integer value1, Integer value2) {
            addCriterion("from_user_id not between", value1, value2, "from_user_id");
            return (Criteria) this;
        }

        public Criteria andTo_user_idIsNull() {
            addCriterion("to_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTo_user_idIsNotNull() {
            addCriterion("to_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTo_user_idEqualTo(Integer value) {
            addCriterion("to_user_id =", value, "to_user_id");
            return (Criteria) this;
        }

        public Criteria andTo_user_idNotEqualTo(Integer value) {
            addCriterion("to_user_id <>", value, "to_user_id");
            return (Criteria) this;
        }

        public Criteria andTo_user_idGreaterThan(Integer value) {
            addCriterion("to_user_id >", value, "to_user_id");
            return (Criteria) this;
        }

        public Criteria andTo_user_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_user_id >=", value, "to_user_id");
            return (Criteria) this;
        }

        public Criteria andTo_user_idLessThan(Integer value) {
            addCriterion("to_user_id <", value, "to_user_id");
            return (Criteria) this;
        }

        public Criteria andTo_user_idLessThanOrEqualTo(Integer value) {
            addCriterion("to_user_id <=", value, "to_user_id");
            return (Criteria) this;
        }

        public Criteria andTo_user_idIn(List<Integer> values) {
            addCriterion("to_user_id in", values, "to_user_id");
            return (Criteria) this;
        }

        public Criteria andTo_user_idNotIn(List<Integer> values) {
            addCriterion("to_user_id not in", values, "to_user_id");
            return (Criteria) this;
        }

        public Criteria andTo_user_idBetween(Integer value1, Integer value2) {
            addCriterion("to_user_id between", value1, value2, "to_user_id");
            return (Criteria) this;
        }

        public Criteria andTo_user_idNotBetween(Integer value1, Integer value2) {
            addCriterion("to_user_id not between", value1, value2, "to_user_id");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("articleId is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("articleId is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("articleId =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("articleId <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("articleId >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("articleId >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("articleId <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("articleId <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("articleId in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("articleId not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("articleId between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("articleId not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andComment_idIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andComment_idIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andComment_idEqualTo(Integer value) {
            addCriterion("comment_id =", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idLessThan(Integer value) {
            addCriterion("comment_id <", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idIn(List<Integer> values) {
            addCriterion("comment_id in", values, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "comment_id");
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