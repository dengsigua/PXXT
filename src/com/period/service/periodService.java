package com.period.service;

import java.util.List;


import com.period.pojo.Period;

public interface periodService {
	/*
	 * 添加课程
	 */
	void addPeriod(Period period);
	/**
	 * 分页查询
	 * @param id
	 * @param period
	 * @param index
	 * @param rows
	 * @return
	 */
	List<Period> findSomePeriod(Integer id,Period period, int index, Integer rows);
	/**
	 * 查询总条目数
	 * @param period
	 * @return
	 */
	int selectCountPeriod(Integer id,Period period);
	/**
	 * 根据Id查询
	 * @param id
	 * @return
	 */
	Period findPeriodById(Integer id);
	/**
	 * 修改章节信息
	 * @param period
	 */
	void updatePeriod(Period period);
	/**
	 * 根据ID删除
	 * @param id
	 */
	void deletePeriodById(Integer id);

}
