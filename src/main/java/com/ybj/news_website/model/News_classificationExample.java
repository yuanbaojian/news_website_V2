package com.ybj.news_website.model;

import java.util.ArrayList;
import java.util.List;

public class News_classificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public News_classificationExample() {
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

        public Criteria andClassification_nameIsNull() {
            addCriterion("classification_name is null");
            return (Criteria) this;
        }

        public Criteria andClassification_nameIsNotNull() {
            addCriterion("classification_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassification_nameEqualTo(String value) {
            addCriterion("classification_name =", value, "classification_name");
            return (Criteria) this;
        }

        public Criteria andClassification_nameNotEqualTo(String value) {
            addCriterion("classification_name <>", value, "classification_name");
            return (Criteria) this;
        }

        public Criteria andClassification_nameGreaterThan(String value) {
            addCriterion("classification_name >", value, "classification_name");
            return (Criteria) this;
        }

        public Criteria andClassification_nameGreaterThanOrEqualTo(String value) {
            addCriterion("classification_name >=", value, "classification_name");
            return (Criteria) this;
        }

        public Criteria andClassification_nameLessThan(String value) {
            addCriterion("classification_name <", value, "classification_name");
            return (Criteria) this;
        }

        public Criteria andClassification_nameLessThanOrEqualTo(String value) {
            addCriterion("classification_name <=", value, "classification_name");
            return (Criteria) this;
        }

        public Criteria andClassification_nameLike(String value) {
            addCriterion("classification_name like", value, "classification_name");
            return (Criteria) this;
        }

        public Criteria andClassification_nameNotLike(String value) {
            addCriterion("classification_name not like", value, "classification_name");
            return (Criteria) this;
        }

        public Criteria andClassification_nameIn(List<String> values) {
            addCriterion("classification_name in", values, "classification_name");
            return (Criteria) this;
        }

        public Criteria andClassification_nameNotIn(List<String> values) {
            addCriterion("classification_name not in", values, "classification_name");
            return (Criteria) this;
        }

        public Criteria andClassification_nameBetween(String value1, String value2) {
            addCriterion("classification_name between", value1, value2, "classification_name");
            return (Criteria) this;
        }

        public Criteria andClassification_nameNotBetween(String value1, String value2) {
            addCriterion("classification_name not between", value1, value2, "classification_name");
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