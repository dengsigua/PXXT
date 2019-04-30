package com.shopping_cart.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classes.mapper.ClassesMapper;
import com.classes.pojo.Classes;
import com.common.utils.ClassCompany;
import com.common.utils.ShopClass;
import com.common.utils.UnitTwo;
import com.company.mapper.CompanyMapper;
import com.company.pojo.Company;
import com.shopping_cart.mapper.ShoppingCartMapper;
import com.shopping_cart.pojo.ShoppingCart;
import com.shopping_cart.pojo.ShoppingCartExample;
import com.shopping_cart.pojo.ShoppingCartExample.Criteria;
import com.shopping_cart.service.Shopping_Cart_Service;
import com.sign_up.mapper.SignUpMapper;
import com.sign_up.pojo.SignUp;
import com.sign_up.pojo.SignUpExample;

@Service
public class Shopping_Cart_ServiceImpl implements Shopping_Cart_Service {
	@Autowired
	private ShoppingCartMapper mapper;
	
	@Autowired
	private ClassesMapper classMapper;
	
	@Autowired
	private CompanyMapper companyMapper;
	
	@Override
	public void ShoppingCartinsert(ShoppingCart shoppingcart) {
		mapper.insert(shoppingcart);
	}
	
	@Override
	public List<ShoppingCart> findShoppingCart(ShoppingCart sp, int index, Integer rows){
		ShoppingCartExample example = new ShoppingCartExample();
		Criteria criteria = example.createCriteria();
		System.out.println(sp);		
//		if(sp!=null){
//			if(!"".equals(sp.getStudentId())&&sp.getStudentId()!=null){
//				criteria.andStudentIdEqualTo(sp.getStudentId());
//		
//			}
//			if(!"".equals(sp.getClassId())&&sp.getClassId()!=null){
//				criteria.andClassIdEqualTo(sp.getClassId());
//		
//			}
//		}
		criteria.andClassIdEqualTo(sp.getClassId());
		criteria.andStudentIdEqualTo(sp.getStudentId());
		
		example.setIndex(index);
		example.setPageSize(rows);
		return mapper.selectByExample(example);
		
	}
	
	@Override
	public int selectCount(ShoppingCart sp){
		ShoppingCartExample example = new ShoppingCartExample();
		Criteria criteria = example.createCriteria();
		System.out.println(sp);			
		if(sp!=null){
			if(!"".equals(sp.getStudentId())&&sp.getStudentId()!=null){
				criteria.andStudentIdEqualTo(sp.getStudentId());
		
			}
			if(!"".equals(sp.getClassId())&&sp.getClassId()!=null){
				criteria.andClassIdEqualTo(sp.getClassId());
		
			}
		}
		return mapper.countByExample(example);
		
	}
	
	
	
	@Override
	public List<ShopClass> findClassesPage(Integer currentPage, int pageSize,ShoppingCart sp) {
		ShoppingCartExample example = new ShoppingCartExample();
		Criteria criteria = example.createCriteria();
		System.out.println(sp);			
		if(sp!=null){
			if(!"".equals(sp.getStudentId())&&sp.getStudentId()!=null){
				criteria.andStudentIdEqualTo(sp.getStudentId());
		
			}
			if(!"".equals(sp.getClassId())&&sp.getClassId()!=null){
				criteria.andClassIdEqualTo(sp.getClassId());
		
			}
		}
		int index = (currentPage-1)*pageSize;
		example.setIndex(index);
		example.setPageSize(pageSize);
		
		 List<ShoppingCart> shopList = mapper.selectByExample(example);
		 List<ShopClass> result  = new ArrayList<>();
		 for (ShoppingCart shopingcart : shopList) {
			Long classId = shopingcart.getClassId();
			Classes classes = classMapper.selectByPrimaryKey(classId);
			Long companyId =classes.getCompanyId() ;
			Company company = companyMapper.selectByPrimaryKey(companyId);
			ShopClass unitTwo = new ShopClass();
			unitTwo.setShoppingCartId(shopingcart.getShoppingCartId());
			unitTwo.setClassId(shopingcart.getClassId());
			unitTwo.setClassCid(classes.getClassCid());
			unitTwo.setClassImg(classes.getClassImg());
			unitTwo.setClassTitle(classes.getClassTitle());
			unitTwo.setCompanyId(classes.getCompanyId());
			unitTwo.setClassPrice(classes.getClassPrice());
			unitTwo.setCompanyName(company.getCompanyName());
			result.add(unitTwo);
			
		 }
		 return result;
	}
	
	@Override
	public void deleteClassesById(Long shoppingcartIds){
		mapper.deleteByPrimaryKey(shoppingcartIds);
	}

}
