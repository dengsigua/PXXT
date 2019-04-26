package com.sign_up.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SignUpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    private int index;
    private int pageSize=1;
    
    public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


    public SignUpExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Long value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Long value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Long value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Long value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Long value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Long value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Long> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Long> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Long value1, Long value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Long value1, Long value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andSignUpNameIsNull() {
            addCriterion("sign_up_name is null");
            return (Criteria) this;
        }

        public Criteria andSignUpNameIsNotNull() {
            addCriterion("sign_up_name is not null");
            return (Criteria) this;
        }

        public Criteria andSignUpNameEqualTo(String value) {
            addCriterion("sign_up_name =", value, "signUpName");
            return (Criteria) this;
        }

        public Criteria andSignUpNameNotEqualTo(String value) {
            addCriterion("sign_up_name <>", value, "signUpName");
            return (Criteria) this;
        }

        public Criteria andSignUpNameGreaterThan(String value) {
            addCriterion("sign_up_name >", value, "signUpName");
            return (Criteria) this;
        }

        public Criteria andSignUpNameGreaterThanOrEqualTo(String value) {
            addCriterion("sign_up_name >=", value, "signUpName");
            return (Criteria) this;
        }

        public Criteria andSignUpNameLessThan(String value) {
            addCriterion("sign_up_name <", value, "signUpName");
            return (Criteria) this;
        }

        public Criteria andSignUpNameLessThanOrEqualTo(String value) {
            addCriterion("sign_up_name <=", value, "signUpName");
            return (Criteria) this;
        }

        public Criteria andSignUpNameLike(String value) {
            addCriterion("sign_up_name like", value, "signUpName");
            return (Criteria) this;
        }

        public Criteria andSignUpNameNotLike(String value) {
            addCriterion("sign_up_name not like", value, "signUpName");
            return (Criteria) this;
        }

        public Criteria andSignUpNameIn(List<String> values) {
            addCriterion("sign_up_name in", values, "signUpName");
            return (Criteria) this;
        }

        public Criteria andSignUpNameNotIn(List<String> values) {
            addCriterion("sign_up_name not in", values, "signUpName");
            return (Criteria) this;
        }

        public Criteria andSignUpNameBetween(String value1, String value2) {
            addCriterion("sign_up_name between", value1, value2, "signUpName");
            return (Criteria) this;
        }

        public Criteria andSignUpNameNotBetween(String value1, String value2) {
            addCriterion("sign_up_name not between", value1, value2, "signUpName");
            return (Criteria) this;
        }

        public Criteria andSignUpStateIsNull() {
            addCriterion("sign_up_state is null");
            return (Criteria) this;
        }

        public Criteria andSignUpStateIsNotNull() {
            addCriterion("sign_up_state is not null");
            return (Criteria) this;
        }

        public Criteria andSignUpStateEqualTo(String value) {
            addCriterion("sign_up_state =", value, "signUpState");
            return (Criteria) this;
        }

        public Criteria andSignUpStateNotEqualTo(String value) {
            addCriterion("sign_up_state <>", value, "signUpState");
            return (Criteria) this;
        }

        public Criteria andSignUpStateGreaterThan(String value) {
            addCriterion("sign_up_state >", value, "signUpState");
            return (Criteria) this;
        }

        public Criteria andSignUpStateGreaterThanOrEqualTo(String value) {
            addCriterion("sign_up_state >=", value, "signUpState");
            return (Criteria) this;
        }

        public Criteria andSignUpStateLessThan(String value) {
            addCriterion("sign_up_state <", value, "signUpState");
            return (Criteria) this;
        }

        public Criteria andSignUpStateLessThanOrEqualTo(String value) {
            addCriterion("sign_up_state <=", value, "signUpState");
            return (Criteria) this;
        }

        public Criteria andSignUpStateLike(String value) {
            addCriterion("sign_up_state like", value, "signUpState");
            return (Criteria) this;
        }

        public Criteria andSignUpStateNotLike(String value) {
            addCriterion("sign_up_state not like", value, "signUpState");
            return (Criteria) this;
        }

        public Criteria andSignUpStateIn(List<String> values) {
            addCriterion("sign_up_state in", values, "signUpState");
            return (Criteria) this;
        }

        public Criteria andSignUpStateNotIn(List<String> values) {
            addCriterion("sign_up_state not in", values, "signUpState");
            return (Criteria) this;
        }

        public Criteria andSignUpStateBetween(String value1, String value2) {
            addCriterion("sign_up_state between", value1, value2, "signUpState");
            return (Criteria) this;
        }

        public Criteria andSignUpStateNotBetween(String value1, String value2) {
            addCriterion("sign_up_state not between", value1, value2, "signUpState");
            return (Criteria) this;
        }

        public Criteria andSignUpTelIsNull() {
            addCriterion("sign_up_tel is null");
            return (Criteria) this;
        }

        public Criteria andSignUpTelIsNotNull() {
            addCriterion("sign_up_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSignUpTelEqualTo(String value) {
            addCriterion("sign_up_tel =", value, "signUpTel");
            return (Criteria) this;
        }

        public Criteria andSignUpTelNotEqualTo(String value) {
            addCriterion("sign_up_tel <>", value, "signUpTel");
            return (Criteria) this;
        }

        public Criteria andSignUpTelGreaterThan(String value) {
            addCriterion("sign_up_tel >", value, "signUpTel");
            return (Criteria) this;
        }

        public Criteria andSignUpTelGreaterThanOrEqualTo(String value) {
            addCriterion("sign_up_tel >=", value, "signUpTel");
            return (Criteria) this;
        }

        public Criteria andSignUpTelLessThan(String value) {
            addCriterion("sign_up_tel <", value, "signUpTel");
            return (Criteria) this;
        }

        public Criteria andSignUpTelLessThanOrEqualTo(String value) {
            addCriterion("sign_up_tel <=", value, "signUpTel");
            return (Criteria) this;
        }

        public Criteria andSignUpTelLike(String value) {
            addCriterion("sign_up_tel like", value, "signUpTel");
            return (Criteria) this;
        }

        public Criteria andSignUpTelNotLike(String value) {
            addCriterion("sign_up_tel not like", value, "signUpTel");
            return (Criteria) this;
        }

        public Criteria andSignUpTelIn(List<String> values) {
            addCriterion("sign_up_tel in", values, "signUpTel");
            return (Criteria) this;
        }

        public Criteria andSignUpTelNotIn(List<String> values) {
            addCriterion("sign_up_tel not in", values, "signUpTel");
            return (Criteria) this;
        }

        public Criteria andSignUpTelBetween(String value1, String value2) {
            addCriterion("sign_up_tel between", value1, value2, "signUpTel");
            return (Criteria) this;
        }

        public Criteria andSignUpTelNotBetween(String value1, String value2) {
            addCriterion("sign_up_tel not between", value1, value2, "signUpTel");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailIsNull() {
            addCriterion("sign_up_email is null");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailIsNotNull() {
            addCriterion("sign_up_email is not null");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailEqualTo(String value) {
            addCriterion("sign_up_email =", value, "signUpEmail");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailNotEqualTo(String value) {
            addCriterion("sign_up_email <>", value, "signUpEmail");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailGreaterThan(String value) {
            addCriterion("sign_up_email >", value, "signUpEmail");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailGreaterThanOrEqualTo(String value) {
            addCriterion("sign_up_email >=", value, "signUpEmail");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailLessThan(String value) {
            addCriterion("sign_up_email <", value, "signUpEmail");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailLessThanOrEqualTo(String value) {
            addCriterion("sign_up_email <=", value, "signUpEmail");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailLike(String value) {
            addCriterion("sign_up_email like", value, "signUpEmail");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailNotLike(String value) {
            addCriterion("sign_up_email not like", value, "signUpEmail");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailIn(List<String> values) {
            addCriterion("sign_up_email in", values, "signUpEmail");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailNotIn(List<String> values) {
            addCriterion("sign_up_email not in", values, "signUpEmail");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailBetween(String value1, String value2) {
            addCriterion("sign_up_email between", value1, value2, "signUpEmail");
            return (Criteria) this;
        }

        public Criteria andSignUpEmailNotBetween(String value1, String value2) {
            addCriterion("sign_up_email not between", value1, value2, "signUpEmail");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeIsNull() {
            addCriterion("sign_up_time is null");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeIsNotNull() {
            addCriterion("sign_up_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeEqualTo(Date value) {
            addCriterion("sign_up_time =", value, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeNotEqualTo(Date value) {
            addCriterion("sign_up_time <>", value, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeGreaterThan(Date value) {
            addCriterion("sign_up_time >", value, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_up_time >=", value, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeLessThan(Date value) {
            addCriterion("sign_up_time <", value, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_up_time <=", value, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeIn(List<Date> values) {
            addCriterion("sign_up_time in", values, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeNotIn(List<Date> values) {
            addCriterion("sign_up_time not in", values, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeBetween(Date value1, Date value2) {
            addCriterion("sign_up_time between", value1, value2, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_up_time not between", value1, value2, "signUpTime");
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