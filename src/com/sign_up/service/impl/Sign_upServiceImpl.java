package com.sign_up.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.common.utils.PageBean;
import com.sign_up.mapper.SignUpMapper;
import com.sign_up.pojo.SignUp;
import com.sign_up.pojo.SignUpExample;
import com.sign_up.pojo.SignUpExample.Criteria;
import com.sign_up.service.Sign_upService;
import com.student.mapper.StudentMapper;
import com.student.pojo.Student;
import com.student.service.StudentService;


@Service
public class Sign_upServiceImpl implements Sign_upService{
	@Autowired
	private SignUpMapper mapper;
	
	@Autowired
	private StudentService studentService;

	
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
	public List<SignUp> findSignup(SignUp sp, int index, int rows){
		SignUpExample example = new SignUpExample();
		Criteria criteria = example.createCriteria();
		System.out.println(sp);		
		if(sp!=null){
			if(!"".equals(sp.getSignUpName())&&sp.getSignUpName()!=null){
				criteria.andSignUpNameLike("%"+sp.getSignUpName()+"%");
			}
			if(!"".equals(sp.getSignUpId())&&sp.getSignUpId()!=null){
				criteria.andSignUpIdEqualTo(sp.getSignUpId());
		
			}
		}
		example.setIndex(index);
		example.setPageSize(rows);
		return mapper.selectByExample(example);
		
	}
	@Override
	public int selectCount(SignUp sp){
		SignUpExample example = new SignUpExample();
		Criteria criteria = example.createCriteria();
		System.out.println(sp);
		
		if(sp!=null){
			if(!"".equals(sp.getSignUpName())&&sp.getSignUpName()!=null){
				criteria.andSignUpNameLike("%"+sp.getSignUpName()+"%");
			}
		}
		return mapper.countByExample(example);
	}
	
	
	@Override
	public void insertSignUp(SignUp sp) {
		mapper.insert(sp);
	}
	
	@Override
	public void updateSignUpInfo(SignUp sp) {
		mapper.updateByPrimaryKey(sp);
	}
	
	@Override
	public void deleteSignUpById(Long id) {
		mapper.deleteByPrimaryKey(id);
	}
	

}
