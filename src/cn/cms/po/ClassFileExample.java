package cn.cms.po;

import java.util.ArrayList;
import java.util.List;

public class ClassFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassFileExample() {
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

        public Criteria andCfidIsNull() {
            addCriterion("cfid is null");
            return (Criteria) this;
        }

        public Criteria andCfidIsNotNull() {
            addCriterion("cfid is not null");
            return (Criteria) this;
        }

        public Criteria andCfidEqualTo(Integer value) {
            addCriterion("cfid =", value, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidNotEqualTo(Integer value) {
            addCriterion("cfid <>", value, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidGreaterThan(Integer value) {
            addCriterion("cfid >", value, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cfid >=", value, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidLessThan(Integer value) {
            addCriterion("cfid <", value, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidLessThanOrEqualTo(Integer value) {
            addCriterion("cfid <=", value, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidIn(List<Integer> values) {
            addCriterion("cfid in", values, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidNotIn(List<Integer> values) {
            addCriterion("cfid not in", values, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidBetween(Integer value1, Integer value2) {
            addCriterion("cfid between", value1, value2, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidNotBetween(Integer value1, Integer value2) {
            addCriterion("cfid not between", value1, value2, "cfid");
            return (Criteria) this;
        }

        public Criteria andAnnexIsNull() {
            addCriterion("annex is null");
            return (Criteria) this;
        }

        public Criteria andAnnexIsNotNull() {
            addCriterion("annex is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexEqualTo(String value) {
            addCriterion("annex =", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexNotEqualTo(String value) {
            addCriterion("annex <>", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexGreaterThan(String value) {
            addCriterion("annex >", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexGreaterThanOrEqualTo(String value) {
            addCriterion("annex >=", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexLessThan(String value) {
            addCriterion("annex <", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexLessThanOrEqualTo(String value) {
            addCriterion("annex <=", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexLike(String value) {
            addCriterion("annex like", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexNotLike(String value) {
            addCriterion("annex not like", value, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexIn(List<String> values) {
            addCriterion("annex in", values, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexNotIn(List<String> values) {
            addCriterion("annex not in", values, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexBetween(String value1, String value2) {
            addCriterion("annex between", value1, value2, "annex");
            return (Criteria) this;
        }

        public Criteria andAnnexNotBetween(String value1, String value2) {
            addCriterion("annex not between", value1, value2, "annex");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
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