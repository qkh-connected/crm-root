package com.sm.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandSiteIsNull() {
            addCriterion("brand_site is null");
            return (Criteria) this;
        }

        public Criteria andBrandSiteIsNotNull() {
            addCriterion("brand_site is not null");
            return (Criteria) this;
        }

        public Criteria andBrandSiteEqualTo(String value) {
            addCriterion("brand_site =", value, "brandSite");
            return (Criteria) this;
        }

        public Criteria andBrandSiteNotEqualTo(String value) {
            addCriterion("brand_site <>", value, "brandSite");
            return (Criteria) this;
        }

        public Criteria andBrandSiteGreaterThan(String value) {
            addCriterion("brand_site >", value, "brandSite");
            return (Criteria) this;
        }

        public Criteria andBrandSiteGreaterThanOrEqualTo(String value) {
            addCriterion("brand_site >=", value, "brandSite");
            return (Criteria) this;
        }

        public Criteria andBrandSiteLessThan(String value) {
            addCriterion("brand_site <", value, "brandSite");
            return (Criteria) this;
        }

        public Criteria andBrandSiteLessThanOrEqualTo(String value) {
            addCriterion("brand_site <=", value, "brandSite");
            return (Criteria) this;
        }

        public Criteria andBrandSiteLike(String value) {
            addCriterion("brand_site like", value, "brandSite");
            return (Criteria) this;
        }

        public Criteria andBrandSiteNotLike(String value) {
            addCriterion("brand_site not like", value, "brandSite");
            return (Criteria) this;
        }

        public Criteria andBrandSiteIn(List<String> values) {
            addCriterion("brand_site in", values, "brandSite");
            return (Criteria) this;
        }

        public Criteria andBrandSiteNotIn(List<String> values) {
            addCriterion("brand_site not in", values, "brandSite");
            return (Criteria) this;
        }

        public Criteria andBrandSiteBetween(String value1, String value2) {
            addCriterion("brand_site between", value1, value2, "brandSite");
            return (Criteria) this;
        }

        public Criteria andBrandSiteNotBetween(String value1, String value2) {
            addCriterion("brand_site not between", value1, value2, "brandSite");
            return (Criteria) this;
        }

        public Criteria andBrandDescIsNull() {
            addCriterion("brand_desc is null");
            return (Criteria) this;
        }

        public Criteria andBrandDescIsNotNull() {
            addCriterion("brand_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBrandDescEqualTo(String value) {
            addCriterion("brand_desc =", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotEqualTo(String value) {
            addCriterion("brand_desc <>", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescGreaterThan(String value) {
            addCriterion("brand_desc >", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescGreaterThanOrEqualTo(String value) {
            addCriterion("brand_desc >=", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescLessThan(String value) {
            addCriterion("brand_desc <", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescLessThanOrEqualTo(String value) {
            addCriterion("brand_desc <=", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescLike(String value) {
            addCriterion("brand_desc like", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotLike(String value) {
            addCriterion("brand_desc not like", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescIn(List<String> values) {
            addCriterion("brand_desc in", values, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotIn(List<String> values) {
            addCriterion("brand_desc not in", values, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescBetween(String value1, String value2) {
            addCriterion("brand_desc between", value1, value2, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotBetween(String value1, String value2) {
            addCriterion("brand_desc not between", value1, value2, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandLogoIsNull() {
            addCriterion("brand_logo is null");
            return (Criteria) this;
        }

        public Criteria andBrandLogoIsNotNull() {
            addCriterion("brand_logo is not null");
            return (Criteria) this;
        }

        public Criteria andBrandLogoEqualTo(String value) {
            addCriterion("brand_logo =", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoNotEqualTo(String value) {
            addCriterion("brand_logo <>", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoGreaterThan(String value) {
            addCriterion("brand_logo >", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoGreaterThanOrEqualTo(String value) {
            addCriterion("brand_logo >=", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoLessThan(String value) {
            addCriterion("brand_logo <", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoLessThanOrEqualTo(String value) {
            addCriterion("brand_logo <=", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoLike(String value) {
            addCriterion("brand_logo like", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoNotLike(String value) {
            addCriterion("brand_logo not like", value, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoIn(List<String> values) {
            addCriterion("brand_logo in", values, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoNotIn(List<String> values) {
            addCriterion("brand_logo not in", values, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoBetween(String value1, String value2) {
            addCriterion("brand_logo between", value1, value2, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andBrandLogoNotBetween(String value1, String value2) {
            addCriterion("brand_logo not between", value1, value2, "brandLogo");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
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