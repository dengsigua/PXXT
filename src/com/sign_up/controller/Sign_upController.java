package com.sign_up.controller;


import java.nio.channels.ScatteringByteChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.accessibility.AccessibleRelation;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.classes.pojo.Classes;
import com.common.utils.PageBean;
import com.common.utils.ResultMap;
import com.common.utils.UnitTwo;
import com.common.utils.result;
import com.company.pojo.Company;
import com.company.service.CompanyService;
import com.sign_up.pojo.SignUp;
import com.sign_up.service.Sign_upService;
import com.student.pojo.Student;


@Controller
@RequestMapping("/sign_up")
public class Sign_upController {
	@Autowired
	private Sign_upService service;
	
	private int page;
	private int rows;//
	
	
	public void setPage(int page) {
		this.page = page;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	
	@RequestMapping("student_list2")
	public String Student_list2(){
		return "sign_up/student_list2";
	}
	
	@RequestMapping("index")
	@ResponseBody
	public PageBean findSomeStudent(Student st, @RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="10") Integer rows){		
		int index = (page-1)*rows;
			System.out.println(st);
			List<Student> list = service.findSomeStudents(st, index, rows);
			System.out.println(page+"......"+rows+"xxxx");
			if(list==null||list.size()==0){
				System.out.println("null");
			}
			for (Student student : list) {
				System.out.println(student);
			}
			int total = service.selectCountStudent(null);
			PageBean bean = new PageBean();
			bean.setRows(list);
			bean.setTotal(total);
			return bean;
	}
	
	@RequestMapping("findsignup")
	@ResponseBody
	public PageBean findStudent(SignUp sp, @RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="10") Integer rows){		
		    int index = (page-1)*rows;
		    System.out.println("xxxxxx:"+sp.getClassId()+"xxxxxx:"+sp.getSignUpName());
			List<SignUp> list = service.findSignup(sp, index, rows);
			System.out.println(page+"......"+rows+"xxxx");
			if(list==null||list.size()==0){
				System.out.println("null");
			}
			for (SignUp signup : list) {
				System.out.println(signup);
			}
			int total = service.selectCount(null);
			PageBean bean = new PageBean();
			bean.setRows(list);
			bean.setTotal(total);
			return bean;
	}
	
	@RequestMapping("addsignup")
	@ResponseBody
	public result addsignup(HttpSession session,Model model,SignUp sp,String id){
		System.out.println("111");
		System.out.println(sp);
		result result = new result();
		try{
			System.out.println("b");	
			service.insertSignUp(sp);
			//return "sign_up/findsignup";
			result.setSuccess(true);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg", "添加失败");
			model.addAttribute("SignUp", sp);
			result.setSuccess(false);
			result.setErrorMsg("添加失败");	
			//return "sign_up/findsignup";
		}
		return result;
	}
	
	@RequestMapping("editsignup")
	@ResponseBody
	public result editstudent(HttpSession session,Model model,SignUp sp,String id){
		System.out.println("111");
		System.out.println(sp);
		result result = new result();
		try{
			System.out.println("b");	
			service.updateSignUpInfo(sp);
			result.setSuccess(true);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg", "编辑失败");
			model.addAttribute("SignUp", sp);
			result.setSuccess(false);
			result.setErrorMsg("编辑失败");	
			//return "sign_up/findsignup";
		}
		return result;
	}
	
	@RequestMapping("deletesignup")
	@ResponseBody
	public result deletesignup(String ids){
		 System.out.println(ids);
		 String[] str = ids.split(",");
		 result result = new result();
		 try{
			 for(int i=0;i<str.length;i++){
				 System.out.println(str[i]);
				 String id = str[i];
				 //service.updateCompanyStateById(id);
				 service.deleteSignUpById(id);
			 }
			 result.setSuccess(true);
		 }catch(Exception e){
			 e.printStackTrace();
			 result.setSuccess(false);
			 result.setErrorMsg("删除失败");
		 }
		 return result;
	}
	
	/**
	 * 课程报名
	 * @return
	 */
	@RequestMapping("class_signup")
	public String Class_signup(HttpSession session,Model model,SignUp sp){
		System.out.println(sp);
		try{
			System.out.println("b");
			System.out.println(sp);
			service.insertSignup1(sp);
			session.setAttribute("signup", sp);
			model.addAttribute("msg1", "报名成功");
			//return "sign_up/toclasslist";
			return "common/xiangqing2";
		}catch(Exception e){
			System.out.println("c");
			model.addAttribute("msg1", "报名失败");
			model.addAttribute("signup", sp);	
			return "sign_up/class_signup";
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
			SignUp sp){
		int PageSize = 3;
		List<UnitTwo> clas= service.findClassesPage(currentPage, PageSize, sp);		
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		for (UnitTwo unitTwo : clas) {
//			formatter.format(unitTwo.getSignUpTime());
			//System.out.println(string);
//		}
		PageBean bean = new PageBean();
		bean.setRows(clas);
		bean.setPageSize(PageSize);
		bean.setCurrentPage(currentPage);
		int total = service.selectCount(sp);
		System.out.println("total:"+total);
		int count = (total+PageSize-1)/PageSize;
		bean.setTotal(total);
		bean.setTotalPages(count);
		model.addAttribute("SignUpbean", bean);
		sesesion.setAttribute("SignUpbean", bean);
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
		PageBean bean = (PageBean) session.getAttribute("SignUpbean");
		if(bean==null){
			classlist(session,model,1,null);
		}
		
		return "common/dingdanzhongxin";
	}

	
	
	
}		
		
		

