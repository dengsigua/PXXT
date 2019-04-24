package com.classes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classes.mapper.ClassesMapper;
import com.classes.pojo.Classes;
import com.classes.pojo.ClassesExample;
import com.classes.pojo.ClassesExample.Criteria;
import com.classes.service.ClassesService;
import com.company.pojo.Company;
import com.company.service.CompanyService;
@Service
public class ClassesServiceImpl implements ClassesService{
	@Autowired
	private ClassesMapper mapper;
	
	@Autowired
	private CompanyService companyService;
	
	@Override
	public void addClasses(Classes classes) {
		try{
		mapper.insert(classes);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Classes> findClassesPage(Long comId,String classTitle, Integer classPrice1, Integer classPrice2,
			Integer currentPage, int pageSize) {
		ClassesExample example = new ClassesExample();
		Criteria criteria = example.createCriteria();
		if(comId!=null){
			criteria.andCompanyIdEqualTo(comId);
		}			
		if(classTitle!=null&&!"".equals(classTitle)){
			criteria.andClassTitleLike("%"+classTitle+"%");
		}
		if(classPrice1!=null&&classPrice1>0){
			Long price1 = (long) (classPrice1*100);
			criteria.andClassPriceGreaterThan(price1);
		}
		if(classPrice2!=null&&classPrice2>0){
			Long price1 = (long) (classPrice2*100);
			criteria.andClassPriceLessThan(price1);
		}
		int index = (currentPage-1)*pageSize;
		example.setIndex(index);
		example.setPageSize(pageSize);
		return mapper.selectByExample(example);
	}
	@Override
	public int countClasses(Long comId,String classTitle, Integer classPrice1, Integer classPrice2) {
		ClassesExample example = new ClassesExample();
		Criteria criteria = example.createCriteria();
		if(comId!=null){
			criteria.andCompanyIdEqualTo(comId);
		}	
		if(classTitle!=null&&!"".equals(classTitle)){
			criteria.andClassTitleLike("%"+classTitle+"%");
		}
		if(classPrice1!=null&&classPrice1>0){
			Long price1 = (long) (classPrice1*100);
			criteria.andClassPriceGreaterThan(price1);
		}
		if(classPrice2!=null&&classPrice2>0){
			Long price1 = (long) (classPrice2*100);
			criteria.andClassPriceLessThan(price1);
		}
		return mapper.countByExample(example);
	}


//	@Override
//	public int countClasses(Classes classes) {
//		ClassesExample example = new ClassesExample();
//		Criteria criteria = example.createCriteria();
//		if(classes!=null){
//			
//		}
//		return mapper.countByExample(example);
//	}
	@Override
	public Classes findClassById(Long classId) {
		return mapper.selectByPrimaryKey(classId);
	}
	@Override
	public void editClass(Classes classes) {
		mapper.updateByPrimaryKey(classes);	
	}
	@Override
	public void deleteClassesById(long classId) {
		mapper.deleteByPrimaryKey(classId);
	}

	
	



}
