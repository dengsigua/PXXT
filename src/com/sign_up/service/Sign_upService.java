package com.sign_up.service;

import java.util.List;

import com.sign_up.pojo.SignUp;
import com.student.pojo.Student;


/**
 * ����Sign_up������service
 * @author DSJ
 *
 */
public interface Sign_upService {
	/**
	 * ����Id��ѯ�������
	 * @param id
	 * @return
	 */
	/**
	 * ��������ѯѧԱ
	 * @return
	 */
	public List<Student> findSomeStudents(Student  student,int index,int pageSize);
	/**
	 * ����ѧԱ����
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
