package cn.cms.po;

import java.util.ArrayList;
import java.util.List;

public class AchievementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AchievementExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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

        public Criteria andChineseIsNull() {
            addCriterion("chinese is null");
            return (Criteria) this;
        }

        public Criteria andChineseIsNotNull() {
            addCriterion("chinese is not null");
            return (Criteria) this;
        }

        public Criteria andChineseEqualTo(Float value) {
            addCriterion("chinese =", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseNotEqualTo(Float value) {
            addCriterion("chinese <>", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseGreaterThan(Float value) {
            addCriterion("chinese >", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseGreaterThanOrEqualTo(Float value) {
            addCriterion("chinese >=", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseLessThan(Float value) {
            addCriterion("chinese <", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseLessThanOrEqualTo(Float value) {
            addCriterion("chinese <=", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseIn(List<Float> values) {
            addCriterion("chinese in", values, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseNotIn(List<Float> values) {
            addCriterion("chinese not in", values, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseBetween(Float value1, Float value2) {
            addCriterion("chinese between", value1, value2, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseNotBetween(Float value1, Float value2) {
            addCriterion("chinese not between", value1, value2, "chinese");
            return (Criteria) this;
        }

        public Criteria andMathIsNull() {
            addCriterion("math is null");
            return (Criteria) this;
        }

        public Criteria andMathIsNotNull() {
            addCriterion("math is not null");
            return (Criteria) this;
        }

        public Criteria andMathEqualTo(Float value) {
            addCriterion("math =", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathNotEqualTo(Float value) {
            addCriterion("math <>", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathGreaterThan(Float value) {
            addCriterion("math >", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathGreaterThanOrEqualTo(Float value) {
            addCriterion("math >=", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathLessThan(Float value) {
            addCriterion("math <", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathLessThanOrEqualTo(Float value) {
            addCriterion("math <=", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathIn(List<Float> values) {
            addCriterion("math in", values, "math");
            return (Criteria) this;
        }

        public Criteria andMathNotIn(List<Float> values) {
            addCriterion("math not in", values, "math");
            return (Criteria) this;
        }

        public Criteria andMathBetween(Float value1, Float value2) {
            addCriterion("math between", value1, value2, "math");
            return (Criteria) this;
        }

        public Criteria andMathNotBetween(Float value1, Float value2) {
            addCriterion("math not between", value1, value2, "math");
            return (Criteria) this;
        }

        public Criteria andEnglishIsNull() {
            addCriterion("english is null");
            return (Criteria) this;
        }

        public Criteria andEnglishIsNotNull() {
            addCriterion("english is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishEqualTo(Float value) {
            addCriterion("english =", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotEqualTo(Float value) {
            addCriterion("english <>", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThan(Float value) {
            addCriterion("english >", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThanOrEqualTo(Float value) {
            addCriterion("english >=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThan(Float value) {
            addCriterion("english <", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThanOrEqualTo(Float value) {
            addCriterion("english <=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishIn(List<Float> values) {
            addCriterion("english in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotIn(List<Float> values) {
            addCriterion("english not in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishBetween(Float value1, Float value2) {
            addCriterion("english between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotBetween(Float value1, Float value2) {
            addCriterion("english not between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andWuliIsNull() {
            addCriterion("wuli is null");
            return (Criteria) this;
        }

        public Criteria andWuliIsNotNull() {
            addCriterion("wuli is not null");
            return (Criteria) this;
        }

        public Criteria andWuliEqualTo(Float value) {
            addCriterion("wuli =", value, "wuli");
            return (Criteria) this;
        }

        public Criteria andWuliNotEqualTo(Float value) {
            addCriterion("wuli <>", value, "wuli");
            return (Criteria) this;
        }

        public Criteria andWuliGreaterThan(Float value) {
            addCriterion("wuli >", value, "wuli");
            return (Criteria) this;
        }

        public Criteria andWuliGreaterThanOrEqualTo(Float value) {
            addCriterion("wuli >=", value, "wuli");
            return (Criteria) this;
        }

        public Criteria andWuliLessThan(Float value) {
            addCriterion("wuli <", value, "wuli");
            return (Criteria) this;
        }

        public Criteria andWuliLessThanOrEqualTo(Float value) {
            addCriterion("wuli <=", value, "wuli");
            return (Criteria) this;
        }

        public Criteria andWuliIn(List<Float> values) {
            addCriterion("wuli in", values, "wuli");
            return (Criteria) this;
        }

        public Criteria andWuliNotIn(List<Float> values) {
            addCriterion("wuli not in", values, "wuli");
            return (Criteria) this;
        }

        public Criteria andWuliBetween(Float value1, Float value2) {
            addCriterion("wuli between", value1, value2, "wuli");
            return (Criteria) this;
        }

        public Criteria andWuliNotBetween(Float value1, Float value2) {
            addCriterion("wuli not between", value1, value2, "wuli");
            return (Criteria) this;
        }

        public Criteria andHauxueIsNull() {
            addCriterion("hauxue is null");
            return (Criteria) this;
        }

        public Criteria andHauxueIsNotNull() {
            addCriterion("hauxue is not null");
            return (Criteria) this;
        }

        public Criteria andHauxueEqualTo(Float value) {
            addCriterion("hauxue =", value, "hauxue");
            return (Criteria) this;
        }

        public Criteria andHauxueNotEqualTo(Float value) {
            addCriterion("hauxue <>", value, "hauxue");
            return (Criteria) this;
        }

        public Criteria andHauxueGreaterThan(Float value) {
            addCriterion("hauxue >", value, "hauxue");
            return (Criteria) this;
        }

        public Criteria andHauxueGreaterThanOrEqualTo(Float value) {
            addCriterion("hauxue >=", value, "hauxue");
            return (Criteria) this;
        }

        public Criteria andHauxueLessThan(Float value) {
            addCriterion("hauxue <", value, "hauxue");
            return (Criteria) this;
        }

        public Criteria andHauxueLessThanOrEqualTo(Float value) {
            addCriterion("hauxue <=", value, "hauxue");
            return (Criteria) this;
        }

        public Criteria andHauxueIn(List<Float> values) {
            addCriterion("hauxue in", values, "hauxue");
            return (Criteria) this;
        }

        public Criteria andHauxueNotIn(List<Float> values) {
            addCriterion("hauxue not in", values, "hauxue");
            return (Criteria) this;
        }

        public Criteria andHauxueBetween(Float value1, Float value2) {
            addCriterion("hauxue between", value1, value2, "hauxue");
            return (Criteria) this;
        }

        public Criteria andHauxueNotBetween(Float value1, Float value2) {
            addCriterion("hauxue not between", value1, value2, "hauxue");
            return (Criteria) this;
        }

        public Criteria andShengwuIsNull() {
            addCriterion("shengwu is null");
            return (Criteria) this;
        }

        public Criteria andShengwuIsNotNull() {
            addCriterion("shengwu is not null");
            return (Criteria) this;
        }

        public Criteria andShengwuEqualTo(Float value) {
            addCriterion("shengwu =", value, "shengwu");
            return (Criteria) this;
        }

        public Criteria andShengwuNotEqualTo(Float value) {
            addCriterion("shengwu <>", value, "shengwu");
            return (Criteria) this;
        }

        public Criteria andShengwuGreaterThan(Float value) {
            addCriterion("shengwu >", value, "shengwu");
            return (Criteria) this;
        }

        public Criteria andShengwuGreaterThanOrEqualTo(Float value) {
            addCriterion("shengwu >=", value, "shengwu");
            return (Criteria) this;
        }

        public Criteria andShengwuLessThan(Float value) {
            addCriterion("shengwu <", value, "shengwu");
            return (Criteria) this;
        }

        public Criteria andShengwuLessThanOrEqualTo(Float value) {
            addCriterion("shengwu <=", value, "shengwu");
            return (Criteria) this;
        }

        public Criteria andShengwuIn(List<Float> values) {
            addCriterion("shengwu in", values, "shengwu");
            return (Criteria) this;
        }

        public Criteria andShengwuNotIn(List<Float> values) {
            addCriterion("shengwu not in", values, "shengwu");
            return (Criteria) this;
        }

        public Criteria andShengwuBetween(Float value1, Float value2) {
            addCriterion("shengwu between", value1, value2, "shengwu");
            return (Criteria) this;
        }

        public Criteria andShengwuNotBetween(Float value1, Float value2) {
            addCriterion("shengwu not between", value1, value2, "shengwu");
            return (Criteria) this;
        }

        public Criteria andLishiIsNull() {
            addCriterion("lishi is null");
            return (Criteria) this;
        }

        public Criteria andLishiIsNotNull() {
            addCriterion("lishi is not null");
            return (Criteria) this;
        }

        public Criteria andLishiEqualTo(Float value) {
            addCriterion("lishi =", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiNotEqualTo(Float value) {
            addCriterion("lishi <>", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiGreaterThan(Float value) {
            addCriterion("lishi >", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiGreaterThanOrEqualTo(Float value) {
            addCriterion("lishi >=", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiLessThan(Float value) {
            addCriterion("lishi <", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiLessThanOrEqualTo(Float value) {
            addCriterion("lishi <=", value, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiIn(List<Float> values) {
            addCriterion("lishi in", values, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiNotIn(List<Float> values) {
            addCriterion("lishi not in", values, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiBetween(Float value1, Float value2) {
            addCriterion("lishi between", value1, value2, "lishi");
            return (Criteria) this;
        }

        public Criteria andLishiNotBetween(Float value1, Float value2) {
            addCriterion("lishi not between", value1, value2, "lishi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiIsNull() {
            addCriterion("zhengzhi is null");
            return (Criteria) this;
        }

        public Criteria andZhengzhiIsNotNull() {
            addCriterion("zhengzhi is not null");
            return (Criteria) this;
        }

        public Criteria andZhengzhiEqualTo(Float value) {
            addCriterion("zhengzhi =", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiNotEqualTo(Float value) {
            addCriterion("zhengzhi <>", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiGreaterThan(Float value) {
            addCriterion("zhengzhi >", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiGreaterThanOrEqualTo(Float value) {
            addCriterion("zhengzhi >=", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiLessThan(Float value) {
            addCriterion("zhengzhi <", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiLessThanOrEqualTo(Float value) {
            addCriterion("zhengzhi <=", value, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiIn(List<Float> values) {
            addCriterion("zhengzhi in", values, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiNotIn(List<Float> values) {
            addCriterion("zhengzhi not in", values, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiBetween(Float value1, Float value2) {
            addCriterion("zhengzhi between", value1, value2, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andZhengzhiNotBetween(Float value1, Float value2) {
            addCriterion("zhengzhi not between", value1, value2, "zhengzhi");
            return (Criteria) this;
        }

        public Criteria andDiliIsNull() {
            addCriterion("dili is null");
            return (Criteria) this;
        }

        public Criteria andDiliIsNotNull() {
            addCriterion("dili is not null");
            return (Criteria) this;
        }

        public Criteria andDiliEqualTo(Float value) {
            addCriterion("dili =", value, "dili");
            return (Criteria) this;
        }

        public Criteria andDiliNotEqualTo(Float value) {
            addCriterion("dili <>", value, "dili");
            return (Criteria) this;
        }

        public Criteria andDiliGreaterThan(Float value) {
            addCriterion("dili >", value, "dili");
            return (Criteria) this;
        }

        public Criteria andDiliGreaterThanOrEqualTo(Float value) {
            addCriterion("dili >=", value, "dili");
            return (Criteria) this;
        }

        public Criteria andDiliLessThan(Float value) {
            addCriterion("dili <", value, "dili");
            return (Criteria) this;
        }

        public Criteria andDiliLessThanOrEqualTo(Float value) {
            addCriterion("dili <=", value, "dili");
            return (Criteria) this;
        }

        public Criteria andDiliIn(List<Float> values) {
            addCriterion("dili in", values, "dili");
            return (Criteria) this;
        }

        public Criteria andDiliNotIn(List<Float> values) {
            addCriterion("dili not in", values, "dili");
            return (Criteria) this;
        }

        public Criteria andDiliBetween(Float value1, Float value2) {
            addCriterion("dili between", value1, value2, "dili");
            return (Criteria) this;
        }

        public Criteria andDiliNotBetween(Float value1, Float value2) {
            addCriterion("dili not between", value1, value2, "dili");
            return (Criteria) this;
        }

        public Criteria andSumIsNull() {
            addCriterion("sum is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("sum is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(Float value) {
            addCriterion("sum =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Float value) {
            addCriterion("sum <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Float value) {
            addCriterion("sum >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Float value) {
            addCriterion("sum >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Float value) {
            addCriterion("sum <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Float value) {
            addCriterion("sum <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Float> values) {
            addCriterion("sum in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Float> values) {
            addCriterion("sum not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Float value1, Float value2) {
            addCriterion("sum between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Float value1, Float value2) {
            addCriterion("sum not between", value1, value2, "sum");
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