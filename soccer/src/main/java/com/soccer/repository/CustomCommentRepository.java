package com.soccer.repository;

import java.util.List;

import com.soccer.entity.Comment;


public interface CustomCommentRepository {
	
	List<Comment> findByComment(long pno);
}
