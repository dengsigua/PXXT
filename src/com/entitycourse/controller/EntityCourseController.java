package com.entitycourse.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.Company;
import com.entitycourse.pojo.Entitycourse;
import com.entitycourse.service.EntityCourseService;

@Controller
@RequestMapping("entityCourse")
public class EntityCourseController {
	@Autowired
	private EntityCourseService sevice;
	
	
	@RequestMapping("toAdd")
	public String toAdd(){
		return "entityCourse/EntityCourse_add";
	}
	
	@RequestMapping("AddEntityCourse")
	public String AddEntityCourse(Model model,HttpSession session,Entitycourse course){

		Company com = (Company) session.getAttribute("company");
		course.setCompanyId(com.getCompanyId());
		System.out.println("EntityCourse:"+course);
		return "entityCourse/EntityCourse_add";
	}
}
