package com.student.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
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


    public StudentExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Long value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Long value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Long value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Long value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Long value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Long> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Long> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Long value1, Long value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Long value1, Long value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentTelIsNull() {
            addCriterion("student_tel is null");
            return (Criteria) this;
        }

        public Criteria andStudentTelIsNotNull() {
            addCriterion("student_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStudentTelEqualTo(String value) {
            addCriterion("student_tel =", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelNotEqualTo(String value) {
            addCriterion("student_tel <>", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelGreaterThan(String value) {
            addCriterion("student_tel >", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelGreaterThanOrEqualTo(String value) {
            addCriterion("student_tel >=", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelLessThan(String value) {
            addCriterion("student_tel <", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelLessThanOrEqualTo(String value) {
            addCriterion("student_tel <=", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelLike(String value) {
            addCriterion("student_tel like", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelNotLike(String value) {
            addCriterion("student_tel not like", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelIn(List<String> values) {
            addCriterion("student_tel in", values, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelNotIn(List<String> values) {
            addCriterion("student_tel not in", values, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelBetween(String value1, String value2) {
            addCriterion("student_tel between", value1, value2, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelNotBetween(String value1, String value2) {
            addCriterion("student_tel not between", value1, value2, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIsNull() {
            addCriterion("student_password is null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIsNotNull() {
            addCriterion("student_password is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordEqualTo(String value) {
            addCriterion("student_password =", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotEqualTo(String value) {
            addCriterion("student_password <>", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordGreaterThan(String value) {
            addCriterion("student_password >", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("student_password >=", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLessThan(String value) {
            addCriterion("student_password <", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLessThanOrEqualTo(String value) {
            addCriterion("student_password <=", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLike(String value) {
            addCriterion("student_password like", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotLike(String value) {
            addCriterion("student_password not like", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIn(List<String> values) {
            addCriterion("student_password in", values, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotIn(List<String> values) {
            addCriterion("student_password not in", values, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordBetween(String value1, String value2) {
            addCriterion("student_password between", value1, value2, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotBetween(String value1, String value2) {
            addCriterion("student_password not between", value1, value2, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestIsNull() {
            addCriterion("student_intrest is null");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestIsNotNull() {
            addCriterion("student_intrest is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestEqualTo(String value) {
            addCriterion("student_intrest =", value, "studentIntrest");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestNotEqualTo(String value) {
            addCriterion("student_intrest <>", value, "studentIntrest");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestGreaterThan(String value) {
            addCriterion("student_intrest >", value, "studentIntrest");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestGreaterThanOrEqualTo(String value) {
            addCriterion("student_intrest >=", value, "studentIntrest");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestLessThan(String value) {
            addCriterion("student_intrest <", value, "studentIntrest");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestLessThanOrEqualTo(String value) {
            addCriterion("student_intrest <=", value, "studentIntrest");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestLike(String value) {
            addCriterion("student_intrest like", value, "studentIntrest");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestNotLike(String value) {
            addCriterion("student_intrest not like", value, "studentIntrest");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestIn(List<String> values) {
            addCriterion("student_intrest in", values, "studentIntrest");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestNotIn(List<String> values) {
            addCriterion("student_intrest not in", values, "studentIntrest");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestBetween(String value1, String value2) {
            addCriterion("student_intrest between", value1, value2, "studentIntrest");
            return (Criteria) this;
        }

        public Criteria andStudentIntrestNotBetween(String value1, String value2) {
            addCriterion("student_intrest not between", value1, value2, "studentIntrest");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNull() {
            addCriterion("student_email is null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNotNull() {
            addCriterion("student_email is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailEqualTo(String value) {
            addCriterion("student_email =", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotEqualTo(String value) {
            addCriterion("student_email <>", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThan(String value) {
            addCriterion("student_email >", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("student_email >=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThan(String value) {
            addCriterion("student_email <", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThanOrEqualTo(String value) {
            addCriterion("student_email <=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLike(String value) {
            addCriterion("student_email like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotLike(String value) {
            addCriterion("student_email not like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIn(List<String> values) {
            addCriterion("student_email in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotIn(List<String> values) {
            addCriterion("student_email not in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailBetween(String value1, String value2) {
            addCriterion("student_email between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotBetween(String value1, String value2) {
            addCriterion("student_email not between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentStateIsNull() {
            addCriterion("student_state is null");
            return (Criteria) this;
        }

        public Criteria andStudentStateIsNotNull() {
            addCriterion("student_state is not null");
            return (Criteria) this;
        }

        public Criteria andStudentStateEqualTo(Boolean value) {
            addCriterion("student_state =", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateNotEqualTo(Boolean value) {
            addCriterion("student_state <>", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateGreaterThan(Boolean value) {
            addCriterion("student_state >", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("student_state >=", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateLessThan(Boolean value) {
            addCriterion("student_state <", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateLessThanOrEqualTo(Boolean value) {
            addCriterion("student_state <=", value, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateIn(List<Boolean> values) {
            addCriterion("student_state in", values, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateNotIn(List<Boolean> values) {
            addCriterion("student_state not in", values, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateBetween(Boolean value1, Boolean value2) {
            addCriterion("student_state between", value1, value2, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("student_state not between", value1, value2, "studentState");
            return (Criteria) this;
        }

        public Criteria andStudentImgIsNull() {
            addCriterion("student_img is null");
            return (Criteria) this;
        }

        public Criteria andStudentImgIsNotNull() {
            addCriterion("student_img is not null");
            return (Criteria) this;
        }

        public Criteria andStudentImgEqualTo(String value) {
            addCriterion("student_img =", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgNotEqualTo(String value) {
            addCriterion("student_img <>", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgGreaterThan(String value) {
            addCriterion("student_img >", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgGreaterThanOrEqualTo(String value) {
            addCriterion("student_img >=", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgLessThan(String value) {
            addCriterion("student_img <", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgLessThanOrEqualTo(String value) {
            addCriterion("student_img <=", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgLike(String value) {
            addCriterion("student_img like", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgNotLike(String value) {
            addCriterion("student_img not like", value, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgIn(List<String> values) {
            addCriterion("student_img in", values, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgNotIn(List<String> values) {
            addCriterion("student_img not in", values, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgBetween(String value1, String value2) {
            addCriterion("student_img between", value1, value2, "studentImg");
            return (Criteria) this;
        }

        public Criteria andStudentImgNotBetween(String value1, String value2) {
            addCriterion("student_img not between", value1, value2, "studentImg");
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