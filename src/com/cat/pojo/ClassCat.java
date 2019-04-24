package com.cat.pojo;

import java.util.Date;

public class ClassCat {
    private Long classCatId;

    private Long classCatParentId;

    private String classCatName;

    private Integer classCatStatus;

    private Integer classCatSortOrder;

    private Boolean classCatIsParent;

    private Date classCatCreated;

    private Date classCatUpdated;

    public Long getClassCatId() {
        return classCatId;
    }

    public void setClassCatId(Long classCatId) {
        this.classCatId = classCatId;
    }

    public Long getClassCatParentId() {
        return classCatParentId;
    }

    public void setClassCatParentId(Long classCatParentId) {
        this.classCatParentId = classCatParentId;
    }

    public String getClassCatName() {
        return classCatName;
    }

    public void setClassCatName(String classCatName) {
        this.classCatName = classCatName == null ? null : classCatName.trim();
    }

    public Integer getClassCatStatus() {
        return classCatStatus;
    }

    public void setClassCatStatus(Integer classCatStatus) {
        this.classCatStatus = classCatStatus;
    }

    public Integer getClassCatSortOrder() {
        return classCatSortOrder;
    }

    public void setClassCatSortOrder(Integer classCatSortOrder) {
        this.classCatSortOrder = classCatSortOrder;
    }

    public Boolean getClassCatIsParent() {
        return classCatIsParent;
    }

    public void setClassCatIsParent(Boolean classCatIsParent) {
        this.classCatIsParent = classCatIsParent;
    }

    public Date getClassCatCreated() {
        return classCatCreated;
    }

    public void setClassCatCreated(Date classCatCreated) {
        this.classCatCreated = classCatCreated;
    }

    public Date getClassCatUpdated() {
        return classCatUpdated;
    }

    public void setClassCatUpdated(Date classCatUpdated) {
        this.classCatUpdated = classCatUpdated;
    }
}