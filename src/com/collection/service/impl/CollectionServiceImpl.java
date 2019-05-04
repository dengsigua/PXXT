package com.collection.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classes.mapper.ClassesMapper;
import com.classes.pojo.Classes;
import com.collection.mapper.CollectionMapper;
import com.collection.pojo.Collection;
import com.collection.pojo.CollectionExample;
import com.collection.pojo.CollectionExample.Criteria;
import com.collection.service.CollectionService;
import com.common.utils.CollectClass;
import com.common.utils.ShopClass;
import com.company.pojo.Company;
import com.shopping_cart.pojo.ShoppingCart;
import com.shopping_cart.pojo.ShoppingCartExample;

@Service
public class CollectionServiceImpl implements CollectionService {
	@Autowired
	private CollectionMapper mapper;
	
	@Autowired
	private ClassesMapper classMapper;
	
	@Override
	public List<CollectClass> findClassesPage(Integer currentPage, int pageSize, Collection collection) {
		CollectionExample example = new CollectionExample();
		Criteria criteria = example.createCriteria();		
		if(collection!=null){
			if(!"".equals(collection.getCollectionId())&&collection.getCollectionId()!=null){
				criteria.andCollectionIdEqualTo(collection.getCollectionId());		
			}
		}
		int index = (currentPage-1)*pageSize;
		example.setIndex(index);
		example.setPageSize(pageSize);		
		List<Collection> collectionList = mapper.selectByExample(example);
		List<CollectClass> result  = new ArrayList<>();
		for (Collection collections : collectionList) {
			Long classId = collections.getClassId();
			Classes classes = classMapper.selectByPrimaryKey(classId);
			CollectClass collectClass = new CollectClass();
			collectClass.setCollectionId(collections.getCollectionId());
			collectClass.setClassId(collections.getClassId());
			collectClass.setClassImg(classes.getClassImg());
			collectClass.setClassTitle(classes.getClassTitle());
			collectClass.setClassPrice(classes.getClassPrice());
			result.add(collectClass);			
		 }
		 return result;
	}
	
	@Override
	public int selectCount(Collection collection){
		CollectionExample example = new CollectionExample();
		Criteria criteria = example.createCriteria();	
		if(collection!=null){
			if(!"".equals(collection.getCollectionId())&&collection.getCollectionId()!=null){
				criteria.andCollectionIdEqualTo(collection.getCollectionId());		
			}
		}
		return mapper.countByExample(example);		
	}
	
	@Override
	public void insertCollection(Collection collection) {
		mapper.insert(collection);
	}
	
	@Override
	public List<Collection> findCollection(Collection collection, int index, Integer rows){
		CollectionExample example = new CollectionExample();
		Criteria criteria = example.createCriteria();
		System.out.println(collection);		
		criteria.andClassIdEqualTo(collection.getClassId());
		criteria.andStudentIdEqualTo(collection.getStudentId());		
		example.setIndex(index);
		example.setPageSize(rows);
		return mapper.selectByExample(example);
		
	}
	
	@Override
	public void deleteClassesById(Long collectionIds){
		mapper.deleteByPrimaryKey(collectionIds);
	}
	
}
