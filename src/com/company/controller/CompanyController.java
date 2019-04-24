package com.company.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.utils.PageBean;
import com.common.utils.result;
import com.company.pojo.Company;
import com.company.service.CompanyService;
import com.student.pojo.Student;


@Controller
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanyService service;

	
	@RequestMapping("register")
	public String register(HttpSession session,Model model,Company company,String code){
		
		String code1 = (String) session.getAttribute("key");
		System.out.println(company);
		if(!code.equals(code1)){
			model.addAttribute("msg", "验证码错误");
			model.addAttribute("company", company);
			return "company/register";
		}
		
		try{
			service.insertCompany(company);
		
			return "common/login";
		}catch (Exception e){
			model.addAttribute("msg", "注册失败");
			model.addAttribute("company", company);
			return "company/register";
		}
	
	}
	
	/**
	 * 基本资料
	 * @return
	 */
	@RequestMapping("base_info")
	public String Base_info(){
		return "company/base_info";
	}
	
	/**
	 * 修改密码
	 * @return
	 */
	@RequestMapping("password_change")
	public String Password_change(){
		return "company/password_change";
	}
	
	/**
	 * 我的桌面
	 * @return
	 */
	@RequestMapping("desk")
	public String Desk(){
		return "company/desk";
	}
	
	@RequestMapping("login")
	public String login(HttpSession session,Model model,String username,String password,String code){
		
		String code1 = (String) session.getAttribute("key");
		Company com = new Company();
		com.setCompanyId((long)1);
		session.setAttribute("company", com);	
		System.out.println(code+"........"+code1);
		System.out.println(username+"..."+password);
		System.out.println("dddd");
		if(code.equals(code1)){
			Company c = new Company();
			c.setCompanyTel(username);
			c.setCompanyPassword(password);
			Company d = null;
			d = service.login(c);	
			System.out.println(d);
			
			if(d==null){
				model.addAttribute("msg", "账号或者密码错误");
				model.addAttribute("username", username);
				return "common/login";
			}else{
				if(d.getCompanyState()==0){
					model.addAttribute("msg", "账号未激活");
					model.addAttribute("username", username);
					return "common/login";
				}else if(d.getCompanyState()==2){
					model.addAttribute("msg", "账号被禁止");
					model.addAttribute("username", username);
					return "common/login";
				}else{
					model.addAttribute("company", d);
					session.setAttribute("company", d);	
					return "company/index";			
				}	
			}
		}else{
			System.out.println("dddd");
			model.addAttribute("msg", "验证码错误");
			return "common/login";
		}
	}
	
//	@RequestMapping("login")
//	public String login(HttpSession session,Model model,String username,String password,String code){
//		
//		String code1 = (String) session.getAttribute("key");
//		System.out.println(username+"..."+password);
//		if(code.equals(code1)){
//			Company c = new Company();
//			c.setCompanyTel(username);
//			c.setCompanyPassword(password);
//		//	c = service.login(c);
//			Company d = null;
//			d = service.login(c);
//			System.out.println();
//			if(c==null){
//				model.addAttribute("msg", "账号或者密码错误");
//				model.addAttribute("username", username);
//				return "common/login";
//			}else{
//				model.addAttribute("username", username);
//				model.addAttribute("msg", username);
//				session.setAttribute("company", d);
//			//	session.setAttribute("company", d);
//				return "company/index";
//			}
//		}else{
//			model.addAttribute("msg", "验证码错误");
//			return "company/index";
//		}
//	
//	}
	
	@RequestMapping("findSomeStudent")
	@ResponseBody
	public PageBean findSomeStudent(Student st, @RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="10") Integer rows){		
		    int index = (page-1)*rows;
		    System.out.println("xxxxxx:"+st.getStudentId()+"xxxxxx:"+st.getStudentName());
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
	
	
	@RequestMapping("deletestudent")
	@ResponseBody
	public result deletestudent(String ids){
		 System.out.println(ids);
		 String[] str = ids.split(",");
		 result result = new result();
		 try{
			 for(int i=0;i<str.length;i++){
				 System.out.println(str[i]);
				 Long id = Long.parseLong(str[i]);
				 //service.updateCompanyStateById(id);
				 service.deleteStudentById(id);
			 }
			 result.setSuccess(true);
		 }catch(Exception e){
			 e.printStackTrace();
			 result.setSuccess(false);
			 result.setErrorMsg("删除失败");
		 }
		 return result;
	}
	
	
	@RequestMapping("addstudent")
	@ResponseBody
	public result addstudent(HttpSession session,Model model,Student st,String id){
		System.out.println("111");
		System.out.println(st);
		result result = new result();
		try{
			System.out.println("b");	
			service.insertStudent(st);
			//return "sign_up/findsignup";
			result.setSuccess(true);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg", "添加失败！");
			model.addAttribute("student", st);
			result.setSuccess(false);
			result.setErrorMsg("编辑失败");	
			//return "sign_up/findsignup";
		}
		return result;
	}
	
	
	@RequestMapping("editstudent")
	@ResponseBody
	public result editstudent(HttpSession session,Model model,Student st,String id){
		System.out.println("111");
		System.out.println(st);
		result result = new result();
		try{
			System.out.println("b");	
			service.updateStudentInfo(st);
			//return "sign_up/findsignup";
			result.setSuccess(true);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg", "编辑失败！");
			model.addAttribute("student", st);
			result.setSuccess(false);
			result.setErrorMsg("编辑失败");	
			//return "sign_up/findsignup";
		}
		return result;
	}
	
	@RequestMapping("edit_info")
	public String edit_info(HttpSession session,Model model,Company c,String id){
		System.out.println("111");
		System.out.println(c);
		try{
			Company com = service.findCompanyById(c.getCompanyId());
			c.setCompanyState(com.getCompanyState());
			
			System.out.println("b");
			model.addAttribute("company", c);
			service.updateCompanyInfo(c);
			//model.addAttribute("company", c);
			System.out.println(c);
            return "company/base_info";
			//result.setSuccess(true);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg", "编辑失败！");
			model.addAttribute("company", c);
			System.out.println(c);
			//result.setSuccess(false);
			////"forward:company/base_info.do";
			//result.setErrorMsg("编辑失败");	
			return "forward:company/base_info.do";
		}
		//return result;
	}
	
	@RequestMapping("psd_change")
	public String psd_change(HttpSession session,Model model,Company c,String id){
		System.out.println("111");
		System.out.println(c);
		Company xx = service.findCompanyById(c.getCompanyId());
		c.setCompanyState(xx.getCompanyState());
		try{
			System.out.println("b");
			model.addAttribute("company", c);
			service.updateCompanyInfo(c);
			System.out.println(c);
            return "company/base_info";
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg", "编辑失败！");
			model.addAttribute("company", c);
			System.out.println(c);
			return "forward:company/base_info.do";
		}
	}
	

	
	@RequestMapping("logout")
	public String logout(HttpSession session,Model model,String username,String password){		
		session.setAttribute("company",null);
        System.out.println("退出登录");
        return "common/login";				
	}

}
