package com.student.service;

import java.util.List;

import com.classes.pojo.Classes;
import com.common.utils.PageBean;
import com.sign_up.pojo.SignUp;
import com.student.pojo.Student;



/**
 * 关于Student表额操作
 * @author 王帅毅
 *
 */
public interface StudentService {
	/**
	 * 根据Id查询学员
	 * @param id
	 * @return
	 */
	public Student findStudentById(Long id);
	/**
	 * 查找所有的学员
	 * @return
	 */
	public List<Student> findAll(PageBean bean);
	
	
	/**
	 * 根据条件查询学员
	 * 分页查询
	 * @param Student
	 * @return
	 */
	public List<Student> findSomeStudent(Student Student,int index,int pageSize);
	/**
	 * 注册学员信息
	 * @param Student
	 */
	public void addStudent(Student Student);
	/**
	 * 根据Id禁用学员
	 * @param id
	 * @param state 
	 */
	public void updateStudentStateById(Long id, boolean state);
	/**
	 * 学员登陆
	 * @param Student
	 * @return
	 */
	public Student login(Student Student);
	/**
	 * 修改学员登陆密码
	 * @param Student
	 */
	public void updateStudentPassword(Student Student);
	/**
	 * 修改学员信息
	 * @param Student
	 */
	public void updateStudentInfo(Student Student);
	/**
	 * 根据ID删除学员
	 * @param id
	 */
	public void deleteStudentById(Long id);
	/**
	 * 批量删除学员
	 * @param ids
	 */
	public void deleteStudentByIds(Long[] id);
	/**
	 * 查询总数
	 * @param student
	 * @return
	 */
	public int selectCount(Student student);
	public void insertSignup(SignUp sp);

}
