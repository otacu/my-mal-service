package com.egoist.mal.pojo;

import java.util.ArrayList;
import java.util.List;

public class AnimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnimeExample() {
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

        public Criteria andEnNameIsNull() {
            addCriterion("en_name is null");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNotNull() {
            addCriterion("en_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnNameEqualTo(String value) {
            addCriterion("en_name =", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotEqualTo(String value) {
            addCriterion("en_name <>", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThan(String value) {
            addCriterion("en_name >", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("en_name >=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThan(String value) {
            addCriterion("en_name <", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThanOrEqualTo(String value) {
            addCriterion("en_name <=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLike(String value) {
            addCriterion("en_name like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotLike(String value) {
            addCriterion("en_name not like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameIn(List<String> values) {
            addCriterion("en_name in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotIn(List<String> values) {
            addCriterion("en_name not in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameBetween(String value1, String value2) {
            addCriterion("en_name between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotBetween(String value1, String value2) {
            addCriterion("en_name not between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andJpNameIsNull() {
            addCriterion("jp_name is null");
            return (Criteria) this;
        }

        public Criteria andJpNameIsNotNull() {
            addCriterion("jp_name is not null");
            return (Criteria) this;
        }

        public Criteria andJpNameEqualTo(String value) {
            addCriterion("jp_name =", value, "jpName");
            return (Criteria) this;
        }

        public Criteria andJpNameNotEqualTo(String value) {
            addCriterion("jp_name <>", value, "jpName");
            return (Criteria) this;
        }

        public Criteria andJpNameGreaterThan(String value) {
            addCriterion("jp_name >", value, "jpName");
            return (Criteria) this;
        }

        public Criteria andJpNameGreaterThanOrEqualTo(String value) {
            addCriterion("jp_name >=", value, "jpName");
            return (Criteria) this;
        }

        public Criteria andJpNameLessThan(String value) {
            addCriterion("jp_name <", value, "jpName");
            return (Criteria) this;
        }

        public Criteria andJpNameLessThanOrEqualTo(String value) {
            addCriterion("jp_name <=", value, "jpName");
            return (Criteria) this;
        }

        public Criteria andJpNameLike(String value) {
            addCriterion("jp_name like", value, "jpName");
            return (Criteria) this;
        }

        public Criteria andJpNameNotLike(String value) {
            addCriterion("jp_name not like", value, "jpName");
            return (Criteria) this;
        }

        public Criteria andJpNameIn(List<String> values) {
            addCriterion("jp_name in", values, "jpName");
            return (Criteria) this;
        }

        public Criteria andJpNameNotIn(List<String> values) {
            addCriterion("jp_name not in", values, "jpName");
            return (Criteria) this;
        }

        public Criteria andJpNameBetween(String value1, String value2) {
            addCriterion("jp_name between", value1, value2, "jpName");
            return (Criteria) this;
        }

        public Criteria andJpNameNotBetween(String value1, String value2) {
            addCriterion("jp_name not between", value1, value2, "jpName");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
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

        public Criteria andEpisodesIsNull() {
            addCriterion("episodes is null");
            return (Criteria) this;
        }

        public Criteria andEpisodesIsNotNull() {
            addCriterion("episodes is not null");
            return (Criteria) this;
        }

        public Criteria andEpisodesEqualTo(Integer value) {
            addCriterion("episodes =", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesNotEqualTo(Integer value) {
            addCriterion("episodes <>", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesGreaterThan(Integer value) {
            addCriterion("episodes >", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesGreaterThanOrEqualTo(Integer value) {
            addCriterion("episodes >=", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesLessThan(Integer value) {
            addCriterion("episodes <", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesLessThanOrEqualTo(Integer value) {
            addCriterion("episodes <=", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesIn(List<Integer> values) {
            addCriterion("episodes in", values, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesNotIn(List<Integer> values) {
            addCriterion("episodes not in", values, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesBetween(Integer value1, Integer value2) {
            addCriterion("episodes between", value1, value2, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesNotBetween(Integer value1, Integer value2) {
            addCriterion("episodes not between", value1, value2, "episodes");
            return (Criteria) this;
        }

        public Criteria andPremieredIsNull() {
            addCriterion("premiered is null");
            return (Criteria) this;
        }

        public Criteria andPremieredIsNotNull() {
            addCriterion("premiered is not null");
            return (Criteria) this;
        }

        public Criteria andPremieredEqualTo(String value) {
            addCriterion("premiered =", value, "premiered");
            return (Criteria) this;
        }

        public Criteria andPremieredNotEqualTo(String value) {
            addCriterion("premiered <>", value, "premiered");
            return (Criteria) this;
        }

        public Criteria andPremieredGreaterThan(String value) {
            addCriterion("premiered >", value, "premiered");
            return (Criteria) this;
        }

        public Criteria andPremieredGreaterThanOrEqualTo(String value) {
            addCriterion("premiered >=", value, "premiered");
            return (Criteria) this;
        }

        public Criteria andPremieredLessThan(String value) {
            addCriterion("premiered <", value, "premiered");
            return (Criteria) this;
        }

        public Criteria andPremieredLessThanOrEqualTo(String value) {
            addCriterion("premiered <=", value, "premiered");
            return (Criteria) this;
        }

        public Criteria andPremieredLike(String value) {
            addCriterion("premiered like", value, "premiered");
            return (Criteria) this;
        }

        public Criteria andPremieredNotLike(String value) {
            addCriterion("premiered not like", value, "premiered");
            return (Criteria) this;
        }

        public Criteria andPremieredIn(List<String> values) {
            addCriterion("premiered in", values, "premiered");
            return (Criteria) this;
        }

        public Criteria andPremieredNotIn(List<String> values) {
            addCriterion("premiered not in", values, "premiered");
            return (Criteria) this;
        }

        public Criteria andPremieredBetween(String value1, String value2) {
            addCriterion("premiered between", value1, value2, "premiered");
            return (Criteria) this;
        }

        public Criteria andPremieredNotBetween(String value1, String value2) {
            addCriterion("premiered not between", value1, value2, "premiered");
            return (Criteria) this;
        }

        public Criteria andProducersIsNull() {
            addCriterion("producers is null");
            return (Criteria) this;
        }

        public Criteria andProducersIsNotNull() {
            addCriterion("producers is not null");
            return (Criteria) this;
        }

        public Criteria andProducersEqualTo(String value) {
            addCriterion("producers =", value, "producers");
            return (Criteria) this;
        }

        public Criteria andProducersNotEqualTo(String value) {
            addCriterion("producers <>", value, "producers");
            return (Criteria) this;
        }

        public Criteria andProducersGreaterThan(String value) {
            addCriterion("producers >", value, "producers");
            return (Criteria) this;
        }

        public Criteria andProducersGreaterThanOrEqualTo(String value) {
            addCriterion("producers >=", value, "producers");
            return (Criteria) this;
        }

        public Criteria andProducersLessThan(String value) {
            addCriterion("producers <", value, "producers");
            return (Criteria) this;
        }

        public Criteria andProducersLessThanOrEqualTo(String value) {
            addCriterion("producers <=", value, "producers");
            return (Criteria) this;
        }

        public Criteria andProducersLike(String value) {
            addCriterion("producers like", value, "producers");
            return (Criteria) this;
        }

        public Criteria andProducersNotLike(String value) {
            addCriterion("producers not like", value, "producers");
            return (Criteria) this;
        }

        public Criteria andProducersIn(List<String> values) {
            addCriterion("producers in", values, "producers");
            return (Criteria) this;
        }

        public Criteria andProducersNotIn(List<String> values) {
            addCriterion("producers not in", values, "producers");
            return (Criteria) this;
        }

        public Criteria andProducersBetween(String value1, String value2) {
            addCriterion("producers between", value1, value2, "producers");
            return (Criteria) this;
        }

        public Criteria andProducersNotBetween(String value1, String value2) {
            addCriterion("producers not between", value1, value2, "producers");
            return (Criteria) this;
        }

        public Criteria andStudiosIsNull() {
            addCriterion("studios is null");
            return (Criteria) this;
        }

        public Criteria andStudiosIsNotNull() {
            addCriterion("studios is not null");
            return (Criteria) this;
        }

        public Criteria andStudiosEqualTo(String value) {
            addCriterion("studios =", value, "studios");
            return (Criteria) this;
        }

        public Criteria andStudiosNotEqualTo(String value) {
            addCriterion("studios <>", value, "studios");
            return (Criteria) this;
        }

        public Criteria andStudiosGreaterThan(String value) {
            addCriterion("studios >", value, "studios");
            return (Criteria) this;
        }

        public Criteria andStudiosGreaterThanOrEqualTo(String value) {
            addCriterion("studios >=", value, "studios");
            return (Criteria) this;
        }

        public Criteria andStudiosLessThan(String value) {
            addCriterion("studios <", value, "studios");
            return (Criteria) this;
        }

        public Criteria andStudiosLessThanOrEqualTo(String value) {
            addCriterion("studios <=", value, "studios");
            return (Criteria) this;
        }

        public Criteria andStudiosLike(String value) {
            addCriterion("studios like", value, "studios");
            return (Criteria) this;
        }

        public Criteria andStudiosNotLike(String value) {
            addCriterion("studios not like", value, "studios");
            return (Criteria) this;
        }

        public Criteria andStudiosIn(List<String> values) {
            addCriterion("studios in", values, "studios");
            return (Criteria) this;
        }

        public Criteria andStudiosNotIn(List<String> values) {
            addCriterion("studios not in", values, "studios");
            return (Criteria) this;
        }

        public Criteria andStudiosBetween(String value1, String value2) {
            addCriterion("studios between", value1, value2, "studios");
            return (Criteria) this;
        }

        public Criteria andStudiosNotBetween(String value1, String value2) {
            addCriterion("studios not between", value1, value2, "studios");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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