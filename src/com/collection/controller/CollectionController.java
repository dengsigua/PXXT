package com.collection.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.collection.pojo.Collection;
import com.collection.service.CollectionService;
import com.common.utils.CollectClass;
import com.common.utils.PageBean;
import com.common.utils.ResultMap;
import com.common.utils.ShopClass;
import com.shopping_cart.pojo.ShoppingCart;

@Controller
@RequestMapping("/collection")
public class CollectionController {
	@Autowired
	private CollectionService service;
	
	@RequestMapping("classeslist")
	@ResponseBody
	public ResultMap classlist(HttpSession sesesion,Model model,@RequestParam(required=true,defaultValue="1") Integer currentPage,
			Collection collection){
		int PageSize = 10;
		List<CollectClass> collections= service.findClassesPage(currentPage, PageSize, collection);
		PageBean bean = new PageBean();
		bean.setRows(collections);
		bean.setPageSize(PageSize);
		bean.setCurrentPage(currentPage);
		int total = service.selectCount(collection);
		System.out.println("total:"+total);
		int count = (total+PageSize-1)/PageSize;
		bean.setTotal(total);
		bean.setTotalPages(count);
		model.addAttribute("Collectionbean", bean);
		sesesion.setAttribute("Collectionbean", bean);
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
		PageBean bean = (PageBean) session.getAttribute("Collectionbean");
		if(bean==null){
			classlist(session,model,1,null);
		}		
		return "common/collection";
	}
	
	@RequestMapping("addcollection")
	@ResponseBody
	public ResultMap addcollection(HttpSession session,Model model,Collection collection,String id,@RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="10") Integer rows){
		System.out.println("111");
		System.out.println(collection);
		int index = (page-1)*rows;
		ResultMap result = new ResultMap();
		try{
			System.out.println("b");
			System.out.println(collection);
			List<Collection> list = service.findCollection(collection, index, rows);
			System.out.println(list.size());
			if(list.size()>0){
				 result.setState(false);
			}else{
				service.insertCollection(collection);
			    session.setAttribute("collection", collection);
			    model.addAttribute("msg1", "添加成功");
			    result.setState(true);
			}					
		}catch(Exception e){
			System.out.println("c");
			model.addAttribute("msg1", "添加失败");
			model.addAttribute("collection", collection);	
			result.setState(false);
		}
		return result;
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
	public ResultMap DeleteClassesById(HttpSession session,Model model,String collectionIds){
		String[] strs = collectionIds.split(",");
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
}
