package com.period.pojo;

import java.util.ArrayList;
import java.util.List;

public class PeriodExample {
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

	public PeriodExample() {
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

        public Criteria andPeriodIdIsNull() {
            addCriterion("period_id is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIdIsNotNull() {
            addCriterion("period_id is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodIdEqualTo(Integer value) {
            addCriterion("period_id =", value, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdNotEqualTo(Integer value) {
            addCriterion("period_id <>", value, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdGreaterThan(Integer value) {
            addCriterion("period_id >", value, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_id >=", value, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdLessThan(Integer value) {
            addCriterion("period_id <", value, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdLessThanOrEqualTo(Integer value) {
            addCriterion("period_id <=", value, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdIn(List<Integer> values) {
            addCriterion("period_id in", values, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdNotIn(List<Integer> values) {
            addCriterion("period_id not in", values, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdBetween(Integer value1, Integer value2) {
            addCriterion("period_id between", value1, value2, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("period_id not between", value1, value2, "periodId");
            return (Criteria) this;
        }

        public Criteria andClassesIdIsNull() {
            addCriterion("classes_id is null");
            return (Criteria) this;
        }

        public Criteria andClassesIdIsNotNull() {
            addCriterion("classes_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassesIdEqualTo(Integer value) {
            addCriterion("classes_id =", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotEqualTo(Integer value) {
            addCriterion("classes_id <>", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThan(Integer value) {
            addCriterion("classes_id >", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classes_id >=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThan(Integer value) {
            addCriterion("classes_id <", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThanOrEqualTo(Integer value) {
            addCriterion("classes_id <=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdIn(List<Integer> values) {
            addCriterion("classes_id in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotIn(List<Integer> values) {
            addCriterion("classes_id not in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdBetween(Integer value1, Integer value2) {
            addCriterion("classes_id between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classes_id not between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleIsNull() {
            addCriterion("period_title is null");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleIsNotNull() {
            addCriterion("period_title is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleEqualTo(String value) {
            addCriterion("period_title =", value, "periodTitle");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleNotEqualTo(String value) {
            addCriterion("period_title <>", value, "periodTitle");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleGreaterThan(String value) {
            addCriterion("period_title >", value, "periodTitle");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleGreaterThanOrEqualTo(String value) {
            addCriterion("period_title >=", value, "periodTitle");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleLessThan(String value) {
            addCriterion("period_title <", value, "periodTitle");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleLessThanOrEqualTo(String value) {
            addCriterion("period_title <=", value, "periodTitle");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleLike(String value) {
            addCriterion("period_title like", value, "periodTitle");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleNotLike(String value) {
            addCriterion("period_title not like", value, "periodTitle");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleIn(List<String> values) {
            addCriterion("period_title in", values, "periodTitle");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleNotIn(List<String> values) {
            addCriterion("period_title not in", values, "periodTitle");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleBetween(String value1, String value2) {
            addCriterion("period_title between", value1, value2, "periodTitle");
            return (Criteria) this;
        }

        public Criteria andPeriodTitleNotBetween(String value1, String value2) {
            addCriterion("period_title not between", value1, value2, "periodTitle");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseIsNull() {
            addCriterion("period_resourse is null");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseIsNotNull() {
            addCriterion("period_resourse is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseEqualTo(String value) {
            addCriterion("period_resourse =", value, "periodResourse");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseNotEqualTo(String value) {
            addCriterion("period_resourse <>", value, "periodResourse");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseGreaterThan(String value) {
            addCriterion("period_resourse >", value, "periodResourse");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseGreaterThanOrEqualTo(String value) {
            addCriterion("period_resourse >=", value, "periodResourse");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseLessThan(String value) {
            addCriterion("period_resourse <", value, "periodResourse");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseLessThanOrEqualTo(String value) {
            addCriterion("period_resourse <=", value, "periodResourse");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseLike(String value) {
            addCriterion("period_resourse like", value, "periodResourse");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseNotLike(String value) {
            addCriterion("period_resourse not like", value, "periodResourse");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseIn(List<String> values) {
            addCriterion("period_resourse in", values, "periodResourse");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseNotIn(List<String> values) {
            addCriterion("period_resourse not in", values, "periodResourse");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseBetween(String value1, String value2) {
            addCriterion("period_resourse between", value1, value2, "periodResourse");
            return (Criteria) this;
        }

        public Criteria andPeriodResourseNotBetween(String value1, String value2) {
            addCriterion("period_resourse not between", value1, value2, "periodResourse");
            return (Criteria) this;
        }

        public Criteria andPeriodIndexIsNull() {
            addCriterion("period_index is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIndexIsNotNull() {
            addCriterion("period_index is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodIndexEqualTo(Integer value) {
            addCriterion("period_index =", value, "periodIndex");
            return (Criteria) this;
        }

        public Criteria andPeriodIndexNotEqualTo(Integer value) {
            addCriterion("period_index <>", value, "periodIndex");
            return (Criteria) this;
        }

        public Criteria andPeriodIndexGreaterThan(Integer value) {
            addCriterion("period_index >", value, "periodIndex");
            return (Criteria) this;
        }

        public Criteria andPeriodIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_index >=", value, "periodIndex");
            return (Criteria) this;
        }

        public Criteria andPeriodIndexLessThan(Integer value) {
            addCriterion("period_index <", value, "periodIndex");
            return (Criteria) this;
        }

        public Criteria andPeriodIndexLessThanOrEqualTo(Integer value) {
            addCriterion("period_index <=", value, "periodIndex");
            return (Criteria) this;
        }

        public Criteria andPeriodIndexIn(List<Integer> values) {
            addCriterion("period_index in", values, "periodIndex");
            return (Criteria) this;
        }

        public Criteria andPeriodIndexNotIn(List<Integer> values) {
            addCriterion("period_index not in", values, "periodIndex");
            return (Criteria) this;
        }

        public Criteria andPeriodIndexBetween(Integer value1, Integer value2) {
            addCriterion("period_index between", value1, value2, "periodIndex");
            return (Criteria) this;
        }

        public Criteria andPeriodIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("period_index not between", value1, value2, "periodIndex");
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