package com.cat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cat.service.ClassCatService;
import com.common.utils.EasyUITreeNode;
/**
 * 商品分类管理
 * @author ASUS
 *
 */
@Controller
@RequestMapping("/classCat")
public class ClassCatController {
	@Autowired
	private ClassCatService service;
	
	@RequestMapping("findCatList")
	@ResponseBody
	public List<EasyUITreeNode> getClassCatList(@RequestParam(value="id", defaultValue="0")Long parentId){
		List<EasyUITreeNode> list = service.getClassCatList(parentId);
		return list;
	}
	
	
}
