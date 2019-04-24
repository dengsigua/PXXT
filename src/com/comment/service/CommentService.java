package com.comment.service;

import java.util.List;

import com.comment.pojo.Comment;

public interface CommentService {

	List<Comment> findComment(Comment comment, int index, Integer rows);

	int selectCount(Comment comment);

	void updateCommentInfo(Comment comment);

	void deleteCommentById(Long id);

}
