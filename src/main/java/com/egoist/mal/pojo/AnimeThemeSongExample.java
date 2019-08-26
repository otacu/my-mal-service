package com.egoist.mal.pojo;

import java.util.ArrayList;
import java.util.List;

public class AnimeThemeSongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnimeThemeSongExample() {
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

        public Criteria andIdxIsNull() {
            addCriterion("idx is null");
            return (Criteria) this;
        }

        public Criteria andIdxIsNotNull() {
            addCriterion("idx is not null");
            return (Criteria) this;
        }

        public Criteria andIdxEqualTo(Long value) {
            addCriterion("idx =", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotEqualTo(Long value) {
            addCriterion("idx <>", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThan(Long value) {
            addCriterion("idx >", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("idx >=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThan(Long value) {
            addCriterion("idx <", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThanOrEqualTo(Long value) {
            addCriterion("idx <=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxIn(List<Long> values) {
            addCriterion("idx in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotIn(List<Long> values) {
            addCriterion("idx not in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxBetween(Long value1, Long value2) {
            addCriterion("idx between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotBetween(Long value1, Long value2) {
            addCriterion("idx not between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andAnimeIdIsNull() {
            addCriterion("anime_id is null");
            return (Criteria) this;
        }

        public Criteria andAnimeIdIsNotNull() {
            addCriterion("anime_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnimeIdEqualTo(Integer value) {
            addCriterion("anime_id =", value, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdNotEqualTo(Integer value) {
            addCriterion("anime_id <>", value, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdGreaterThan(Integer value) {
            addCriterion("anime_id >", value, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("anime_id >=", value, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdLessThan(Integer value) {
            addCriterion("anime_id <", value, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("anime_id <=", value, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdIn(List<Integer> values) {
            addCriterion("anime_id in", values, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdNotIn(List<Integer> values) {
            addCriterion("anime_id not in", values, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdBetween(Integer value1, Integer value2) {
            addCriterion("anime_id between", value1, value2, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("anime_id not between", value1, value2, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameIsNull() {
            addCriterion("anime_en_name is null");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameIsNotNull() {
            addCriterion("anime_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameEqualTo(String value) {
            addCriterion("anime_en_name =", value, "animeEnName");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameNotEqualTo(String value) {
            addCriterion("anime_en_name <>", value, "animeEnName");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameGreaterThan(String value) {
            addCriterion("anime_en_name >", value, "animeEnName");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("anime_en_name >=", value, "animeEnName");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameLessThan(String value) {
            addCriterion("anime_en_name <", value, "animeEnName");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameLessThanOrEqualTo(String value) {
            addCriterion("anime_en_name <=", value, "animeEnName");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameLike(String value) {
            addCriterion("anime_en_name like", value, "animeEnName");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameNotLike(String value) {
            addCriterion("anime_en_name not like", value, "animeEnName");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameIn(List<String> values) {
            addCriterion("anime_en_name in", values, "animeEnName");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameNotIn(List<String> values) {
            addCriterion("anime_en_name not in", values, "animeEnName");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameBetween(String value1, String value2) {
            addCriterion("anime_en_name between", value1, value2, "animeEnName");
            return (Criteria) this;
        }

        public Criteria andAnimeEnNameNotBetween(String value1, String value2) {
            addCriterion("anime_en_name not between", value1, value2, "animeEnName");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameIsNull() {
            addCriterion("anime_jp_name is null");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameIsNotNull() {
            addCriterion("anime_jp_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameEqualTo(String value) {
            addCriterion("anime_jp_name =", value, "animeJpName");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameNotEqualTo(String value) {
            addCriterion("anime_jp_name <>", value, "animeJpName");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameGreaterThan(String value) {
            addCriterion("anime_jp_name >", value, "animeJpName");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameGreaterThanOrEqualTo(String value) {
            addCriterion("anime_jp_name >=", value, "animeJpName");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameLessThan(String value) {
            addCriterion("anime_jp_name <", value, "animeJpName");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameLessThanOrEqualTo(String value) {
            addCriterion("anime_jp_name <=", value, "animeJpName");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameLike(String value) {
            addCriterion("anime_jp_name like", value, "animeJpName");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameNotLike(String value) {
            addCriterion("anime_jp_name not like", value, "animeJpName");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameIn(List<String> values) {
            addCriterion("anime_jp_name in", values, "animeJpName");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameNotIn(List<String> values) {
            addCriterion("anime_jp_name not in", values, "animeJpName");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameBetween(String value1, String value2) {
            addCriterion("anime_jp_name between", value1, value2, "animeJpName");
            return (Criteria) this;
        }

        public Criteria andAnimeJpNameNotBetween(String value1, String value2) {
            addCriterion("anime_jp_name not between", value1, value2, "animeJpName");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSingerIsNull() {
            addCriterion("singer is null");
            return (Criteria) this;
        }

        public Criteria andSingerIsNotNull() {
            addCriterion("singer is not null");
            return (Criteria) this;
        }

        public Criteria andSingerEqualTo(String value) {
            addCriterion("singer =", value, "singer");
            return (Criteria) this;
        }

        public Criteria andSingerNotEqualTo(String value) {
            addCriterion("singer <>", value, "singer");
            return (Criteria) this;
        }

        public Criteria andSingerGreaterThan(String value) {
            addCriterion("singer >", value, "singer");
            return (Criteria) this;
        }

        public Criteria andSingerGreaterThanOrEqualTo(String value) {
            addCriterion("singer >=", value, "singer");
            return (Criteria) this;
        }

        public Criteria andSingerLessThan(String value) {
            addCriterion("singer <", value, "singer");
            return (Criteria) this;
        }

        public Criteria andSingerLessThanOrEqualTo(String value) {
            addCriterion("singer <=", value, "singer");
            return (Criteria) this;
        }

        public Criteria andSingerLike(String value) {
            addCriterion("singer like", value, "singer");
            return (Criteria) this;
        }

        public Criteria andSingerNotLike(String value) {
            addCriterion("singer not like", value, "singer");
            return (Criteria) this;
        }

        public Criteria andSingerIn(List<String> values) {
            addCriterion("singer in", values, "singer");
            return (Criteria) this;
        }

        public Criteria andSingerNotIn(List<String> values) {
            addCriterion("singer not in", values, "singer");
            return (Criteria) this;
        }

        public Criteria andSingerBetween(String value1, String value2) {
            addCriterion("singer between", value1, value2, "singer");
            return (Criteria) this;
        }

        public Criteria andSingerNotBetween(String value1, String value2) {
            addCriterion("singer not between", value1, value2, "singer");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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