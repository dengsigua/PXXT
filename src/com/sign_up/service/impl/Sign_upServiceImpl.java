package com.sign_up.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classes.mapper.ClassesMapper;
import com.classes.pojo.Classes;
import com.classes.pojo.ClassesExample;
import com.classes.service.ClassesService;
import com.common.utils.PageBean;
import com.common.utils.UnitTwo;
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
	private ClassesMapper classMapper;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private ClassesService classesService;

	
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
			if(!"".equals(sp.getSignUpId())&&sp.getSignUpId()!=null){
				criteria.andSignUpIdEqualTo(sp.getSignUpId());
		
			}
			if(!"".equals(sp.getSignUpName())&&sp.getSignUpName()!=null){
				criteria.andSignUpNameLike("%"+sp.getSignUpName()+"%");
			}
			if(!"".equals(sp.getClassId())&&sp.getClassId()!=null){
				criteria.andClassIdEqualTo(sp.getClassId());
		
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
			if(!"".equals(sp.getSignUpId())&&sp.getSignUpId()!=null){
				criteria.andSignUpIdEqualTo(sp.getSignUpId());
		
			}
			if(!"".equals(sp.getSignUpName())&&sp.getSignUpName()!=null){
				criteria.andSignUpNameLike("%"+sp.getSignUpName()+"%");
			}
			if(!"".equals(sp.getClassId())&&sp.getClassId()!=null){
				criteria.andClassIdEqualTo(sp.getClassId());
		
			}
		}
		
		return mapper.countByExample(example);
	}
	
	
	@Override
	public void insertSignUp(SignUp sp) {
		mapper.insert(sp);
	}
	
	@Override
	public void insertSignup1(SignUp sp) {
	
		sp.setSignUpId(UUID.randomUUID().toString());
		mapper.insert(sp);
	}
	
	@Override
	public void updateSignUpInfo(SignUp sp) {
		mapper.updateByPrimaryKey(sp);
	}
	
	@Override
	public void deleteSignUpById(String id) {
		mapper.deleteByPrimaryKey(id);
	}
	

	@Override
	public List<UnitTwo> findClassesPage(Integer currentPage, int pageSize,SignUp sp) {
		SignUpExample example = new SignUpExample();
		Criteria criteria = example.createCriteria();
		System.out.println(sp);		
		if(sp!=null){
			if(!"".equals(sp.getSignUpId())&&sp.getSignUpId()!=null){
				criteria.andSignUpIdEqualTo(sp.getSignUpId());
		
			}
			if(!"".equals(sp.getSignUpName())&&sp.getSignUpName()!=null){
				criteria.andSignUpNameLike("%"+sp.getSignUpName()+"%");
			}
			if(!"".equals(sp.getClassId())&&sp.getClassId()!=null){
				criteria.andClassIdEqualTo(sp.getClassId());		
			}
		}
		int index = (currentPage-1)*pageSize;
		example.setIndex(index);
		example.setPageSize(pageSize);
		
		 List<SignUp> signList = mapper.selectByExample(example);
		 List<UnitTwo> result  = new ArrayList<>();
		 for (SignUp signUp : signList) {
			Long classId = signUp.getClassId();
			Classes classes = classMapper.selectByPrimaryKey(classId);
			UnitTwo unitTwo = new UnitTwo();
			unitTwo.setSignUpId(signUp.getSignUpId());
			unitTwo.setSignUpTime(signUp.getSignUpTime());
			unitTwo.setClassId(signUp.getClassId());
			unitTwo.setClassImg(classes.getClassImg());
			unitTwo.setClassPrice(classes.getClassPrice());
			result.add(unitTwo);
		 }
		
		return result;
	}
	@Override
	public int countClasses(SignUp sp) {
		SignUpExample example = new SignUpExample();
		Criteria criteria = example.createCriteria();
		System.out.println(sp);		
		if(sp!=null){
			if(!"".equals(sp.getSignUpId())&&sp.getSignUpId()!=null){
				criteria.andSignUpIdEqualTo(sp.getSignUpId());
		
			}
			if(!"".equals(sp.getSignUpName())&&sp.getSignUpName()!=null){
				criteria.andSignUpNameLike("%"+sp.getSignUpName()+"%");
			}
			if(!"".equals(sp.getClassId())&&sp.getClassId()!=null){
				criteria.andClassIdEqualTo(sp.getClassId());
		
			}
		}
		return mapper.countByExample(example);
	}


}
