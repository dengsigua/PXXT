package com.place.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.utils.PageBean;
import com.place.mapper.PlaceMapper;
import com.place.pojo.Place;
import com.place.pojo.PlaceExample;
import com.place.pojo.PlaceExample.Criteria;
import com.place.service.PlaceService;
import com.sign_up.pojo.SignUp;


@Service
public class PlaceServiceImpl implements PlaceService{
	@Autowired
	private PlaceMapper mapper;
	
	@Override
	public List<Place> findPlace(Place place, int index, Integer rows){
		PlaceExample example = new PlaceExample();
		Criteria criteria = example.createCriteria();
		System.out.println(place);		
		if(place!=null){
			if(!"".equals(place.getPlaceName())&&place.getPlaceName()!=null){
				criteria.andPlaceNameLike("%"+place.getPlaceName()+"%");
			}
		}
		example.setIndex(index);
		example.setPageSize(rows);
		return mapper.selectByExample(example);
		
	}
	
	@Override
	public int selectCount(Place place){
		PlaceExample example = new PlaceExample();
		Criteria criteria = example.createCriteria();
		System.out.println(place);
		
		if(place!=null){
			if(!"".equals(place.getPlaceName())&&place.getPlaceName()!=null){
				criteria.andPlaceNameLike("%"+place.getPlaceName()+"%");
			}
		}
		return mapper.countByExample(example);
	}
	
	@Override
	public void insertPlace(Place place) {
		mapper.insert(place);
	}
	
	@Override
	public void updatePlaceInfo(Place place) {
		mapper.updateByPrimaryKey(place);
	}
	
	@Override
	public void deletePlaceById(Long id) {
		mapper.deleteByPrimaryKey(id);
	}
}
