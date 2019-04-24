package com.entitycourse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EntitycourseExample {
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

	public EntitycourseExample() {
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

        public Criteria andEntitycourseIdIsNull() {
            addCriterion("EntityCourse_id is null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseIdIsNotNull() {
            addCriterion("EntityCourse_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseIdEqualTo(Long value) {
            addCriterion("EntityCourse_id =", value, "entitycourseId");
            return (Criteria) this;
        }

        public Criteria andEntitycourseIdNotEqualTo(Long value) {
            addCriterion("EntityCourse_id <>", value, "entitycourseId");
            return (Criteria) this;
        }

        public Criteria andEntitycourseIdGreaterThan(Long value) {
            addCriterion("EntityCourse_id >", value, "entitycourseId");
            return (Criteria) this;
        }

        public Criteria andEntitycourseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EntityCourse_id >=", value, "entitycourseId");
            return (Criteria) this;
        }

        public Criteria andEntitycourseIdLessThan(Long value) {
            addCriterion("EntityCourse_id <", value, "entitycourseId");
            return (Criteria) this;
        }

        public Criteria andEntitycourseIdLessThanOrEqualTo(Long value) {
            addCriterion("EntityCourse_id <=", value, "entitycourseId");
            return (Criteria) this;
        }

        public Criteria andEntitycourseIdIn(List<Long> values) {
            addCriterion("EntityCourse_id in", values, "entitycourseId");
            return (Criteria) this;
        }

        public Criteria andEntitycourseIdNotIn(List<Long> values) {
            addCriterion("EntityCourse_id not in", values, "entitycourseId");
            return (Criteria) this;
        }

        public Criteria andEntitycourseIdBetween(Long value1, Long value2) {
            addCriterion("EntityCourse_id between", value1, value2, "entitycourseId");
            return (Criteria) this;
        }

        public Criteria andEntitycourseIdNotBetween(Long value1, Long value2) {
            addCriterion("EntityCourse_id not between", value1, value2, "entitycourseId");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatIsNull() {
            addCriterion("EntityCourse_cat is null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatIsNotNull() {
            addCriterion("EntityCourse_cat is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatEqualTo(String value) {
            addCriterion("EntityCourse_cat =", value, "entitycourseCat");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatNotEqualTo(String value) {
            addCriterion("EntityCourse_cat <>", value, "entitycourseCat");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatGreaterThan(String value) {
            addCriterion("EntityCourse_cat >", value, "entitycourseCat");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatGreaterThanOrEqualTo(String value) {
            addCriterion("EntityCourse_cat >=", value, "entitycourseCat");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatLessThan(String value) {
            addCriterion("EntityCourse_cat <", value, "entitycourseCat");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatLessThanOrEqualTo(String value) {
            addCriterion("EntityCourse_cat <=", value, "entitycourseCat");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatLike(String value) {
            addCriterion("EntityCourse_cat like", value, "entitycourseCat");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatNotLike(String value) {
            addCriterion("EntityCourse_cat not like", value, "entitycourseCat");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatIn(List<String> values) {
            addCriterion("EntityCourse_cat in", values, "entitycourseCat");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatNotIn(List<String> values) {
            addCriterion("EntityCourse_cat not in", values, "entitycourseCat");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatBetween(String value1, String value2) {
            addCriterion("EntityCourse_cat between", value1, value2, "entitycourseCat");
            return (Criteria) this;
        }

        public Criteria andEntitycourseCatNotBetween(String value1, String value2) {
            addCriterion("EntityCourse_cat not between", value1, value2, "entitycourseCat");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointIsNull() {
            addCriterion("EntityCourse_point is null");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointIsNotNull() {
            addCriterion("EntityCourse_point is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointEqualTo(String value) {
            addCriterion("EntityCourse_point =", value, "entitycoursePoint");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointNotEqualTo(String value) {
            addCriterion("EntityCourse_point <>", value, "entitycoursePoint");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointGreaterThan(String value) {
            addCriterion("EntityCourse_point >", value, "entitycoursePoint");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointGreaterThanOrEqualTo(String value) {
            addCriterion("EntityCourse_point >=", value, "entitycoursePoint");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointLessThan(String value) {
            addCriterion("EntityCourse_point <", value, "entitycoursePoint");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointLessThanOrEqualTo(String value) {
            addCriterion("EntityCourse_point <=", value, "entitycoursePoint");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointLike(String value) {
            addCriterion("EntityCourse_point like", value, "entitycoursePoint");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointNotLike(String value) {
            addCriterion("EntityCourse_point not like", value, "entitycoursePoint");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointIn(List<String> values) {
            addCriterion("EntityCourse_point in", values, "entitycoursePoint");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointNotIn(List<String> values) {
            addCriterion("EntityCourse_point not in", values, "entitycoursePoint");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointBetween(String value1, String value2) {
            addCriterion("EntityCourse_point between", value1, value2, "entitycoursePoint");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePointNotBetween(String value1, String value2) {
            addCriterion("EntityCourse_point not between", value1, value2, "entitycoursePoint");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeIsNull() {
            addCriterion("EntityCourse_guige is null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeIsNotNull() {
            addCriterion("EntityCourse_guige is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeEqualTo(String value) {
            addCriterion("EntityCourse_guige =", value, "entitycourseGuige");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeNotEqualTo(String value) {
            addCriterion("EntityCourse_guige <>", value, "entitycourseGuige");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeGreaterThan(String value) {
            addCriterion("EntityCourse_guige >", value, "entitycourseGuige");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeGreaterThanOrEqualTo(String value) {
            addCriterion("EntityCourse_guige >=", value, "entitycourseGuige");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeLessThan(String value) {
            addCriterion("EntityCourse_guige <", value, "entitycourseGuige");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeLessThanOrEqualTo(String value) {
            addCriterion("EntityCourse_guige <=", value, "entitycourseGuige");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeLike(String value) {
            addCriterion("EntityCourse_guige like", value, "entitycourseGuige");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeNotLike(String value) {
            addCriterion("EntityCourse_guige not like", value, "entitycourseGuige");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeIn(List<String> values) {
            addCriterion("EntityCourse_guige in", values, "entitycourseGuige");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeNotIn(List<String> values) {
            addCriterion("EntityCourse_guige not in", values, "entitycourseGuige");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeBetween(String value1, String value2) {
            addCriterion("EntityCourse_guige between", value1, value2, "entitycourseGuige");
            return (Criteria) this;
        }

        public Criteria andEntitycourseGuigeNotBetween(String value1, String value2) {
            addCriterion("EntityCourse_guige not between", value1, value2, "entitycourseGuige");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingIsNull() {
            addCriterion("EntityCourse_banxing is null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingIsNotNull() {
            addCriterion("EntityCourse_banxing is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingEqualTo(String value) {
            addCriterion("EntityCourse_banxing =", value, "entitycourseBanxing");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingNotEqualTo(String value) {
            addCriterion("EntityCourse_banxing <>", value, "entitycourseBanxing");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingGreaterThan(String value) {
            addCriterion("EntityCourse_banxing >", value, "entitycourseBanxing");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingGreaterThanOrEqualTo(String value) {
            addCriterion("EntityCourse_banxing >=", value, "entitycourseBanxing");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingLessThan(String value) {
            addCriterion("EntityCourse_banxing <", value, "entitycourseBanxing");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingLessThanOrEqualTo(String value) {
            addCriterion("EntityCourse_banxing <=", value, "entitycourseBanxing");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingLike(String value) {
            addCriterion("EntityCourse_banxing like", value, "entitycourseBanxing");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingNotLike(String value) {
            addCriterion("EntityCourse_banxing not like", value, "entitycourseBanxing");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingIn(List<String> values) {
            addCriterion("EntityCourse_banxing in", values, "entitycourseBanxing");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingNotIn(List<String> values) {
            addCriterion("EntityCourse_banxing not in", values, "entitycourseBanxing");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingBetween(String value1, String value2) {
            addCriterion("EntityCourse_banxing between", value1, value2, "entitycourseBanxing");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBanxingNotBetween(String value1, String value2) {
            addCriterion("EntityCourse_banxing not between", value1, value2, "entitycourseBanxing");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeIsNull() {
            addCriterion("EntityCourse_type is null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeIsNotNull() {
            addCriterion("EntityCourse_type is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeEqualTo(String value) {
            addCriterion("EntityCourse_type =", value, "entitycourseType");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeNotEqualTo(String value) {
            addCriterion("EntityCourse_type <>", value, "entitycourseType");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeGreaterThan(String value) {
            addCriterion("EntityCourse_type >", value, "entitycourseType");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EntityCourse_type >=", value, "entitycourseType");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeLessThan(String value) {
            addCriterion("EntityCourse_type <", value, "entitycourseType");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeLessThanOrEqualTo(String value) {
            addCriterion("EntityCourse_type <=", value, "entitycourseType");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeLike(String value) {
            addCriterion("EntityCourse_type like", value, "entitycourseType");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeNotLike(String value) {
            addCriterion("EntityCourse_type not like", value, "entitycourseType");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeIn(List<String> values) {
            addCriterion("EntityCourse_type in", values, "entitycourseType");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeNotIn(List<String> values) {
            addCriterion("EntityCourse_type not in", values, "entitycourseType");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeBetween(String value1, String value2) {
            addCriterion("EntityCourse_type between", value1, value2, "entitycourseType");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTypeNotBetween(String value1, String value2) {
            addCriterion("EntityCourse_type not between", value1, value2, "entitycourseType");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmstarttimeIsNull() {
            addCriterion("EntityCourse_bmStartTime is null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmstarttimeIsNotNull() {
            addCriterion("EntityCourse_bmStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmstarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_bmStartTime =", value, "entitycourseBmstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmstarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_bmStartTime <>", value, "entitycourseBmstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmstarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EntityCourse_bmStartTime >", value, "entitycourseBmstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_bmStartTime >=", value, "entitycourseBmstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmstarttimeLessThan(Date value) {
            addCriterionForJDBCDate("EntityCourse_bmStartTime <", value, "entitycourseBmstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmstarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_bmStartTime <=", value, "entitycourseBmstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmstarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("EntityCourse_bmStartTime in", values, "entitycourseBmstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmstarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EntityCourse_bmStartTime not in", values, "entitycourseBmstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmstarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EntityCourse_bmStartTime between", value1, value2, "entitycourseBmstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmstarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EntityCourse_bmStartTime not between", value1, value2, "entitycourseBmstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmendtimeIsNull() {
            addCriterion("EntityCourse_bmEndTime is null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmendtimeIsNotNull() {
            addCriterion("EntityCourse_bmEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_bmEndTime =", value, "entitycourseBmendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_bmEndTime <>", value, "entitycourseBmendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EntityCourse_bmEndTime >", value, "entitycourseBmendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_bmEndTime >=", value, "entitycourseBmendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmendtimeLessThan(Date value) {
            addCriterionForJDBCDate("EntityCourse_bmEndTime <", value, "entitycourseBmendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_bmEndTime <=", value, "entitycourseBmendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("EntityCourse_bmEndTime in", values, "entitycourseBmendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EntityCourse_bmEndTime not in", values, "entitycourseBmendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EntityCourse_bmEndTime between", value1, value2, "entitycourseBmendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseBmendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EntityCourse_bmEndTime not between", value1, value2, "entitycourseBmendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbstarttimeIsNull() {
            addCriterion("EntityCourse_kbStartTime is null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbstarttimeIsNotNull() {
            addCriterion("EntityCourse_kbStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbstarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_kbStartTime =", value, "entitycourseKbstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbstarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_kbStartTime <>", value, "entitycourseKbstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbstarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EntityCourse_kbStartTime >", value, "entitycourseKbstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_kbStartTime >=", value, "entitycourseKbstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbstarttimeLessThan(Date value) {
            addCriterionForJDBCDate("EntityCourse_kbStartTime <", value, "entitycourseKbstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbstarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_kbStartTime <=", value, "entitycourseKbstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbstarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("EntityCourse_kbStartTime in", values, "entitycourseKbstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbstarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EntityCourse_kbStartTime not in", values, "entitycourseKbstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbstarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EntityCourse_kbStartTime between", value1, value2, "entitycourseKbstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbstarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EntityCourse_kbStartTime not between", value1, value2, "entitycourseKbstarttime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbendtimeIsNull() {
            addCriterion("EntityCourse_kbEndTime is null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbendtimeIsNotNull() {
            addCriterion("EntityCourse_kbEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_kbEndTime =", value, "entitycourseKbendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_kbEndTime <>", value, "entitycourseKbendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EntityCourse_kbEndTime >", value, "entitycourseKbendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_kbEndTime >=", value, "entitycourseKbendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbendtimeLessThan(Date value) {
            addCriterionForJDBCDate("EntityCourse_kbEndTime <", value, "entitycourseKbendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EntityCourse_kbEndTime <=", value, "entitycourseKbendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("EntityCourse_kbEndTime in", values, "entitycourseKbendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EntityCourse_kbEndTime not in", values, "entitycourseKbendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EntityCourse_kbEndTime between", value1, value2, "entitycourseKbendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseKbendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EntityCourse_kbEndTime not between", value1, value2, "entitycourseKbendtime");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgIsNull() {
            addCriterion("EntityCourse_Img is null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgIsNotNull() {
            addCriterion("EntityCourse_Img is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgEqualTo(String value) {
            addCriterion("EntityCourse_Img =", value, "entitycourseImg");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgNotEqualTo(String value) {
            addCriterion("EntityCourse_Img <>", value, "entitycourseImg");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgGreaterThan(String value) {
            addCriterion("EntityCourse_Img >", value, "entitycourseImg");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgGreaterThanOrEqualTo(String value) {
            addCriterion("EntityCourse_Img >=", value, "entitycourseImg");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgLessThan(String value) {
            addCriterion("EntityCourse_Img <", value, "entitycourseImg");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgLessThanOrEqualTo(String value) {
            addCriterion("EntityCourse_Img <=", value, "entitycourseImg");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgLike(String value) {
            addCriterion("EntityCourse_Img like", value, "entitycourseImg");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgNotLike(String value) {
            addCriterion("EntityCourse_Img not like", value, "entitycourseImg");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgIn(List<String> values) {
            addCriterion("EntityCourse_Img in", values, "entitycourseImg");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgNotIn(List<String> values) {
            addCriterion("EntityCourse_Img not in", values, "entitycourseImg");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgBetween(String value1, String value2) {
            addCriterion("EntityCourse_Img between", value1, value2, "entitycourseImg");
            return (Criteria) this;
        }

        public Criteria andEntitycourseImgNotBetween(String value1, String value2) {
            addCriterion("EntityCourse_Img not between", value1, value2, "entitycourseImg");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescIsNull() {
            addCriterion("EntityCourse_desc is null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescIsNotNull() {
            addCriterion("EntityCourse_desc is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescEqualTo(String value) {
            addCriterion("EntityCourse_desc =", value, "entitycourseDesc");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescNotEqualTo(String value) {
            addCriterion("EntityCourse_desc <>", value, "entitycourseDesc");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescGreaterThan(String value) {
            addCriterion("EntityCourse_desc >", value, "entitycourseDesc");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescGreaterThanOrEqualTo(String value) {
            addCriterion("EntityCourse_desc >=", value, "entitycourseDesc");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescLessThan(String value) {
            addCriterion("EntityCourse_desc <", value, "entitycourseDesc");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescLessThanOrEqualTo(String value) {
            addCriterion("EntityCourse_desc <=", value, "entitycourseDesc");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescLike(String value) {
            addCriterion("EntityCourse_desc like", value, "entitycourseDesc");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescNotLike(String value) {
            addCriterion("EntityCourse_desc not like", value, "entitycourseDesc");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescIn(List<String> values) {
            addCriterion("EntityCourse_desc in", values, "entitycourseDesc");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescNotIn(List<String> values) {
            addCriterion("EntityCourse_desc not in", values, "entitycourseDesc");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescBetween(String value1, String value2) {
            addCriterion("EntityCourse_desc between", value1, value2, "entitycourseDesc");
            return (Criteria) this;
        }

        public Criteria andEntitycourseDescNotBetween(String value1, String value2) {
            addCriterion("EntityCourse_desc not between", value1, value2, "entitycourseDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("Company_Id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("Company_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Byte value) {
            addCriterion("Company_Id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Byte value) {
            addCriterion("Company_Id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Byte value) {
            addCriterion("Company_Id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("Company_Id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Byte value) {
            addCriterion("Company_Id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Byte value) {
            addCriterion("Company_Id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Byte> values) {
            addCriterion("Company_Id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Byte> values) {
            addCriterion("Company_Id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Byte value1, Byte value2) {
            addCriterion("Company_Id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Byte value1, Byte value2) {
            addCriterion("Company_Id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleIsNull() {
            addCriterion("EntityCourse_title is null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleIsNotNull() {
            addCriterion("EntityCourse_title is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleEqualTo(String value) {
            addCriterion("EntityCourse_title =", value, "entitycourseTitle");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleNotEqualTo(String value) {
            addCriterion("EntityCourse_title <>", value, "entitycourseTitle");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleGreaterThan(String value) {
            addCriterion("EntityCourse_title >", value, "entitycourseTitle");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleGreaterThanOrEqualTo(String value) {
            addCriterion("EntityCourse_title >=", value, "entitycourseTitle");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleLessThan(String value) {
            addCriterion("EntityCourse_title <", value, "entitycourseTitle");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleLessThanOrEqualTo(String value) {
            addCriterion("EntityCourse_title <=", value, "entitycourseTitle");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleLike(String value) {
            addCriterion("EntityCourse_title like", value, "entitycourseTitle");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleNotLike(String value) {
            addCriterion("EntityCourse_title not like", value, "entitycourseTitle");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleIn(List<String> values) {
            addCriterion("EntityCourse_title in", values, "entitycourseTitle");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleNotIn(List<String> values) {
            addCriterion("EntityCourse_title not in", values, "entitycourseTitle");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleBetween(String value1, String value2) {
            addCriterion("EntityCourse_title between", value1, value2, "entitycourseTitle");
            return (Criteria) this;
        }

        public Criteria andEntitycourseTitleNotBetween(String value1, String value2) {
            addCriterion("EntityCourse_title not between", value1, value2, "entitycourseTitle");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePriceIsNull() {
            addCriterion("EntityCourse_price is null");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePriceIsNotNull() {
            addCriterion("EntityCourse_price is not null");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePriceEqualTo(Integer value) {
            addCriterion("EntityCourse_price =", value, "entitycoursePrice");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePriceNotEqualTo(Integer value) {
            addCriterion("EntityCourse_price <>", value, "entitycoursePrice");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePriceGreaterThan(Integer value) {
            addCriterion("EntityCourse_price >", value, "entitycoursePrice");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("EntityCourse_price >=", value, "entitycoursePrice");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePriceLessThan(Integer value) {
            addCriterion("EntityCourse_price <", value, "entitycoursePrice");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePriceLessThanOrEqualTo(Integer value) {
            addCriterion("EntityCourse_price <=", value, "entitycoursePrice");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePriceIn(List<Integer> values) {
            addCriterion("EntityCourse_price in", values, "entitycoursePrice");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePriceNotIn(List<Integer> values) {
            addCriterion("EntityCourse_price not in", values, "entitycoursePrice");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePriceBetween(Integer value1, Integer value2) {
            addCriterion("EntityCourse_price between", value1, value2, "entitycoursePrice");
            return (Criteria) this;
        }

        public Criteria andEntitycoursePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("EntityCourse_price not between", value1, value2, "entitycoursePrice");
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