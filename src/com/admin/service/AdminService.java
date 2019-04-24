package com.admin.service;

import java.util.List;

import com.admin.pojo.Admin;
import com.common.utils.PageBean;
import com.company.pojo.Company;
import com.student.pojo.Student;

/**
 * 管理员的功能
 * @author 王帅毅
 *
 */
public interface AdminService {
	/**
	 *强制禁止某个学员的账号
	 * @param id
	 */
	public void updateStudentStateById(Long id,boolean state);
	/**
	 * 查找所有的用户
	 * @return
	 */
	public List<Student> findAllStudents(PageBean bean);
	/**
	 * 按条件查询学员
	 * @return
	 */
	public List<Student> findSomeStudents(Student  student,int index,int pageSize);
	/**
	 * 查找学员总数
	 * @param student
	 * @return
	 */
	
	public int selectCountStudent(Student student);
	/**
	 *根据Id查询学员
	 * @param id
	 * @return
	 */
	public Student findStudentById(Long id);
	/**
	 * 强制关闭某个机构的账号
	 * @param id
	 */
	public void updateCompanyStateById(Long id,int state);
	/**
	 * 查询所有的机构
	 * @return
	 */
	public List<Company> findAllCompanys(PageBean bean);
	/**
	 * 按条件查询机构
	 * @return
	 */
	public List<Company> findSomeCompanys(Company  company,int index,int pageSize);
	/**
	 *根据Id查询机构
	 * @param id
	 * @return
	 */
	public Company findCompanyById(Long id);
	/**
	 * 管理员登录
	 * @param admin
	 */
	public Admin login(Admin admin);
	/**
	 * 管理员 修改密码
	 * @param admin
	 */
	public void updatePassword(Admin admin);
	/**
	 * 查询机构的总记录数
	 * @param company
	 */
	public int selectCountCompany(Company company);
}
