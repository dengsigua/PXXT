package com.orders.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrdersIdIsNull() {
            addCriterion("orders_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNotNull() {
            addCriterion("orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdEqualTo(String value) {
            addCriterion("orders_id =", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotEqualTo(String value) {
            addCriterion("orders_id <>", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThan(String value) {
            addCriterion("orders_id >", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThanOrEqualTo(String value) {
            addCriterion("orders_id >=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThan(String value) {
            addCriterion("orders_id <", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThanOrEqualTo(String value) {
            addCriterion("orders_id <=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLike(String value) {
            addCriterion("orders_id like", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotLike(String value) {
            addCriterion("orders_id not like", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIn(List<String> values) {
            addCriterion("orders_id in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotIn(List<String> values) {
            addCriterion("orders_id not in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdBetween(String value1, String value2) {
            addCriterion("orders_id between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotBetween(String value1, String value2) {
            addCriterion("orders_id not between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andClassIdsIsNull() {
            addCriterion("class_ids is null");
            return (Criteria) this;
        }

        public Criteria andClassIdsIsNotNull() {
            addCriterion("class_ids is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdsEqualTo(String value) {
            addCriterion("class_ids =", value, "classIds");
            return (Criteria) this;
        }

        public Criteria andClassIdsNotEqualTo(String value) {
            addCriterion("class_ids <>", value, "classIds");
            return (Criteria) this;
        }

        public Criteria andClassIdsGreaterThan(String value) {
            addCriterion("class_ids >", value, "classIds");
            return (Criteria) this;
        }

        public Criteria andClassIdsGreaterThanOrEqualTo(String value) {
            addCriterion("class_ids >=", value, "classIds");
            return (Criteria) this;
        }

        public Criteria andClassIdsLessThan(String value) {
            addCriterion("class_ids <", value, "classIds");
            return (Criteria) this;
        }

        public Criteria andClassIdsLessThanOrEqualTo(String value) {
            addCriterion("class_ids <=", value, "classIds");
            return (Criteria) this;
        }

        public Criteria andClassIdsLike(String value) {
            addCriterion("class_ids like", value, "classIds");
            return (Criteria) this;
        }

        public Criteria andClassIdsNotLike(String value) {
            addCriterion("class_ids not like", value, "classIds");
            return (Criteria) this;
        }

        public Criteria andClassIdsIn(List<String> values) {
            addCriterion("class_ids in", values, "classIds");
            return (Criteria) this;
        }

        public Criteria andClassIdsNotIn(List<String> values) {
            addCriterion("class_ids not in", values, "classIds");
            return (Criteria) this;
        }

        public Criteria andClassIdsBetween(String value1, String value2) {
            addCriterion("class_ids between", value1, value2, "classIds");
            return (Criteria) this;
        }

        public Criteria andClassIdsNotBetween(String value1, String value2) {
            addCriterion("class_ids not between", value1, value2, "classIds");
            return (Criteria) this;
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

        public Criteria andOrdersTimeIsNull() {
            addCriterion("orders_time is null");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeIsNotNull() {
            addCriterion("orders_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeEqualTo(Date value) {
            addCriterion("orders_time =", value, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeNotEqualTo(Date value) {
            addCriterion("orders_time <>", value, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeGreaterThan(Date value) {
            addCriterion("orders_time >", value, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orders_time >=", value, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeLessThan(Date value) {
            addCriterion("orders_time <", value, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeLessThanOrEqualTo(Date value) {
            addCriterion("orders_time <=", value, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeIn(List<Date> values) {
            addCriterion("orders_time in", values, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeNotIn(List<Date> values) {
            addCriterion("orders_time not in", values, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeBetween(Date value1, Date value2) {
            addCriterion("orders_time between", value1, value2, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTimeNotBetween(Date value1, Date value2) {
            addCriterion("orders_time not between", value1, value2, "ordersTime");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceIsNull() {
            addCriterion("orders_price is null");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceIsNotNull() {
            addCriterion("orders_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceEqualTo(Float value) {
            addCriterion("orders_price =", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceNotEqualTo(Float value) {
            addCriterion("orders_price <>", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceGreaterThan(Float value) {
            addCriterion("orders_price >", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("orders_price >=", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceLessThan(Float value) {
            addCriterion("orders_price <", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceLessThanOrEqualTo(Float value) {
            addCriterion("orders_price <=", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceIn(List<Float> values) {
            addCriterion("orders_price in", values, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceNotIn(List<Float> values) {
            addCriterion("orders_price not in", values, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceBetween(Float value1, Float value2) {
            addCriterion("orders_price between", value1, value2, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceNotBetween(Float value1, Float value2) {
            addCriterion("orders_price not between", value1, value2, "ordersPrice");
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