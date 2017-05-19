package cn.cms.po;

import java.util.ArrayList;
import java.util.List;

public class ClassInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassInfoExample() {
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

        public Criteria andCiidIsNull() {
            addCriterion("ciid is null");
            return (Criteria) this;
        }

        public Criteria andCiidIsNotNull() {
            addCriterion("ciid is not null");
            return (Criteria) this;
        }

        public Criteria andCiidEqualTo(Integer value) {
            addCriterion("ciid =", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidNotEqualTo(Integer value) {
            addCriterion("ciid <>", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidGreaterThan(Integer value) {
            addCriterion("ciid >", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ciid >=", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidLessThan(Integer value) {
            addCriterion("ciid <", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidLessThanOrEqualTo(Integer value) {
            addCriterion("ciid <=", value, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidIn(List<Integer> values) {
            addCriterion("ciid in", values, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidNotIn(List<Integer> values) {
            addCriterion("ciid not in", values, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidBetween(Integer value1, Integer value2) {
            addCriterion("ciid between", value1, value2, "ciid");
            return (Criteria) this;
        }

        public Criteria andCiidNotBetween(Integer value1, Integer value2) {
            addCriterion("ciid not between", value1, value2, "ciid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andClasssIsNull() {
            addCriterion("classs is null");
            return (Criteria) this;
        }

        public Criteria andClasssIsNotNull() {
            addCriterion("classs is not null");
            return (Criteria) this;
        }

        public Criteria andClasssEqualTo(String value) {
            addCriterion("classs =", value, "classs");
            return (Criteria) this;
        }

        public Criteria andClasssNotEqualTo(String value) {
            addCriterion("classs <>", value, "classs");
            return (Criteria) this;
        }

        public Criteria andClasssGreaterThan(String value) {
            addCriterion("classs >", value, "classs");
            return (Criteria) this;
        }

        public Criteria andClasssGreaterThanOrEqualTo(String value) {
            addCriterion("classs >=", value, "classs");
            return (Criteria) this;
        }

        public Criteria andClasssLessThan(String value) {
            addCriterion("classs <", value, "classs");
            return (Criteria) this;
        }

        public Criteria andClasssLessThanOrEqualTo(String value) {
            addCriterion("classs <=", value, "classs");
            return (Criteria) this;
        }

        public Criteria andClasssLike(String value) {
            addCriterion("classs like", value, "classs");
            return (Criteria) this;
        }

        public Criteria andClasssNotLike(String value) {
            addCriterion("classs not like", value, "classs");
            return (Criteria) this;
        }

        public Criteria andClasssIn(List<String> values) {
            addCriterion("classs in", values, "classs");
            return (Criteria) this;
        }

        public Criteria andClasssNotIn(List<String> values) {
            addCriterion("classs not in", values, "classs");
            return (Criteria) this;
        }

        public Criteria andClasssBetween(String value1, String value2) {
            addCriterion("classs between", value1, value2, "classs");
            return (Criteria) this;
        }

        public Criteria andClasssNotBetween(String value1, String value2) {
            addCriterion("classs not between", value1, value2, "classs");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(String value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(String value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(String value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(String value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(String value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLike(String value) {
            addCriterion("teacher like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotLike(String value) {
            addCriterion("teacher not like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<String> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<String> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(String value1, String value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(String value1, String value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andCountpeopleIsNull() {
            addCriterion("countPeople is null");
            return (Criteria) this;
        }

        public Criteria andCountpeopleIsNotNull() {
            addCriterion("countPeople is not null");
            return (Criteria) this;
        }

        public Criteria andCountpeopleEqualTo(Integer value) {
            addCriterion("countPeople =", value, "countpeople");
            return (Criteria) this;
        }

        public Criteria andCountpeopleNotEqualTo(Integer value) {
            addCriterion("countPeople <>", value, "countpeople");
            return (Criteria) this;
        }

        public Criteria andCountpeopleGreaterThan(Integer value) {
            addCriterion("countPeople >", value, "countpeople");
            return (Criteria) this;
        }

        public Criteria andCountpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("countPeople >=", value, "countpeople");
            return (Criteria) this;
        }

        public Criteria andCountpeopleLessThan(Integer value) {
            addCriterion("countPeople <", value, "countpeople");
            return (Criteria) this;
        }

        public Criteria andCountpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("countPeople <=", value, "countpeople");
            return (Criteria) this;
        }

        public Criteria andCountpeopleIn(List<Integer> values) {
            addCriterion("countPeople in", values, "countpeople");
            return (Criteria) this;
        }

        public Criteria andCountpeopleNotIn(List<Integer> values) {
            addCriterion("countPeople not in", values, "countpeople");
            return (Criteria) this;
        }

        public Criteria andCountpeopleBetween(Integer value1, Integer value2) {
            addCriterion("countPeople between", value1, value2, "countpeople");
            return (Criteria) this;
        }

        public Criteria andCountpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("countPeople not between", value1, value2, "countpeople");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
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