package com.comment.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.comment.pojo.Comment;
import com.comment.service.CommentService;
import com.common.utils.PageBean;
import com.common.utils.result;



@Controller
@RequestMapping("/comment")
public class CommentController {
	@Autowired
	private CommentService service;
	
	private int page;
	private int rows;//
	
	
	public void setPage(int page) {
		this.page = page;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	/**
	 * ∆¿¬€¡–±Ì
	 * @return
	 */
	@RequestMapping("comment_list2")
	public String Comment_list2(){
		return "comment/comment_list2";
	}
	
	@RequestMapping("findcomment")
	@ResponseBody
	public PageBean findComment(Comment comment, @RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="10") Integer rows){		
		    int index = (page-1)*rows;
		    System.out.println("xxxxxx:"+comment.getCommentId()+"xxxxxx:"+comment.getCommentName());
			List<Comment> list = service.findComment(comment, index, rows);
			System.out.println(page+"......"+rows+"xxxx");
			if(list==null||list.size()==0){
				System.out.println("null");
			}
			for (Comment n : list) {
				System.out.println(n);
			}
			int total = service.selectCount(null);
			PageBean bean = new PageBean();
			bean.setRows(list);
			bean.setTotal(total);
			return bean;
	}
	
	@RequestMapping("editcomment")
	@ResponseBody
	public result editcomment(HttpSession session,Model model,Comment comment,String id){
		System.out.println("111");
		System.out.println(comment);
		result result = new result();
		try{
			System.out.println("b");
			System.out.println("xxxxxx:"+comment.getCommentId());
			System.out.println(comment);
			service.updateCommentInfo(comment);
			result.setSuccess(true);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg", "±‡º≠ ß∞‹£°");
			model.addAttribute("Comment", comment);
			result.setSuccess(false);
			result.setErrorMsg("±‡º≠ ß∞‹");	
		}
		return result;
	}
	
	@RequestMapping("deletecomment")
	@ResponseBody
	public result deletecomment(String ids){
		 System.out.println(ids);
		 String[] str = ids.split(",");
		 result result = new result();
		 try{
			 for(int i=0;i<str.length;i++){
				 System.out.println(str[i]);
				 Long id = Long.parseLong(str[i]);
				 //service.updateCompanyStateById(id);
				 service.deleteCommentById(id);
			 }
			 result.setSuccess(true);
		 }catch(Exception e){
			 e.printStackTrace();
			 result.setSuccess(false);
			 result.setErrorMsg("…æ≥˝ ß∞‹");
		 }
		 return result;
	}

}
