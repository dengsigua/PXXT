package com.classes.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassesExample {
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

	public ClassesExample() {
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

        public Criteria andClassTitleIsNull() {
            addCriterion("class_title is null");
            return (Criteria) this;
        }

        public Criteria andClassTitleIsNotNull() {
            addCriterion("class_title is not null");
            return (Criteria) this;
        }

        public Criteria andClassTitleEqualTo(String value) {
            addCriterion("class_title =", value, "classTitle");
            return (Criteria) this;
        }

        public Criteria andClassTitleNotEqualTo(String value) {
            addCriterion("class_title <>", value, "classTitle");
            return (Criteria) this;
        }

        public Criteria andClassTitleGreaterThan(String value) {
            addCriterion("class_title >", value, "classTitle");
            return (Criteria) this;
        }

        public Criteria andClassTitleGreaterThanOrEqualTo(String value) {
            addCriterion("class_title >=", value, "classTitle");
            return (Criteria) this;
        }

        public Criteria andClassTitleLessThan(String value) {
            addCriterion("class_title <", value, "classTitle");
            return (Criteria) this;
        }

        public Criteria andClassTitleLessThanOrEqualTo(String value) {
            addCriterion("class_title <=", value, "classTitle");
            return (Criteria) this;
        }

        public Criteria andClassTitleLike(String value) {
            addCriterion("class_title like", value, "classTitle");
            return (Criteria) this;
        }

        public Criteria andClassTitleNotLike(String value) {
            addCriterion("class_title not like", value, "classTitle");
            return (Criteria) this;
        }

        public Criteria andClassTitleIn(List<String> values) {
            addCriterion("class_title in", values, "classTitle");
            return (Criteria) this;
        }

        public Criteria andClassTitleNotIn(List<String> values) {
            addCriterion("class_title not in", values, "classTitle");
            return (Criteria) this;
        }

        public Criteria andClassTitleBetween(String value1, String value2) {
            addCriterion("class_title between", value1, value2, "classTitle");
            return (Criteria) this;
        }

        public Criteria andClassTitleNotBetween(String value1, String value2) {
            addCriterion("class_title not between", value1, value2, "classTitle");
            return (Criteria) this;
        }

        public Criteria andClassSellPointIsNull() {
            addCriterion("class_sell_point is null");
            return (Criteria) this;
        }

        public Criteria andClassSellPointIsNotNull() {
            addCriterion("class_sell_point is not null");
            return (Criteria) this;
        }

        public Criteria andClassSellPointEqualTo(String value) {
            addCriterion("class_sell_point =", value, "classSellPoint");
            return (Criteria) this;
        }

        public Criteria andClassSellPointNotEqualTo(String value) {
            addCriterion("class_sell_point <>", value, "classSellPoint");
            return (Criteria) this;
        }

        public Criteria andClassSellPointGreaterThan(String value) {
            addCriterion("class_sell_point >", value, "classSellPoint");
            return (Criteria) this;
        }

        public Criteria andClassSellPointGreaterThanOrEqualTo(String value) {
            addCriterion("class_sell_point >=", value, "classSellPoint");
            return (Criteria) this;
        }

        public Criteria andClassSellPointLessThan(String value) {
            addCriterion("class_sell_point <", value, "classSellPoint");
            return (Criteria) this;
        }

        public Criteria andClassSellPointLessThanOrEqualTo(String value) {
            addCriterion("class_sell_point <=", value, "classSellPoint");
            return (Criteria) this;
        }

        public Criteria andClassSellPointLike(String value) {
            addCriterion("class_sell_point like", value, "classSellPoint");
            return (Criteria) this;
        }

        public Criteria andClassSellPointNotLike(String value) {
            addCriterion("class_sell_point not like", value, "classSellPoint");
            return (Criteria) this;
        }

        public Criteria andClassSellPointIn(List<String> values) {
            addCriterion("class_sell_point in", values, "classSellPoint");
            return (Criteria) this;
        }

        public Criteria andClassSellPointNotIn(List<String> values) {
            addCriterion("class_sell_point not in", values, "classSellPoint");
            return (Criteria) this;
        }

        public Criteria andClassSellPointBetween(String value1, String value2) {
            addCriterion("class_sell_point between", value1, value2, "classSellPoint");
            return (Criteria) this;
        }

        public Criteria andClassSellPointNotBetween(String value1, String value2) {
            addCriterion("class_sell_point not between", value1, value2, "classSellPoint");
            return (Criteria) this;
        }

        public Criteria andClassPriceIsNull() {
            addCriterion("class_price is null");
            return (Criteria) this;
        }

        public Criteria andClassPriceIsNotNull() {
            addCriterion("class_price is not null");
            return (Criteria) this;
        }

        public Criteria andClassPriceEqualTo(Long value) {
            addCriterion("class_price =", value, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceNotEqualTo(Long value) {
            addCriterion("class_price <>", value, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceGreaterThan(Long value) {
            addCriterion("class_price >", value, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("class_price >=", value, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceLessThan(Long value) {
            addCriterion("class_price <", value, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceLessThanOrEqualTo(Long value) {
            addCriterion("class_price <=", value, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceIn(List<Long> values) {
            addCriterion("class_price in", values, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceNotIn(List<Long> values) {
            addCriterion("class_price not in", values, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceBetween(Long value1, Long value2) {
            addCriterion("class_price between", value1, value2, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceNotBetween(Long value1, Long value2) {
            addCriterion("class_price not between", value1, value2, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassImgIsNull() {
            addCriterion("class_img is null");
            return (Criteria) this;
        }

        public Criteria andClassImgIsNotNull() {
            addCriterion("class_img is not null");
            return (Criteria) this;
        }

        public Criteria andClassImgEqualTo(String value) {
            addCriterion("class_img =", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgNotEqualTo(String value) {
            addCriterion("class_img <>", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgGreaterThan(String value) {
            addCriterion("class_img >", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgGreaterThanOrEqualTo(String value) {
            addCriterion("class_img >=", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgLessThan(String value) {
            addCriterion("class_img <", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgLessThanOrEqualTo(String value) {
            addCriterion("class_img <=", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgLike(String value) {
            addCriterion("class_img like", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgNotLike(String value) {
            addCriterion("class_img not like", value, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgIn(List<String> values) {
            addCriterion("class_img in", values, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgNotIn(List<String> values) {
            addCriterion("class_img not in", values, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgBetween(String value1, String value2) {
            addCriterion("class_img between", value1, value2, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassImgNotBetween(String value1, String value2) {
            addCriterion("class_img not between", value1, value2, "classImg");
            return (Criteria) this;
        }

        public Criteria andClassCidIsNull() {
            addCriterion("class_cid is null");
            return (Criteria) this;
        }

        public Criteria andClassCidIsNotNull() {
            addCriterion("class_cid is not null");
            return (Criteria) this;
        }

        public Criteria andClassCidEqualTo(String value) {
            addCriterion("class_cid =", value, "classCid");
            return (Criteria) this;
        }

        public Criteria andClassCidNotEqualTo(String value) {
            addCriterion("class_cid <>", value, "classCid");
            return (Criteria) this;
        }

        public Criteria andClassCidGreaterThan(String value) {
            addCriterion("class_cid >", value, "classCid");
            return (Criteria) this;
        }

        public Criteria andClassCidGreaterThanOrEqualTo(String value) {
            addCriterion("class_cid >=", value, "classCid");
            return (Criteria) this;
        }

        public Criteria andClassCidLessThan(String value) {
            addCriterion("class_cid <", value, "classCid");
            return (Criteria) this;
        }

        public Criteria andClassCidLessThanOrEqualTo(String value) {
            addCriterion("class_cid <=", value, "classCid");
            return (Criteria) this;
        }

        public Criteria andClassCidLike(String value) {
            addCriterion("class_cid like", value, "classCid");
            return (Criteria) this;
        }

        public Criteria andClassCidNotLike(String value) {
            addCriterion("class_cid not like", value, "classCid");
            return (Criteria) this;
        }

        public Criteria andClassCidIn(List<String> values) {
            addCriterion("class_cid in", values, "classCid");
            return (Criteria) this;
        }

        public Criteria andClassCidNotIn(List<String> values) {
            addCriterion("class_cid not in", values, "classCid");
            return (Criteria) this;
        }

        public Criteria andClassCidBetween(String value1, String value2) {
            addCriterion("class_cid between", value1, value2, "classCid");
            return (Criteria) this;
        }

        public Criteria andClassCidNotBetween(String value1, String value2) {
            addCriterion("class_cid not between", value1, value2, "classCid");
            return (Criteria) this;
        }

        public Criteria andClassStatusIsNull() {
            addCriterion("class_status is null");
            return (Criteria) this;
        }

        public Criteria andClassStatusIsNotNull() {
            addCriterion("class_status is not null");
            return (Criteria) this;
        }

        public Criteria andClassStatusEqualTo(Byte value) {
            addCriterion("class_status =", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusNotEqualTo(Byte value) {
            addCriterion("class_status <>", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusGreaterThan(Byte value) {
            addCriterion("class_status >", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("class_status >=", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusLessThan(Byte value) {
            addCriterion("class_status <", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusLessThanOrEqualTo(Byte value) {
            addCriterion("class_status <=", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusIn(List<Byte> values) {
            addCriterion("class_status in", values, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusNotIn(List<Byte> values) {
            addCriterion("class_status not in", values, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusBetween(Byte value1, Byte value2) {
            addCriterion("class_status between", value1, value2, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("class_status not between", value1, value2, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassCreatedIsNull() {
            addCriterion("class_created is null");
            return (Criteria) this;
        }

        public Criteria andClassCreatedIsNotNull() {
            addCriterion("class_created is not null");
            return (Criteria) this;
        }

        public Criteria andClassCreatedEqualTo(Date value) {
            addCriterion("class_created =", value, "classCreated");
            return (Criteria) this;
        }

        public Criteria andClassCreatedNotEqualTo(Date value) {
            addCriterion("class_created <>", value, "classCreated");
            return (Criteria) this;
        }

        public Criteria andClassCreatedGreaterThan(Date value) {
            addCriterion("class_created >", value, "classCreated");
            return (Criteria) this;
        }

        public Criteria andClassCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("class_created >=", value, "classCreated");
            return (Criteria) this;
        }

        public Criteria andClassCreatedLessThan(Date value) {
            addCriterion("class_created <", value, "classCreated");
            return (Criteria) this;
        }

        public Criteria andClassCreatedLessThanOrEqualTo(Date value) {
            addCriterion("class_created <=", value, "classCreated");
            return (Criteria) this;
        }

        public Criteria andClassCreatedIn(List<Date> values) {
            addCriterion("class_created in", values, "classCreated");
            return (Criteria) this;
        }

        public Criteria andClassCreatedNotIn(List<Date> values) {
            addCriterion("class_created not in", values, "classCreated");
            return (Criteria) this;
        }

        public Criteria andClassCreatedBetween(Date value1, Date value2) {
            addCriterion("class_created between", value1, value2, "classCreated");
            return (Criteria) this;
        }

        public Criteria andClassCreatedNotBetween(Date value1, Date value2) {
            addCriterion("class_created not between", value1, value2, "classCreated");
            return (Criteria) this;
        }

        public Criteria andClassUpdateIsNull() {
            addCriterion("class_update is null");
            return (Criteria) this;
        }

        public Criteria andClassUpdateIsNotNull() {
            addCriterion("class_update is not null");
            return (Criteria) this;
        }

        public Criteria andClassUpdateEqualTo(Date value) {
            addCriterion("class_update =", value, "classUpdate");
            return (Criteria) this;
        }

        public Criteria andClassUpdateNotEqualTo(Date value) {
            addCriterion("class_update <>", value, "classUpdate");
            return (Criteria) this;
        }

        public Criteria andClassUpdateGreaterThan(Date value) {
            addCriterion("class_update >", value, "classUpdate");
            return (Criteria) this;
        }

        public Criteria andClassUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("class_update >=", value, "classUpdate");
            return (Criteria) this;
        }

        public Criteria andClassUpdateLessThan(Date value) {
            addCriterion("class_update <", value, "classUpdate");
            return (Criteria) this;
        }

        public Criteria andClassUpdateLessThanOrEqualTo(Date value) {
            addCriterion("class_update <=", value, "classUpdate");
            return (Criteria) this;
        }

        public Criteria andClassUpdateIn(List<Date> values) {
            addCriterion("class_update in", values, "classUpdate");
            return (Criteria) this;
        }

        public Criteria andClassUpdateNotIn(List<Date> values) {
            addCriterion("class_update not in", values, "classUpdate");
            return (Criteria) this;
        }

        public Criteria andClassUpdateBetween(Date value1, Date value2) {
            addCriterion("class_update between", value1, value2, "classUpdate");
            return (Criteria) this;
        }

        public Criteria andClassUpdateNotBetween(Date value1, Date value2) {
            addCriterion("class_update not between", value1, value2, "classUpdate");
            return (Criteria) this;
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