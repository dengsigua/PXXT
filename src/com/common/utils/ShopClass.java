package com.common.utils;

import java.util.Date;

import com.shopping_cart.pojo.ShoppingCart;

public class ShopClass extends ShoppingCart{
	private String classTitle;
	
	private Long classPrice;

    private String classImg;

    private String classCid;

    private Long companyId;
    private String companyName;
    public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getClassTitle() {
		return classTitle;
	}

	public void setClassTitle(String classTitle) {
		this.classTitle = classTitle;
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
		this.classImg = classImg;
	}

	public String getClassCid() {
		return classCid;
	}

	public void setClassCid(String classCid) {
		this.classCid = classCid;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	

}
