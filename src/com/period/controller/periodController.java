package com.period.controller;

import java.util.List;


import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.classes.pojo.Classes;
import com.classes.service.ClassesService;
import com.common.utils.PageBean;
import com.common.utils.ResultMap;
import com.company.pojo.Company;
import com.period.pojo.Period;
import com.period.service.periodService;

@Controller
@RequestMapping("/period")
public class periodController {
	@Autowired
	private periodService service;
	@Autowired
	private ClassesService claService;
	
	@RequestMapping("toList")
	public String init(HttpSession session,Model model,String classId){
		System.out.println("toList:"+classId);
		Integer intId = Integer.parseInt(classId);
		Long id = Long.parseLong(classId);
		System.out.println("toList+id:"+id);
		Classes cla = claService.findClassById(id);
		
		System.out.println("toList:"+cla);
		System.out.println("toList:"+intId);
		model.addAttribute("PeriodClass", cla);
		session.setAttribute("PeriodClass", cla);
		session.setAttribute("classId", intId);
		Company com = (Company) session.getAttribute("company");
		if(com==null){
			return "common/xiangqing2";
		}else{
			return "period/periodList";
		}
		
	}
	
	
	@RequestMapping("addOrEditPeriod")
	public String addOrEditPeriod(Model model,Period period,String flag){
		
		System.out.println("add:"+period);
		System.out.println("xxxxxxxxx:"+flag);
		
		try{
			
			if("add".equals(flag)){
				service.addPeriod(period);
			}
			if("edit".equals(flag)){
				service.updatePeriod(period);
			}	
		}catch(Exception e){
			e.printStackTrace();
		}
		return "period/periodList";
	}
	
	
	
	@RequestMapping("findSomePeriod")
	@ResponseBody
	public PageBean findSomeCompany(@RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="8") Integer rows,Period period,HttpSession session){
		Integer classId = (Integer) session.getAttribute("classId");
		
		System.out.println("period"+period);
		System.out.println("classId:"+classId);
		int index = (page-1)*rows;	
		System.out.println(page+"......"+rows+"xxxx");
		List<Period> list = service.findSomePeriod(classId,period,index, rows);

		if(list==null||list.size()==0){
			System.out.println("null");
		}
		for (Period p : list) {
			System.out.println(p);
		}
		int total = service.selectCountPeriod(classId,period);
		PageBean bean = new PageBean();
		bean.setRows(list);
		bean.setTotal(total);
		return bean;
	}

	@RequestMapping("findPeriodById")
	@ResponseBody
	public ResultMap findPeriodById(HttpSession session,Model model,String PeriodId){
		System.out.println("findPeriodById:"+PeriodId);
		Integer id = Integer.parseInt(PeriodId);
		ResultMap map = new ResultMap();
		try{
			Period p = service.findPeriodById(id);	
			map.setState(true);
			System.out.println("p:"+p);
			map.setObject(p);
			session.removeAttribute("period");
			session.setAttribute("period",p);
			model.addAttribute("period", p);
		}catch(Exception e){
			map.setState(false);
			map.setMsg("网络异常");
			e.printStackTrace();
			
		}
		return map;
	}
	
	@RequestMapping("deletePeriodByIds")
	@ResponseBody
	public ResultMap deletePeriodByIds(String ids){
		
		System.out.println("periodIds:"+ids);
		String[] strs = ids.split(",");
		ResultMap map = new ResultMap();
		
			try{
				for(int i=0;i<strs.length;i++){
				 Integer id = Integer.parseInt(strs[i]);
				service.deletePeriodById(id);
				}
				map.setState(true);
			}catch(Exception e){
				e.printStackTrace();
				map.setState(false);
				map.setMsg("删除失败");
			}
		
		
		return map;
	}
	
	
}
