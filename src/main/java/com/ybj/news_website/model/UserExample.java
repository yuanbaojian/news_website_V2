package com.ybj.news_website.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUser_accountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUser_accountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUser_accountEqualTo(String value) {
            addCriterion("user_account =", value, "user_account");
            return (Criteria) this;
        }

        public Criteria andUser_accountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "user_account");
            return (Criteria) this;
        }

        public Criteria andUser_accountGreaterThan(String value) {
            addCriterion("user_account >", value, "user_account");
            return (Criteria) this;
        }

        public Criteria andUser_accountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "user_account");
            return (Criteria) this;
        }

        public Criteria andUser_accountLessThan(String value) {
            addCriterion("user_account <", value, "user_account");
            return (Criteria) this;
        }

        public Criteria andUser_accountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "user_account");
            return (Criteria) this;
        }

        public Criteria andUser_accountLike(String value) {
            addCriterion("user_account like", value, "user_account");
            return (Criteria) this;
        }

        public Criteria andUser_accountNotLike(String value) {
            addCriterion("user_account not like", value, "user_account");
            return (Criteria) this;
        }

        public Criteria andUser_accountIn(List<String> values) {
            addCriterion("user_account in", values, "user_account");
            return (Criteria) this;
        }

        public Criteria andUser_accountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "user_account");
            return (Criteria) this;
        }

        public Criteria andUser_accountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "user_account");
            return (Criteria) this;
        }

        public Criteria andUser_accountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "user_account");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordEqualTo(String value) {
            addCriterion("user_password =", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThan(String value) {
            addCriterion("user_password >", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThan(String value) {
            addCriterion("user_password <", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLike(String value) {
            addCriterion("user_password like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotLike(String value) {
            addCriterion("user_password not like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIn(List<String> values) {
            addCriterion("user_password in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_iconIsNull() {
            addCriterion("user_icon is null");
            return (Criteria) this;
        }

        public Criteria andUser_iconIsNotNull() {
            addCriterion("user_icon is not null");
            return (Criteria) this;
        }

        public Criteria andUser_iconEqualTo(String value) {
            addCriterion("user_icon =", value, "user_icon");
            return (Criteria) this;
        }

        public Criteria andUser_iconNotEqualTo(String value) {
            addCriterion("user_icon <>", value, "user_icon");
            return (Criteria) this;
        }

        public Criteria andUser_iconGreaterThan(String value) {
            addCriterion("user_icon >", value, "user_icon");
            return (Criteria) this;
        }

        public Criteria andUser_iconGreaterThanOrEqualTo(String value) {
            addCriterion("user_icon >=", value, "user_icon");
            return (Criteria) this;
        }

        public Criteria andUser_iconLessThan(String value) {
            addCriterion("user_icon <", value, "user_icon");
            return (Criteria) this;
        }

        public Criteria andUser_iconLessThanOrEqualTo(String value) {
            addCriterion("user_icon <=", value, "user_icon");
            return (Criteria) this;
        }

        public Criteria andUser_iconLike(String value) {
            addCriterion("user_icon like", value, "user_icon");
            return (Criteria) this;
        }

        public Criteria andUser_iconNotLike(String value) {
            addCriterion("user_icon not like", value, "user_icon");
            return (Criteria) this;
        }

        public Criteria andUser_iconIn(List<String> values) {
            addCriterion("user_icon in", values, "user_icon");
            return (Criteria) this;
        }

        public Criteria andUser_iconNotIn(List<String> values) {
            addCriterion("user_icon not in", values, "user_icon");
            return (Criteria) this;
        }

        public Criteria andUser_iconBetween(String value1, String value2) {
            addCriterion("user_icon between", value1, value2, "user_icon");
            return (Criteria) this;
        }

        public Criteria andUser_iconNotBetween(String value1, String value2) {
            addCriterion("user_icon not between", value1, value2, "user_icon");
            return (Criteria) this;
        }

        public Criteria andUser_emailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUser_emailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUser_emailEqualTo(String value) {
            addCriterion("user_email =", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailGreaterThan(String value) {
            addCriterion("user_email >", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailLessThan(String value) {
            addCriterion("user_email <", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailLike(String value) {
            addCriterion("user_email like", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotLike(String value) {
            addCriterion("user_email not like", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailIn(List<String> values) {
            addCriterion("user_email in", values, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "user_email");
            return (Criteria) this;
        }

        public Criteria andActivateIsNull() {
            addCriterion("activate is null");
            return (Criteria) this;
        }

        public Criteria andActivateIsNotNull() {
            addCriterion("activate is not null");
            return (Criteria) this;
        }

        public Criteria andActivateEqualTo(Integer value) {
            addCriterion("activate =", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateNotEqualTo(Integer value) {
            addCriterion("activate <>", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateGreaterThan(Integer value) {
            addCriterion("activate >", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateGreaterThanOrEqualTo(Integer value) {
            addCriterion("activate >=", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateLessThan(Integer value) {
            addCriterion("activate <", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateLessThanOrEqualTo(Integer value) {
            addCriterion("activate <=", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateIn(List<Integer> values) {
            addCriterion("activate in", values, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateNotIn(List<Integer> values) {
            addCriterion("activate not in", values, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateBetween(Integer value1, Integer value2) {
            addCriterion("activate between", value1, value2, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateNotBetween(Integer value1, Integer value2) {
            addCriterion("activate not between", value1, value2, "activate");
            return (Criteria) this;
        }

        public Criteria andRole_idIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRole_idIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRole_idEqualTo(Integer value) {
            addCriterion("role_id =", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idGreaterThan(Integer value) {
            addCriterion("role_id >", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idLessThan(Integer value) {
            addCriterion("role_id <", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idIn(List<Integer> values) {
            addCriterion("role_id in", values, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "role_id");
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