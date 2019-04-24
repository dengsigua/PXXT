package com.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.common.utils.PageBean;
import com.student.mapper.StudentMapper;
import com.student.pojo.Student;
import com.student.pojo.StudentExample;
import com.student.pojo.StudentExample.Criteria;
import com.student.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapper mapper;

	
	@Override
	public Student findStudentById(Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Student> findAll(PageBean bean) {
	
		return mapper.findAll(bean);
	}
	/**
	 * 我们暂时按照学员姓名和兴趣来查询
	 */
	@Override
	public List<Student> findSomeStudent(Student Student,int index,int pageSize) {
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		System.out.println(Student);
		
		if(Student!=null){
			if(!"".equals(Student.getStudentName())&&Student.getStudentName()!=null){
				criteria.andStudentNameLike("%"+Student.getStudentName()+"%");
			}
			if(!"".equals(Student.getStudentIntrest())&&Student.getStudentIntrest()!=null){
				criteria.andStudentIntrestLike("%"+Student.getStudentIntrest()+"%");
			}
		}
		example.setIndex(index);
		example.setPageSize(pageSize);
	    
		return mapper.selectByExample(example);
	}

	@Override
	public void addStudent(Student Student) {
		Student.setStudentState(true);
		mapper.insert(Student);
	}

	@Override
	public void updateStudentStateById(Long id,boolean state) {
		Student student = mapper.selectByPrimaryKey(id);
		student.setStudentState(state);
		System.out.println(student.getStudentState());
		mapper.updateByPrimaryKey(student);
	}

	@Override
	public Student login(Student Student) {
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		System.out.println(Student);
		criteria.andStudentTelEqualTo(Student.getStudentTel());
		criteria.andStudentPasswordEqualTo(Student.getStudentPassword());
		List<Student> list = mapper.selectByExample(example);
		if(list==null||list.size()==0){
			return null;
		}else{
			return list.get(0);
		}
	}

	/**
	 * 修改密码和修改信息不一样
	 * 修改密码只传看ID和Password
	 * 
	 */
	@Override
	public void updateStudentPassword(Student Student) {
		Student student1 = mapper.selectByPrimaryKey(Student.getStudentId());
		student1.setStudentPassword(Student.getStudentPassword());
		mapper.updateByPrimaryKey(student1);
	}

	@Override
	public void updateStudentInfo(Student Student) {
		mapper.updateByPrimaryKey(Student);
	}

	@Override
	public void deleteStudentById(Long id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteStudentByIds(Long[] id) {
		for(int i = 0;i<id.length;i++){
			mapper.deleteByPrimaryKey(id[i]);
		}
	}

	@Override
	public int selectCount(Student Student) {
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		System.out.println(Student);
		
		if(Student!=null){
			if(!"".equals(Student.getStudentName())&&Student.getStudentName()!=null){
				criteria.andStudentNameLike("%"+Student.getStudentName()+"%");
			}
			if(!"".equals(Student.getStudentIntrest())&&Student.getStudentIntrest()!=null){
				criteria.andStudentIntrestLike(Student.getStudentIntrest());
			}
		}
		return mapper.countByExample(example);
	}

	

	
	
}
