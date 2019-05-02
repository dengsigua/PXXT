package com.orders.service;

import com.orders.pojo.Orders;

/**
 * shopping_cart的service层
 * @author ASUS
 *
 */
public interface OrdersService {
	/**
	 * 添加购物车
	 * @param classes
	 */
	void insertOrders(Orders orders);

}
