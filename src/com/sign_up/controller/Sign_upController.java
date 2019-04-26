package com.sign_up.controller;

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
			model.addAttribute("msg", "���ʧ�ܣ�");
			model.addAttribute("SignUp", sp);
			result.setSuccess(false);
			result.setErrorMsg("�༭ʧ��");	
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
				 Long id = Long.parseLong(str[i]);
				 //service.updateCompanyStateById(id);
				 service.deleteSignUpById(id);
			 }
			 result.setSuccess(true);
		 }catch(Exception e){
			 e.printStackTrace();
			 result.setSuccess(false);
			 result.setErrorMsg("ɾ��ʧ��");
		 }
		 return result;
	}
	

	
}		
		
		

