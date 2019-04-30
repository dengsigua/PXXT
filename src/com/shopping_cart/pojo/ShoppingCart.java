package com.shopping_cart.pojo;

import java.util.Date;

public class ShoppingCart {
    private Long shoppingCartId;

    private Long classId;

    private Long studentId;

    private Date shoppingCartTime;

    public Long getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(Long shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Date getShoppingCartTime() {
        return shoppingCartTime;
    }

    public void setShoppingCartTime(Date shoppingCartTime) {
        this.shoppingCartTime = shoppingCartTime;
    }

	@Override
	public String toString() {
		return "ShoppingCart [shoppingCartId=" + shoppingCartId + ", classId=" + classId + ", studentId=" + studentId
				+ ", shoppingCartTime=" + shoppingCartTime + "]";
	}
    
}