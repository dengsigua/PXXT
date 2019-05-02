package com.orders.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

import com.common.utils.ResultMap;
import com.orders.pojo.Orders;
import com.orders.service.OrdersService;
import com.shopping_cart.pojo.ShoppingCart;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	@Autowired
	private OrdersService service;
	
	@RequestMapping("addorders")
	@ResponseBody
	public ResultMap addorders(HttpSession session,Model model,Orders orders,String classIds, Long studentId,Float ordersPrice){
		System.out.println("111");
		System.out.println(orders);
		System.out.println(classIds);
		System.out.println(studentId);	
		System.out.println(ordersPrice);	
		ResultMap map = new ResultMap();
		try{
			System.out.println("b");
			System.out.println(orders);
			service.insertOrders(orders);
			session.setAttribute("orders", orders);
			System.out.println(orders);
			model.addAttribute("msg1", "添加成功");
			map.setState(true);			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg1", "添加失败");
			model.addAttribute("orders", orders);	
			map.setState(false);
        	map.setMsg("网络异常");
			
		}
		return map;
	}
}
