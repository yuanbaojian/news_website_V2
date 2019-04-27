package com.ybj.news_website.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Top_upExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Top_upExample() {
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

        public Criteria andTop_up_idIsNull() {
            addCriterion("top_up_id is null");
            return (Criteria) this;
        }

        public Criteria andTop_up_idIsNotNull() {
            addCriterion("top_up_id is not null");
            return (Criteria) this;
        }

        public Criteria andTop_up_idEqualTo(Integer value) {
            addCriterion("top_up_id =", value, "top_up_id");
            return (Criteria) this;
        }

        public Criteria andTop_up_idNotEqualTo(Integer value) {
            addCriterion("top_up_id <>", value, "top_up_id");
            return (Criteria) this;
        }

        public Criteria andTop_up_idGreaterThan(Integer value) {
            addCriterion("top_up_id >", value, "top_up_id");
            return (Criteria) this;
        }

        public Criteria andTop_up_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("top_up_id >=", value, "top_up_id");
            return (Criteria) this;
        }

        public Criteria andTop_up_idLessThan(Integer value) {
            addCriterion("top_up_id <", value, "top_up_id");
            return (Criteria) this;
        }

        public Criteria andTop_up_idLessThanOrEqualTo(Integer value) {
            addCriterion("top_up_id <=", value, "top_up_id");
            return (Criteria) this;
        }

        public Criteria andTop_up_idIn(List<Integer> values) {
            addCriterion("top_up_id in", values, "top_up_id");
            return (Criteria) this;
        }

        public Criteria andTop_up_idNotIn(List<Integer> values) {
            addCriterion("top_up_id not in", values, "top_up_id");
            return (Criteria) this;
        }

        public Criteria andTop_up_idBetween(Integer value1, Integer value2) {
            addCriterion("top_up_id between", value1, value2, "top_up_id");
            return (Criteria) this;
        }

        public Criteria andTop_up_idNotBetween(Integer value1, Integer value2) {
            addCriterion("top_up_id not between", value1, value2, "top_up_id");
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andIncreased_balanceIsNull() {
            addCriterion("increased_balance is null");
            return (Criteria) this;
        }

        public Criteria andIncreased_balanceIsNotNull() {
            addCriterion("increased_balance is not null");
            return (Criteria) this;
        }

        public Criteria andIncreased_balanceEqualTo(Double value) {
            addCriterion("increased_balance =", value, "increased_balance");
            return (Criteria) this;
        }

        public Criteria andIncreased_balanceNotEqualTo(Double value) {
            addCriterion("increased_balance <>", value, "increased_balance");
            return (Criteria) this;
        }

        public Criteria andIncreased_balanceGreaterThan(Double value) {
            addCriterion("increased_balance >", value, "increased_balance");
            return (Criteria) this;
        }

        public Criteria andIncreased_balanceGreaterThanOrEqualTo(Double value) {
            addCriterion("increased_balance >=", value, "increased_balance");
            return (Criteria) this;
        }

        public Criteria andIncreased_balanceLessThan(Double value) {
            addCriterion("increased_balance <", value, "increased_balance");
            return (Criteria) this;
        }

        public Criteria andIncreased_balanceLessThanOrEqualTo(Double value) {
            addCriterion("increased_balance <=", value, "increased_balance");
            return (Criteria) this;
        }

        public Criteria andIncreased_balanceIn(List<Double> values) {
            addCriterion("increased_balance in", values, "increased_balance");
            return (Criteria) this;
        }

        public Criteria andIncreased_balanceNotIn(List<Double> values) {
            addCriterion("increased_balance not in", values, "increased_balance");
            return (Criteria) this;
        }

        public Criteria andIncreased_balanceBetween(Double value1, Double value2) {
            addCriterion("increased_balance between", value1, value2, "increased_balance");
            return (Criteria) this;
        }

        public Criteria andIncreased_balanceNotBetween(Double value1, Double value2) {
            addCriterion("increased_balance not between", value1, value2, "increased_balance");
            return (Criteria) this;
        }

        public Criteria andChaanel_idIsNull() {
            addCriterion("chaanel_id is null");
            return (Criteria) this;
        }

        public Criteria andChaanel_idIsNotNull() {
            addCriterion("chaanel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChaanel_idEqualTo(String value) {
            addCriterion("chaanel_id =", value, "chaanel_id");
            return (Criteria) this;
        }

        public Criteria andChaanel_idNotEqualTo(String value) {
            addCriterion("chaanel_id <>", value, "chaanel_id");
            return (Criteria) this;
        }

        public Criteria andChaanel_idGreaterThan(String value) {
            addCriterion("chaanel_id >", value, "chaanel_id");
            return (Criteria) this;
        }

        public Criteria andChaanel_idGreaterThanOrEqualTo(String value) {
            addCriterion("chaanel_id >=", value, "chaanel_id");
            return (Criteria) this;
        }

        public Criteria andChaanel_idLessThan(String value) {
            addCriterion("chaanel_id <", value, "chaanel_id");
            return (Criteria) this;
        }

        public Criteria andChaanel_idLessThanOrEqualTo(String value) {
            addCriterion("chaanel_id <=", value, "chaanel_id");
            return (Criteria) this;
        }

        public Criteria andChaanel_idLike(String value) {
            addCriterion("chaanel_id like", value, "chaanel_id");
            return (Criteria) this;
        }

        public Criteria andChaanel_idNotLike(String value) {
            addCriterion("chaanel_id not like", value, "chaanel_id");
            return (Criteria) this;
        }

        public Criteria andChaanel_idIn(List<String> values) {
            addCriterion("chaanel_id in", values, "chaanel_id");
            return (Criteria) this;
        }

        public Criteria andChaanel_idNotIn(List<String> values) {
            addCriterion("chaanel_id not in", values, "chaanel_id");
            return (Criteria) this;
        }

        public Criteria andChaanel_idBetween(String value1, String value2) {
            addCriterion("chaanel_id between", value1, value2, "chaanel_id");
            return (Criteria) this;
        }

        public Criteria andChaanel_idNotBetween(String value1, String value2) {
            addCriterion("chaanel_id not between", value1, value2, "chaanel_id");
            return (Criteria) this;
        }

        public Criteria andExchange_rateIsNull() {
            addCriterion("exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andExchange_rateIsNotNull() {
            addCriterion("exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andExchange_rateEqualTo(String value) {
            addCriterion("exchange_rate =", value, "exchange_rate");
            return (Criteria) this;
        }

        public Criteria andExchange_rateNotEqualTo(String value) {
            addCriterion("exchange_rate <>", value, "exchange_rate");
            return (Criteria) this;
        }

        public Criteria andExchange_rateGreaterThan(String value) {
            addCriterion("exchange_rate >", value, "exchange_rate");
            return (Criteria) this;
        }

        public Criteria andExchange_rateGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_rate >=", value, "exchange_rate");
            return (Criteria) this;
        }

        public Criteria andExchange_rateLessThan(String value) {
            addCriterion("exchange_rate <", value, "exchange_rate");
            return (Criteria) this;
        }

        public Criteria andExchange_rateLessThanOrEqualTo(String value) {
            addCriterion("exchange_rate <=", value, "exchange_rate");
            return (Criteria) this;
        }

        public Criteria andExchange_rateLike(String value) {
            addCriterion("exchange_rate like", value, "exchange_rate");
            return (Criteria) this;
        }

        public Criteria andExchange_rateNotLike(String value) {
            addCriterion("exchange_rate not like", value, "exchange_rate");
            return (Criteria) this;
        }

        public Criteria andExchange_rateIn(List<String> values) {
            addCriterion("exchange_rate in", values, "exchange_rate");
            return (Criteria) this;
        }

        public Criteria andExchange_rateNotIn(List<String> values) {
            addCriterion("exchange_rate not in", values, "exchange_rate");
            return (Criteria) this;
        }

        public Criteria andExchange_rateBetween(String value1, String value2) {
            addCriterion("exchange_rate between", value1, value2, "exchange_rate");
            return (Criteria) this;
        }

        public Criteria andExchange_rateNotBetween(String value1, String value2) {
            addCriterion("exchange_rate not between", value1, value2, "exchange_rate");
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