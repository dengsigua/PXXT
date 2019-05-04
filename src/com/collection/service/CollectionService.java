package com.collection.service;

import java.util.List;

import com.collection.pojo.Collection;
import com.common.utils.CollectClass;

/**
 * shopping_cart的service层
 * @author ASUS
 *
 */
public interface CollectionService {

	/**
	 * 分页查询 因为这里的是多个参数
	 * @param shoppingcartIds
	 * @param pageSize
	 * @return
	 */
	List<CollectClass> findClassesPage(Integer currentPage, int pageSize, Collection collection);
	/**
	 * 统计数量
	 * @param shoppingcartIds

	 * @return
	 */
	int selectCount(Collection collection);
	
	/**
	 * 分页查询 
	 * @param shoppingcartIds
	 * @param pageSize
	 * @return
	 */
	List<Collection> findCollection(Collection collection, int index, Integer rows);
	
	/**
	 * 添加收藏
	 * @param shoppingcartIds

	 * @return
	 */
	void insertCollection(Collection collection);
	/**
	 * 批量删除
	 * @param shoppingcartIds

	 * @return
	 */
	void deleteClassesById(Long collectionIds);

}
