package com.shopping_cart.service;

import java.util.List;

import com.common.utils.ShopClass;
import com.shopping_cart.pojo.ShoppingCart;

/**
 * shopping_cart的service层
 * @author ASUS
 *
 */
public interface Shopping_Cart_Service {
	/**
	 * 添加购物车
	 * @param classes
	 */
	 void ShoppingCartinsert(ShoppingCart shoppingcart);

	List<ShoppingCart> findShoppingCart(ShoppingCart sp, int index, Integer rows);

	int selectCount(ShoppingCart sp);

	List<ShopClass> findClassesPage(Integer currentPage, int pageSize, ShoppingCart sp);

	void deleteClassesById(Long shoppingcartIds);

	
}
