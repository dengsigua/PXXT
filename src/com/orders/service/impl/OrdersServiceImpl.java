package com.orders.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orders.mapper.OrdersMapper;
import com.orders.pojo.Orders;
import com.orders.service.OrdersService;
import com.shopping_cart.pojo.ShoppingCart;

@Service
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	private OrdersMapper mapper;
	
	@Override
	public void insertOrders(Orders orders) {
		orders.setOrdersId(UUID.randomUUID().toString());
		orders.setOrdersTime(new Date());
		mapper.insert(orders); 
	}
	
}
