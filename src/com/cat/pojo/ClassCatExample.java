package com.cat.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassCatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassCatExample() {
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

        public Criteria andClassCatIdIsNull() {
            addCriterion("class_cat_id is null");
            return (Criteria) this;
        }

        public Criteria andClassCatIdIsNotNull() {
            addCriterion("class_cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassCatIdEqualTo(Long value) {
            addCriterion("class_cat_id =", value, "classCatId");
            return (Criteria) this;
        }

        public Criteria andClassCatIdNotEqualTo(Long value) {
            addCriterion("class_cat_id <>", value, "classCatId");
            return (Criteria) this;
        }

        public Criteria andClassCatIdGreaterThan(Long value) {
            addCriterion("class_cat_id >", value, "classCatId");
            return (Criteria) this;
        }

        public Criteria andClassCatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("class_cat_id >=", value, "classCatId");
            return (Criteria) this;
        }

        public Criteria andClassCatIdLessThan(Long value) {
            addCriterion("class_cat_id <", value, "classCatId");
            return (Criteria) this;
        }

        public Criteria andClassCatIdLessThanOrEqualTo(Long value) {
            addCriterion("class_cat_id <=", value, "classCatId");
            return (Criteria) this;
        }

        public Criteria andClassCatIdIn(List<Long> values) {
            addCriterion("class_cat_id in", values, "classCatId");
            return (Criteria) this;
        }

        public Criteria andClassCatIdNotIn(List<Long> values) {
            addCriterion("class_cat_id not in", values, "classCatId");
            return (Criteria) this;
        }

        public Criteria andClassCatIdBetween(Long value1, Long value2) {
            addCriterion("class_cat_id between", value1, value2, "classCatId");
            return (Criteria) this;
        }

        public Criteria andClassCatIdNotBetween(Long value1, Long value2) {
            addCriterion("class_cat_id not between", value1, value2, "classCatId");
            return (Criteria) this;
        }

        public Criteria andClassCatParentIdIsNull() {
            addCriterion("class_cat_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andClassCatParentIdIsNotNull() {
            addCriterion("class_cat_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassCatParentIdEqualTo(Long value) {
            addCriterion("class_cat_parent_id =", value, "classCatParentId");
            return (Criteria) this;
        }

        public Criteria andClassCatParentIdNotEqualTo(Long value) {
            addCriterion("class_cat_parent_id <>", value, "classCatParentId");
            return (Criteria) this;
        }

        public Criteria andClassCatParentIdGreaterThan(Long value) {
            addCriterion("class_cat_parent_id >", value, "classCatParentId");
            return (Criteria) this;
        }

        public Criteria andClassCatParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("class_cat_parent_id >=", value, "classCatParentId");
            return (Criteria) this;
        }

        public Criteria andClassCatParentIdLessThan(Long value) {
            addCriterion("class_cat_parent_id <", value, "classCatParentId");
            return (Criteria) this;
        }

        public Criteria andClassCatParentIdLessThanOrEqualTo(Long value) {
            addCriterion("class_cat_parent_id <=", value, "classCatParentId");
            return (Criteria) this;
        }

        public Criteria andClassCatParentIdIn(List<Long> values) {
            addCriterion("class_cat_parent_id in", values, "classCatParentId");
            return (Criteria) this;
        }

        public Criteria andClassCatParentIdNotIn(List<Long> values) {
            addCriterion("class_cat_parent_id not in", values, "classCatParentId");
            return (Criteria) this;
        }

        public Criteria andClassCatParentIdBetween(Long value1, Long value2) {
            addCriterion("class_cat_parent_id between", value1, value2, "classCatParentId");
            return (Criteria) this;
        }

        public Criteria andClassCatParentIdNotBetween(Long value1, Long value2) {
            addCriterion("class_cat_parent_id not between", value1, value2, "classCatParentId");
            return (Criteria) this;
        }

        public Criteria andClassCatNameIsNull() {
            addCriterion("class_cat_name is null");
            return (Criteria) this;
        }

        public Criteria andClassCatNameIsNotNull() {
            addCriterion("class_cat_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassCatNameEqualTo(String value) {
            addCriterion("class_cat_name =", value, "classCatName");
            return (Criteria) this;
        }

        public Criteria andClassCatNameNotEqualTo(String value) {
            addCriterion("class_cat_name <>", value, "classCatName");
            return (Criteria) this;
        }

        public Criteria andClassCatNameGreaterThan(String value) {
            addCriterion("class_cat_name >", value, "classCatName");
            return (Criteria) this;
        }

        public Criteria andClassCatNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_cat_name >=", value, "classCatName");
            return (Criteria) this;
        }

        public Criteria andClassCatNameLessThan(String value) {
            addCriterion("class_cat_name <", value, "classCatName");
            return (Criteria) this;
        }

        public Criteria andClassCatNameLessThanOrEqualTo(String value) {
            addCriterion("class_cat_name <=", value, "classCatName");
            return (Criteria) this;
        }

        public Criteria andClassCatNameLike(String value) {
            addCriterion("class_cat_name like", value, "classCatName");
            return (Criteria) this;
        }

        public Criteria andClassCatNameNotLike(String value) {
            addCriterion("class_cat_name not like", value, "classCatName");
            return (Criteria) this;
        }

        public Criteria andClassCatNameIn(List<String> values) {
            addCriterion("class_cat_name in", values, "classCatName");
            return (Criteria) this;
        }

        public Criteria andClassCatNameNotIn(List<String> values) {
            addCriterion("class_cat_name not in", values, "classCatName");
            return (Criteria) this;
        }

        public Criteria andClassCatNameBetween(String value1, String value2) {
            addCriterion("class_cat_name between", value1, value2, "classCatName");
            return (Criteria) this;
        }

        public Criteria andClassCatNameNotBetween(String value1, String value2) {
            addCriterion("class_cat_name not between", value1, value2, "classCatName");
            return (Criteria) this;
        }

        public Criteria andClassCatStatusIsNull() {
            addCriterion("class_cat_status is null");
            return (Criteria) this;
        }

        public Criteria andClassCatStatusIsNotNull() {
            addCriterion("class_cat_status is not null");
            return (Criteria) this;
        }

        public Criteria andClassCatStatusEqualTo(Integer value) {
            addCriterion("class_cat_status =", value, "classCatStatus");
            return (Criteria) this;
        }

        public Criteria andClassCatStatusNotEqualTo(Integer value) {
            addCriterion("class_cat_status <>", value, "classCatStatus");
            return (Criteria) this;
        }

        public Criteria andClassCatStatusGreaterThan(Integer value) {
            addCriterion("class_cat_status >", value, "classCatStatus");
            return (Criteria) this;
        }

        public Criteria andClassCatStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_cat_status >=", value, "classCatStatus");
            return (Criteria) this;
        }

        public Criteria andClassCatStatusLessThan(Integer value) {
            addCriterion("class_cat_status <", value, "classCatStatus");
            return (Criteria) this;
        }

        public Criteria andClassCatStatusLessThanOrEqualTo(Integer value) {
            addCriterion("class_cat_status <=", value, "classCatStatus");
            return (Criteria) this;
        }

        public Criteria andClassCatStatusIn(List<Integer> values) {
            addCriterion("class_cat_status in", values, "classCatStatus");
            return (Criteria) this;
        }

        public Criteria andClassCatStatusNotIn(List<Integer> values) {
            addCriterion("class_cat_status not in", values, "classCatStatus");
            return (Criteria) this;
        }

        public Criteria andClassCatStatusBetween(Integer value1, Integer value2) {
            addCriterion("class_cat_status between", value1, value2, "classCatStatus");
            return (Criteria) this;
        }

        public Criteria andClassCatStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("class_cat_status not between", value1, value2, "classCatStatus");
            return (Criteria) this;
        }

        public Criteria andClassCatSortOrderIsNull() {
            addCriterion("class_cat_sort_order is null");
            return (Criteria) this;
        }

        public Criteria andClassCatSortOrderIsNotNull() {
            addCriterion("class_cat_sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andClassCatSortOrderEqualTo(Integer value) {
            addCriterion("class_cat_sort_order =", value, "classCatSortOrder");
            return (Criteria) this;
        }

        public Criteria andClassCatSortOrderNotEqualTo(Integer value) {
            addCriterion("class_cat_sort_order <>", value, "classCatSortOrder");
            return (Criteria) this;
        }

        public Criteria andClassCatSortOrderGreaterThan(Integer value) {
            addCriterion("class_cat_sort_order >", value, "classCatSortOrder");
            return (Criteria) this;
        }

        public Criteria andClassCatSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_cat_sort_order >=", value, "classCatSortOrder");
            return (Criteria) this;
        }

        public Criteria andClassCatSortOrderLessThan(Integer value) {
            addCriterion("class_cat_sort_order <", value, "classCatSortOrder");
            return (Criteria) this;
        }

        public Criteria andClassCatSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("class_cat_sort_order <=", value, "classCatSortOrder");
            return (Criteria) this;
        }

        public Criteria andClassCatSortOrderIn(List<Integer> values) {
            addCriterion("class_cat_sort_order in", values, "classCatSortOrder");
            return (Criteria) this;
        }

        public Criteria andClassCatSortOrderNotIn(List<Integer> values) {
            addCriterion("class_cat_sort_order not in", values, "classCatSortOrder");
            return (Criteria) this;
        }

        public Criteria andClassCatSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("class_cat_sort_order between", value1, value2, "classCatSortOrder");
            return (Criteria) this;
        }

        public Criteria andClassCatSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("class_cat_sort_order not between", value1, value2, "classCatSortOrder");
            return (Criteria) this;
        }

        public Criteria andClassCatIsParentIsNull() {
            addCriterion("class_cat_is_parent is null");
            return (Criteria) this;
        }

        public Criteria andClassCatIsParentIsNotNull() {
            addCriterion("class_cat_is_parent is not null");
            return (Criteria) this;
        }

        public Criteria andClassCatIsParentEqualTo(Boolean value) {
            addCriterion("class_cat_is_parent =", value, "classCatIsParent");
            return (Criteria) this;
        }

        public Criteria andClassCatIsParentNotEqualTo(Boolean value) {
            addCriterion("class_cat_is_parent <>", value, "classCatIsParent");
            return (Criteria) this;
        }

        public Criteria andClassCatIsParentGreaterThan(Boolean value) {
            addCriterion("class_cat_is_parent >", value, "classCatIsParent");
            return (Criteria) this;
        }

        public Criteria andClassCatIsParentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("class_cat_is_parent >=", value, "classCatIsParent");
            return (Criteria) this;
        }

        public Criteria andClassCatIsParentLessThan(Boolean value) {
            addCriterion("class_cat_is_parent <", value, "classCatIsParent");
            return (Criteria) this;
        }

        public Criteria andClassCatIsParentLessThanOrEqualTo(Boolean value) {
            addCriterion("class_cat_is_parent <=", value, "classCatIsParent");
            return (Criteria) this;
        }

        public Criteria andClassCatIsParentIn(List<Boolean> values) {
            addCriterion("class_cat_is_parent in", values, "classCatIsParent");
            return (Criteria) this;
        }

        public Criteria andClassCatIsParentNotIn(List<Boolean> values) {
            addCriterion("class_cat_is_parent not in", values, "classCatIsParent");
            return (Criteria) this;
        }

        public Criteria andClassCatIsParentBetween(Boolean value1, Boolean value2) {
            addCriterion("class_cat_is_parent between", value1, value2, "classCatIsParent");
            return (Criteria) this;
        }

        public Criteria andClassCatIsParentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("class_cat_is_parent not between", value1, value2, "classCatIsParent");
            return (Criteria) this;
        }

        public Criteria andClassCatCreatedIsNull() {
            addCriterion("class_cat_created is null");
            return (Criteria) this;
        }

        public Criteria andClassCatCreatedIsNotNull() {
            addCriterion("class_cat_created is not null");
            return (Criteria) this;
        }

        public Criteria andClassCatCreatedEqualTo(Date value) {
            addCriterion("class_cat_created =", value, "classCatCreated");
            return (Criteria) this;
        }

        public Criteria andClassCatCreatedNotEqualTo(Date value) {
            addCriterion("class_cat_created <>", value, "classCatCreated");
            return (Criteria) this;
        }

        public Criteria andClassCatCreatedGreaterThan(Date value) {
            addCriterion("class_cat_created >", value, "classCatCreated");
            return (Criteria) this;
        }

        public Criteria andClassCatCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("class_cat_created >=", value, "classCatCreated");
            return (Criteria) this;
        }

        public Criteria andClassCatCreatedLessThan(Date value) {
            addCriterion("class_cat_created <", value, "classCatCreated");
            return (Criteria) this;
        }

        public Criteria andClassCatCreatedLessThanOrEqualTo(Date value) {
            addCriterion("class_cat_created <=", value, "classCatCreated");
            return (Criteria) this;
        }

        public Criteria andClassCatCreatedIn(List<Date> values) {
            addCriterion("class_cat_created in", values, "classCatCreated");
            return (Criteria) this;
        }

        public Criteria andClassCatCreatedNotIn(List<Date> values) {
            addCriterion("class_cat_created not in", values, "classCatCreated");
            return (Criteria) this;
        }

        public Criteria andClassCatCreatedBetween(Date value1, Date value2) {
            addCriterion("class_cat_created between", value1, value2, "classCatCreated");
            return (Criteria) this;
        }

        public Criteria andClassCatCreatedNotBetween(Date value1, Date value2) {
            addCriterion("class_cat_created not between", value1, value2, "classCatCreated");
            return (Criteria) this;
        }

        public Criteria andClassCatUpdatedIsNull() {
            addCriterion("class_cat_updated is null");
            return (Criteria) this;
        }

        public Criteria andClassCatUpdatedIsNotNull() {
            addCriterion("class_cat_updated is not null");
            return (Criteria) this;
        }

        public Criteria andClassCatUpdatedEqualTo(Date value) {
            addCriterion("class_cat_updated =", value, "classCatUpdated");
            return (Criteria) this;
        }

        public Criteria andClassCatUpdatedNotEqualTo(Date value) {
            addCriterion("class_cat_updated <>", value, "classCatUpdated");
            return (Criteria) this;
        }

        public Criteria andClassCatUpdatedGreaterThan(Date value) {
            addCriterion("class_cat_updated >", value, "classCatUpdated");
            return (Criteria) this;
        }

        public Criteria andClassCatUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("class_cat_updated >=", value, "classCatUpdated");
            return (Criteria) this;
        }

        public Criteria andClassCatUpdatedLessThan(Date value) {
            addCriterion("class_cat_updated <", value, "classCatUpdated");
            return (Criteria) this;
        }

        public Criteria andClassCatUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("class_cat_updated <=", value, "classCatUpdated");
            return (Criteria) this;
        }

        public Criteria andClassCatUpdatedIn(List<Date> values) {
            addCriterion("class_cat_updated in", values, "classCatUpdated");
            return (Criteria) this;
        }

        public Criteria andClassCatUpdatedNotIn(List<Date> values) {
            addCriterion("class_cat_updated not in", values, "classCatUpdated");
            return (Criteria) this;
        }

        public Criteria andClassCatUpdatedBetween(Date value1, Date value2) {
            addCriterion("class_cat_updated between", value1, value2, "classCatUpdated");
            return (Criteria) this;
        }

        public Criteria andClassCatUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("class_cat_updated not between", value1, value2, "classCatUpdated");
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