package com.news.service;

import java.util.List;

import com.news.pojo.News;

public interface NewsService {

	void insertNews(News news);

	List<News> findNews(News news, int index, Integer rows);

	int selectCount(News news);

	void updateNewsInfo(News news);

	void deleteNewsById(Long id);

}
