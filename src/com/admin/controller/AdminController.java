package com.admin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.admin.pojo.Admin;
import com.admin.service.AdminService;
import com.common.utils.PageBean;
import com.company.pojo.Company;
import com.student.pojo.Student;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService service;
	
	@RequestMapping("index")
	public String index(){
		return "admin/login";
	}
	/**
	 * 管理员登陆
	 * @param session
	 * @param model
	 * @param valiDate
	 * @param admin
	 * @return
	 */
	@RequestMapping("login")
	public String login(HttpSession session,Model model, String valiDate,Admin admin){
		System.out.println("admin:"+admin);
		String code1 = (String) session.getAttribute("key");
		if(!code1.equals(valiDate)){
			model.addAttribute("msg", "验证码错误");
			model.addAttribute("admin", admin);
			return "admin/login";
		}
		admin.setAdminTel("2147483647");
		admin.setAdminPassword("1234");
		Admin admin1 = service.login(admin);
		if(admin1==null){
			model.addAttribute("msg", "账号或者密码错误");
			return "admin/login";
		}
		System.out.println(admin1);
		model.addAttribute("ad", admin1);
		session.setAttribute("ad", admin1);
		return "admin/main";
	}
	
	

    /**
     * 分页查询机构
     * @param page
     * @param rows
     * @param company
     * @return
     */
	@RequestMapping("findSomeCompany")
	@ResponseBody
	public PageBean findSomeCompany(@RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="8") Integer rows,Company company){
	
		System.out.println("company"+company);
		int index = (page-1)*rows;	
		List<Company> list = service.findSomeCompanys(company, index, rows);
		System.out.println(page+"......"+rows+"xxxx");
		if(list==null||list.size()==0){
			System.out.println("null");
		}
		for (Company conpany : list) {
			System.out.println(conpany);
		}
		int total = service.selectCountCompany(company);
		PageBean bean = new PageBean();
		bean.setRows(list);
		bean.setTotal(total);
		
		return bean;
	}

	/**
	 * 禁用机构
	 * @param ids
	 * @return
	 */
	@RequestMapping("prohibitCompany")
	public String prohibit(String ids){
		 System.out.println(ids);
		 String[] str = ids.split(",");
		 for(int i=0;i<str.length;i++){
			 System.out.println(str[i]);
			 Long id = Long.parseLong(str[i]);
			 service.updateCompanyStateById(id,2);
		 }
		 return "admin/company_table";
	}
	
	/**
	 * 启用机构
	 * @param ids
	 * @return
	 */
	@RequestMapping("allowCompany")
	public String allow(String ids){
		 System.out.println(ids);
		 String[] str = ids.split(",");
		 for(int i=0;i<str.length;i++){
			 System.out.println(str[i]);
			 Long id = Long.parseLong(str[i]);
			 service.updateCompanyStateById(id,1);
		 }
		 return "admin/company_table";
	}

	
	/**
	 * 分页查询学员
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("findSomeStudent")
	@ResponseBody
	public PageBean findSomeStudent(@RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="10") Integer rows,Student student){
	
		System.out.println(student);
		int index = (page-1)*rows;
	
		
		List<Student> list = service.findSomeStudents(student, index, rows);
		System.out.println(page+"......"+rows+"xxxx");
		if(list==null||list.size()==0){
			System.out.println("null");
		}
		for (Student stu : list) {
			System.out.println(stu);
		}
		int total = service.selectCountStudent(null);
		PageBean bean = new PageBean();
		bean.setRows(list);
		bean.setTotal(total);
		
		return bean;
	}
	
	/**
	 * 禁用学员
	 * @param ids
	 * @return
	 */
	@RequestMapping("prohibitStudent")
	public String prohibitStudent(String ids){
		 System.out.println(ids);
		 String[] str = ids.split(",");
		 for(int i=0;i<str.length;i++){
			 System.out.println(str[i]);
			 Long id = Long.parseLong(str[i]);
			 service.updateStudentStateById(id,false);
		 }
		 return "admin/student_table";
	}
	
	/**
	 * 启用学员
	 * @param ids
	 * @return
	 */
	@RequestMapping("allowStudent")
	public String allowStudent(String ids){
		 System.out.println(ids);
		 String[] str = ids.split(",");
		 for(int i=0;i<str.length;i++){
			 System.out.println(str[i]);
			 Long id = Long.parseLong(str[i]);
			 service.updateStudentStateById(id,true);
		 }
		 return "admin/student_table";
	}

	
}
