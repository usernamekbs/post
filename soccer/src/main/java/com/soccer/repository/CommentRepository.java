package com.soccer.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.soccer.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>,CustomCommentRepository{


}
   