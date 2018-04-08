package com.zd.shop.search.pojo.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable{
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

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("pro_name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("pro_name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("pro_name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("pro_name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("pro_name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("pro_name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("pro_name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("pro_name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("pro_name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("pro_name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("pro_name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("pro_name not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNull() {
            addCriterion("pro_price is null");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNotNull() {
            addCriterion("pro_price is not null");
            return (Criteria) this;
        }

        public Criteria andProPriceEqualTo(Double value) {
            addCriterion("pro_price =", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotEqualTo(Double value) {
            addCriterion("pro_price <>", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThan(Double value) {
            addCriterion("pro_price >", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pro_price >=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThan(Double value) {
            addCriterion("pro_price <", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThanOrEqualTo(Double value) {
            addCriterion("pro_price <=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceIn(List<Double> values) {
            addCriterion("pro_price in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotIn(List<Double> values) {
            addCriterion("pro_price not in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceBetween(Double value1, Double value2) {
            addCriterion("pro_price between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotBetween(Double value1, Double value2) {
            addCriterion("pro_price not between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProImageIsNull() {
            addCriterion("pro_image is null");
            return (Criteria) this;
        }

        public Criteria andProImageIsNotNull() {
            addCriterion("pro_image is not null");
            return (Criteria) this;
        }

        public Criteria andProImageEqualTo(String value) {
            addCriterion("pro_image =", value, "proImage");
            return (Criteria) this;
        }

        public Criteria andProImageNotEqualTo(String value) {
            addCriterion("pro_image <>", value, "proImage");
            return (Criteria) this;
        }

        public Criteria andProImageGreaterThan(String value) {
            addCriterion("pro_image >", value, "proImage");
            return (Criteria) this;
        }

        public Criteria andProImageGreaterThanOrEqualTo(String value) {
            addCriterion("pro_image >=", value, "proImage");
            return (Criteria) this;
        }

        public Criteria andProImageLessThan(String value) {
            addCriterion("pro_image <", value, "proImage");
            return (Criteria) this;
        }

        public Criteria andProImageLessThanOrEqualTo(String value) {
            addCriterion("pro_image <=", value, "proImage");
            return (Criteria) this;
        }

        public Criteria andProImageLike(String value) {
            addCriterion("pro_image like", value, "proImage");
            return (Criteria) this;
        }

        public Criteria andProImageNotLike(String value) {
            addCriterion("pro_image not like", value, "proImage");
            return (Criteria) this;
        }

        public Criteria andProImageIn(List<String> values) {
            addCriterion("pro_image in", values, "proImage");
            return (Criteria) this;
        }

        public Criteria andProImageNotIn(List<String> values) {
            addCriterion("pro_image not in", values, "proImage");
            return (Criteria) this;
        }

        public Criteria andProImageBetween(String value1, String value2) {
            addCriterion("pro_image between", value1, value2, "proImage");
            return (Criteria) this;
        }

        public Criteria andProImageNotBetween(String value1, String value2) {
            addCriterion("pro_image not between", value1, value2, "proImage");
            return (Criteria) this;
        }

        public Criteria andProDescIsNull() {
            addCriterion("pro_desc is null");
            return (Criteria) this;
        }

        public Criteria andProDescIsNotNull() {
            addCriterion("pro_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProDescEqualTo(String value) {
            addCriterion("pro_desc =", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotEqualTo(String value) {
            addCriterion("pro_desc <>", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescGreaterThan(String value) {
            addCriterion("pro_desc >", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescGreaterThanOrEqualTo(String value) {
            addCriterion("pro_desc >=", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLessThan(String value) {
            addCriterion("pro_desc <", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLessThanOrEqualTo(String value) {
            addCriterion("pro_desc <=", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLike(String value) {
            addCriterion("pro_desc like", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotLike(String value) {
            addCriterion("pro_desc not like", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescIn(List<String> values) {
            addCriterion("pro_desc in", values, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotIn(List<String> values) {
            addCriterion("pro_desc not in", values, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescBetween(String value1, String value2) {
            addCriterion("pro_desc between", value1, value2, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotBetween(String value1, String value2) {
            addCriterion("pro_desc not between", value1, value2, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDateIsNull() {
            addCriterion("pro_date is null");
            return (Criteria) this;
        }

        public Criteria andProDateIsNotNull() {
            addCriterion("pro_date is not null");
            return (Criteria) this;
        }

        public Criteria andProDateEqualTo(Date value) {
            addCriterionForJDBCDate("pro_date =", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pro_date <>", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pro_date >", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_date >=", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateLessThan(Date value) {
            addCriterionForJDBCDate("pro_date <", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_date <=", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateIn(List<Date> values) {
            addCriterionForJDBCDate("pro_date in", values, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pro_date not in", values, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_date between", value1, value2, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_date not between", value1, value2, "proDate");
            return (Criteria) this;
        }

        public Criteria andProStatusIsNull() {
            addCriterion("pro_status is null");
            return (Criteria) this;
        }

        public Criteria andProStatusIsNotNull() {
            addCriterion("pro_status is not null");
            return (Criteria) this;
        }

        public Criteria andProStatusEqualTo(Integer value) {
            addCriterion("pro_status =", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotEqualTo(Integer value) {
            addCriterion("pro_status <>", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusGreaterThan(Integer value) {
            addCriterion("pro_status >", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_status >=", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLessThan(Integer value) {
            addCriterion("pro_status <", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pro_status <=", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusIn(List<Integer> values) {
            addCriterion("pro_status in", values, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotIn(List<Integer> values) {
            addCriterion("pro_status not in", values, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusBetween(Integer value1, Integer value2) {
            addCriterion("pro_status between", value1, value2, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_status not between", value1, value2, "proStatus");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCatIdIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdEqualTo(Integer value) {
            addCriterion("cat_id =", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotEqualTo(Integer value) {
            addCriterion("cat_id <>", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThan(Integer value) {
            addCriterion("cat_id >", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_id >=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThan(Integer value) {
            addCriterion("cat_id <", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdLessThanOrEqualTo(Integer value) {
            addCriterion("cat_id <=", value, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdIn(List<Integer> values) {
            addCriterion("cat_id in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotIn(List<Integer> values) {
            addCriterion("cat_id not in", values, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdBetween(Integer value1, Integer value2) {
            addCriterion("cat_id between", value1, value2, "catId");
            return (Criteria) this;
        }

        public Criteria andCatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_id not between", value1, value2, "catId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable{

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable{
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