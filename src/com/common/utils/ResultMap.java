package com.common.utils;

import com.period.pojo.Period;

public class ResultMap {
	
	private String  msg;
	private boolean state;
	private Object object;
	


	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	
}
