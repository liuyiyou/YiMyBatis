package cn.liuyiyou.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

import java.util.Date;
/**
 * 代码自动生成，请不要修改，而是直接覆盖
 */
public class SubsExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubsExample() {
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


        public Criteria andSubsIdIsNull() {
            addCriterion("subs_id is null");
            return (Criteria) this;
        }

        public Criteria andSubsIdIsNotNull() {
            addCriterion("subs_id  is not null");
            return (Criteria) this;
        }

        public Criteria andSubsIdEqualTo(Long value) {
            addCriterion("subs_id =", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdNotEqualTo(Long value) {
            addCriterion("subs_id <>", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdGreaterThan(Long value) {
            addCriterion(" subs_id  >", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("subs_id >=", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdLessThan(Long value) {
            addCriterion("subs_id <", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdLessThanOrEqualTo(Long value) {
            addCriterion("subs_id <=", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdIn(List<Long> values) {
            addCriterion("subs_id in", values, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdNotIn(List<Long> values) {
            addCriterion("subs_id not in", values, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdBetween(Long value1, Long value2) {
            addCriterion("subs_id between", value1, value2, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdNotBetween(Long value1, Long value2) {
            addCriterion("subs_id not between", value1, value2, "subsId");
            return (Criteria) this;
        }

        public Criteria andUnionSubsIdIsNull() {
            addCriterion("union_subs_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionSubsIdIsNotNull() {
            addCriterion("union_subs_id  is not null");
            return (Criteria) this;
        }

        public Criteria andUnionSubsIdEqualTo(Long value) {
            addCriterion("union_subs_id =", value, "unionSubsId");
            return (Criteria) this;
        }

        public Criteria andUnionSubsIdNotEqualTo(Long value) {
            addCriterion("union_subs_id <>", value, "unionSubsId");
            return (Criteria) this;
        }

        public Criteria andUnionSubsIdGreaterThan(Long value) {
            addCriterion(" union_subs_id  >", value, "unionSubsId");
            return (Criteria) this;
        }

        public Criteria andUnionSubsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("union_subs_id >=", value, "unionSubsId");
            return (Criteria) this;
        }

        public Criteria andUnionSubsIdLessThan(Long value) {
            addCriterion("union_subs_id <", value, "unionSubsId");
            return (Criteria) this;
        }

        public Criteria andUnionSubsIdLessThanOrEqualTo(Long value) {
            addCriterion("union_subs_id <=", value, "unionSubsId");
            return (Criteria) this;
        }

        public Criteria andUnionSubsIdIn(List<Long> values) {
            addCriterion("union_subs_id in", values, "unionSubsId");
            return (Criteria) this;
        }

        public Criteria andUnionSubsIdNotIn(List<Long> values) {
            addCriterion("union_subs_id not in", values, "unionSubsId");
            return (Criteria) this;
        }

        public Criteria andUnionSubsIdBetween(Long value1, Long value2) {
            addCriterion("union_subs_id between", value1, value2, "unionSubsId");
            return (Criteria) this;
        }

        public Criteria andUnionSubsIdNotBetween(Long value1, Long value2) {
            addCriterion("union_subs_id not between", value1, value2, "unionSubsId");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid  is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion(" uid  >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time  is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion(" create_time  >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price  is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Float value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Float value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Float value) {
            addCriterion(" total_price  >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Float value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Float value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Float> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Float> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Float value1, Float value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Float value1, Float value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceIsNull() {
            addCriterion("freight_price is null");
            return (Criteria) this;
        }

        public Criteria andFreightPriceIsNotNull() {
            addCriterion("freight_price  is not null");
            return (Criteria) this;
        }

        public Criteria andFreightPriceEqualTo(Float value) {
            addCriterion("freight_price =", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceNotEqualTo(Float value) {
            addCriterion("freight_price <>", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceGreaterThan(Float value) {
            addCriterion(" freight_price  >", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("freight_price >=", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceLessThan(Float value) {
            addCriterion("freight_price <", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceLessThanOrEqualTo(Float value) {
            addCriterion("freight_price <=", value, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceIn(List<Float> values) {
            addCriterion("freight_price in", values, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceNotIn(List<Float> values) {
            addCriterion("freight_price not in", values, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceBetween(Float value1, Float value2) {
            addCriterion("freight_price between", value1, value2, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andFreightPriceNotBetween(Float value1, Float value2) {
            addCriterion("freight_price not between", value1, value2, "freightPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceIsNull() {
            addCriterion("tax_price is null");
            return (Criteria) this;
        }

        public Criteria andTaxPriceIsNotNull() {
            addCriterion("tax_price  is not null");
            return (Criteria) this;
        }

        public Criteria andTaxPriceEqualTo(Float value) {
            addCriterion("tax_price =", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceNotEqualTo(Float value) {
            addCriterion("tax_price <>", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceGreaterThan(Float value) {
            addCriterion(" tax_price  >", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("tax_price >=", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceLessThan(Float value) {
            addCriterion("tax_price <", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceLessThanOrEqualTo(Float value) {
            addCriterion("tax_price <=", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceIn(List<Float> values) {
            addCriterion("tax_price in", values, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceNotIn(List<Float> values) {
            addCriterion("tax_price not in", values, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceBetween(Float value1, Float value2) {
            addCriterion("tax_price between", value1, value2, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceNotBetween(Float value1, Float value2) {
            addCriterion("tax_price not between", value1, value2, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceIsNull() {
            addCriterion("deduct_price is null");
            return (Criteria) this;
        }

        public Criteria andDeductPriceIsNotNull() {
            addCriterion("deduct_price  is not null");
            return (Criteria) this;
        }

        public Criteria andDeductPriceEqualTo(Float value) {
            addCriterion("deduct_price =", value, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceNotEqualTo(Float value) {
            addCriterion("deduct_price <>", value, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceGreaterThan(Float value) {
            addCriterion(" deduct_price  >", value, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("deduct_price >=", value, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceLessThan(Float value) {
            addCriterion("deduct_price <", value, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceLessThanOrEqualTo(Float value) {
            addCriterion("deduct_price <=", value, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceIn(List<Float> values) {
            addCriterion("deduct_price in", values, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceNotIn(List<Float> values) {
            addCriterion("deduct_price not in", values, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceBetween(Float value1, Float value2) {
            addCriterion("deduct_price between", value1, value2, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceNotBetween(Float value1, Float value2) {
            addCriterion("deduct_price not between", value1, value2, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductTypeIsNull() {
            addCriterion("deduct_type is null");
            return (Criteria) this;
        }

        public Criteria andDeductTypeIsNotNull() {
            addCriterion("deduct_type  is not null");
            return (Criteria) this;
        }

        public Criteria andDeductTypeEqualTo(Integer value) {
            addCriterion("deduct_type =", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeNotEqualTo(Integer value) {
            addCriterion("deduct_type <>", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeGreaterThan(Integer value) {
            addCriterion(" deduct_type  >", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deduct_type >=", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeLessThan(Integer value) {
            addCriterion("deduct_type <", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeLessThanOrEqualTo(Integer value) {
            addCriterion("deduct_type <=", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeIn(List<Integer> values) {
            addCriterion("deduct_type in", values, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeNotIn(List<Integer> values) {
            addCriterion("deduct_type not in", values, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeBetween(Integer value1, Integer value2) {
            addCriterion("deduct_type between", value1, value2, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("deduct_type not between", value1, value2, "deductType");
            return (Criteria) this;
        }

        public Criteria andActDeductPriceIsNull() {
            addCriterion("act_deduct_price is null");
            return (Criteria) this;
        }

        public Criteria andActDeductPriceIsNotNull() {
            addCriterion("act_deduct_price  is not null");
            return (Criteria) this;
        }

        public Criteria andActDeductPriceEqualTo(Float value) {
            addCriterion("act_deduct_price =", value, "actDeductPrice");
            return (Criteria) this;
        }

        public Criteria andActDeductPriceNotEqualTo(Float value) {
            addCriterion("act_deduct_price <>", value, "actDeductPrice");
            return (Criteria) this;
        }

        public Criteria andActDeductPriceGreaterThan(Float value) {
            addCriterion(" act_deduct_price  >", value, "actDeductPrice");
            return (Criteria) this;
        }

        public Criteria andActDeductPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("act_deduct_price >=", value, "actDeductPrice");
            return (Criteria) this;
        }

        public Criteria andActDeductPriceLessThan(Float value) {
            addCriterion("act_deduct_price <", value, "actDeductPrice");
            return (Criteria) this;
        }

        public Criteria andActDeductPriceLessThanOrEqualTo(Float value) {
            addCriterion("act_deduct_price <=", value, "actDeductPrice");
            return (Criteria) this;
        }

        public Criteria andActDeductPriceIn(List<Float> values) {
            addCriterion("act_deduct_price in", values, "actDeductPrice");
            return (Criteria) this;
        }

        public Criteria andActDeductPriceNotIn(List<Float> values) {
            addCriterion("act_deduct_price not in", values, "actDeductPrice");
            return (Criteria) this;
        }

        public Criteria andActDeductPriceBetween(Float value1, Float value2) {
            addCriterion("act_deduct_price between", value1, value2, "actDeductPrice");
            return (Criteria) this;
        }

        public Criteria andActDeductPriceNotBetween(Float value1, Float value2) {
            addCriterion("act_deduct_price not between", value1, value2, "actDeductPrice");
            return (Criteria) this;
        }

        public Criteria andCouponDeductPriceIsNull() {
            addCriterion("coupon_deduct_price is null");
            return (Criteria) this;
        }

        public Criteria andCouponDeductPriceIsNotNull() {
            addCriterion("coupon_deduct_price  is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDeductPriceEqualTo(Float value) {
            addCriterion("coupon_deduct_price =", value, "couponDeductPrice");
            return (Criteria) this;
        }

        public Criteria andCouponDeductPriceNotEqualTo(Float value) {
            addCriterion("coupon_deduct_price <>", value, "couponDeductPrice");
            return (Criteria) this;
        }

        public Criteria andCouponDeductPriceGreaterThan(Float value) {
            addCriterion(" coupon_deduct_price  >", value, "couponDeductPrice");
            return (Criteria) this;
        }

        public Criteria andCouponDeductPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("coupon_deduct_price >=", value, "couponDeductPrice");
            return (Criteria) this;
        }

        public Criteria andCouponDeductPriceLessThan(Float value) {
            addCriterion("coupon_deduct_price <", value, "couponDeductPrice");
            return (Criteria) this;
        }

        public Criteria andCouponDeductPriceLessThanOrEqualTo(Float value) {
            addCriterion("coupon_deduct_price <=", value, "couponDeductPrice");
            return (Criteria) this;
        }

        public Criteria andCouponDeductPriceIn(List<Float> values) {
            addCriterion("coupon_deduct_price in", values, "couponDeductPrice");
            return (Criteria) this;
        }

        public Criteria andCouponDeductPriceNotIn(List<Float> values) {
            addCriterion("coupon_deduct_price not in", values, "couponDeductPrice");
            return (Criteria) this;
        }

        public Criteria andCouponDeductPriceBetween(Float value1, Float value2) {
            addCriterion("coupon_deduct_price between", value1, value2, "couponDeductPrice");
            return (Criteria) this;
        }

        public Criteria andCouponDeductPriceNotBetween(Float value1, Float value2) {
            addCriterion("coupon_deduct_price not between", value1, value2, "couponDeductPrice");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance  is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Float value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Float value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Float value) {
            addCriterion(" balance  >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Float value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Float value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Float> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Float> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Float value1, Float value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Float value1, Float value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andConsignIdnoIsNull() {
            addCriterion("consign_idno is null");
            return (Criteria) this;
        }

        public Criteria andConsignIdnoIsNotNull() {
            addCriterion("consign_idno  is not null");
            return (Criteria) this;
        }

        public Criteria andConsignIdnoEqualTo(String value) {
            addCriterion("consign_idno =", value, "consignIdno");
            return (Criteria) this;
        }

        public Criteria andConsignIdnoNotEqualTo(String value) {
            addCriterion("consign_idno <>", value, "consignIdno");
            return (Criteria) this;
        }

        public Criteria andConsignIdnoGreaterThan(String value) {
            addCriterion(" consign_idno  >", value, "consignIdno");
            return (Criteria) this;
        }

        public Criteria andConsignIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("consign_idno >=", value, "consignIdno");
            return (Criteria) this;
        }

        public Criteria andConsignIdnoLessThan(String value) {
            addCriterion("consign_idno <", value, "consignIdno");
            return (Criteria) this;
        }

        public Criteria andConsignIdnoLessThanOrEqualTo(String value) {
            addCriterion("consign_idno <=", value, "consignIdno");
            return (Criteria) this;
        }

        public Criteria andConsignIdnoIn(List<String> values) {
            addCriterion("consign_idno in", values, "consignIdno");
            return (Criteria) this;
        }

        public Criteria andConsignIdnoNotIn(List<String> values) {
            addCriterion("consign_idno not in", values, "consignIdno");
            return (Criteria) this;
        }

        public Criteria andConsignIdnoBetween(String value1, String value2) {
            addCriterion("consign_idno between", value1, value2, "consignIdno");
            return (Criteria) this;
        }

        public Criteria andConsignIdnoNotBetween(String value1, String value2) {
            addCriterion("consign_idno not between", value1, value2, "consignIdno");
            return (Criteria) this;
        }

        public Criteria andOverseaIsNull() {
            addCriterion("oversea is null");
            return (Criteria) this;
        }

        public Criteria andOverseaIsNotNull() {
            addCriterion("oversea  is not null");
            return (Criteria) this;
        }

        public Criteria andOverseaEqualTo(Integer value) {
            addCriterion("oversea =", value, "oversea");
            return (Criteria) this;
        }

        public Criteria andOverseaNotEqualTo(Integer value) {
            addCriterion("oversea <>", value, "oversea");
            return (Criteria) this;
        }

        public Criteria andOverseaGreaterThan(Integer value) {
            addCriterion(" oversea  >", value, "oversea");
            return (Criteria) this;
        }

        public Criteria andOverseaGreaterThanOrEqualTo(Integer value) {
            addCriterion("oversea >=", value, "oversea");
            return (Criteria) this;
        }

        public Criteria andOverseaLessThan(Integer value) {
            addCriterion("oversea <", value, "oversea");
            return (Criteria) this;
        }

        public Criteria andOverseaLessThanOrEqualTo(Integer value) {
            addCriterion("oversea <=", value, "oversea");
            return (Criteria) this;
        }

        public Criteria andOverseaIn(List<Integer> values) {
            addCriterion("oversea in", values, "oversea");
            return (Criteria) this;
        }

        public Criteria andOverseaNotIn(List<Integer> values) {
            addCriterion("oversea not in", values, "oversea");
            return (Criteria) this;
        }

        public Criteria andOverseaBetween(Integer value1, Integer value2) {
            addCriterion("oversea between", value1, value2, "oversea");
            return (Criteria) this;
        }

        public Criteria andOverseaNotBetween(Integer value1, Integer value2) {
            addCriterion("oversea not between", value1, value2, "oversea");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee  is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion(" consignee  >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsignPhoneIsNull() {
            addCriterion("consign_phone is null");
            return (Criteria) this;
        }

        public Criteria andConsignPhoneIsNotNull() {
            addCriterion("consign_phone  is not null");
            return (Criteria) this;
        }

        public Criteria andConsignPhoneEqualTo(String value) {
            addCriterion("consign_phone =", value, "consignPhone");
            return (Criteria) this;
        }

        public Criteria andConsignPhoneNotEqualTo(String value) {
            addCriterion("consign_phone <>", value, "consignPhone");
            return (Criteria) this;
        }

        public Criteria andConsignPhoneGreaterThan(String value) {
            addCriterion(" consign_phone  >", value, "consignPhone");
            return (Criteria) this;
        }

        public Criteria andConsignPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("consign_phone >=", value, "consignPhone");
            return (Criteria) this;
        }

        public Criteria andConsignPhoneLessThan(String value) {
            addCriterion("consign_phone <", value, "consignPhone");
            return (Criteria) this;
        }

        public Criteria andConsignPhoneLessThanOrEqualTo(String value) {
            addCriterion("consign_phone <=", value, "consignPhone");
            return (Criteria) this;
        }

        public Criteria andConsignPhoneIn(List<String> values) {
            addCriterion("consign_phone in", values, "consignPhone");
            return (Criteria) this;
        }

        public Criteria andConsignPhoneNotIn(List<String> values) {
            addCriterion("consign_phone not in", values, "consignPhone");
            return (Criteria) this;
        }

        public Criteria andConsignPhoneBetween(String value1, String value2) {
            addCriterion("consign_phone between", value1, value2, "consignPhone");
            return (Criteria) this;
        }

        public Criteria andConsignPhoneNotBetween(String value1, String value2) {
            addCriterion("consign_phone not between", value1, value2, "consignPhone");
            return (Criteria) this;
        }

        public Criteria andConsignAddrIsNull() {
            addCriterion("consign_addr is null");
            return (Criteria) this;
        }

        public Criteria andConsignAddrIsNotNull() {
            addCriterion("consign_addr  is not null");
            return (Criteria) this;
        }

        public Criteria andConsignAddrEqualTo(String value) {
            addCriterion("consign_addr =", value, "consignAddr");
            return (Criteria) this;
        }

        public Criteria andConsignAddrNotEqualTo(String value) {
            addCriterion("consign_addr <>", value, "consignAddr");
            return (Criteria) this;
        }

        public Criteria andConsignAddrGreaterThan(String value) {
            addCriterion(" consign_addr  >", value, "consignAddr");
            return (Criteria) this;
        }

        public Criteria andConsignAddrGreaterThanOrEqualTo(String value) {
            addCriterion("consign_addr >=", value, "consignAddr");
            return (Criteria) this;
        }

        public Criteria andConsignAddrLessThan(String value) {
            addCriterion("consign_addr <", value, "consignAddr");
            return (Criteria) this;
        }

        public Criteria andConsignAddrLessThanOrEqualTo(String value) {
            addCriterion("consign_addr <=", value, "consignAddr");
            return (Criteria) this;
        }

        public Criteria andConsignAddrIn(List<String> values) {
            addCriterion("consign_addr in", values, "consignAddr");
            return (Criteria) this;
        }

        public Criteria andConsignAddrNotIn(List<String> values) {
            addCriterion("consign_addr not in", values, "consignAddr");
            return (Criteria) this;
        }

        public Criteria andConsignAddrBetween(String value1, String value2) {
            addCriterion("consign_addr between", value1, value2, "consignAddr");
            return (Criteria) this;
        }

        public Criteria andConsignAddrNotBetween(String value1, String value2) {
            addCriterion("consign_addr not between", value1, value2, "consignAddr");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status  is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion(" status  >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusIsNull() {
            addCriterion("declare_status is null");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusIsNotNull() {
            addCriterion("declare_status  is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusEqualTo(Integer value) {
            addCriterion("declare_status =", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusNotEqualTo(Integer value) {
            addCriterion("declare_status <>", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusGreaterThan(Integer value) {
            addCriterion(" declare_status  >", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("declare_status >=", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusLessThan(Integer value) {
            addCriterion("declare_status <", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusLessThanOrEqualTo(Integer value) {
            addCriterion("declare_status <=", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusIn(List<Integer> values) {
            addCriterion("declare_status in", values, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusNotIn(List<Integer> values) {
            addCriterion("declare_status not in", values, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusBetween(Integer value1, Integer value2) {
            addCriterion("declare_status between", value1, value2, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("declare_status not between", value1, value2, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andStatusTimeIsNull() {
            addCriterion("status_time is null");
            return (Criteria) this;
        }

        public Criteria andStatusTimeIsNotNull() {
            addCriterion("status_time  is not null");
            return (Criteria) this;
        }

        public Criteria andStatusTimeEqualTo(String value) {
            addCriterion("status_time =", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeNotEqualTo(String value) {
            addCriterion("status_time <>", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeGreaterThan(String value) {
            addCriterion(" status_time  >", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeGreaterThanOrEqualTo(String value) {
            addCriterion("status_time >=", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeLessThan(String value) {
            addCriterion("status_time <", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeLessThanOrEqualTo(String value) {
            addCriterion("status_time <=", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeIn(List<String> values) {
            addCriterion("status_time in", values, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeNotIn(List<String> values) {
            addCriterion("status_time not in", values, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeBetween(String value1, String value2) {
            addCriterion("status_time between", value1, value2, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeNotBetween(String value1, String value2) {
            addCriterion("status_time not between", value1, value2, "statusTime");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIsNull() {
            addCriterion("return_status is null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIsNotNull() {
            addCriterion("return_status  is not null");
            return (Criteria) this;
        }

        public Criteria andReturnStatusEqualTo(Integer value) {
            addCriterion("return_status =", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotEqualTo(Integer value) {
            addCriterion("return_status <>", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThan(Integer value) {
            addCriterion(" return_status  >", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_status >=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThan(Integer value) {
            addCriterion("return_status <", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusLessThanOrEqualTo(Integer value) {
            addCriterion("return_status <=", value, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusIn(List<Integer> values) {
            addCriterion("return_status in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotIn(List<Integer> values) {
            addCriterion("return_status not in", values, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusBetween(Integer value1, Integer value2) {
            addCriterion("return_status between", value1, value2, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("return_status not between", value1, value2, "returnStatus");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNull() {
            addCriterion("return_time is null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNotNull() {
            addCriterion("return_time  is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeEqualTo(Date value) {
            addCriterion("return_time =", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotEqualTo(Date value) {
            addCriterion("return_time <>", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThan(Date value) {
            addCriterion(" return_time  >", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("return_time >=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThan(Date value) {
            addCriterion("return_time <", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("return_time <=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIn(List<Date> values) {
            addCriterion("return_time in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotIn(List<Date> values) {
            addCriterion("return_time not in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeBetween(Date value1, Date value2) {
            addCriterion("return_time between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("return_time not between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIsNull() {
            addCriterion("return_amount is null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIsNotNull() {
            addCriterion("return_amount  is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountEqualTo(Float value) {
            addCriterion("return_amount =", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotEqualTo(Float value) {
            addCriterion("return_amount <>", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThan(Float value) {
            addCriterion(" return_amount  >", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("return_amount >=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThan(Float value) {
            addCriterion("return_amount <", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThanOrEqualTo(Float value) {
            addCriterion("return_amount <=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIn(List<Float> values) {
            addCriterion("return_amount in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotIn(List<Float> values) {
            addCriterion("return_amount not in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountBetween(Float value1, Float value2) {
            addCriterion("return_amount between", value1, value2, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotBetween(Float value1, Float value2) {
            addCriterion("return_amount not between", value1, value2, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNull() {
            addCriterion("cancel_reason is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("cancel_reason  is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("cancel_reason =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("cancel_reason <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion(" cancel_reason  >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_reason >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("cancel_reason <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("cancel_reason <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("cancel_reason in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("cancel_reason not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("cancel_reason between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("cancel_reason not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andConsignCountryIsNull() {
            addCriterion("consign_country is null");
            return (Criteria) this;
        }

        public Criteria andConsignCountryIsNotNull() {
            addCriterion("consign_country  is not null");
            return (Criteria) this;
        }

        public Criteria andConsignCountryEqualTo(Integer value) {
            addCriterion("consign_country =", value, "consignCountry");
            return (Criteria) this;
        }

        public Criteria andConsignCountryNotEqualTo(Integer value) {
            addCriterion("consign_country <>", value, "consignCountry");
            return (Criteria) this;
        }

        public Criteria andConsignCountryGreaterThan(Integer value) {
            addCriterion(" consign_country  >", value, "consignCountry");
            return (Criteria) this;
        }

        public Criteria andConsignCountryGreaterThanOrEqualTo(Integer value) {
            addCriterion("consign_country >=", value, "consignCountry");
            return (Criteria) this;
        }

        public Criteria andConsignCountryLessThan(Integer value) {
            addCriterion("consign_country <", value, "consignCountry");
            return (Criteria) this;
        }

        public Criteria andConsignCountryLessThanOrEqualTo(Integer value) {
            addCriterion("consign_country <=", value, "consignCountry");
            return (Criteria) this;
        }

        public Criteria andConsignCountryIn(List<Integer> values) {
            addCriterion("consign_country in", values, "consignCountry");
            return (Criteria) this;
        }

        public Criteria andConsignCountryNotIn(List<Integer> values) {
            addCriterion("consign_country not in", values, "consignCountry");
            return (Criteria) this;
        }

        public Criteria andConsignCountryBetween(Integer value1, Integer value2) {
            addCriterion("consign_country between", value1, value2, "consignCountry");
            return (Criteria) this;
        }

        public Criteria andConsignCountryNotBetween(Integer value1, Integer value2) {
            addCriterion("consign_country not between", value1, value2, "consignCountry");
            return (Criteria) this;
        }

        public Criteria andConsignProvinceIsNull() {
            addCriterion("consign_province is null");
            return (Criteria) this;
        }

        public Criteria andConsignProvinceIsNotNull() {
            addCriterion("consign_province  is not null");
            return (Criteria) this;
        }

        public Criteria andConsignProvinceEqualTo(Integer value) {
            addCriterion("consign_province =", value, "consignProvince");
            return (Criteria) this;
        }

        public Criteria andConsignProvinceNotEqualTo(Integer value) {
            addCriterion("consign_province <>", value, "consignProvince");
            return (Criteria) this;
        }

        public Criteria andConsignProvinceGreaterThan(Integer value) {
            addCriterion(" consign_province  >", value, "consignProvince");
            return (Criteria) this;
        }

        public Criteria andConsignProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("consign_province >=", value, "consignProvince");
            return (Criteria) this;
        }

        public Criteria andConsignProvinceLessThan(Integer value) {
            addCriterion("consign_province <", value, "consignProvince");
            return (Criteria) this;
        }

        public Criteria andConsignProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("consign_province <=", value, "consignProvince");
            return (Criteria) this;
        }

        public Criteria andConsignProvinceIn(List<Integer> values) {
            addCriterion("consign_province in", values, "consignProvince");
            return (Criteria) this;
        }

        public Criteria andConsignProvinceNotIn(List<Integer> values) {
            addCriterion("consign_province not in", values, "consignProvince");
            return (Criteria) this;
        }

        public Criteria andConsignProvinceBetween(Integer value1, Integer value2) {
            addCriterion("consign_province between", value1, value2, "consignProvince");
            return (Criteria) this;
        }

        public Criteria andConsignProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("consign_province not between", value1, value2, "consignProvince");
            return (Criteria) this;
        }

        public Criteria andConsignCityIsNull() {
            addCriterion("consign_city is null");
            return (Criteria) this;
        }

        public Criteria andConsignCityIsNotNull() {
            addCriterion("consign_city  is not null");
            return (Criteria) this;
        }

        public Criteria andConsignCityEqualTo(Integer value) {
            addCriterion("consign_city =", value, "consignCity");
            return (Criteria) this;
        }

        public Criteria andConsignCityNotEqualTo(Integer value) {
            addCriterion("consign_city <>", value, "consignCity");
            return (Criteria) this;
        }

        public Criteria andConsignCityGreaterThan(Integer value) {
            addCriterion(" consign_city  >", value, "consignCity");
            return (Criteria) this;
        }

        public Criteria andConsignCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("consign_city >=", value, "consignCity");
            return (Criteria) this;
        }

        public Criteria andConsignCityLessThan(Integer value) {
            addCriterion("consign_city <", value, "consignCity");
            return (Criteria) this;
        }

        public Criteria andConsignCityLessThanOrEqualTo(Integer value) {
            addCriterion("consign_city <=", value, "consignCity");
            return (Criteria) this;
        }

        public Criteria andConsignCityIn(List<Integer> values) {
            addCriterion("consign_city in", values, "consignCity");
            return (Criteria) this;
        }

        public Criteria andConsignCityNotIn(List<Integer> values) {
            addCriterion("consign_city not in", values, "consignCity");
            return (Criteria) this;
        }

        public Criteria andConsignCityBetween(Integer value1, Integer value2) {
            addCriterion("consign_city between", value1, value2, "consignCity");
            return (Criteria) this;
        }

        public Criteria andConsignCityNotBetween(Integer value1, Integer value2) {
            addCriterion("consign_city not between", value1, value2, "consignCity");
            return (Criteria) this;
        }

        public Criteria andSubsnoIsNull() {
            addCriterion("subsno is null");
            return (Criteria) this;
        }

        public Criteria andSubsnoIsNotNull() {
            addCriterion("subsno  is not null");
            return (Criteria) this;
        }

        public Criteria andSubsnoEqualTo(String value) {
            addCriterion("subsno =", value, "subsno");
            return (Criteria) this;
        }

        public Criteria andSubsnoNotEqualTo(String value) {
            addCriterion("subsno <>", value, "subsno");
            return (Criteria) this;
        }

        public Criteria andSubsnoGreaterThan(String value) {
            addCriterion(" subsno  >", value, "subsno");
            return (Criteria) this;
        }

        public Criteria andSubsnoGreaterThanOrEqualTo(String value) {
            addCriterion("subsno >=", value, "subsno");
            return (Criteria) this;
        }

        public Criteria andSubsnoLessThan(String value) {
            addCriterion("subsno <", value, "subsno");
            return (Criteria) this;
        }

        public Criteria andSubsnoLessThanOrEqualTo(String value) {
            addCriterion("subsno <=", value, "subsno");
            return (Criteria) this;
        }

        public Criteria andSubsnoIn(List<String> values) {
            addCriterion("subsno in", values, "subsno");
            return (Criteria) this;
        }

        public Criteria andSubsnoNotIn(List<String> values) {
            addCriterion("subsno not in", values, "subsno");
            return (Criteria) this;
        }

        public Criteria andSubsnoBetween(String value1, String value2) {
            addCriterion("subsno between", value1, value2, "subsno");
            return (Criteria) this;
        }

        public Criteria andSubsnoNotBetween(String value1, String value2) {
            addCriterion("subsno not between", value1, value2, "subsno");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type  is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion(" pay_type  >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight  is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Float value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Float value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Float value) {
            addCriterion(" weight  >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Float value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Float value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Float> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Float> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Float value1, Float value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Float value1, Float value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andPaynoIsNull() {
            addCriterion("payno is null");
            return (Criteria) this;
        }

        public Criteria andPaynoIsNotNull() {
            addCriterion("payno  is not null");
            return (Criteria) this;
        }

        public Criteria andPaynoEqualTo(String value) {
            addCriterion("payno =", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoNotEqualTo(String value) {
            addCriterion("payno <>", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoGreaterThan(String value) {
            addCriterion(" payno  >", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoGreaterThanOrEqualTo(String value) {
            addCriterion("payno >=", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoLessThan(String value) {
            addCriterion("payno <", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoLessThanOrEqualTo(String value) {
            addCriterion("payno <=", value, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoIn(List<String> values) {
            addCriterion("payno in", values, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoNotIn(List<String> values) {
            addCriterion("payno not in", values, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoBetween(String value1, String value2) {
            addCriterion("payno between", value1, value2, "payno");
            return (Criteria) this;
        }

        public Criteria andPaynoNotBetween(String value1, String value2) {
            addCriterion("payno not between", value1, value2, "payno");
            return (Criteria) this;
        }

        public Criteria andTrannoIsNull() {
            addCriterion("tranno is null");
            return (Criteria) this;
        }

        public Criteria andTrannoIsNotNull() {
            addCriterion("tranno  is not null");
            return (Criteria) this;
        }

        public Criteria andTrannoEqualTo(String value) {
            addCriterion("tranno =", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoNotEqualTo(String value) {
            addCriterion("tranno <>", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoGreaterThan(String value) {
            addCriterion(" tranno  >", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoGreaterThanOrEqualTo(String value) {
            addCriterion("tranno >=", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoLessThan(String value) {
            addCriterion("tranno <", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoLessThanOrEqualTo(String value) {
            addCriterion("tranno <=", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoIn(List<String> values) {
            addCriterion("tranno in", values, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoNotIn(List<String> values) {
            addCriterion("tranno not in", values, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoBetween(String value1, String value2) {
            addCriterion("tranno between", value1, value2, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoNotBetween(String value1, String value2) {
            addCriterion("tranno not between", value1, value2, "tranno");
            return (Criteria) this;
        }

        public Criteria andSubTrannoIsNull() {
            addCriterion("sub_tranno is null");
            return (Criteria) this;
        }

        public Criteria andSubTrannoIsNotNull() {
            addCriterion("sub_tranno  is not null");
            return (Criteria) this;
        }

        public Criteria andSubTrannoEqualTo(String value) {
            addCriterion("sub_tranno =", value, "subTranno");
            return (Criteria) this;
        }

        public Criteria andSubTrannoNotEqualTo(String value) {
            addCriterion("sub_tranno <>", value, "subTranno");
            return (Criteria) this;
        }

        public Criteria andSubTrannoGreaterThan(String value) {
            addCriterion(" sub_tranno  >", value, "subTranno");
            return (Criteria) this;
        }

        public Criteria andSubTrannoGreaterThanOrEqualTo(String value) {
            addCriterion("sub_tranno >=", value, "subTranno");
            return (Criteria) this;
        }

        public Criteria andSubTrannoLessThan(String value) {
            addCriterion("sub_tranno <", value, "subTranno");
            return (Criteria) this;
        }

        public Criteria andSubTrannoLessThanOrEqualTo(String value) {
            addCriterion("sub_tranno <=", value, "subTranno");
            return (Criteria) this;
        }

        public Criteria andSubTrannoIn(List<String> values) {
            addCriterion("sub_tranno in", values, "subTranno");
            return (Criteria) this;
        }

        public Criteria andSubTrannoNotIn(List<String> values) {
            addCriterion("sub_tranno not in", values, "subTranno");
            return (Criteria) this;
        }

        public Criteria andSubTrannoBetween(String value1, String value2) {
            addCriterion("sub_tranno between", value1, value2, "subTranno");
            return (Criteria) this;
        }

        public Criteria andSubTrannoNotBetween(String value1, String value2) {
            addCriterion("sub_tranno not between", value1, value2, "subTranno");
            return (Criteria) this;
        }

        public Criteria andExpressnoIsNull() {
            addCriterion("expressno is null");
            return (Criteria) this;
        }

        public Criteria andExpressnoIsNotNull() {
            addCriterion("expressno  is not null");
            return (Criteria) this;
        }

        public Criteria andExpressnoEqualTo(String value) {
            addCriterion("expressno =", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotEqualTo(String value) {
            addCriterion("expressno <>", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoGreaterThan(String value) {
            addCriterion(" expressno  >", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoGreaterThanOrEqualTo(String value) {
            addCriterion("expressno >=", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoLessThan(String value) {
            addCriterion("expressno <", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoLessThanOrEqualTo(String value) {
            addCriterion("expressno <=", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoIn(List<String> values) {
            addCriterion("expressno in", values, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotIn(List<String> values) {
            addCriterion("expressno not in", values, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoBetween(String value1, String value2) {
            addCriterion("expressno between", value1, value2, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotBetween(String value1, String value2) {
            addCriterion("expressno not between", value1, value2, "expressno");
            return (Criteria) this;
        }

        public Criteria andUaccountIsNull() {
            addCriterion("uaccount is null");
            return (Criteria) this;
        }

        public Criteria andUaccountIsNotNull() {
            addCriterion("uaccount  is not null");
            return (Criteria) this;
        }

        public Criteria andUaccountEqualTo(String value) {
            addCriterion("uaccount =", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountNotEqualTo(String value) {
            addCriterion("uaccount <>", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountGreaterThan(String value) {
            addCriterion(" uaccount  >", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountGreaterThanOrEqualTo(String value) {
            addCriterion("uaccount >=", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountLessThan(String value) {
            addCriterion("uaccount <", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountLessThanOrEqualTo(String value) {
            addCriterion("uaccount <=", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountIn(List<String> values) {
            addCriterion("uaccount in", values, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountNotIn(List<String> values) {
            addCriterion("uaccount not in", values, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountBetween(String value1, String value2) {
            addCriterion("uaccount between", value1, value2, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountNotBetween(String value1, String value2) {
            addCriterion("uaccount not between", value1, value2, "uaccount");
            return (Criteria) this;
        }

        public Criteria andSrcIsNull() {
            addCriterion("src is null");
            return (Criteria) this;
        }

        public Criteria andSrcIsNotNull() {
            addCriterion("src  is not null");
            return (Criteria) this;
        }

        public Criteria andSrcEqualTo(Integer value) {
            addCriterion("src =", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotEqualTo(Integer value) {
            addCriterion("src <>", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcGreaterThan(Integer value) {
            addCriterion(" src  >", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcGreaterThanOrEqualTo(Integer value) {
            addCriterion("src >=", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLessThan(Integer value) {
            addCriterion("src <", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLessThanOrEqualTo(Integer value) {
            addCriterion("src <=", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcIn(List<Integer> values) {
            addCriterion("src in", values, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotIn(List<Integer> values) {
            addCriterion("src not in", values, "src");
            return (Criteria) this;
        }

        public Criteria andSrcBetween(Integer value1, Integer value2) {
            addCriterion("src between", value1, value2, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotBetween(Integer value1, Integer value2) {
            addCriterion("src not between", value1, value2, "src");
            return (Criteria) this;
        }

        public Criteria andMixIsNull() {
            addCriterion("mix is null");
            return (Criteria) this;
        }

        public Criteria andMixIsNotNull() {
            addCriterion("mix  is not null");
            return (Criteria) this;
        }

        public Criteria andMixEqualTo(Integer value) {
            addCriterion("mix =", value, "mix");
            return (Criteria) this;
        }

        public Criteria andMixNotEqualTo(Integer value) {
            addCriterion("mix <>", value, "mix");
            return (Criteria) this;
        }

        public Criteria andMixGreaterThan(Integer value) {
            addCriterion(" mix  >", value, "mix");
            return (Criteria) this;
        }

        public Criteria andMixGreaterThanOrEqualTo(Integer value) {
            addCriterion("mix >=", value, "mix");
            return (Criteria) this;
        }

        public Criteria andMixLessThan(Integer value) {
            addCriterion("mix <", value, "mix");
            return (Criteria) this;
        }

        public Criteria andMixLessThanOrEqualTo(Integer value) {
            addCriterion("mix <=", value, "mix");
            return (Criteria) this;
        }

        public Criteria andMixIn(List<Integer> values) {
            addCriterion("mix in", values, "mix");
            return (Criteria) this;
        }

        public Criteria andMixNotIn(List<Integer> values) {
            addCriterion("mix not in", values, "mix");
            return (Criteria) this;
        }

        public Criteria andMixBetween(Integer value1, Integer value2) {
            addCriterion("mix between", value1, value2, "mix");
            return (Criteria) this;
        }

        public Criteria andMixNotBetween(Integer value1, Integer value2) {
            addCriterion("mix not between", value1, value2, "mix");
            return (Criteria) this;
        }

        public Criteria andOpUidIsNull() {
            addCriterion("op_uid is null");
            return (Criteria) this;
        }

        public Criteria andOpUidIsNotNull() {
            addCriterion("op_uid  is not null");
            return (Criteria) this;
        }

        public Criteria andOpUidEqualTo(Integer value) {
            addCriterion("op_uid =", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidNotEqualTo(Integer value) {
            addCriterion("op_uid <>", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidGreaterThan(Integer value) {
            addCriterion(" op_uid  >", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_uid >=", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidLessThan(Integer value) {
            addCriterion("op_uid <", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidLessThanOrEqualTo(Integer value) {
            addCriterion("op_uid <=", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidIn(List<Integer> values) {
            addCriterion("op_uid in", values, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidNotIn(List<Integer> values) {
            addCriterion("op_uid not in", values, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidBetween(Integer value1, Integer value2) {
            addCriterion("op_uid between", value1, value2, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidNotBetween(Integer value1, Integer value2) {
            addCriterion("op_uid not between", value1, value2, "opUid");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel  is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Integer value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Integer value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Integer value) {
            addCriterion(" channel  >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Integer value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Integer value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Integer> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Integer> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Integer value1, Integer value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id  is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion(" supplier_id  >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNull() {
            addCriterion("express_id is null");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNotNull() {
            addCriterion("express_id  is not null");
            return (Criteria) this;
        }

        public Criteria andExpressIdEqualTo(Integer value) {
            addCriterion("express_id =", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotEqualTo(Integer value) {
            addCriterion("express_id <>", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThan(Integer value) {
            addCriterion(" express_id  >", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("express_id >=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThan(Integer value) {
            addCriterion("express_id <", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThanOrEqualTo(Integer value) {
            addCriterion("express_id <=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdIn(List<Integer> values) {
            addCriterion("express_id in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotIn(List<Integer> values) {
            addCriterion("express_id not in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdBetween(Integer value1, Integer value2) {
            addCriterion("express_id between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("express_id not between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressNameIsNull() {
            addCriterion("express_name is null");
            return (Criteria) this;
        }

        public Criteria andExpressNameIsNotNull() {
            addCriterion("express_name  is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNameEqualTo(String value) {
            addCriterion("express_name =", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotEqualTo(String value) {
            addCriterion("express_name <>", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThan(String value) {
            addCriterion(" express_name  >", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThanOrEqualTo(String value) {
            addCriterion("express_name >=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThan(String value) {
            addCriterion("express_name <", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThanOrEqualTo(String value) {
            addCriterion("express_name <=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameIn(List<String> values) {
            addCriterion("express_name in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotIn(List<String> values) {
            addCriterion("express_name not in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameBetween(String value1, String value2) {
            addCriterion("express_name between", value1, value2, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotBetween(String value1, String value2) {
            addCriterion("express_name not between", value1, value2, "expressName");
            return (Criteria) this;
        }

        public Criteria andInnerExpnoIsNull() {
            addCriterion("inner_expno is null");
            return (Criteria) this;
        }

        public Criteria andInnerExpnoIsNotNull() {
            addCriterion("inner_expno  is not null");
            return (Criteria) this;
        }

        public Criteria andInnerExpnoEqualTo(String value) {
            addCriterion("inner_expno =", value, "innerExpno");
            return (Criteria) this;
        }

        public Criteria andInnerExpnoNotEqualTo(String value) {
            addCriterion("inner_expno <>", value, "innerExpno");
            return (Criteria) this;
        }

        public Criteria andInnerExpnoGreaterThan(String value) {
            addCriterion(" inner_expno  >", value, "innerExpno");
            return (Criteria) this;
        }

        public Criteria andInnerExpnoGreaterThanOrEqualTo(String value) {
            addCriterion("inner_expno >=", value, "innerExpno");
            return (Criteria) this;
        }

        public Criteria andInnerExpnoLessThan(String value) {
            addCriterion("inner_expno <", value, "innerExpno");
            return (Criteria) this;
        }

        public Criteria andInnerExpnoLessThanOrEqualTo(String value) {
            addCriterion("inner_expno <=", value, "innerExpno");
            return (Criteria) this;
        }

        public Criteria andInnerExpnoIn(List<String> values) {
            addCriterion("inner_expno in", values, "innerExpno");
            return (Criteria) this;
        }

        public Criteria andInnerExpnoNotIn(List<String> values) {
            addCriterion("inner_expno not in", values, "innerExpno");
            return (Criteria) this;
        }

        public Criteria andInnerExpnoBetween(String value1, String value2) {
            addCriterion("inner_expno between", value1, value2, "innerExpno");
            return (Criteria) this;
        }

        public Criteria andInnerExpnoNotBetween(String value1, String value2) {
            addCriterion("inner_expno not between", value1, value2, "innerExpno");
            return (Criteria) this;
        }

        public Criteria andInnerExpidIsNull() {
            addCriterion("inner_expid is null");
            return (Criteria) this;
        }

        public Criteria andInnerExpidIsNotNull() {
            addCriterion("inner_expid  is not null");
            return (Criteria) this;
        }

        public Criteria andInnerExpidEqualTo(Integer value) {
            addCriterion("inner_expid =", value, "innerExpid");
            return (Criteria) this;
        }

        public Criteria andInnerExpidNotEqualTo(Integer value) {
            addCriterion("inner_expid <>", value, "innerExpid");
            return (Criteria) this;
        }

        public Criteria andInnerExpidGreaterThan(Integer value) {
            addCriterion(" inner_expid  >", value, "innerExpid");
            return (Criteria) this;
        }

        public Criteria andInnerExpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("inner_expid >=", value, "innerExpid");
            return (Criteria) this;
        }

        public Criteria andInnerExpidLessThan(Integer value) {
            addCriterion("inner_expid <", value, "innerExpid");
            return (Criteria) this;
        }

        public Criteria andInnerExpidLessThanOrEqualTo(Integer value) {
            addCriterion("inner_expid <=", value, "innerExpid");
            return (Criteria) this;
        }

        public Criteria andInnerExpidIn(List<Integer> values) {
            addCriterion("inner_expid in", values, "innerExpid");
            return (Criteria) this;
        }

        public Criteria andInnerExpidNotIn(List<Integer> values) {
            addCriterion("inner_expid not in", values, "innerExpid");
            return (Criteria) this;
        }

        public Criteria andInnerExpidBetween(Integer value1, Integer value2) {
            addCriterion("inner_expid between", value1, value2, "innerExpid");
            return (Criteria) this;
        }

        public Criteria andInnerExpidNotBetween(Integer value1, Integer value2) {
            addCriterion("inner_expid not between", value1, value2, "innerExpid");
            return (Criteria) this;
        }

        public Criteria andInnerExpnameIsNull() {
            addCriterion("inner_expname is null");
            return (Criteria) this;
        }

        public Criteria andInnerExpnameIsNotNull() {
            addCriterion("inner_expname  is not null");
            return (Criteria) this;
        }

        public Criteria andInnerExpnameEqualTo(String value) {
            addCriterion("inner_expname =", value, "innerExpname");
            return (Criteria) this;
        }

        public Criteria andInnerExpnameNotEqualTo(String value) {
            addCriterion("inner_expname <>", value, "innerExpname");
            return (Criteria) this;
        }

        public Criteria andInnerExpnameGreaterThan(String value) {
            addCriterion(" inner_expname  >", value, "innerExpname");
            return (Criteria) this;
        }

        public Criteria andInnerExpnameGreaterThanOrEqualTo(String value) {
            addCriterion("inner_expname >=", value, "innerExpname");
            return (Criteria) this;
        }

        public Criteria andInnerExpnameLessThan(String value) {
            addCriterion("inner_expname <", value, "innerExpname");
            return (Criteria) this;
        }

        public Criteria andInnerExpnameLessThanOrEqualTo(String value) {
            addCriterion("inner_expname <=", value, "innerExpname");
            return (Criteria) this;
        }

        public Criteria andInnerExpnameIn(List<String> values) {
            addCriterion("inner_expname in", values, "innerExpname");
            return (Criteria) this;
        }

        public Criteria andInnerExpnameNotIn(List<String> values) {
            addCriterion("inner_expname not in", values, "innerExpname");
            return (Criteria) this;
        }

        public Criteria andInnerExpnameBetween(String value1, String value2) {
            addCriterion("inner_expname between", value1, value2, "innerExpname");
            return (Criteria) this;
        }

        public Criteria andInnerExpnameNotBetween(String value1, String value2) {
            addCriterion("inner_expname not between", value1, value2, "innerExpname");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id  is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion(" shop_id  >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark  is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion(" remark  >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andActIdIsNull() {
            addCriterion("act_id is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("act_id  is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(Long value) {
            addCriterion("act_id =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(Long value) {
            addCriterion("act_id <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(Long value) {
            addCriterion(" act_id  >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(Long value) {
            addCriterion("act_id >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(Long value) {
            addCriterion("act_id <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(Long value) {
            addCriterion("act_id <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<Long> values) {
            addCriterion("act_id in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<Long> values) {
            addCriterion("act_id not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(Long value1, Long value2) {
            addCriterion("act_id between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(Long value1, Long value2) {
            addCriterion("act_id not between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time  is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion(" pay_time  >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time  is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion(" send_time  >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeIsNull() {
            addCriterion("distribute_time is null");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeIsNotNull() {
            addCriterion("distribute_time  is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeEqualTo(Date value) {
            addCriterion("distribute_time =", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeNotEqualTo(Date value) {
            addCriterion("distribute_time <>", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeGreaterThan(Date value) {
            addCriterion(" distribute_time  >", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("distribute_time >=", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeLessThan(Date value) {
            addCriterion("distribute_time <", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeLessThanOrEqualTo(Date value) {
            addCriterion("distribute_time <=", value, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeIn(List<Date> values) {
            addCriterion("distribute_time in", values, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeNotIn(List<Date> values) {
            addCriterion("distribute_time not in", values, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeBetween(Date value1, Date value2) {
            addCriterion("distribute_time between", value1, value2, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDistributeTimeNotBetween(Date value1, Date value2) {
            addCriterion("distribute_time not between", value1, value2, "distributeTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeIsNull() {
            addCriterion("done_time is null");
            return (Criteria) this;
        }

        public Criteria andDoneTimeIsNotNull() {
            addCriterion("done_time  is not null");
            return (Criteria) this;
        }

        public Criteria andDoneTimeEqualTo(Date value) {
            addCriterion("done_time =", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeNotEqualTo(Date value) {
            addCriterion("done_time <>", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeGreaterThan(Date value) {
            addCriterion(" done_time  >", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("done_time >=", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeLessThan(Date value) {
            addCriterion("done_time <", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeLessThanOrEqualTo(Date value) {
            addCriterion("done_time <=", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeIn(List<Date> values) {
            addCriterion("done_time in", values, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeNotIn(List<Date> values) {
            addCriterion("done_time not in", values, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeBetween(Date value1, Date value2) {
            addCriterion("done_time between", value1, value2, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeNotBetween(Date value1, Date value2) {
            addCriterion("done_time not between", value1, value2, "doneTime");
            return (Criteria) this;
        }

        public Criteria andFirstDeductIsNull() {
            addCriterion("first_deduct is null");
            return (Criteria) this;
        }

        public Criteria andFirstDeductIsNotNull() {
            addCriterion("first_deduct  is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDeductEqualTo(Float value) {
            addCriterion("first_deduct =", value, "firstDeduct");
            return (Criteria) this;
        }

        public Criteria andFirstDeductNotEqualTo(Float value) {
            addCriterion("first_deduct <>", value, "firstDeduct");
            return (Criteria) this;
        }

        public Criteria andFirstDeductGreaterThan(Float value) {
            addCriterion(" first_deduct  >", value, "firstDeduct");
            return (Criteria) this;
        }

        public Criteria andFirstDeductGreaterThanOrEqualTo(Float value) {
            addCriterion("first_deduct >=", value, "firstDeduct");
            return (Criteria) this;
        }

        public Criteria andFirstDeductLessThan(Float value) {
            addCriterion("first_deduct <", value, "firstDeduct");
            return (Criteria) this;
        }

        public Criteria andFirstDeductLessThanOrEqualTo(Float value) {
            addCriterion("first_deduct <=", value, "firstDeduct");
            return (Criteria) this;
        }

        public Criteria andFirstDeductIn(List<Float> values) {
            addCriterion("first_deduct in", values, "firstDeduct");
            return (Criteria) this;
        }

        public Criteria andFirstDeductNotIn(List<Float> values) {
            addCriterion("first_deduct not in", values, "firstDeduct");
            return (Criteria) this;
        }

        public Criteria andFirstDeductBetween(Float value1, Float value2) {
            addCriterion("first_deduct between", value1, value2, "firstDeduct");
            return (Criteria) this;
        }

        public Criteria andFirstDeductNotBetween(Float value1, Float value2) {
            addCriterion("first_deduct not between", value1, value2, "firstDeduct");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNull() {
            addCriterion("terminal_id is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNotNull() {
            addCriterion("terminal_id  is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdEqualTo(Long value) {
            addCriterion("terminal_id =", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotEqualTo(Long value) {
            addCriterion("terminal_id <>", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThan(Long value) {
            addCriterion(" terminal_id  >", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThanOrEqualTo(Long value) {
            addCriterion("terminal_id >=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThan(Long value) {
            addCriterion("terminal_id <", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThanOrEqualTo(Long value) {
            addCriterion("terminal_id <=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIn(List<Long> values) {
            addCriterion("terminal_id in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotIn(List<Long> values) {
            addCriterion("terminal_id not in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdBetween(Long value1, Long value2) {
            addCriterion("terminal_id between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotBetween(Long value1, Long value2) {
            addCriterion("terminal_id not between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number  is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(Integer value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(Integer value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(Integer value) {
            addCriterion(" serial_number  >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(Integer value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(Integer value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<Integer> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<Integer> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(Integer value1, Integer value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andOrderFirstIsNull() {
            addCriterion("order_first is null");
            return (Criteria) this;
        }

        public Criteria andOrderFirstIsNotNull() {
            addCriterion("order_first  is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFirstEqualTo(Integer value) {
            addCriterion("order_first =", value, "orderFirst");
            return (Criteria) this;
        }

        public Criteria andOrderFirstNotEqualTo(Integer value) {
            addCriterion("order_first <>", value, "orderFirst");
            return (Criteria) this;
        }

        public Criteria andOrderFirstGreaterThan(Integer value) {
            addCriterion(" order_first  >", value, "orderFirst");
            return (Criteria) this;
        }

        public Criteria andOrderFirstGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_first >=", value, "orderFirst");
            return (Criteria) this;
        }

        public Criteria andOrderFirstLessThan(Integer value) {
            addCriterion("order_first <", value, "orderFirst");
            return (Criteria) this;
        }

        public Criteria andOrderFirstLessThanOrEqualTo(Integer value) {
            addCriterion("order_first <=", value, "orderFirst");
            return (Criteria) this;
        }

        public Criteria andOrderFirstIn(List<Integer> values) {
            addCriterion("order_first in", values, "orderFirst");
            return (Criteria) this;
        }

        public Criteria andOrderFirstNotIn(List<Integer> values) {
            addCriterion("order_first not in", values, "orderFirst");
            return (Criteria) this;
        }

        public Criteria andOrderFirstBetween(Integer value1, Integer value2) {
            addCriterion("order_first between", value1, value2, "orderFirst");
            return (Criteria) this;
        }

        public Criteria andOrderFirstNotBetween(Integer value1, Integer value2) {
            addCriterion("order_first not between", value1, value2, "orderFirst");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time  is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion(" last_update_time  >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
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