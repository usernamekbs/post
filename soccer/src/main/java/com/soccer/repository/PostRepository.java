package com.soccer.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.soccer.entity.Post;
import com.soccer.model.PostViewDto;

public interface PostRepository extends JpaRepository<Post, Long>,CustomPostRepository{

}
   