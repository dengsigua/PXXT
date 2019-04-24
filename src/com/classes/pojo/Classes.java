package com.classes.pojo;

import java.util.Date;

public class Classes {
    private Long classId;

    private String classTitle;

    private String classSellPoint;

    private Long classPrice;

    private String classImg;

    private String classCid;

    private Byte classStatus;

    private Date classCreated;

    private Date classUpdate;

    private Long companyId;

    private String classDesc;

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle == null ? null : classTitle.trim();
    }

    public String getClassSellPoint() {
        return classSellPoint;
    }

    public void setClassSellPoint(String classSellPoint) {
        this.classSellPoint = classSellPoint == null ? null : classSellPoint.trim();
    }

    public Long getClassPrice() {
        return classPrice;
    }

    public void setClassPrice(Long classPrice) {
        this.classPrice = classPrice;
    }

    public String getClassImg() {
        return classImg;
    }

    public void setClassImg(String classImg) {
        this.classImg = classImg == null ? null : classImg.trim();
    }

    public String getClassCid() {
        return classCid;
    }

    public void setClassCid(String classCid) {
        this.classCid = classCid == null ? null : classCid.trim();
    }

    public Byte getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(Byte classStatus) {
        this.classStatus = classStatus;
    }

    public Date getClassCreated() {
        return classCreated;
    }

    public void setClassCreated(Date classCreated) {
        this.classCreated = classCreated;
    }

    public Date getClassUpdate() {
        return classUpdate;
    }

    public void setClassUpdate(Date classUpdate) {
        this.classUpdate = classUpdate;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc == null ? null : classDesc.trim();
    }

	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", classTitle=" + classTitle + ", classSellPoint=" + classSellPoint
				+ ", classPrice=" + classPrice + ", classImg=" + classImg + ", classCid=" + classCid + ", classStatus="
				+ classStatus + ", classCreated=" + classCreated + ", classUpdate=" + classUpdate + ", companyId="
				+ companyId + ", classDesc=" + classDesc + "]";
	}
    
}