package com.comment.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
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

    public CommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Long value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Long value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Long value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Long value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Long> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Long> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Long value1, Long value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentNameIsNull() {
            addCriterion("comment_name is null");
            return (Criteria) this;
        }

        public Criteria andCommentNameIsNotNull() {
            addCriterion("comment_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNameEqualTo(String value) {
            addCriterion("comment_name =", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotEqualTo(String value) {
            addCriterion("comment_name <>", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameGreaterThan(String value) {
            addCriterion("comment_name >", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameGreaterThanOrEqualTo(String value) {
            addCriterion("comment_name >=", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameLessThan(String value) {
            addCriterion("comment_name <", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameLessThanOrEqualTo(String value) {
            addCriterion("comment_name <=", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameLike(String value) {
            addCriterion("comment_name like", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotLike(String value) {
            addCriterion("comment_name not like", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameIn(List<String> values) {
            addCriterion("comment_name in", values, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotIn(List<String> values) {
            addCriterion("comment_name not in", values, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameBetween(String value1, String value2) {
            addCriterion("comment_name between", value1, value2, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotBetween(String value1, String value2) {
            addCriterion("comment_name not between", value1, value2, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNull() {
            addCriterion("comment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(Date value) {
            addCriterion("comment_time =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(Date value) {
            addCriterion("comment_time <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(Date value) {
            addCriterion("comment_time >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_time >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(Date value) {
            addCriterion("comment_time <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("comment_time <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<Date> values) {
            addCriterion("comment_time in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<Date> values) {
            addCriterion("comment_time not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(Date value1, Date value2) {
            addCriterion("comment_time between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("comment_time not between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIsNull() {
            addCriterion("comment_picture is null");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIsNotNull() {
            addCriterion("comment_picture is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPictureEqualTo(String value) {
            addCriterion("comment_picture =", value, "commentPicture");
            return (Criteria) this;
        }

        public Criteria andCommentPictureNotEqualTo(String value) {
            addCriterion("comment_picture <>", value, "commentPicture");
            return (Criteria) this;
        }

        public Criteria andCommentPictureGreaterThan(String value) {
            addCriterion("comment_picture >", value, "commentPicture");
            return (Criteria) this;
        }

        public Criteria andCommentPictureGreaterThanOrEqualTo(String value) {
            addCriterion("comment_picture >=", value, "commentPicture");
            return (Criteria) this;
        }

        public Criteria andCommentPictureLessThan(String value) {
            addCriterion("comment_picture <", value, "commentPicture");
            return (Criteria) this;
        }

        public Criteria andCommentPictureLessThanOrEqualTo(String value) {
            addCriterion("comment_picture <=", value, "commentPicture");
            return (Criteria) this;
        }

        public Criteria andCommentPictureLike(String value) {
            addCriterion("comment_picture like", value, "commentPicture");
            return (Criteria) this;
        }

        public Criteria andCommentPictureNotLike(String value) {
            addCriterion("comment_picture not like", value, "commentPicture");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIn(List<String> values) {
            addCriterion("comment_picture in", values, "commentPicture");
            return (Criteria) this;
        }

        public Criteria andCommentPictureNotIn(List<String> values) {
            addCriterion("comment_picture not in", values, "commentPicture");
            return (Criteria) this;
        }

        public Criteria andCommentPictureBetween(String value1, String value2) {
            addCriterion("comment_picture between", value1, value2, "commentPicture");
            return (Criteria) this;
        }

        public Criteria andCommentPictureNotBetween(String value1, String value2) {
            addCriterion("comment_picture not between", value1, value2, "commentPicture");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerIsNull() {
            addCriterion("comment_answer is null");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerIsNotNull() {
            addCriterion("comment_answer is not null");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerEqualTo(String value) {
            addCriterion("comment_answer =", value, "commentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerNotEqualTo(String value) {
            addCriterion("comment_answer <>", value, "commentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerGreaterThan(String value) {
            addCriterion("comment_answer >", value, "commentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("comment_answer >=", value, "commentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerLessThan(String value) {
            addCriterion("comment_answer <", value, "commentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerLessThanOrEqualTo(String value) {
            addCriterion("comment_answer <=", value, "commentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerLike(String value) {
            addCriterion("comment_answer like", value, "commentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerNotLike(String value) {
            addCriterion("comment_answer not like", value, "commentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerIn(List<String> values) {
            addCriterion("comment_answer in", values, "commentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerNotIn(List<String> values) {
            addCriterion("comment_answer not in", values, "commentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerBetween(String value1, String value2) {
            addCriterion("comment_answer between", value1, value2, "commentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentAnswerNotBetween(String value1, String value2) {
            addCriterion("comment_answer not between", value1, value2, "commentAnswer");
            return (Criteria) this;
        }

        public Criteria andCommentStateIsNull() {
            addCriterion("comment_state is null");
            return (Criteria) this;
        }

        public Criteria andCommentStateIsNotNull() {
            addCriterion("comment_state is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStateEqualTo(String value) {
            addCriterion("comment_state =", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotEqualTo(String value) {
            addCriterion("comment_state <>", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateGreaterThan(String value) {
            addCriterion("comment_state >", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateGreaterThanOrEqualTo(String value) {
            addCriterion("comment_state >=", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateLessThan(String value) {
            addCriterion("comment_state <", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateLessThanOrEqualTo(String value) {
            addCriterion("comment_state <=", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateLike(String value) {
            addCriterion("comment_state like", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotLike(String value) {
            addCriterion("comment_state not like", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateIn(List<String> values) {
            addCriterion("comment_state in", values, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotIn(List<String> values) {
            addCriterion("comment_state not in", values, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateBetween(String value1, String value2) {
            addCriterion("comment_state between", value1, value2, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotBetween(String value1, String value2) {
            addCriterion("comment_state not between", value1, value2, "commentState");
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