package com.comment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comment.mapper.CommentMapper;
import com.comment.pojo.Comment;
import com.comment.pojo.CommentExample;
import com.comment.pojo.CommentExample.Criteria;
import com.comment.service.CommentService;



@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private  CommentMapper mapper;
	
	@Override
	public List<Comment> findComment(Comment comment, int index, Integer rows){
		CommentExample example = new CommentExample();
		Criteria criteria = example.createCriteria();
		System.out.println(comment);		
		if(comment!=null){
			if(!"".equals(comment.getCommentName())&&comment.getCommentName()!=null){
				criteria.andCommentNameLike("%"+comment.getCommentName()+"%");
			}
			if(!"".equals(comment.getCommentId())&&comment.getCommentId()!=null){
				criteria.andCommentIdEqualTo(comment.getCommentId());		
			}
		}
		example.setIndex(index);
		example.setPageSize(rows);
		return mapper.selectByExample(example);
		
	}
	@Override
	public int selectCount(Comment comment ){
		CommentExample example = new CommentExample();
		Criteria criteria = example.createCriteria();
		System.out.println(comment);
		if(comment!=null){
			if(!"".equals(comment.getCommentName())&&comment.getCommentName()!=null){
				criteria.andCommentNameLike("%"+comment.getCommentName()+"%");
			}
			if(!"".equals(comment.getCommentId())&&comment.getCommentId()!=null){
				criteria.andCommentIdEqualTo(comment.getCommentId());		
			}
		}
		return mapper.countByExample(example);
	}
	
	@Override
	public void updateCommentInfo(Comment comment) {
		mapper.updateByPrimaryKey(comment);
	}
	
	@Override
	public void deleteCommentById(Long id) {
		mapper.deleteByPrimaryKey(id);
	}

}
