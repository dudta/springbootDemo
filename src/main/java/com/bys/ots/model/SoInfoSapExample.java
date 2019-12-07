package com.bys.ots.model;

import java.util.ArrayList;
import java.util.List;
/**
 * @author zhagnyan
 * 2019/11/27
 */
public class SoInfoSapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoInfoSapExample() {
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

        public Criteria andPoNumberIsNull() {
            addCriterion("Po_Number is null");
            return (Criteria) this;
        }

        public Criteria andPoNumberIsNotNull() {
            addCriterion("Po_Number is not null");
            return (Criteria) this;
        }

        public Criteria andPoNumberEqualTo(String value) {
            addCriterion("Po_Number =", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberNotEqualTo(String value) {
            addCriterion("Po_Number <>", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberGreaterThan(String value) {
            addCriterion("Po_Number >", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Po_Number >=", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberLessThan(String value) {
            addCriterion("Po_Number <", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberLessThanOrEqualTo(String value) {
            addCriterion("Po_Number <=", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberLike(String value) {
            addCriterion("Po_Number like", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberNotLike(String value) {
            addCriterion("Po_Number not like", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberIn(List<String> values) {
            addCriterion("Po_Number in", values, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberNotIn(List<String> values) {
            addCriterion("Po_Number not in", values, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberBetween(String value1, String value2) {
            addCriterion("Po_Number between", value1, value2, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberNotBetween(String value1, String value2) {
            addCriterion("Po_Number not between", value1, value2, "poNumber");
            return (Criteria) this;
        }

        public Criteria andSoldToIsNull() {
            addCriterion("Sold_To is null");
            return (Criteria) this;
        }

        public Criteria andSoldToIsNotNull() {
            addCriterion("Sold_To is not null");
            return (Criteria) this;
        }

        public Criteria andSoldToEqualTo(String value) {
            addCriterion("Sold_To =", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToNotEqualTo(String value) {
            addCriterion("Sold_To <>", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToGreaterThan(String value) {
            addCriterion("Sold_To >", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToGreaterThanOrEqualTo(String value) {
            addCriterion("Sold_To >=", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToLessThan(String value) {
            addCriterion("Sold_To <", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToLessThanOrEqualTo(String value) {
            addCriterion("Sold_To <=", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToLike(String value) {
            addCriterion("Sold_To like", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToNotLike(String value) {
            addCriterion("Sold_To not like", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToIn(List<String> values) {
            addCriterion("Sold_To in", values, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToNotIn(List<String> values) {
            addCriterion("Sold_To not in", values, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToBetween(String value1, String value2) {
            addCriterion("Sold_To between", value1, value2, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToNotBetween(String value1, String value2) {
            addCriterion("Sold_To not between", value1, value2, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSaleOrgIsNull() {
            addCriterion("Sale_Org is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrgIsNotNull() {
            addCriterion("Sale_Org is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrgEqualTo(String value) {
            addCriterion("Sale_Org =", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgNotEqualTo(String value) {
            addCriterion("Sale_Org <>", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgGreaterThan(String value) {
            addCriterion("Sale_Org >", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgGreaterThanOrEqualTo(String value) {
            addCriterion("Sale_Org >=", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgLessThan(String value) {
            addCriterion("Sale_Org <", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgLessThanOrEqualTo(String value) {
            addCriterion("Sale_Org <=", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgLike(String value) {
            addCriterion("Sale_Org like", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgNotLike(String value) {
            addCriterion("Sale_Org not like", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgIn(List<String> values) {
            addCriterion("Sale_Org in", values, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgNotIn(List<String> values) {
            addCriterion("Sale_Org not in", values, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgBetween(String value1, String value2) {
            addCriterion("Sale_Org between", value1, value2, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgNotBetween(String value1, String value2) {
            addCriterion("Sale_Org not between", value1, value2, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeIsNull() {
            addCriterion("Sale_Office is null");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeIsNotNull() {
            addCriterion("Sale_Office is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeEqualTo(String value) {
            addCriterion("Sale_Office =", value, "saleOffice");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeNotEqualTo(String value) {
            addCriterion("Sale_Office <>", value, "saleOffice");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeGreaterThan(String value) {
            addCriterion("Sale_Office >", value, "saleOffice");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("Sale_Office >=", value, "saleOffice");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeLessThan(String value) {
            addCriterion("Sale_Office <", value, "saleOffice");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeLessThanOrEqualTo(String value) {
            addCriterion("Sale_Office <=", value, "saleOffice");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeLike(String value) {
            addCriterion("Sale_Office like", value, "saleOffice");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeNotLike(String value) {
            addCriterion("Sale_Office not like", value, "saleOffice");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeIn(List<String> values) {
            addCriterion("Sale_Office in", values, "saleOffice");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeNotIn(List<String> values) {
            addCriterion("Sale_Office not in", values, "saleOffice");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeBetween(String value1, String value2) {
            addCriterion("Sale_Office between", value1, value2, "saleOffice");
            return (Criteria) this;
        }

        public Criteria andSaleOfficeNotBetween(String value1, String value2) {
            addCriterion("Sale_Office not between", value1, value2, "saleOffice");
            return (Criteria) this;
        }

        public Criteria andDisCIsNull() {
            addCriterion("Dis_C is null");
            return (Criteria) this;
        }

        public Criteria andDisCIsNotNull() {
            addCriterion("Dis_C is not null");
            return (Criteria) this;
        }

        public Criteria andDisCEqualTo(String value) {
            addCriterion("Dis_C =", value, "disC");
            return (Criteria) this;
        }

        public Criteria andDisCNotEqualTo(String value) {
            addCriterion("Dis_C <>", value, "disC");
            return (Criteria) this;
        }

        public Criteria andDisCGreaterThan(String value) {
            addCriterion("Dis_C >", value, "disC");
            return (Criteria) this;
        }

        public Criteria andDisCGreaterThanOrEqualTo(String value) {
            addCriterion("Dis_C >=", value, "disC");
            return (Criteria) this;
        }

        public Criteria andDisCLessThan(String value) {
            addCriterion("Dis_C <", value, "disC");
            return (Criteria) this;
        }

        public Criteria andDisCLessThanOrEqualTo(String value) {
            addCriterion("Dis_C <=", value, "disC");
            return (Criteria) this;
        }

        public Criteria andDisCLike(String value) {
            addCriterion("Dis_C like", value, "disC");
            return (Criteria) this;
        }

        public Criteria andDisCNotLike(String value) {
            addCriterion("Dis_C not like", value, "disC");
            return (Criteria) this;
        }

        public Criteria andDisCIn(List<String> values) {
            addCriterion("Dis_C in", values, "disC");
            return (Criteria) this;
        }

        public Criteria andDisCNotIn(List<String> values) {
            addCriterion("Dis_C not in", values, "disC");
            return (Criteria) this;
        }

        public Criteria andDisCBetween(String value1, String value2) {
            addCriterion("Dis_C between", value1, value2, "disC");
            return (Criteria) this;
        }

        public Criteria andDisCNotBetween(String value1, String value2) {
            addCriterion("Dis_C not between", value1, value2, "disC");
            return (Criteria) this;
        }

        public Criteria andSkuIsNull() {
            addCriterion("SKU is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsNotNull() {
            addCriterion("SKU is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(Integer value) {
            addCriterion("SKU =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(Integer value) {
            addCriterion("SKU <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(Integer value) {
            addCriterion("SKU >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(Integer value) {
            addCriterion("SKU >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(Integer value) {
            addCriterion("SKU <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(Integer value) {
            addCriterion("SKU <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<Integer> values) {
            addCriterion("SKU in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<Integer> values) {
            addCriterion("SKU not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(Integer value1, Integer value2) {
            addCriterion("SKU between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(Integer value1, Integer value2) {
            addCriterion("SKU not between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSoStatusIsNull() {
            addCriterion("SO_status is null");
            return (Criteria) this;
        }

        public Criteria andSoStatusIsNotNull() {
            addCriterion("SO_status is not null");
            return (Criteria) this;
        }

        public Criteria andSoStatusEqualTo(Integer value) {
            addCriterion("SO_status =", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusNotEqualTo(Integer value) {
            addCriterion("SO_status <>", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusGreaterThan(Integer value) {
            addCriterion("SO_status >", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SO_status >=", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusLessThan(Integer value) {
            addCriterion("SO_status <", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusLessThanOrEqualTo(Integer value) {
            addCriterion("SO_status <=", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusIn(List<Integer> values) {
            addCriterion("SO_status in", values, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusNotIn(List<Integer> values) {
            addCriterion("SO_status not in", values, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusBetween(Integer value1, Integer value2) {
            addCriterion("SO_status between", value1, value2, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SO_status not between", value1, value2, "soStatus");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
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