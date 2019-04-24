package com.sign_up.service;

import java.util.List;

import com.sign_up.pojo.SignUp;
import com.student.pojo.Student;


/**
 * 操作Sign_up的所有service
 * @author DSJ
 *
 */
public interface Sign_upService {
	/**
	 * 根据Id查询报名情况
	 * @param id
	 * @return
	 */
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
	public int selectCount(SignUp sp);
	public void insertSignUp(SignUp sp);
	public void updateSignUpInfo(SignUp sp);
	public void deleteSignUpById(Long id);
	public List<SignUp> findSignup(SignUp sp, int index, int rows);

}
