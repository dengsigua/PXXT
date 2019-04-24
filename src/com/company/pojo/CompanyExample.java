package com.company.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    private int index;//当前页数
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

	public CompanyExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIsNull() {
            addCriterion("company_city is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIsNotNull() {
            addCriterion("company_city is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCityEqualTo(String value) {
            addCriterion("company_city =", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNotEqualTo(String value) {
            addCriterion("company_city <>", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityGreaterThan(String value) {
            addCriterion("company_city >", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityGreaterThanOrEqualTo(String value) {
            addCriterion("company_city >=", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityLessThan(String value) {
            addCriterion("company_city <", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityLessThanOrEqualTo(String value) {
            addCriterion("company_city <=", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityLike(String value) {
            addCriterion("company_city like", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNotLike(String value) {
            addCriterion("company_city not like", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIn(List<String> values) {
            addCriterion("company_city in", values, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNotIn(List<String> values) {
            addCriterion("company_city not in", values, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityBetween(String value1, String value2) {
            addCriterion("company_city between", value1, value2, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNotBetween(String value1, String value2) {
            addCriterion("company_city not between", value1, value2, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsIsNull() {
            addCriterion("company_contacts is null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsIsNotNull() {
            addCriterion("company_contacts is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsEqualTo(String value) {
            addCriterion("company_contacts =", value, "companyContacts");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsNotEqualTo(String value) {
            addCriterion("company_contacts <>", value, "companyContacts");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsGreaterThan(String value) {
            addCriterion("company_contacts >", value, "companyContacts");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsGreaterThanOrEqualTo(String value) {
            addCriterion("company_contacts >=", value, "companyContacts");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsLessThan(String value) {
            addCriterion("company_contacts <", value, "companyContacts");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsLessThanOrEqualTo(String value) {
            addCriterion("company_contacts <=", value, "companyContacts");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsLike(String value) {
            addCriterion("company_contacts like", value, "companyContacts");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsNotLike(String value) {
            addCriterion("company_contacts not like", value, "companyContacts");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsIn(List<String> values) {
            addCriterion("company_contacts in", values, "companyContacts");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsNotIn(List<String> values) {
            addCriterion("company_contacts not in", values, "companyContacts");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsBetween(String value1, String value2) {
            addCriterion("company_contacts between", value1, value2, "companyContacts");
            return (Criteria) this;
        }

        public Criteria andCompanyContactsNotBetween(String value1, String value2) {
            addCriterion("company_contacts not between", value1, value2, "companyContacts");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNull() {
            addCriterion("company_tel is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNotNull() {
            addCriterion("company_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelEqualTo(String value) {
            addCriterion("company_tel =", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotEqualTo(String value) {
            addCriterion("company_tel <>", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThan(String value) {
            addCriterion("company_tel >", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThanOrEqualTo(String value) {
            addCriterion("company_tel >=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThan(String value) {
            addCriterion("company_tel <", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThanOrEqualTo(String value) {
            addCriterion("company_tel <=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLike(String value) {
            addCriterion("company_tel like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotLike(String value) {
            addCriterion("company_tel not like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIn(List<String> values) {
            addCriterion("company_tel in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotIn(List<String> values) {
            addCriterion("company_tel not in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelBetween(String value1, String value2) {
            addCriterion("company_tel between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotBetween(String value1, String value2) {
            addCriterion("company_tel not between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNull() {
            addCriterion("company_email is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNotNull() {
            addCriterion("company_email is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailEqualTo(String value) {
            addCriterion("company_email =", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotEqualTo(String value) {
            addCriterion("company_email <>", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThan(String value) {
            addCriterion("company_email >", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("company_email >=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThan(String value) {
            addCriterion("company_email <", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThanOrEqualTo(String value) {
            addCriterion("company_email <=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLike(String value) {
            addCriterion("company_email like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotLike(String value) {
            addCriterion("company_email not like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIn(List<String> values) {
            addCriterion("company_email in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotIn(List<String> values) {
            addCriterion("company_email not in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailBetween(String value1, String value2) {
            addCriterion("company_email between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotBetween(String value1, String value2) {
            addCriterion("company_email not between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsIsNull() {
            addCriterion("company_labels is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsIsNotNull() {
            addCriterion("company_labels is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsEqualTo(String value) {
            addCriterion("company_labels =", value, "companyLabels");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsNotEqualTo(String value) {
            addCriterion("company_labels <>", value, "companyLabels");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsGreaterThan(String value) {
            addCriterion("company_labels >", value, "companyLabels");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsGreaterThanOrEqualTo(String value) {
            addCriterion("company_labels >=", value, "companyLabels");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsLessThan(String value) {
            addCriterion("company_labels <", value, "companyLabels");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsLessThanOrEqualTo(String value) {
            addCriterion("company_labels <=", value, "companyLabels");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsLike(String value) {
            addCriterion("company_labels like", value, "companyLabels");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsNotLike(String value) {
            addCriterion("company_labels not like", value, "companyLabels");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsIn(List<String> values) {
            addCriterion("company_labels in", values, "companyLabels");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsNotIn(List<String> values) {
            addCriterion("company_labels not in", values, "companyLabels");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsBetween(String value1, String value2) {
            addCriterion("company_labels between", value1, value2, "companyLabels");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelsNotBetween(String value1, String value2) {
            addCriterion("company_labels not between", value1, value2, "companyLabels");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordIsNull() {
            addCriterion("company_password is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordIsNotNull() {
            addCriterion("company_password is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordEqualTo(String value) {
            addCriterion("company_password =", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordNotEqualTo(String value) {
            addCriterion("company_password <>", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordGreaterThan(String value) {
            addCriterion("company_password >", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("company_password >=", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordLessThan(String value) {
            addCriterion("company_password <", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordLessThanOrEqualTo(String value) {
            addCriterion("company_password <=", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordLike(String value) {
            addCriterion("company_password like", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordNotLike(String value) {
            addCriterion("company_password not like", value, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordIn(List<String> values) {
            addCriterion("company_password in", values, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordNotIn(List<String> values) {
            addCriterion("company_password not in", values, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordBetween(String value1, String value2) {
            addCriterion("company_password between", value1, value2, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyPasswordNotBetween(String value1, String value2) {
            addCriterion("company_password not between", value1, value2, "companyPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyStateIsNull() {
            addCriterion("company_state is null");
            return (Criteria) this;
        }

        public Criteria andCompanyStateIsNotNull() {
            addCriterion("company_state is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyStateEqualTo(Integer value) {
            addCriterion("company_state =", value, "companyState");
            return (Criteria) this;
        }

        public Criteria andCompanyStateNotEqualTo(Integer value) {
            addCriterion("company_state <>", value, "companyState");
            return (Criteria) this;
        }

        public Criteria andCompanyStateGreaterThan(Integer value) {
            addCriterion("company_state >", value, "companyState");
            return (Criteria) this;
        }

        public Criteria andCompanyStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_state >=", value, "companyState");
            return (Criteria) this;
        }

        public Criteria andCompanyStateLessThan(Integer value) {
            addCriterion("company_state <", value, "companyState");
            return (Criteria) this;
        }

        public Criteria andCompanyStateLessThanOrEqualTo(Integer value) {
            addCriterion("company_state <=", value, "companyState");
            return (Criteria) this;
        }

        public Criteria andCompanyStateIn(List<Integer> values) {
            addCriterion("company_state in", values, "companyState");
            return (Criteria) this;
        }

        public Criteria andCompanyStateNotIn(List<Integer> values) {
            addCriterion("company_state not in", values, "companyState");
            return (Criteria) this;
        }

        public Criteria andCompanyStateBetween(Integer value1, Integer value2) {
            addCriterion("company_state between", value1, value2, "companyState");
            return (Criteria) this;
        }

        public Criteria andCompanyStateNotBetween(Integer value1, Integer value2) {
            addCriterion("company_state not between", value1, value2, "companyState");
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