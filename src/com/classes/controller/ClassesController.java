package com.classes.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.weaver.ast.Var;
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
import com.student.pojo.Student;

@Controller
@RequestMapping("/classes")
public class ClassesController {
	@Autowired
	private ClassesService service;
	
	
	@RequestMapping("toAdd")
	public String toAdd(){
		return "classes/class_release";
	}
	@RequestMapping("welcome")
	public String welcome(){
		return "company/welcome";
	}
	
	
	/**
	 * 添加课程，因为这里的表单进行了序列化所以只能一个个接受参数了
	 * @param session
	 * @param model
	 * @param classCid
	 * @param classPrice
	 * @param classTitle
	 * @param classSellPoint
	 * @param classImg
	 * @param classDesc
	 * @return
	 */
	@RequestMapping("addclass")
	public String AddClasses(HttpSession session,Model model,String classCid, String classPrice,
			String classTitle,String classSellPoint,String classImg,String classDesc){

		Company company = (Company) session.getAttribute("company");
		System.out.println(company);
		long l = Long.parseLong(classPrice);
		Classes classes = new Classes();
		classes.setCompanyId(company.getCompanyId());
		classes.setClassCid(classCid);
		classes.setClassPrice(Long.parseLong(classPrice));
		classes.setClassImg(classImg);
		classes.setClassSellPoint(classSellPoint);
		classes.setClassTitle(classTitle);
		classes.setClassDesc(classDesc);
		System.out.println(classes);

		try{
			service.addClasses(classes);
			model.addAttribute("msg","添加成功");
			model.addAttribute("cla",classes);
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("ddddd");
			model.addAttribute("msg", "添加失败");	
		}
		return "classes/class_release";
	}
/**
 * 编辑用户
 * @param session
 * @param model
 * @param classes
 * @return
 */
	@RequestMapping("editClass")
	public String EidtClasses(HttpSession session,Model model,Classes classes){
		//Company com = (Company) session.getAttribute("company");
		//classes.setCompanyId(com.getCompanyId());
		System.out.println("edit:"+classes);
		try{
			service.editClass(classes);
			//model.addAttribute("cla",classes);
			session.removeAttribute("Classbean");
			return "forward:/classes/toClasseslist.do";
		}catch(Exception e){
			e.printStackTrace();
			model.addAttribute("msg","修改失败");
			model.addAttribute("cla",classes);
			return "classes/class_edit";
		}	
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
	public ResultMap DeleteClassesById(HttpSession session,Model model,String classIds){

		String[] strs = classIds.split(",");
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
	 * 查询分页信息
	 * 条件查询
	 * @param sesesion
	 * @param model
	 * @param currentPage
	 * @param classPrice1
	 * @param classPrice2
	 * @param classTitle
	 * @return
	 */
	
	@RequestMapping("classeslist")
	@ResponseBody
	public ResultMap classlist(HttpSession sesesion,Model model,@RequestParam(required=true,defaultValue="1") Integer currentPage,
			@RequestParam(required=true,defaultValue="-1")  Integer classPrice1,@RequestParam(required=true,defaultValue="-1") Integer classPrice2,
			String classTitle){
		System.out.println(currentPage);
		System.out.println(classPrice1);
		System.out.println(classPrice2);
		System.out.println(classTitle);
		Company com = (Company) sesesion.getAttribute("company");
		int PageSize = 6;
		List<Classes> clas = null;
		if(com==null){
			PageSize = 10;
			clas= service.findClassesPage(null,classTitle,classPrice1, classPrice2,currentPage,PageSize);
			
		}else{
			clas= service.findClassesPage(com.getCompanyId(),classTitle,classPrice1, classPrice2,currentPage,PageSize);
		}		
		
		if(clas!=null&&clas.size()>0){
			for (Classes classes : clas) {
				System.out.println(clas);
			}
		}
		PageBean bean = new PageBean();
		bean.setRows(clas);
		bean.setPageSize(PageSize);
		bean.setCurrentPage(currentPage);
		int total =0;
		if(com==null){
			total = service.countClasses(null,classTitle,classPrice1, classPrice2);
		}else{
			total = service.countClasses(com.getCompanyId(),classTitle,classPrice1, classPrice2);
		}
		System.out.println("total:"+total);
		int count = (total+PageSize-1)/PageSize;
		bean.setTotal(total);
		bean.setTotalPages(count);
		model.addAttribute("Classbean", bean);
		sesesion.setAttribute("Classbean", bean);
		ResultMap result = new ResultMap();
		result.setState(true);
		
		return result;
	}
	/**
	 * 跳转到课程管理列表
	 * @return
	 */
	@RequestMapping("toClasseslist")
	public String toClasseslist(HttpSession session,Model model){
		PageBean bean = (PageBean) session.getAttribute("Classbean");
		if(bean==null){
			classlist(session,model,1,-1,-1,"");
		}
		
		return "classes/class_manage";
	}
	
	
	/**
	 * 跳转到课程管理列表
	 * @return
	 */
	@RequestMapping("toliebiaolist")
	public String toliebiaolist(HttpSession session,Model model){
		PageBean bean = (PageBean) session.getAttribute("Classbean");
		if(bean==null){
			classlist(session,model,1,-1,-1,"");
		}
		
		return "common/liebiao";
	}
	
	
	/**
	 * 根据与ID查询
	 * @param model
	 * @param classId
	 * @param request
	 * @return
	 */
	@RequestMapping("findClassById")
	public String findClassById(Model model,String classId,HttpServletRequest request){
		System.out.println("wwwww"+classId);
		HttpSession session = request.getSession();
		Long id = Long.parseLong(classId);
	try{
		Classes cla = service.findClassById(id);
		model.addAttribute("cla", cla);
		session.setAttribute("cla", cla);
		System.out.println(cla);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "classes/class_edit2";
	}
	
	

	


}
