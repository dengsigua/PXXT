package com.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.mapper.AdminMapper;
import com.admin.pojo.Admin;
import com.admin.pojo.AdminExample;
import com.admin.pojo.AdminExample.Criteria;
import com.admin.service.AdminService;
import com.common.utils.PageBean;
import com.company.pojo.Company;
import com.company.service.CompanyService;
import com.student.pojo.Student;
import com.student.service.StudentService;


@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminMapper mapper;
	@Autowired
	private StudentService studentService;
	@Autowired
	private CompanyService companyService;
	
	@Override
	public Admin login(Admin admin) {
		AdminExample example = new AdminExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdminTelEqualTo(admin.getAdminTel());
		criteria.andAdminPasswordEqualTo(admin.getAdminPassword());
		List<Admin> list = mapper.selectByExample(example);
		if(list==null||list.size()<1){
			return null;
		}else{
			return list.get(0);
		}
	}
	@Override
	public void updatePassword(Admin admin) {
		Admin admin1 = mapper.selectByPrimaryKey(admin.getAdminId());
		admin1.setAdminPassword(admin.getAdminPassword());
		mapper.updateByPrimaryKey(admin1);
	}
	
	
	@Override
	public void updateStudentStateById(Long id,boolean state) {
		studentService.updateStudentStateById(id, state);
	}
	@Override
	public List<Student> findAllStudents(PageBean bean) {
		return studentService.findAll(bean);
	}
	
	
	
	@Override
	public List<Student> findSomeStudents(Student student,int index,int pageSize) {
		return studentService.findSomeStudent(student,index,pageSize);
	}
	@Override
	public Student findStudentById(Long id) {
		return studentService.findStudentById(id);
	}
	@Override
	public void updateCompanyStateById(Long id,int state) {
		companyService.updateCompanyStateById(id,state);
	}
	@Override
	public List<Company> findAllCompanys(PageBean bean) {
		return companyService.findAll(bean);
	}
	@Override
	public List<Company> findSomeCompanys(Company company,int index,int pageSize) {
		
		return companyService.findSomeCompany(company, index, pageSize);
	}
	@Override
	public Company findCompanyById(Long id) {
		return companyService.findCompanyById(id);
	}
	@Override
	public int selectCountCompany(Company company) {
		
		return companyService.selectCount(company);
	}
	@Override
	public int selectCountStudent(Student student) {
		// TODO Auto-generated method stub
		return studentService.selectCount(student);
	}

}
