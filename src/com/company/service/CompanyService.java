package com.company.service;

import java.util.List;

import com.common.utils.PageBean;
import com.company.pojo.Company;
import com.student.pojo.Student;

/**
 * 操作Company的所有service
 * @author ASUS
 *
 */
public interface CompanyService {
	/**
	 * 根据Id查询机构
	 * @param id
	 * @return
	 */
	public Company findCompanyById(Long id);
	/**
	 * 查找所有的机构
	 * @return
	 */
	public List<Company> findAll(PageBean bean);
	/**
	 * 根据条件查询机构
	 * @param company
	 * @return
	 */
	public List<Company> findSomeCompany(Company company,int index,int pageSize);
	/**
	 * 注册机构信息
	 * @param company
	 */
	public void insertCompany(Company company);
	/**
	 * 根据Id禁用机构
	 * @param id
	 */
	public void updateCompanyStateById(Long id,int state);
	/**
	 * 机构登陆
	 * @param company
	 * @return
	 */
	public Company login(Company company);
	/**
	 * 修改机构登陆密码
	 * @param company
	 */
	public void updateCompanyPassword(Company company);
	/**
	 * 修改机构信息
	 * @param company
	 */
	public void updateCompanyInfo(Company company);
	/**
	 * 根据ID删除机构
	 * @param id
	 */
	public void deleteCompanyById(Long id);
	/**
	 * 批量删除机构
	 * @param ids
	 */
	public void deleteCompanyByIds(Long[] id);
	
	/**
	 * 查询总数
	 * @param c
	 * @return
	 */
	public int selectCount(Company company);
	
	
	public List<Student> findSomeStudents(Student  student,int index,int pageSize);
	public int selectCountStudent(Student student);
	public void deleteStudentById(Long id);
	public void insertStudent(Student Student);
	public void updateStudentInfo(Student Student);
	public Student findStudentById(Long id);
	
	
}
