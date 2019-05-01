package com.order.controller;

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
	public String addorder(HttpSession session,Model model,Order order,String id){
		System.out.println("111");
		System.out.println(order);
		try{
			System.out.println("b");
			System.out.println(order);
			service.insertOrder(order);
			session.setAttribute("order", order);
			model.addAttribute("msg1", "添加成功");
			return "common/order";				
		}catch(Exception e){
			System.out.println("c");
			model.addAttribute("msg1", "添加失败");
			model.addAttribute("order", order);	
			return "common/self_collection";
		}
	}
}
