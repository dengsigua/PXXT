package com.student.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.classes.pojo.Classes;
import com.common.utils.PageBean;
import com.common.utils.ResultMap;
import com.company.pojo.Company;
import com.sign_up.pojo.SignUp;
import com.student.pojo.Student;
import com.student.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;
	/**
	 * 学员注册方法
	 * @param session 获取验证码用的
	 * @param model  用了数据回显的
	 * @param code 验证码
	 * @param st 封装对象
	 * @return
	 */
	
	/**
	 * 学员列表
	 * @return
	 */
	@RequestMapping("student_list")
	public String Student_list(){
		return "student/student_list";
	}
	
	@RequestMapping("regester")
	public String regester(HttpSession session,Model model,Student student,String code){
		String code1 = (String) session.getAttribute("key");
		student.setStudentState(true);
		System.out.println(student);
		if(!code.equals(code1)){
			model.addAttribute("msg", "验证码错误");
			model.addAttribute("student", student);
			return "student/register";
		}
		
		try{
			service.addStudent(student);
			model.addAttribute("student", student);
			return "common/login";
		}catch (Exception e){
			model.addAttribute("msg", "注册失败");
			model.addAttribute("student", student);
			return "student/register";
		}
	}
	
	@RequestMapping("login")
	public String login(HttpSession session,Model model,String username,String password,String code){
			String code1 = (String) session.getAttribute("key");
			System.out.println(username+"..."+password);
			if(code.equals(code1)){
				Student s = new Student();
				s.setStudentTel(username);
				
				s.setStudentPassword(password);
				System.out.println(s);
				Student stu = service.login(s);
				System.out.println(stu);
				
			if(stu==null){
					model.addAttribute("msg", "账号或者密码错误");
					model.addAttribute("username", username);
					return "common/login";
				}else if(stu.getStudentState()==false){
					model.addAttribute("msg", "账号已经被冻结");
					model.addAttribute("username", username);
					return "common/login";
				}else{
					session.setAttribute("studentName", stu.getStudentName());
					model.addAttribute("studentName", stu.getStudentName());
					model.addAttribute("student", stu);
					session.setAttribute("student", stu);	
					return "common/index";
				}
			}else{
				model.addAttribute("msg", "验证码错误");
				return "common/login";
			}	
	
	}
	
	
	@RequestMapping("edit_info")
	public String edit_info(HttpSession session,Model model,Student stu,String id){
		System.out.println("111");
		System.out.println(stu);
		try{
			//System.out.println(student);
			Student student = service.findStudentById(stu.getStudentId());		
			student.setStudentState(student.getStudentState());			
			System.out.println("b");	
			model.addAttribute("student", stu);
			service.updateStudentInfo(stu);
			session.setAttribute("student", stu);
			//model.addAttribute("company", c);
			System.out.println(stu);
            return "common/self_info";
			//result.setSuccess(true);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg", "编辑失败！");
			model.addAttribute("student", stu);
			System.out.println(stu);
			//result.setSuccess(false);
			////"forward:company/base_info.do";
			//result.setErrorMsg("编辑失败");	
			return "common/self_info";
		}
		//return result;
	}
	

	@RequestMapping("psd_change")
	public String psd_change(HttpSession session,Model model,Student stu,String id){
		System.out.println("111");
		System.out.println(stu);
		Student xx = service.findStudentById(stu.getStudentId());
		stu.setStudentState(xx.getStudentState());
		try{
			System.out.println("b");
			model.addAttribute("student", stu);
			service.updateStudentInfo(stu);
			System.out.println(stu);
            return "common/edit_password2";
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg", "编辑失败！");
			model.addAttribute("student", stu);
			System.out.println(stu);
			return "common/edit_password2";
		}
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session,Model model,String username){		
		session.setAttribute("student",null);
        System.out.println("退出登录");
        return "common/login";				
	}
	
}
