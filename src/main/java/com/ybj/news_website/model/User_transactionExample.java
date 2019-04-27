package com.ybj.news_website.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User_transactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public User_transactionExample() {
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

        public Criteria andTransaction_idIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransaction_idIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransaction_idEqualTo(Integer value) {
            addCriterion("transaction_id =", value, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idNotEqualTo(Integer value) {
            addCriterion("transaction_id <>", value, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idGreaterThan(Integer value) {
            addCriterion("transaction_id >", value, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("transaction_id >=", value, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idLessThan(Integer value) {
            addCriterion("transaction_id <", value, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idLessThanOrEqualTo(Integer value) {
            addCriterion("transaction_id <=", value, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idIn(List<Integer> values) {
            addCriterion("transaction_id in", values, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idNotIn(List<Integer> values) {
            addCriterion("transaction_id not in", values, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idBetween(Integer value1, Integer value2) {
            addCriterion("transaction_id between", value1, value2, "transaction_id");
            return (Criteria) this;
        }

        public Criteria andTransaction_idNotBetween(Integer value1, Integer value2) {
            addCriterion("transaction_id not between", value1, value2, "transaction_id");
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

        public Criteria andCreated_timeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreated_timeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreated_timeEqualTo(Date value) {
            addCriterion("created_time =", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeGreaterThan(Date value) {
            addCriterion("created_time >", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeLessThan(Date value) {
            addCriterion("created_time <", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeIn(List<Date> values) {
            addCriterion("created_time in", values, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "created_time");
            return (Criteria) this;
        }

        public Criteria andExpend_sumIsNull() {
            addCriterion("expend_sum is null");
            return (Criteria) this;
        }

        public Criteria andExpend_sumIsNotNull() {
            addCriterion("expend_sum is not null");
            return (Criteria) this;
        }

        public Criteria andExpend_sumEqualTo(Double value) {
            addCriterion("expend_sum =", value, "expend_sum");
            return (Criteria) this;
        }

        public Criteria andExpend_sumNotEqualTo(Double value) {
            addCriterion("expend_sum <>", value, "expend_sum");
            return (Criteria) this;
        }

        public Criteria andExpend_sumGreaterThan(Double value) {
            addCriterion("expend_sum >", value, "expend_sum");
            return (Criteria) this;
        }

        public Criteria andExpend_sumGreaterThanOrEqualTo(Double value) {
            addCriterion("expend_sum >=", value, "expend_sum");
            return (Criteria) this;
        }

        public Criteria andExpend_sumLessThan(Double value) {
            addCriterion("expend_sum <", value, "expend_sum");
            return (Criteria) this;
        }

        public Criteria andExpend_sumLessThanOrEqualTo(Double value) {
            addCriterion("expend_sum <=", value, "expend_sum");
            return (Criteria) this;
        }

        public Criteria andExpend_sumIn(List<Double> values) {
            addCriterion("expend_sum in", values, "expend_sum");
            return (Criteria) this;
        }

        public Criteria andExpend_sumNotIn(List<Double> values) {
            addCriterion("expend_sum not in", values, "expend_sum");
            return (Criteria) this;
        }

        public Criteria andExpend_sumBetween(Double value1, Double value2) {
            addCriterion("expend_sum between", value1, value2, "expend_sum");
            return (Criteria) this;
        }

        public Criteria andExpend_sumNotBetween(Double value1, Double value2) {
            addCriterion("expend_sum not between", value1, value2, "expend_sum");
            return (Criteria) this;
        }

        public Criteria andTo_user_sumIsNull() {
            addCriterion("to_user_sum is null");
            return (Criteria) this;
        }

        public Criteria andTo_user_sumIsNotNull() {
            addCriterion("to_user_sum is not null");
            return (Criteria) this;
        }

        public Criteria andTo_user_sumEqualTo(Double value) {
            addCriterion("to_user_sum =", value, "to_user_sum");
            return (Criteria) this;
        }

        public Criteria andTo_user_sumNotEqualTo(Double value) {
            addCriterion("to_user_sum <>", value, "to_user_sum");
            return (Criteria) this;
        }

        public Criteria andTo_user_sumGreaterThan(Double value) {
            addCriterion("to_user_sum >", value, "to_user_sum");
            return (Criteria) this;
        }

        public Criteria andTo_user_sumGreaterThanOrEqualTo(Double value) {
            addCriterion("to_user_sum >=", value, "to_user_sum");
            return (Criteria) this;
        }

        public Criteria andTo_user_sumLessThan(Double value) {
            addCriterion("to_user_sum <", value, "to_user_sum");
            return (Criteria) this;
        }

        public Criteria andTo_user_sumLessThanOrEqualTo(Double value) {
            addCriterion("to_user_sum <=", value, "to_user_sum");
            return (Criteria) this;
        }

        public Criteria andTo_user_sumIn(List<Double> values) {
            addCriterion("to_user_sum in", values, "to_user_sum");
            return (Criteria) this;
        }

        public Criteria andTo_user_sumNotIn(List<Double> values) {
            addCriterion("to_user_sum not in", values, "to_user_sum");
            return (Criteria) this;
        }

        public Criteria andTo_user_sumBetween(Double value1, Double value2) {
            addCriterion("to_user_sum between", value1, value2, "to_user_sum");
            return (Criteria) this;
        }

        public Criteria andTo_user_sumNotBetween(Double value1, Double value2) {
            addCriterion("to_user_sum not between", value1, value2, "to_user_sum");
            return (Criteria) this;
        }

        public Criteria andTo_platform_sumIsNull() {
            addCriterion("to_platform_sum is null");
            return (Criteria) this;
        }

        public Criteria andTo_platform_sumIsNotNull() {
            addCriterion("to_platform_sum is not null");
            return (Criteria) this;
        }

        public Criteria andTo_platform_sumEqualTo(Double value) {
            addCriterion("to_platform_sum =", value, "to_platform_sum");
            return (Criteria) this;
        }

        public Criteria andTo_platform_sumNotEqualTo(Double value) {
            addCriterion("to_platform_sum <>", value, "to_platform_sum");
            return (Criteria) this;
        }

        public Criteria andTo_platform_sumGreaterThan(Double value) {
            addCriterion("to_platform_sum >", value, "to_platform_sum");
            return (Criteria) this;
        }

        public Criteria andTo_platform_sumGreaterThanOrEqualTo(Double value) {
            addCriterion("to_platform_sum >=", value, "to_platform_sum");
            return (Criteria) this;
        }

        public Criteria andTo_platform_sumLessThan(Double value) {
            addCriterion("to_platform_sum <", value, "to_platform_sum");
            return (Criteria) this;
        }

        public Criteria andTo_platform_sumLessThanOrEqualTo(Double value) {
            addCriterion("to_platform_sum <=", value, "to_platform_sum");
            return (Criteria) this;
        }

        public Criteria andTo_platform_sumIn(List<Double> values) {
            addCriterion("to_platform_sum in", values, "to_platform_sum");
            return (Criteria) this;
        }

        public Criteria andTo_platform_sumNotIn(List<Double> values) {
            addCriterion("to_platform_sum not in", values, "to_platform_sum");
            return (Criteria) this;
        }

        public Criteria andTo_platform_sumBetween(Double value1, Double value2) {
            addCriterion("to_platform_sum between", value1, value2, "to_platform_sum");
            return (Criteria) this;
        }

        public Criteria andTo_platform_sumNotBetween(Double value1, Double value2) {
            addCriterion("to_platform_sum not between", value1, value2, "to_platform_sum");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Float value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Float value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Float value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Float value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Float value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Float value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Float> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Float> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Float value1, Float value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Float value1, Float value2) {
            addCriterion("rate not between", value1, value2, "rate");
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