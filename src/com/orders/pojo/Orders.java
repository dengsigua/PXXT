package com.orders.pojo;

import java.util.Date;

public class Orders {
    private String ordersId;

    private String classIds;

    private Long studentId;

    private Date ordersTime;

    private Float ordersPrice;

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId == null ? null : ordersId.trim();
    }

    public String getClassIds() {
        return classIds;
    }

    public void setClassIds(String classIds) {
        this.classIds = classIds == null ? null : classIds.trim();
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Date getOrdersTime() {
        return ordersTime;
    }

    public void setOrdersTime(Date ordersTime) {
        this.ordersTime = ordersTime;
    }

    public Float getOrdersPrice() {
        return ordersPrice;
    }

    public void setOrdersPrice(Float ordersPrice) {
        this.ordersPrice = ordersPrice;
    }
}