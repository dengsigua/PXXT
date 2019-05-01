package com.shopping_cart.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.utils.PageBean;
import com.common.utils.ResultMap;
import com.common.utils.ShopClass;
import com.common.utils.UnitTwo;
import com.common.utils.result;
import com.shopping_cart.pojo.ShoppingCart;
import com.shopping_cart.service.Shopping_Cart_Service;
import com.sun.org.apache.bcel.internal.generic.NEW;




@Controller
@RequestMapping("/shopping_cart")
public class Shopping_Cart_Controller {
	@Autowired
	private Shopping_Cart_Service service;
	
	
	@RequestMapping("findshoppingcart")
	@ResponseBody
	public PageBean findshoppingcart(ShoppingCart sp, @RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="10") Integer rows){		
		    int index = (page-1)*rows;
		    System.out.println("xxxxxx:"+sp.getStudentId()+"xxxxxx:"+sp.getClassId());
			List<ShoppingCart> list = service.findShoppingCart(sp, index, rows);
			System.out.println(page+"......"+rows+"xxxx");
			if(list==null||list.size()==0){
				System.out.println("null");
			}
			for (ShoppingCart shoppingcart : list) {
				System.out.println(shoppingcart);
			}
			int total = service.selectCount(null);
			PageBean bean = new PageBean();
			bean.setRows(list);
			bean.setTotal(total);
			return bean;
	}
	
	@RequestMapping("addshoppingcart")
	@ResponseBody
	public ResultMap addshoppingcart(HttpSession session,Model model,ShoppingCart sp,String id,@RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="10") Integer rows){
		System.out.println("111");
		System.out.println(sp);
		int index = (page-1)*rows;
		ResultMap result = new ResultMap();
		try{
			System.out.println("b");
			System.out.println(sp);
			List<ShoppingCart> list = service.findShoppingCart(sp, index, rows);
			System.out.println(list.size());
			if(list.size()>0){
				 result.setState(false);
			}else{
				service.ShoppingCartinsert(sp);
			    session.setAttribute("shoppingcart", sp);
			    model.addAttribute("msg1", "添加成功");
			    result.setState(true);
			}					
		}catch(Exception e){
			System.out.println("c");
			model.addAttribute("msg1", "添加失败");
			model.addAttribute("shoppingcart", sp);	
			result.setState(false);
		}
		return result;
	}
	
	@RequestMapping("classeslist")
	@ResponseBody
	public ResultMap classlist(HttpSession sesesion,Model model,@RequestParam(required=true,defaultValue="1") Integer currentPage,
			ShoppingCart sp){
		int PageSize = 5;
		List<ShopClass> clas= service.findClassesPage(currentPage, PageSize, sp);
		PageBean bean = new PageBean();
		bean.setRows(clas);
		bean.setPageSize(PageSize);
		bean.setCurrentPage(currentPage);
		int total = service.selectCount(sp);
		System.out.println("total:"+total);
		int count = (total+PageSize-1)/PageSize;
		bean.setTotal(total);
		bean.setTotalPages(count);
		model.addAttribute("ShoppingCartbean", bean);
		sesesion.setAttribute("ShoppingCartbean", bean);
		ResultMap result = new ResultMap();
		result.setState(true);		
		return result;
	}
	
	/**
	 * 跳转到我的课程列表列表
	 * @return
	 */
	@RequestMapping("toclasslist")
	public String toclasslist(HttpSession session,Model model){
		PageBean bean = (PageBean) session.getAttribute("ShoppingCartbean");
		if(bean==null){
			classlist(session,model,1,null);
		}
		
		return "common/self_collection";
	}
	
	/**
	 * 批量删除
	 * @param session
	 * @param model
	 * @param classIds
	 * @return
	 */
	
	@RequestMapping("deleteClassByIds")
	@ResponseBody
	public ResultMap DeleteClassesById(HttpSession session,Model model,String shoppingcartIds){

		String[] strs = shoppingcartIds.split(",");
		ArrayList<Long> ids = new ArrayList<>();
		
		for(int i = 0;i < strs.length;i++){
			long id = Long.parseLong(strs[i]);
			ids.add(id);
		}
		ResultMap map = new ResultMap();
		try{
			for(int i=0;i<ids.size();i++){
				service.deleteClassesById(ids.get(i));
			}
			
			map.setState(true);
			return map;
		}catch(Exception e){
			e.printStackTrace();
			map.setState(false);
			map.setMsg("删除失败");
			return map;
		}	
	}
	
	/**
	 * 跳转到订单列表
	 * @return
	 */
	@RequestMapping("orderlist")
	@ResponseBody
	public ResultMap orderlist(HttpSession session,Model model,String shoppingcartIds){
             String[] idStrings = shoppingcartIds.split(",");
            ResultMap map = new ResultMap();
            		
             try{
            	 List<ShopClass> sClasses = new ArrayList<>();
                 for (String id : idStrings) {
    				ShopClass sClass= service.findShopClassById(id);
    				sClasses.add(sClass);
    			}
                 session.setAttribute("sClasses", sClasses);
                 map.setState(true);
            }catch(Exception e){
            	e.printStackTrace();
            	map.setState(false);
            	map.setMsg("网络异常");
            }
            
			return map;
		}
		
		
		

}
