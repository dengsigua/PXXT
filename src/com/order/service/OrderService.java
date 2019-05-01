package com.order.service;

import com.order.pojo.Order;

/**
 * shopping_cart的service层
 * @author ASUS
 *
 */
public interface OrderService {
	/**
	 * 添加购物车
	 * @param classes
	 */
	void insertOrder(Order order);

}
