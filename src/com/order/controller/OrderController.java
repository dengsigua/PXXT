package com.order.controller;

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
import com.order.pojo.Order;
import com.order.service.OrderService;
import com.shopping_cart.pojo.ShoppingCart;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService service;
	
	@RequestMapping("addorder")
	@ResponseBody
	public ResultMap addorder(HttpSession session,Model model,Order order,String classIds, Long studentId,Float orderPrice){
		System.out.println("111");
		System.out.println(order);
		System.out.println(classIds);
		System.out.println(studentId);	
		System.out.println(orderPrice);	
		ResultMap map = new ResultMap();
		try{
			System.out.println("b");
			System.out.println(order);
			service.insertOrder(order);
			session.setAttribute("order", order);
			System.out.println(order);
			model.addAttribute("msg1", "添加成功");
			map.setState(true);			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg1", "添加失败");
			model.addAttribute("order", order);	
			map.setState(false);
        	map.setMsg("网络异常");
			
		}
		return map;
	}
}
