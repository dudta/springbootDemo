package com.bys.ots.model;
/**
 * @author zhagnyan
 * 2019/11/27
 */
import java.util.ArrayList;
import java.util.List;

public class SoEmailSapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoEmailSapExample() {
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

        public Criteria andPartnerIsNull() {
            addCriterion("Partner is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNotNull() {
            addCriterion("Partner is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerEqualTo(String value) {
            addCriterion("Partner =", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotEqualTo(String value) {
            addCriterion("Partner <>", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThan(String value) {
            addCriterion("Partner >", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("Partner >=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThan(String value) {
            addCriterion("Partner <", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThanOrEqualTo(String value) {
            addCriterion("Partner <=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLike(String value) {
            addCriterion("Partner like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotLike(String value) {
            addCriterion("Partner not like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerIn(List<String> values) {
            addCriterion("Partner in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotIn(List<String> values) {
            addCriterion("Partner not in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerBetween(String value1, String value2) {
            addCriterion("Partner between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotBetween(String value1, String value2) {
            addCriterion("Partner not between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("Customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("Customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("Customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("Customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("Customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("Customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("Customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("Customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("Customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("Customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("Customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("Customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("Customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("Customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
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