package com.cat.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cat.mapper.ClassCatMapper;
import com.cat.pojo.ClassCat;
import com.cat.pojo.ClassCatExample;
import com.cat.pojo.ClassCatExample.Criteria;
import com.cat.service.ClassCatService;

import com.common.utils.EasyUITreeNode;
/**课程分类管理
 * easyui产生异步树
 * @author ASUS
 *
 */
@Service
public class ClassCatServiceImpl implements ClassCatService{
	@Autowired
	private ClassCatMapper mapper;
	@Override
	public List<EasyUITreeNode> getClassCatList(long id) {
		ClassCatExample example = new ClassCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andClassCatParentIdEqualTo(id);
		List<ClassCat> list = mapper.selectByExample(example);
		//转化成树形列表的list
		List<EasyUITreeNode> resultList = new ArrayList<>();
		for (ClassCat classCat : list) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(classCat.getClassCatId());
			node.setText(classCat.getClassCatName());
			node.setState(classCat.getClassCatIsParent()?"closed":"open");
			resultList.add(node);
		}
		return resultList;
	}

}
