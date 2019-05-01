package com.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.mapper.OrderMapper;
import com.order.pojo.Order;
import com.order.service.OrderService;
import com.shopping_cart.pojo.ShoppingCart;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper mapper;
	
	@Override
	public void insertOrder(Order order) {
		mapper.insert(order);
	}
}
