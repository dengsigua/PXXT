package com.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这个页面为组合页面加载进行控制
 * @author ASUS
 *
 */
@Controller
@RequestMapping("/common")
public class CommonController {

	
	/**
	 * 后台主页需要加载的页面
	 * @return
	 */
	@RequestMapping("nav")
	public String CreatNav(){
		return "admin/nav";
	}
	
	/**
	 * 后台主页面
	 * @return
	 */
	@RequestMapping("home")
	public String IntoHome(){
		return "admin/index";
	}
	
	/**
	 * 后台管理机构的页面
	 * @return
	 */
	@RequestMapping("company_home")
	public String IntoCompanyHome(){
		return "admin/company_index";
	}
	/**
	 * 后台机构表单
	 * @return
	 */
	@RequestMapping("company_form")
	public String IntoCompanyForm(){
		return "admin/company_table";
	}
	/**
	 * 后台学员表单
	 * @return
	 */
	@RequestMapping("student_home")
	public String IntoStudentHome(){
		return "admin/student_index";
	}
	/**
	 * 后台学员表单
	 * @return
	 */
	@RequestMapping("student_form")
	public String IntoStudentForm(){
		return "admin/student_table";
	}
	
	
	
	/**
	 * 前台主页
	 * @return
	 */
	@RequestMapping("door")
	public String doorIndex(){
		
		return "common/index";
	}
	/**
	 * 前台登陆页面
	 * @return
	 */
	@RequestMapping("login")
	public String login(){
		return "common/login";
	}
	
	/**
	 * 学员注册页面
	 * @return
	 */
	@RequestMapping("StudentRegister")
	public String StudentRegister(){	
		return "student/register";
	}
	/**
	 * 机构注册页面
	 * @return
	 */
	@RequestMapping("CompanyRegister")
	public String CompanyRegister(){
		return "company/register";
	}
	
	@RequestMapping("addClass")
	public String ClassesAdd(){
		return "classes/class_add";
	}
	
	
	
	

	/**
	 *课程列表
	 * @return
	 */
	@RequestMapping("show")
	public String ClassShow(){
		return "company/classlist";
	}
	
	/**
	 * 添加章节
	 */
	@RequestMapping("addchapter")
	public String AddChapter(){
		return "company/chapter_add";
	}
	/**
	 * 添加课时小节
	 * @return
	 */
	@RequestMapping("addPeriod")
	public String AddPeriod(){
		return "company/period_add";
	}
	
	
	@RequestMapping("test")
	public String test(String page){
		String str = "test1/"+page;
		System.out.println(str);
		return str;
	}
	
	
	/**
	 * 购物车页面
	 * @return
	 */
	@RequestMapping("gouwuche")
	public String gouwuche(){
		return "common/gouwuche";
	}

	/**
	 * 个人中心页面
	 * @return
	 */
	@RequestMapping("self_info")
	public String self_info(){
		return "common/self_info";
	}
	
	
	/**
	 * 修改密码页面
	 * @return
	 */
	@RequestMapping("edit_password")
	public String edit_password(){
		return "common/edit_password";
	}
	/**
	 * 修改密码页面
	 * @return
	 */
	@RequestMapping("edit_password2")
	public String edit_password2(){
		
		return "common/edit_password2";
	}
	
	/**
	 * 编辑中心页面
	 * @return
	 */
	@RequestMapping("edit_info2")
	public String edit_info2(){
		return "common/edit_info2";
	}
	
	/**
	 * 详情展示页面
	 * @return
	 */
	@RequestMapping("xiangqing")
	public String xiangqing(){
		return "common/xiangqing";
	}
	/**
	 * 订单中心页面
	 * @return
	 */
	@RequestMapping("dingdanzhongxin")
	public String dingdanzhongxin(){
		return "common/dingdanzhongxin";
	}
	/**
	 * 个人收藏页面
	 * @return
	 */
	@RequestMapping("self_collection")
	public String self_collection(){
		return "common/self_collection";
	}
	/**
	 * 个人评价页面
	 * @return
	 */
	@RequestMapping("self_comment")
	public String self_comment(){
		return "common/self_comment";
	}
	/**
	 * 课程报名页面
	 * @return
	 */
	@RequestMapping("class_signup")
	public String Class_signup(){
		return "student/class_signup";
	}
	
	


}
