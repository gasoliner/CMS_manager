package cn.cms.po;

public class ClassFile {
    private Integer cfid;

    private String annex;

    private String filename;

    private String classs;

    private String action;

    @Override
    public String toString() {
        return "ClassFile{" +
                "cfid=" + cfid +
                ", annex='" + annex + '\'' +
                ", filename='" + filename + '\'' +
                ", classs='" + classs + '\'' +
                '}';
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getCfid() {
        return cfid;
    }

    public void setCfid(Integer cfid) {
        this.cfid = cfid;
    }

    public String getAnnex() {
        return annex;
    }

    public void setAnnex(String annex) {
        this.annex = annex == null ? null : annex.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs == null ? null : classs.trim();
    }
}