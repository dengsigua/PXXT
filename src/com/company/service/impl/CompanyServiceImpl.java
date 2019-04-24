package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.utils.PageBean;
import com.company.mapper.CompanyMapper;
import com.company.pojo.Company;
import com.company.pojo.CompanyExample;
import com.company.pojo.CompanyExample.Criteria;
import com.company.service.CompanyService;
import com.student.mapper.StudentMapper;
import com.student.pojo.Student;
import com.student.service.StudentService;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private  CompanyMapper mapper;
	
	@Autowired
	private  StudentMapper mapper1;
	@Autowired
	private StudentService studentService;
	
	
	@Override
	public Company findCompanyById(Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Company> findAll(PageBean bean) {
		return mapper.findAll(bean);
	}
	/**
	 * 我们暂定的是根据机构的名称查询
	 */
	
	
	
	@Override
	public List<Company> findSomeCompany(Company company,int index,int pageSize) {
		CompanyExample example = new CompanyExample();
		
		Criteria criteria = example.createCriteria();
		if(company!=null){
			if(!"".equals(company.getCompanyCity())&&company.getCompanyCity()!=null){
				criteria.andCompanyCityEqualTo(company.getCompanyCity());
			}
			if(!"".equals(company.getCompanyName())&&company.getCompanyName()!=null){
				criteria.andCompanyNameLike("%"+company.getCompanyName()+"%");
			}
		}
		
		example.setIndex(index);
		example.setPageSize(pageSize);
		return mapper.selectByExample(example);
	}

	@Override
	public void insertCompany(Company company) {
		company.setCompanyState(0);
		mapper.insert(company);
	}

	@Override
	public void updateCompanyStateById(Long id,int state) {
		Company company = mapper.selectByPrimaryKey(id);
		company.setCompanyState(state);
		mapper.updateByPrimaryKey(company);	
	}
	/**
	 * 登陆我们用的是手机号和密码
	 * @param company
	 * @return
	 */
	@Override
	public Company login(Company company) {
		CompanyExample example = new CompanyExample();
		Criteria criteria = example.createCriteria();
		criteria.andCompanyTelEqualTo(company.getCompanyTel());
		criteria.andCompanyPasswordEqualTo(company.getCompanyPassword());
		List<Company> list = mapper.selectByExample(example);
		if(list==null||list.size()<1){
			return null;
		}else{
			return list.get(0);
		}
	}
	/**
	 * 修改密码 和修改机构信息不同
	 * 区别在于传入的参数不一样，
	 * 修改密码我们company的参数只有ID和Password
	 * 但是修改信息的时候我们的参数比较完整
	 * @param company
	 */
	@Override
	public void updateCompanyPassword(Company company) {
		Company company1 = mapper.selectByPrimaryKey(company.getCompanyId());
		company1.setCompanyPassword(company.getCompanyPassword());
		mapper.updateByPrimaryKey(company1);
	}

	@Override
	public void deleteCompanyById(Long id) {
		mapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void deleteCompanyByIds(Long[] id) {
		for(int i=0;i<id.length;i++){
			mapper.deleteByPrimaryKey(id[i]);
		}
		
	}

	@Override
	public void updateCompanyInfo(Company company) {
		
		mapper.updateByPrimaryKey(company);	
	}

	@Override
	public int selectCount(Company company) {
		
		CompanyExample example = new CompanyExample();
		Criteria criteria = example.createCriteria();
		if(company!=null){
			if(!"".equals(company.getCompanyCity())&&company.getCompanyCity()!=null){
				criteria.andCompanyCityEqualTo(company.getCompanyCity());
			}
			if(!"".equals(company.getCompanyName())&&company.getCompanyName()!=null){
				criteria.andCompanyNameLike(company.getCompanyName());
			}	
		}
		
		return mapper.countByExample(example);
	}
	
	
	@Override
	public List<Student> findSomeStudents(Student student,int index,int pageSize) {
		return studentService.findSomeStudent(student,index,pageSize);
	}
	@Override
	public int selectCountStudent(Student student) {
		// TODO Auto-generated method stub
		return studentService.selectCount(student);
	}
	
	
	
	
	@Override
	public void deleteStudentById(Long id) {
		studentService.deleteStudentById(id);
	}
	
	
	@Override
	public void insertStudent(Student Student) {
		mapper1.insert(Student);
	}
	
	@Override
	public void updateStudentInfo(Student Student) {
		mapper1.updateByPrimaryKey(Student);
	}
	@Override
	public Student findStudentById(Long id) {
		return studentService.findStudentById(id);
	}

}
