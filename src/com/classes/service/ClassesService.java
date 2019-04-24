package com.classes.service;

import java.util.List;

import com.classes.pojo.Classes;
import com.company.pojo.Company;

/**
 * classes的service层
 * @author ASUS
 *
 */
public interface ClassesService {
	/**
	 * 添加课程
	 * @param classes
	 */
	void addClasses(Classes classes);

	/**
	 * 根据ID查询课程信息
	 * @param classId
	 * @return
	 */
	Classes findClassById(Long classId);
	/**
	 * 编辑课程信息
	 * @param classes
	 */
	void editClass(Classes classes);
	/**
	 * 根据课程Id删除课程
	 * @param classId
	 */
	void deleteClassesById(long classId);
	/**
	 * 分页查询 因为这里的是多个参数
	 * @param classTitle
	 * @param classPrice1
	 * @param classPrice2
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	List<Classes> findClassesPage(Long comId,String classTitle, Integer classPrice1, Integer classPrice2, Integer currentPage,
			int pageSize);
	/**
	 * 统计数量
	 * @param classTitle
	 * @param classPrice1
	 * @param classPrice2
	 * @return
	 */
	int countClasses(Long comId,String classTitle, Integer classPrice1, Integer classPrice2);

	
}
