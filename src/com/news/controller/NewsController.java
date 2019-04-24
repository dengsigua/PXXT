package com.news.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.utils.PageBean;
import com.common.utils.result;
import com.company.pojo.Company;
import com.company.service.CompanyService;
import com.news.pojo.News;
import com.news.service.NewsService;

@Controller
@RequestMapping("/news")
public class NewsController {
	@Autowired
	private NewsService service;
	
	private int page;
	private int rows;//
	
	
	public void setPage(int page) {
		this.page = page;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	

	/**
	 *֪ͨ����
	 * @return
	 */
	@RequestMapping("news_release")
	public String News_release(){
		return "news/news_release";
	}
	
	/**
	 *֪ͨ�鿴
	 * @return
	 */
	@RequestMapping("news_check")
	public String News_check(){
		return "news/news_check";
	}
	
	@RequestMapping("release")
	public String release(HttpSession session,Model model,News news){
		System.out.println("��������");
		System.out.println(news);
		try{
			service.insertNews(news);
			return "news/news_release";
		}catch (Exception e){
			model.addAttribute("msg", "�ύʧ��");
			model.addAttribute("news", news);
			return "news/news_release";
		}	
	}
	
	@RequestMapping("release1")
	public String release1(HttpSession session,Model model,News news){
		System.out.println("��������");
		System.out.println(news);
		try{
			service.insertNews(news);
			return "place/place_release";
		}catch (Exception e){
			model.addAttribute("msg", "�ύʧ��");
			model.addAttribute("news", news);
			return "place/place_release";
		}	
	}
	
	@RequestMapping("findnews")
	@ResponseBody
	public PageBean findNews(News news, @RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="10") Integer rows){		
		    int index = (page-1)*rows;
		    System.out.println("xxxxxx:"+news.getNewsId()+"xxxxxx:"+news.getNewsName());
			List<News> list = service.findNews(news, index, rows);
			System.out.println(page+"......"+rows+"xxxx");
			if(list==null||list.size()==0){
				System.out.println("null");
			}
			for (News n : list) {
				System.out.println(n);
			}
			int total = service.selectCount(null);
			PageBean bean = new PageBean();
			bean.setRows(list);
			bean.setTotal(total);
			return bean;
	}
	
	@RequestMapping("editnews")
	@ResponseBody
	public result editnews(HttpSession session,Model model,News news,String id){
		System.out.println("111");
		System.out.println(news);
		result result = new result();
		try{
			System.out.println("b");
			System.out.println("xxxxxx:"+news.getNewsId());
			System.out.println(news);
			service.updateNewsInfo(news);
			result.setSuccess(true);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg", "�༭ʧ�ܣ�");
			model.addAttribute("News", news);
			result.setSuccess(false);
			result.setErrorMsg("�༭ʧ��");	
		}
		return result;
	}
	
	@RequestMapping("deletenews")
	@ResponseBody
	public result deletenews(String ids){
		 System.out.println(ids);
		 String[] str = ids.split(",");
		 result result = new result();
		 try{
			 for(int i=0;i<str.length;i++){
				 System.out.println(str[i]);
				 Long id = Long.parseLong(str[i]);
				 //service.updateCompanyStateById(id);
				 service.deleteNewsById(id);
			 }
			 result.setSuccess(true);
		 }catch(Exception e){
			 e.printStackTrace();
			 result.setSuccess(false);
			 result.setErrorMsg("ɾ��ʧ��");
		 }
		 return result;
	}
	
	
}
