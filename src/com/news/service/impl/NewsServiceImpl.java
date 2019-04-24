package com.news.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.mapper.CompanyMapper;
import com.company.pojo.Company;
import com.news.mapper.NewsMapper;
import com.news.pojo.News;
import com.news.pojo.NewsExample;
import com.news.pojo.NewsExample.Criteria;
import com.news.service.NewsService;


@Service
public class NewsServiceImpl implements NewsService{
	@Autowired
	private  NewsMapper mapper;
	
	@Override
	public void insertNews(News news) {
		mapper.insert(news);
	}
	
	@Override
	public List<News> findNews(News news, int index, Integer rows){
		NewsExample example = new NewsExample();
		Criteria criteria = example.createCriteria();
		System.out.println(news);		
		if(news!=null){
			if(!"".equals(news.getNewsName())&&news.getNewsName()!=null){
				criteria.andNewsNameLike("%"+news.getNewsName()+"%");
			}
			if(!"".equals(news.getNewsId())&&news.getNewsId()!=null){
				criteria.andNewsIdEqualTo(news.getNewsId());		
			}
		}
		example.setIndex(index);
		example.setPageSize(rows);
		return mapper.selectByExample(example);
		
	}
	@Override
	public int selectCount(News news ){
		NewsExample example = new NewsExample();
		Criteria criteria = example.createCriteria();
		System.out.println(news);
		if(news!=null){
			if(!"".equals(news.getNewsName())&&news.getNewsName()!=null){
				criteria.andNewsNameLike("%"+news.getNewsName()+"%");
			}
			if(!"".equals(news.getNewsId())&&news.getNewsId()!=null){
				criteria.andNewsIdEqualTo(news.getNewsId());		
			}
		}
		return mapper.countByExample(example);
	}
	
	@Override
	public void updateNewsInfo(News news) {
		mapper.updateByPrimaryKey(news);
	}
	
	@Override
	public void deleteNewsById(Long id) {
		mapper.deleteByPrimaryKey(id);
	}
	
}
