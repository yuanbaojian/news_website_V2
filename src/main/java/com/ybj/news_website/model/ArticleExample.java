package com.ybj.news_website.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticle_idIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticle_idIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_idEqualTo(Integer value) {
            addCriterion("article_id =", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idGreaterThan(Integer value) {
            addCriterion("article_id >", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idLessThan(Integer value) {
            addCriterion("article_id <", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idIn(List<Integer> values) {
            addCriterion("article_id in", values, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_created_timeIsNull() {
            addCriterion("article_created_time is null");
            return (Criteria) this;
        }

        public Criteria andArticle_created_timeIsNotNull() {
            addCriterion("article_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_created_timeEqualTo(Date value) {
            addCriterion("article_created_time =", value, "article_created_time");
            return (Criteria) this;
        }

        public Criteria andArticle_created_timeNotEqualTo(Date value) {
            addCriterion("article_created_time <>", value, "article_created_time");
            return (Criteria) this;
        }

        public Criteria andArticle_created_timeGreaterThan(Date value) {
            addCriterion("article_created_time >", value, "article_created_time");
            return (Criteria) this;
        }

        public Criteria andArticle_created_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("article_created_time >=", value, "article_created_time");
            return (Criteria) this;
        }

        public Criteria andArticle_created_timeLessThan(Date value) {
            addCriterion("article_created_time <", value, "article_created_time");
            return (Criteria) this;
        }

        public Criteria andArticle_created_timeLessThanOrEqualTo(Date value) {
            addCriterion("article_created_time <=", value, "article_created_time");
            return (Criteria) this;
        }

        public Criteria andArticle_created_timeIn(List<Date> values) {
            addCriterion("article_created_time in", values, "article_created_time");
            return (Criteria) this;
        }

        public Criteria andArticle_created_timeNotIn(List<Date> values) {
            addCriterion("article_created_time not in", values, "article_created_time");
            return (Criteria) this;
        }

        public Criteria andArticle_created_timeBetween(Date value1, Date value2) {
            addCriterion("article_created_time between", value1, value2, "article_created_time");
            return (Criteria) this;
        }

        public Criteria andArticle_created_timeNotBetween(Date value1, Date value2) {
            addCriterion("article_created_time not between", value1, value2, "article_created_time");
            return (Criteria) this;
        }

        public Criteria andArticle_img1IsNull() {
            addCriterion("article_img1 is null");
            return (Criteria) this;
        }

        public Criteria andArticle_img1IsNotNull() {
            addCriterion("article_img1 is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_img1EqualTo(String value) {
            addCriterion("article_img1 =", value, "article_img1");
            return (Criteria) this;
        }

        public Criteria andArticle_img1NotEqualTo(String value) {
            addCriterion("article_img1 <>", value, "article_img1");
            return (Criteria) this;
        }

        public Criteria andArticle_img1GreaterThan(String value) {
            addCriterion("article_img1 >", value, "article_img1");
            return (Criteria) this;
        }

        public Criteria andArticle_img1GreaterThanOrEqualTo(String value) {
            addCriterion("article_img1 >=", value, "article_img1");
            return (Criteria) this;
        }

        public Criteria andArticle_img1LessThan(String value) {
            addCriterion("article_img1 <", value, "article_img1");
            return (Criteria) this;
        }

        public Criteria andArticle_img1LessThanOrEqualTo(String value) {
            addCriterion("article_img1 <=", value, "article_img1");
            return (Criteria) this;
        }

        public Criteria andArticle_img1Like(String value) {
            addCriterion("article_img1 like", value, "article_img1");
            return (Criteria) this;
        }

        public Criteria andArticle_img1NotLike(String value) {
            addCriterion("article_img1 not like", value, "article_img1");
            return (Criteria) this;
        }

        public Criteria andArticle_img1In(List<String> values) {
            addCriterion("article_img1 in", values, "article_img1");
            return (Criteria) this;
        }

        public Criteria andArticle_img1NotIn(List<String> values) {
            addCriterion("article_img1 not in", values, "article_img1");
            return (Criteria) this;
        }

        public Criteria andArticle_img1Between(String value1, String value2) {
            addCriterion("article_img1 between", value1, value2, "article_img1");
            return (Criteria) this;
        }

        public Criteria andArticle_img1NotBetween(String value1, String value2) {
            addCriterion("article_img1 not between", value1, value2, "article_img1");
            return (Criteria) this;
        }

        public Criteria andArticle_img2IsNull() {
            addCriterion("article_img2 is null");
            return (Criteria) this;
        }

        public Criteria andArticle_img2IsNotNull() {
            addCriterion("article_img2 is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_img2EqualTo(String value) {
            addCriterion("article_img2 =", value, "article_img2");
            return (Criteria) this;
        }

        public Criteria andArticle_img2NotEqualTo(String value) {
            addCriterion("article_img2 <>", value, "article_img2");
            return (Criteria) this;
        }

        public Criteria andArticle_img2GreaterThan(String value) {
            addCriterion("article_img2 >", value, "article_img2");
            return (Criteria) this;
        }

        public Criteria andArticle_img2GreaterThanOrEqualTo(String value) {
            addCriterion("article_img2 >=", value, "article_img2");
            return (Criteria) this;
        }

        public Criteria andArticle_img2LessThan(String value) {
            addCriterion("article_img2 <", value, "article_img2");
            return (Criteria) this;
        }

        public Criteria andArticle_img2LessThanOrEqualTo(String value) {
            addCriterion("article_img2 <=", value, "article_img2");
            return (Criteria) this;
        }

        public Criteria andArticle_img2Like(String value) {
            addCriterion("article_img2 like", value, "article_img2");
            return (Criteria) this;
        }

        public Criteria andArticle_img2NotLike(String value) {
            addCriterion("article_img2 not like", value, "article_img2");
            return (Criteria) this;
        }

        public Criteria andArticle_img2In(List<String> values) {
            addCriterion("article_img2 in", values, "article_img2");
            return (Criteria) this;
        }

        public Criteria andArticle_img2NotIn(List<String> values) {
            addCriterion("article_img2 not in", values, "article_img2");
            return (Criteria) this;
        }

        public Criteria andArticle_img2Between(String value1, String value2) {
            addCriterion("article_img2 between", value1, value2, "article_img2");
            return (Criteria) this;
        }

        public Criteria andArticle_img2NotBetween(String value1, String value2) {
            addCriterion("article_img2 not between", value1, value2, "article_img2");
            return (Criteria) this;
        }

        public Criteria andArticle_img3IsNull() {
            addCriterion("article_img3 is null");
            return (Criteria) this;
        }

        public Criteria andArticle_img3IsNotNull() {
            addCriterion("article_img3 is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_img3EqualTo(String value) {
            addCriterion("article_img3 =", value, "article_img3");
            return (Criteria) this;
        }

        public Criteria andArticle_img3NotEqualTo(String value) {
            addCriterion("article_img3 <>", value, "article_img3");
            return (Criteria) this;
        }

        public Criteria andArticle_img3GreaterThan(String value) {
            addCriterion("article_img3 >", value, "article_img3");
            return (Criteria) this;
        }

        public Criteria andArticle_img3GreaterThanOrEqualTo(String value) {
            addCriterion("article_img3 >=", value, "article_img3");
            return (Criteria) this;
        }

        public Criteria andArticle_img3LessThan(String value) {
            addCriterion("article_img3 <", value, "article_img3");
            return (Criteria) this;
        }

        public Criteria andArticle_img3LessThanOrEqualTo(String value) {
            addCriterion("article_img3 <=", value, "article_img3");
            return (Criteria) this;
        }

        public Criteria andArticle_img3Like(String value) {
            addCriterion("article_img3 like", value, "article_img3");
            return (Criteria) this;
        }

        public Criteria andArticle_img3NotLike(String value) {
            addCriterion("article_img3 not like", value, "article_img3");
            return (Criteria) this;
        }

        public Criteria andArticle_img3In(List<String> values) {
            addCriterion("article_img3 in", values, "article_img3");
            return (Criteria) this;
        }

        public Criteria andArticle_img3NotIn(List<String> values) {
            addCriterion("article_img3 not in", values, "article_img3");
            return (Criteria) this;
        }

        public Criteria andArticle_img3Between(String value1, String value2) {
            addCriterion("article_img3 between", value1, value2, "article_img3");
            return (Criteria) this;
        }

        public Criteria andArticle_img3NotBetween(String value1, String value2) {
            addCriterion("article_img3 not between", value1, value2, "article_img3");
            return (Criteria) this;
        }

        public Criteria andArticle_img4IsNull() {
            addCriterion("GetArticleByUserId is null");
            return (Criteria) this;
        }

        public Criteria andArticle_img4IsNotNull() {
            addCriterion("article_img4 is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_img4EqualTo(String value) {
            addCriterion("article_img4 =", value, "article_img4");
            return (Criteria) this;
        }

        public Criteria andArticle_img4NotEqualTo(String value) {
            addCriterion("article_img4 <>", value, "article_img4");
            return (Criteria) this;
        }

        public Criteria andArticle_img4GreaterThan(String value) {
            addCriterion("article_img4 >", value, "article_img4");
            return (Criteria) this;
        }

        public Criteria andArticle_img4GreaterThanOrEqualTo(String value) {
            addCriterion("article_img4 >=", value, "article_img4");
            return (Criteria) this;
        }

        public Criteria andArticle_img4LessThan(String value) {
            addCriterion("article_img4 <", value, "article_img4");
            return (Criteria) this;
        }

        public Criteria andArticle_img4LessThanOrEqualTo(String value) {
            addCriterion("article_img4 <=", value, "article_img4");
            return (Criteria) this;
        }

        public Criteria andArticle_img4Like(String value) {
            addCriterion("article_img4 like", value, "article_img4");
            return (Criteria) this;
        }

        public Criteria andArticle_img4NotLike(String value) {
            addCriterion("article_img4 not like", value, "article_img4");
            return (Criteria) this;
        }

        public Criteria andArticle_img4In(List<String> values) {
            addCriterion("article_img4 in", values, "article_img4");
            return (Criteria) this;
        }

        public Criteria andArticle_img4NotIn(List<String> values) {
            addCriterion("article_img4 not in", values, "article_img4");
            return (Criteria) this;
        }

        public Criteria andArticle_img4Between(String value1, String value2) {
            addCriterion("article_img4 between", value1, value2, "article_img4");
            return (Criteria) this;
        }

        public Criteria andArticle_img4NotBetween(String value1, String value2) {
            addCriterion("article_img4 not between", value1, value2, "article_img4");
            return (Criteria) this;
        }

        public Criteria andArticle_img5IsNull() {
            addCriterion("article_name is null");
            return (Criteria) this;
        }

        public Criteria andArticle_img5IsNotNull() {
            addCriterion("article_name is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_img5EqualTo(String value) {
            addCriterion("article_name =", value, "article_name");
            return (Criteria) this;
        }

        public Criteria andArticle_img5NotEqualTo(String value) {
            addCriterion("article_name <>", value, "article_name");
            return (Criteria) this;
        }

        public Criteria andArticle_img5GreaterThan(String value) {
            addCriterion("article_name >", value, "article_name");
            return (Criteria) this;
        }

        public Criteria andArticle_img5GreaterThanOrEqualTo(String value) {
            addCriterion("article_name >=", value, "article_name");
            return (Criteria) this;
        }

        public Criteria andArticle_img5LessThan(String value) {
            addCriterion("article_name <", value, "article_name");
            return (Criteria) this;
        }

        public Criteria andArticle_img5LessThanOrEqualTo(String value) {
            addCriterion("article_name <=", value, "article_name");
            return (Criteria) this;
        }

        public Criteria andArticle_img5Like(String value) {
            addCriterion("article_name like", value, "article_name");
            return (Criteria) this;
        }

        public Criteria andArticle_img5NotLike(String value) {
            addCriterion("article_name not like", value, "article_name");
            return (Criteria) this;
        }

        public Criteria andArticle_img5In(List<String> values) {
            addCriterion("article_name in", values, "article_name");
            return (Criteria) this;
        }

        public Criteria andArticle_img5NotIn(List<String> values) {
            addCriterion("article_name not in", values, "article_name");
            return (Criteria) this;
        }

        public Criteria andArticle_img5Between(String value1, String value2) {
            addCriterion("article_name between", value1, value2, "article_name");
            return (Criteria) this;
        }

        public Criteria andArticle_img5NotBetween(String value1, String value2) {
            addCriterion("article_name not between", value1, value2, "article_name");
            return (Criteria) this;
        }

        public Criteria andClassification_idIsNull() {
            addCriterion("classification_id is null");
            return (Criteria) this;
        }

        public Criteria andClassification_idIsNotNull() {
            addCriterion("classification_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassification_idEqualTo(Integer value) {
            addCriterion("classification_id =", value, "classification_id");
            return (Criteria) this;
        }

        public Criteria andClassification_idNotEqualTo(Integer value) {
            addCriterion("classification_id <>", value, "classification_id");
            return (Criteria) this;
        }

        public Criteria andClassification_idGreaterThan(Integer value) {
            addCriterion("classification_id >", value, "classification_id");
            return (Criteria) this;
        }

        public Criteria andClassification_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("classification_id >=", value, "classification_id");
            return (Criteria) this;
        }

        public Criteria andClassification_idLessThan(Integer value) {
            addCriterion("classification_id <", value, "classification_id");
            return (Criteria) this;
        }

        public Criteria andClassification_idLessThanOrEqualTo(Integer value) {
            addCriterion("classification_id <=", value, "classification_id");
            return (Criteria) this;
        }

        public Criteria andClassification_idIn(List<Integer> values) {
            addCriterion("classification_id in", values, "classification_id");
            return (Criteria) this;
        }

        public Criteria andClassification_idNotIn(List<Integer> values) {
            addCriterion("classification_id not in", values, "classification_id");
            return (Criteria) this;
        }

        public Criteria andClassification_idBetween(Integer value1, Integer value2) {
            addCriterion("classification_id between", value1, value2, "classification_id");
            return (Criteria) this;
        }

        public Criteria andClassification_idNotBetween(Integer value1, Integer value2) {
            addCriterion("classification_id not between", value1, value2, "classification_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNull() {
            addCriterion("checked is null");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNotNull() {
            addCriterion("checked is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedEqualTo(Integer value) {
            addCriterion("checked =", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotEqualTo(Integer value) {
            addCriterion("checked <>", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThan(Integer value) {
            addCriterion("checked >", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThanOrEqualTo(Integer value) {
            addCriterion("checked >=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThan(Integer value) {
            addCriterion("checked <", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedLessThanOrEqualTo(Integer value) {
            addCriterion("checked <=", value, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedIn(List<Integer> values) {
            addCriterion("checked in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotIn(List<Integer> values) {
            addCriterion("checked not in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedBetween(Integer value1, Integer value2) {
            addCriterion("checked between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotBetween(Integer value1, Integer value2) {
            addCriterion("checked not between", value1, value2, "checked");
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