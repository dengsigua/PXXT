package com.common.utils;

import com.collection.pojo.Collection;

public class CollectClass extends Collection{

	private String classTitle;
	
	private Long classPrice;

    private String classImg;
    
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
}
