package com.period.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.period.mapper.PeriodMapper;
import com.period.pojo.Period;
import com.period.pojo.PeriodExample;
import com.period.pojo.PeriodExample.Criteria;
import com.period.service.periodService;
@Service
public class periodServiceImpl implements periodService{
	@Autowired
	private PeriodMapper mapper;
	@Override
	public void addPeriod(Period period) {
		mapper.insert(period);
	}
	@Override
	public List<Period> findSomePeriod(Integer id,Period period, int index, Integer rows) {
		PeriodExample example = new PeriodExample();
		Criteria criteria = example.createCriteria();
		criteria.andClassesIdEqualTo(id);
		if(period!=null){
			if(period.getPeriodTitle()!=null&&!"".equals(period.getPeriodTitle())){
				criteria.andPeriodTitleLike("%"+period.getPeriodTitle()+"%");
			}
		}
		example.setIndex(index);
		example.setPageSize(rows);
		return mapper.selectByExample(example);
	}
	@Override
	public int selectCountPeriod(Integer id,Period period) {
		PeriodExample example = new PeriodExample();
		Criteria criteria = example.createCriteria();
		criteria.andClassesIdEqualTo(id);
		if(period!=null){
			if(period.getPeriodTitle()!=null&&!"".equals(period.getPeriodTitle())){
				criteria.andPeriodTitleLike("%"+period.getPeriodTitle()+"%");
			}
		}
		return mapper.countByExample(example);
	}
	@Override
	public Period findPeriodById(Integer id) {
		
		return mapper.selectByPrimaryKey(id);
	}
	@Override
	public void updatePeriod(Period period) {
		mapper.updateByPrimaryKey(period);
		
	}
	@Override
	public void deletePeriodById(Integer id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
	}

}
