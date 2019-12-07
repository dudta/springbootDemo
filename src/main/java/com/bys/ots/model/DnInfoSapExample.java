package com.bys.ots.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * @author zhagnyan
 * 2019/11/27
 */
public class DnInfoSapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DnInfoSapExample() {
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

        public Criteria andDnIsNull() {
            addCriterion("DN is null");
            return (Criteria) this;
        }

        public Criteria andDnIsNotNull() {
            addCriterion("DN is not null");
            return (Criteria) this;
        }

        public Criteria andDnEqualTo(String value) {
            addCriterion("DN =", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotEqualTo(String value) {
            addCriterion("DN <>", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnGreaterThan(String value) {
            addCriterion("DN >", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnGreaterThanOrEqualTo(String value) {
            addCriterion("DN >=", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLessThan(String value) {
            addCriterion("DN <", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLessThanOrEqualTo(String value) {
            addCriterion("DN <=", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLike(String value) {
            addCriterion("DN like", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotLike(String value) {
            addCriterion("DN not like", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnIn(List<String> values) {
            addCriterion("DN in", values, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotIn(List<String> values) {
            addCriterion("DN not in", values, "dn");
            return (Criteria) this;
        }

        public Criteria andDnBetween(String value1, String value2) {
            addCriterion("DN between", value1, value2, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotBetween(String value1, String value2) {
            addCriterion("DN not between", value1, value2, "dn");
            return (Criteria) this;
        }

        public Criteria andDnItemIsNull() {
            addCriterion("DN_Item is null");
            return (Criteria) this;
        }

        public Criteria andDnItemIsNotNull() {
            addCriterion("DN_Item is not null");
            return (Criteria) this;
        }

        public Criteria andDnItemEqualTo(String value) {
            addCriterion("DN_Item =", value, "dnItem");
            return (Criteria) this;
        }

        public Criteria andDnItemNotEqualTo(String value) {
            addCriterion("DN_Item <>", value, "dnItem");
            return (Criteria) this;
        }

        public Criteria andDnItemGreaterThan(String value) {
            addCriterion("DN_Item >", value, "dnItem");
            return (Criteria) this;
        }

        public Criteria andDnItemGreaterThanOrEqualTo(String value) {
            addCriterion("DN_Item >=", value, "dnItem");
            return (Criteria) this;
        }

        public Criteria andDnItemLessThan(String value) {
            addCriterion("DN_Item <", value, "dnItem");
            return (Criteria) this;
        }

        public Criteria andDnItemLessThanOrEqualTo(String value) {
            addCriterion("DN_Item <=", value, "dnItem");
            return (Criteria) this;
        }

        public Criteria andDnItemLike(String value) {
            addCriterion("DN_Item like", value, "dnItem");
            return (Criteria) this;
        }

        public Criteria andDnItemNotLike(String value) {
            addCriterion("DN_Item not like", value, "dnItem");
            return (Criteria) this;
        }

        public Criteria andDnItemIn(List<String> values) {
            addCriterion("DN_Item in", values, "dnItem");
            return (Criteria) this;
        }

        public Criteria andDnItemNotIn(List<String> values) {
            addCriterion("DN_Item not in", values, "dnItem");
            return (Criteria) this;
        }

        public Criteria andDnItemBetween(String value1, String value2) {
            addCriterion("DN_Item between", value1, value2, "dnItem");
            return (Criteria) this;
        }

        public Criteria andDnItemNotBetween(String value1, String value2) {
            addCriterion("DN_Item not between", value1, value2, "dnItem");
            return (Criteria) this;
        }

        public Criteria andSoIsNull() {
            addCriterion("SO is null");
            return (Criteria) this;
        }

        public Criteria andSoIsNotNull() {
            addCriterion("SO is not null");
            return (Criteria) this;
        }

        public Criteria andSoEqualTo(String value) {
            addCriterion("SO =", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoNotEqualTo(String value) {
            addCriterion("SO <>", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoGreaterThan(String value) {
            addCriterion("SO >", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoGreaterThanOrEqualTo(String value) {
            addCriterion("SO >=", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoLessThan(String value) {
            addCriterion("SO <", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoLessThanOrEqualTo(String value) {
            addCriterion("SO <=", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoLike(String value) {
            addCriterion("SO like", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoNotLike(String value) {
            addCriterion("SO not like", value, "so");
            return (Criteria) this;
        }

        public Criteria andSoIn(List<String> values) {
            addCriterion("SO in", values, "so");
            return (Criteria) this;
        }

        public Criteria andSoNotIn(List<String> values) {
            addCriterion("SO not in", values, "so");
            return (Criteria) this;
        }

        public Criteria andSoBetween(String value1, String value2) {
            addCriterion("SO between", value1, value2, "so");
            return (Criteria) this;
        }

        public Criteria andSoNotBetween(String value1, String value2) {
            addCriterion("SO not between", value1, value2, "so");
            return (Criteria) this;
        }

        public Criteria andSoItemIsNull() {
            addCriterion("SO_Item is null");
            return (Criteria) this;
        }

        public Criteria andSoItemIsNotNull() {
            addCriterion("SO_Item is not null");
            return (Criteria) this;
        }

        public Criteria andSoItemEqualTo(String value) {
            addCriterion("SO_Item =", value, "soItem");
            return (Criteria) this;
        }

        public Criteria andSoItemNotEqualTo(String value) {
            addCriterion("SO_Item <>", value, "soItem");
            return (Criteria) this;
        }

        public Criteria andSoItemGreaterThan(String value) {
            addCriterion("SO_Item >", value, "soItem");
            return (Criteria) this;
        }

        public Criteria andSoItemGreaterThanOrEqualTo(String value) {
            addCriterion("SO_Item >=", value, "soItem");
            return (Criteria) this;
        }

        public Criteria andSoItemLessThan(String value) {
            addCriterion("SO_Item <", value, "soItem");
            return (Criteria) this;
        }

        public Criteria andSoItemLessThanOrEqualTo(String value) {
            addCriterion("SO_Item <=", value, "soItem");
            return (Criteria) this;
        }

        public Criteria andSoItemLike(String value) {
            addCriterion("SO_Item like", value, "soItem");
            return (Criteria) this;
        }

        public Criteria andSoItemNotLike(String value) {
            addCriterion("SO_Item not like", value, "soItem");
            return (Criteria) this;
        }

        public Criteria andSoItemIn(List<String> values) {
            addCriterion("SO_Item in", values, "soItem");
            return (Criteria) this;
        }

        public Criteria andSoItemNotIn(List<String> values) {
            addCriterion("SO_Item not in", values, "soItem");
            return (Criteria) this;
        }

        public Criteria andSoItemBetween(String value1, String value2) {
            addCriterion("SO_Item between", value1, value2, "soItem");
            return (Criteria) this;
        }

        public Criteria andSoItemNotBetween(String value1, String value2) {
            addCriterion("SO_Item not between", value1, value2, "soItem");
            return (Criteria) this;
        }

        public Criteria andPlantIsNull() {
            addCriterion("Plant is null");
            return (Criteria) this;
        }

        public Criteria andPlantIsNotNull() {
            addCriterion("Plant is not null");
            return (Criteria) this;
        }

        public Criteria andPlantEqualTo(String value) {
            addCriterion("Plant =", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantNotEqualTo(String value) {
            addCriterion("Plant <>", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantGreaterThan(String value) {
            addCriterion("Plant >", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantGreaterThanOrEqualTo(String value) {
            addCriterion("Plant >=", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantLessThan(String value) {
            addCriterion("Plant <", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantLessThanOrEqualTo(String value) {
            addCriterion("Plant <=", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantLike(String value) {
            addCriterion("Plant like", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantNotLike(String value) {
            addCriterion("Plant not like", value, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantIn(List<String> values) {
            addCriterion("Plant in", values, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantNotIn(List<String> values) {
            addCriterion("Plant not in", values, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantBetween(String value1, String value2) {
            addCriterion("Plant between", value1, value2, "plant");
            return (Criteria) this;
        }

        public Criteria andPlantNotBetween(String value1, String value2) {
            addCriterion("Plant not between", value1, value2, "plant");
            return (Criteria) this;
        }

        public Criteria andStorLocIsNull() {
            addCriterion("Stor_Loc is null");
            return (Criteria) this;
        }

        public Criteria andStorLocIsNotNull() {
            addCriterion("Stor_Loc is not null");
            return (Criteria) this;
        }

        public Criteria andStorLocEqualTo(String value) {
            addCriterion("Stor_Loc =", value, "storLoc");
            return (Criteria) this;
        }

        public Criteria andStorLocNotEqualTo(String value) {
            addCriterion("Stor_Loc <>", value, "storLoc");
            return (Criteria) this;
        }

        public Criteria andStorLocGreaterThan(String value) {
            addCriterion("Stor_Loc >", value, "storLoc");
            return (Criteria) this;
        }

        public Criteria andStorLocGreaterThanOrEqualTo(String value) {
            addCriterion("Stor_Loc >=", value, "storLoc");
            return (Criteria) this;
        }

        public Criteria andStorLocLessThan(String value) {
            addCriterion("Stor_Loc <", value, "storLoc");
            return (Criteria) this;
        }

        public Criteria andStorLocLessThanOrEqualTo(String value) {
            addCriterion("Stor_Loc <=", value, "storLoc");
            return (Criteria) this;
        }

        public Criteria andStorLocLike(String value) {
            addCriterion("Stor_Loc like", value, "storLoc");
            return (Criteria) this;
        }

        public Criteria andStorLocNotLike(String value) {
            addCriterion("Stor_Loc not like", value, "storLoc");
            return (Criteria) this;
        }

        public Criteria andStorLocIn(List<String> values) {
            addCriterion("Stor_Loc in", values, "storLoc");
            return (Criteria) this;
        }

        public Criteria andStorLocNotIn(List<String> values) {
            addCriterion("Stor_Loc not in", values, "storLoc");
            return (Criteria) this;
        }

        public Criteria andStorLocBetween(String value1, String value2) {
            addCriterion("Stor_Loc between", value1, value2, "storLoc");
            return (Criteria) this;
        }

        public Criteria andStorLocNotBetween(String value1, String value2) {
            addCriterion("Stor_Loc not between", value1, value2, "storLoc");
            return (Criteria) this;
        }

        public Criteria andShippingPointIsNull() {
            addCriterion("Shipping_Point is null");
            return (Criteria) this;
        }

        public Criteria andShippingPointIsNotNull() {
            addCriterion("Shipping_Point is not null");
            return (Criteria) this;
        }

        public Criteria andShippingPointEqualTo(String value) {
            addCriterion("Shipping_Point =", value, "shippingPoint");
            return (Criteria) this;
        }

        public Criteria andShippingPointNotEqualTo(String value) {
            addCriterion("Shipping_Point <>", value, "shippingPoint");
            return (Criteria) this;
        }

        public Criteria andShippingPointGreaterThan(String value) {
            addCriterion("Shipping_Point >", value, "shippingPoint");
            return (Criteria) this;
        }

        public Criteria andShippingPointGreaterThanOrEqualTo(String value) {
            addCriterion("Shipping_Point >=", value, "shippingPoint");
            return (Criteria) this;
        }

        public Criteria andShippingPointLessThan(String value) {
            addCriterion("Shipping_Point <", value, "shippingPoint");
            return (Criteria) this;
        }

        public Criteria andShippingPointLessThanOrEqualTo(String value) {
            addCriterion("Shipping_Point <=", value, "shippingPoint");
            return (Criteria) this;
        }

        public Criteria andShippingPointLike(String value) {
            addCriterion("Shipping_Point like", value, "shippingPoint");
            return (Criteria) this;
        }

        public Criteria andShippingPointNotLike(String value) {
            addCriterion("Shipping_Point not like", value, "shippingPoint");
            return (Criteria) this;
        }

        public Criteria andShippingPointIn(List<String> values) {
            addCriterion("Shipping_Point in", values, "shippingPoint");
            return (Criteria) this;
        }

        public Criteria andShippingPointNotIn(List<String> values) {
            addCriterion("Shipping_Point not in", values, "shippingPoint");
            return (Criteria) this;
        }

        public Criteria andShippingPointBetween(String value1, String value2) {
            addCriterion("Shipping_Point between", value1, value2, "shippingPoint");
            return (Criteria) this;
        }

        public Criteria andShippingPointNotBetween(String value1, String value2) {
            addCriterion("Shipping_Point not between", value1, value2, "shippingPoint");
            return (Criteria) this;
        }

        public Criteria andDnStatusIsNull() {
            addCriterion("DN_status is null");
            return (Criteria) this;
        }

        public Criteria andDnStatusIsNotNull() {
            addCriterion("DN_status is not null");
            return (Criteria) this;
        }

        public Criteria andDnStatusEqualTo(Integer value) {
            addCriterion("DN_status =", value, "dnStatus");
            return (Criteria) this;
        }

        public Criteria andDnStatusNotEqualTo(Integer value) {
            addCriterion("DN_status <>", value, "dnStatus");
            return (Criteria) this;
        }

        public Criteria andDnStatusGreaterThan(Integer value) {
            addCriterion("DN_status >", value, "dnStatus");
            return (Criteria) this;
        }

        public Criteria andDnStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DN_status >=", value, "dnStatus");
            return (Criteria) this;
        }

        public Criteria andDnStatusLessThan(Integer value) {
            addCriterion("DN_status <", value, "dnStatus");
            return (Criteria) this;
        }

        public Criteria andDnStatusLessThanOrEqualTo(Integer value) {
            addCriterion("DN_status <=", value, "dnStatus");
            return (Criteria) this;
        }

        public Criteria andDnStatusIn(List<Integer> values) {
            addCriterion("DN_status in", values, "dnStatus");
            return (Criteria) this;
        }

        public Criteria andDnStatusNotIn(List<Integer> values) {
            addCriterion("DN_status not in", values, "dnStatus");
            return (Criteria) this;
        }

        public Criteria andDnStatusBetween(Integer value1, Integer value2) {
            addCriterion("DN_status between", value1, value2, "dnStatus");
            return (Criteria) this;
        }

        public Criteria andDnStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("DN_status not between", value1, value2, "dnStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNull() {
            addCriterion("Delivery_Date is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNotNull() {
            addCriterion("Delivery_Date is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEqualTo(Date value) {
            addCriterion("Delivery_Date =", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotEqualTo(Date value) {
            addCriterion("Delivery_Date <>", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThan(Date value) {
            addCriterion("Delivery_Date >", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Delivery_Date >=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThan(Date value) {
            addCriterion("Delivery_Date <", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThanOrEqualTo(Date value) {
            addCriterion("Delivery_Date <=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIn(List<Date> values) {
            addCriterion("Delivery_Date in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotIn(List<Date> values) {
            addCriterion("Delivery_Date not in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateBetween(Date value1, Date value2) {
            addCriterion("Delivery_Date between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotBetween(Date value1, Date value2) {
            addCriterion("Delivery_Date not between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("Qty is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("Qty is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(Integer value) {
            addCriterion("Qty =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(Integer value) {
            addCriterion("Qty <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(Integer value) {
            addCriterion("Qty >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Qty >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(Integer value) {
            addCriterion("Qty <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(Integer value) {
            addCriterion("Qty <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<Integer> values) {
            addCriterion("Qty in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<Integer> values) {
            addCriterion("Qty not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(Integer value1, Integer value2) {
            addCriterion("Qty between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("Qty not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
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