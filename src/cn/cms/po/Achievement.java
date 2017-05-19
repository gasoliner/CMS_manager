package cn.cms.po;

public class Achievement {
    private Integer aid;

    private String username;

    private String classs;

    private Float chinese;

    private Float math;

    private Float english;

    private Float wuli;

    private Float hauxue;

    private Float shengwu;

    private Float lishi;

    private Float zhengzhi;

    private Float dili;

    private Float sum;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs == null ? null : classs.trim();
    }

    public Float getChinese() {
        return chinese;
    }

    public void setChinese(Float chinese) {
        this.chinese = chinese;
    }

    public Float getMath() {
        return math;
    }

    public void setMath(Float math) {
        this.math = math;
    }

    public Float getEnglish() {
        return english;
    }

    public void setEnglish(Float english) {
        this.english = english;
    }

    public Float getWuli() {
        return wuli;
    }

    public void setWuli(Float wuli) {
        this.wuli = wuli;
    }

    public Float getHauxue() {
        return hauxue;
    }

    public void setHauxue(Float hauxue) {
        this.hauxue = hauxue;
    }

    public Float getShengwu() {
        return shengwu;
    }

    public void setShengwu(Float shengwu) {
        this.shengwu = shengwu;
    }

    public Float getLishi() {
        return lishi;
    }

    public void setLishi(Float lishi) {
        this.lishi = lishi;
    }

    public Float getZhengzhi() {
        return zhengzhi;
    }

    public void setZhengzhi(Float zhengzhi) {
        this.zhengzhi = zhengzhi;
    }

    public Float getDili() {
        return dili;
    }

    public void setDili(Float dili) {
        this.dili = dili;
    }

    public Float getSum() {
        return sum;
    }

    public void setSum(Float sum) {
        this.sum = sum;
    }
}