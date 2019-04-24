package com.place.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PlaceExample {
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

    public PlaceExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPlaceIdIsNull() {
            addCriterion("place_id is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNotNull() {
            addCriterion("place_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdEqualTo(Long value) {
            addCriterion("place_id =", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotEqualTo(Long value) {
            addCriterion("place_id <>", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThan(Long value) {
            addCriterion("place_id >", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("place_id >=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThan(Long value) {
            addCriterion("place_id <", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThanOrEqualTo(Long value) {
            addCriterion("place_id <=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIn(List<Long> values) {
            addCriterion("place_id in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotIn(List<Long> values) {
            addCriterion("place_id not in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdBetween(Long value1, Long value2) {
            addCriterion("place_id between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotBetween(Long value1, Long value2) {
            addCriterion("place_id not between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIsNull() {
            addCriterion("place_name is null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIsNotNull() {
            addCriterion("place_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameEqualTo(String value) {
            addCriterion("place_name =", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotEqualTo(String value) {
            addCriterion("place_name <>", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThan(String value) {
            addCriterion("place_name >", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("place_name >=", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThan(String value) {
            addCriterion("place_name <", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThanOrEqualTo(String value) {
            addCriterion("place_name <=", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLike(String value) {
            addCriterion("place_name like", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotLike(String value) {
            addCriterion("place_name not like", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIn(List<String> values) {
            addCriterion("place_name in", values, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotIn(List<String> values) {
            addCriterion("place_name not in", values, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameBetween(String value1, String value2) {
            addCriterion("place_name between", value1, value2, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotBetween(String value1, String value2) {
            addCriterion("place_name not between", value1, value2, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressIsNull() {
            addCriterion("place_address is null");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressIsNotNull() {
            addCriterion("place_address is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressEqualTo(String value) {
            addCriterion("place_address =", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressNotEqualTo(String value) {
            addCriterion("place_address <>", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressGreaterThan(String value) {
            addCriterion("place_address >", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("place_address >=", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressLessThan(String value) {
            addCriterion("place_address <", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressLessThanOrEqualTo(String value) {
            addCriterion("place_address <=", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressLike(String value) {
            addCriterion("place_address like", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressNotLike(String value) {
            addCriterion("place_address not like", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressIn(List<String> values) {
            addCriterion("place_address in", values, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressNotIn(List<String> values) {
            addCriterion("place_address not in", values, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressBetween(String value1, String value2) {
            addCriterion("place_address between", value1, value2, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressNotBetween(String value1, String value2) {
            addCriterion("place_address not between", value1, value2, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyIsNull() {
            addCriterion("place_company is null");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyIsNotNull() {
            addCriterion("place_company is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyEqualTo(String value) {
            addCriterion("place_company =", value, "placeCompany");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyNotEqualTo(String value) {
            addCriterion("place_company <>", value, "placeCompany");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyGreaterThan(String value) {
            addCriterion("place_company >", value, "placeCompany");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("place_company >=", value, "placeCompany");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyLessThan(String value) {
            addCriterion("place_company <", value, "placeCompany");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyLessThanOrEqualTo(String value) {
            addCriterion("place_company <=", value, "placeCompany");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyLike(String value) {
            addCriterion("place_company like", value, "placeCompany");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyNotLike(String value) {
            addCriterion("place_company not like", value, "placeCompany");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyIn(List<String> values) {
            addCriterion("place_company in", values, "placeCompany");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyNotIn(List<String> values) {
            addCriterion("place_company not in", values, "placeCompany");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyBetween(String value1, String value2) {
            addCriterion("place_company between", value1, value2, "placeCompany");
            return (Criteria) this;
        }

        public Criteria andPlaceCompanyNotBetween(String value1, String value2) {
            addCriterion("place_company not between", value1, value2, "placeCompany");
            return (Criteria) this;
        }

        public Criteria andPlaceStarttimeIsNull() {
            addCriterion("place_starttime is null");
            return (Criteria) this;
        }

        public Criteria andPlaceStarttimeIsNotNull() {
            addCriterion("place_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("place_starttime =", value, "placeStarttime");
            return (Criteria) this;
        }

        public Criteria andPlaceStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("place_starttime <>", value, "placeStarttime");
            return (Criteria) this;
        }

        public Criteria andPlaceStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("place_starttime >", value, "placeStarttime");
            return (Criteria) this;
        }

        public Criteria andPlaceStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("place_starttime >=", value, "placeStarttime");
            return (Criteria) this;
        }

        public Criteria andPlaceStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("place_starttime <", value, "placeStarttime");
            return (Criteria) this;
        }

        public Criteria andPlaceStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("place_starttime <=", value, "placeStarttime");
            return (Criteria) this;
        }

        public Criteria andPlaceStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("place_starttime in", values, "placeStarttime");
            return (Criteria) this;
        }

        public Criteria andPlaceStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("place_starttime not in", values, "placeStarttime");
            return (Criteria) this;
        }

        public Criteria andPlaceStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("place_starttime between", value1, value2, "placeStarttime");
            return (Criteria) this;
        }

        public Criteria andPlaceStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("place_starttime not between", value1, value2, "placeStarttime");
            return (Criteria) this;
        }

        public Criteria andPlaceEndtimeIsNull() {
            addCriterion("place_endtime is null");
            return (Criteria) this;
        }

        public Criteria andPlaceEndtimeIsNotNull() {
            addCriterion("place_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("place_endtime =", value, "placeEndtime");
            return (Criteria) this;
        }

        public Criteria andPlaceEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("place_endtime <>", value, "placeEndtime");
            return (Criteria) this;
        }

        public Criteria andPlaceEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("place_endtime >", value, "placeEndtime");
            return (Criteria) this;
        }

        public Criteria andPlaceEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("place_endtime >=", value, "placeEndtime");
            return (Criteria) this;
        }

        public Criteria andPlaceEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("place_endtime <", value, "placeEndtime");
            return (Criteria) this;
        }

        public Criteria andPlaceEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("place_endtime <=", value, "placeEndtime");
            return (Criteria) this;
        }

        public Criteria andPlaceEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("place_endtime in", values, "placeEndtime");
            return (Criteria) this;
        }

        public Criteria andPlaceEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("place_endtime not in", values, "placeEndtime");
            return (Criteria) this;
        }

        public Criteria andPlaceEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("place_endtime between", value1, value2, "placeEndtime");
            return (Criteria) this;
        }

        public Criteria andPlaceEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("place_endtime not between", value1, value2, "placeEndtime");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeIsNull() {
            addCriterion("place_size is null");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeIsNotNull() {
            addCriterion("place_size is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeEqualTo(String value) {
            addCriterion("place_size =", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeNotEqualTo(String value) {
            addCriterion("place_size <>", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeGreaterThan(String value) {
            addCriterion("place_size >", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeGreaterThanOrEqualTo(String value) {
            addCriterion("place_size >=", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeLessThan(String value) {
            addCriterion("place_size <", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeLessThanOrEqualTo(String value) {
            addCriterion("place_size <=", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeLike(String value) {
            addCriterion("place_size like", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeNotLike(String value) {
            addCriterion("place_size not like", value, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeIn(List<String> values) {
            addCriterion("place_size in", values, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeNotIn(List<String> values) {
            addCriterion("place_size not in", values, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeBetween(String value1, String value2) {
            addCriterion("place_size between", value1, value2, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceSizeNotBetween(String value1, String value2) {
            addCriterion("place_size not between", value1, value2, "placeSize");
            return (Criteria) this;
        }

        public Criteria andPlaceStateIsNull() {
            addCriterion("place_state is null");
            return (Criteria) this;
        }

        public Criteria andPlaceStateIsNotNull() {
            addCriterion("place_state is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceStateEqualTo(String value) {
            addCriterion("place_state =", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateNotEqualTo(String value) {
            addCriterion("place_state <>", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateGreaterThan(String value) {
            addCriterion("place_state >", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateGreaterThanOrEqualTo(String value) {
            addCriterion("place_state >=", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateLessThan(String value) {
            addCriterion("place_state <", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateLessThanOrEqualTo(String value) {
            addCriterion("place_state <=", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateLike(String value) {
            addCriterion("place_state like", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateNotLike(String value) {
            addCriterion("place_state not like", value, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateIn(List<String> values) {
            addCriterion("place_state in", values, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateNotIn(List<String> values) {
            addCriterion("place_state not in", values, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateBetween(String value1, String value2) {
            addCriterion("place_state between", value1, value2, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceStateNotBetween(String value1, String value2) {
            addCriterion("place_state not between", value1, value2, "placeState");
            return (Criteria) this;
        }

        public Criteria andPlaceContentIsNull() {
            addCriterion("place_content is null");
            return (Criteria) this;
        }

        public Criteria andPlaceContentIsNotNull() {
            addCriterion("place_content is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceContentEqualTo(String value) {
            addCriterion("place_content =", value, "placeContent");
            return (Criteria) this;
        }

        public Criteria andPlaceContentNotEqualTo(String value) {
            addCriterion("place_content <>", value, "placeContent");
            return (Criteria) this;
        }

        public Criteria andPlaceContentGreaterThan(String value) {
            addCriterion("place_content >", value, "placeContent");
            return (Criteria) this;
        }

        public Criteria andPlaceContentGreaterThanOrEqualTo(String value) {
            addCriterion("place_content >=", value, "placeContent");
            return (Criteria) this;
        }

        public Criteria andPlaceContentLessThan(String value) {
            addCriterion("place_content <", value, "placeContent");
            return (Criteria) this;
        }

        public Criteria andPlaceContentLessThanOrEqualTo(String value) {
            addCriterion("place_content <=", value, "placeContent");
            return (Criteria) this;
        }

        public Criteria andPlaceContentLike(String value) {
            addCriterion("place_content like", value, "placeContent");
            return (Criteria) this;
        }

        public Criteria andPlaceContentNotLike(String value) {
            addCriterion("place_content not like", value, "placeContent");
            return (Criteria) this;
        }

        public Criteria andPlaceContentIn(List<String> values) {
            addCriterion("place_content in", values, "placeContent");
            return (Criteria) this;
        }

        public Criteria andPlaceContentNotIn(List<String> values) {
            addCriterion("place_content not in", values, "placeContent");
            return (Criteria) this;
        }

        public Criteria andPlaceContentBetween(String value1, String value2) {
            addCriterion("place_content between", value1, value2, "placeContent");
            return (Criteria) this;
        }

        public Criteria andPlaceContentNotBetween(String value1, String value2) {
            addCriterion("place_content not between", value1, value2, "placeContent");
            return (Criteria) this;
        }

        public Criteria andPlaceTelIsNull() {
            addCriterion("place_tel is null");
            return (Criteria) this;
        }

        public Criteria andPlaceTelIsNotNull() {
            addCriterion("place_tel is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceTelEqualTo(String value) {
            addCriterion("place_tel =", value, "placeTel");
            return (Criteria) this;
        }

        public Criteria andPlaceTelNotEqualTo(String value) {
            addCriterion("place_tel <>", value, "placeTel");
            return (Criteria) this;
        }

        public Criteria andPlaceTelGreaterThan(String value) {
            addCriterion("place_tel >", value, "placeTel");
            return (Criteria) this;
        }

        public Criteria andPlaceTelGreaterThanOrEqualTo(String value) {
            addCriterion("place_tel >=", value, "placeTel");
            return (Criteria) this;
        }

        public Criteria andPlaceTelLessThan(String value) {
            addCriterion("place_tel <", value, "placeTel");
            return (Criteria) this;
        }

        public Criteria andPlaceTelLessThanOrEqualTo(String value) {
            addCriterion("place_tel <=", value, "placeTel");
            return (Criteria) this;
        }

        public Criteria andPlaceTelLike(String value) {
            addCriterion("place_tel like", value, "placeTel");
            return (Criteria) this;
        }

        public Criteria andPlaceTelNotLike(String value) {
            addCriterion("place_tel not like", value, "placeTel");
            return (Criteria) this;
        }

        public Criteria andPlaceTelIn(List<String> values) {
            addCriterion("place_tel in", values, "placeTel");
            return (Criteria) this;
        }

        public Criteria andPlaceTelNotIn(List<String> values) {
            addCriterion("place_tel not in", values, "placeTel");
            return (Criteria) this;
        }

        public Criteria andPlaceTelBetween(String value1, String value2) {
            addCriterion("place_tel between", value1, value2, "placeTel");
            return (Criteria) this;
        }

        public Criteria andPlaceTelNotBetween(String value1, String value2) {
            addCriterion("place_tel not between", value1, value2, "placeTel");
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