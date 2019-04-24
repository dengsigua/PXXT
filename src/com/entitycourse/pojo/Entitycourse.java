package com.entitycourse.pojo;

import java.util.Date;

public class Entitycourse {
    private Long entitycourseId;

    private String entitycourseCat;

    private String entitycoursePoint;

    private String entitycourseGuige;

    private String entitycourseBanxing;

    private String entitycourseType;

    private Date entitycourseBmstarttime;

    private Date entitycourseBmendtime;

    private Date entitycourseKbstarttime;

    private Date entitycourseKbendtime;

    private String entitycourseImg;

    private String entitycourseDesc;

    private Long companyId;

    private String entitycourseTitle;

    private Integer entitycoursePrice;

    public Long getEntitycourseId() {
        return entitycourseId;
    }

    public void setEntitycourseId(Long entitycourseId) {
        this.entitycourseId = entitycourseId;
    }

    public String getEntitycourseCat() {
        return entitycourseCat;
    }

    public void setEntitycourseCat(String entitycourseCat) {
        this.entitycourseCat = entitycourseCat == null ? null : entitycourseCat.trim();
    }

    public String getEntitycoursePoint() {
        return entitycoursePoint;
    }

    public void setEntitycoursePoint(String entitycoursePoint) {
        this.entitycoursePoint = entitycoursePoint == null ? null : entitycoursePoint.trim();
    }

    public String getEntitycourseGuige() {
        return entitycourseGuige;
    }

    public void setEntitycourseGuige(String entitycourseGuige) {
        this.entitycourseGuige = entitycourseGuige == null ? null : entitycourseGuige.trim();
    }

    public String getEntitycourseBanxing() {
        return entitycourseBanxing;
    }

    public void setEntitycourseBanxing(String entitycourseBanxing) {
        this.entitycourseBanxing = entitycourseBanxing == null ? null : entitycourseBanxing.trim();
    }

    public String getEntitycourseType() {
        return entitycourseType;
    }

    public void setEntitycourseType(String entitycourseType) {
        this.entitycourseType = entitycourseType == null ? null : entitycourseType.trim();
    }

    public Date getEntitycourseBmstarttime() {
        return entitycourseBmstarttime;
    }

    public void setEntitycourseBmstarttime(Date entitycourseBmstarttime) {
        this.entitycourseBmstarttime = entitycourseBmstarttime;
    }

    public Date getEntitycourseBmendtime() {
        return entitycourseBmendtime;
    }

    public void setEntitycourseBmendtime(Date entitycourseBmendtime) {
        this.entitycourseBmendtime = entitycourseBmendtime;
    }

    public Date getEntitycourseKbstarttime() {
        return entitycourseKbstarttime;
    }

    public void setEntitycourseKbstarttime(Date entitycourseKbstarttime) {
        this.entitycourseKbstarttime = entitycourseKbstarttime;
    }

    public Date getEntitycourseKbendtime() {
        return entitycourseKbendtime;
    }

    public void setEntitycourseKbendtime(Date entitycourseKbendtime) {
        this.entitycourseKbendtime = entitycourseKbendtime;
    }

    public String getEntitycourseImg() {
        return entitycourseImg;
    }

    public void setEntitycourseImg(String entitycourseImg) {
        this.entitycourseImg = entitycourseImg == null ? null : entitycourseImg.trim();
    }

    public String getEntitycourseDesc() {
        return entitycourseDesc;
    }

    public void setEntitycourseDesc(String entitycourseDesc) {
        this.entitycourseDesc = entitycourseDesc == null ? null : entitycourseDesc.trim();
    }

  

    public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getEntitycourseTitle() {
        return entitycourseTitle;
    }

    public void setEntitycourseTitle(String entitycourseTitle) {
        this.entitycourseTitle = entitycourseTitle == null ? null : entitycourseTitle.trim();
    }

    public Integer getEntitycoursePrice() {
        return entitycoursePrice;
    }

    public void setEntitycoursePrice(Integer entitycoursePrice) {
        this.entitycoursePrice = entitycoursePrice;
    }

	@Override
	public String toString() {
		return "Entitycourse [entitycourseId=" + entitycourseId + ", entitycourseCat=" + entitycourseCat
				+ ", entitycoursePoint=" + entitycoursePoint + ", entitycourseGuige=" + entitycourseGuige
				+ ", entitycourseBanxing=" + entitycourseBanxing + ", entitycourseType=" + entitycourseType
				+ ", entitycourseBmstarttime=" + entitycourseBmstarttime + ", entitycourseBmendtime="
				+ entitycourseBmendtime + ", entitycourseKbstarttime=" + entitycourseKbstarttime
				+ ", entitycourseKbendtime=" + entitycourseKbendtime + ", entitycourseImg=" + entitycourseImg
				+ ", entitycourseDesc=" + entitycourseDesc + ", companyId=" + companyId + ", entitycourseTitle="
				+ entitycourseTitle + ", entitycoursePrice=" + entitycoursePrice + "]";
	}
    
    
}