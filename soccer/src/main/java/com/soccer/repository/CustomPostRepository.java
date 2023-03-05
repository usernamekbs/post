package com.soccer.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.soccer.model.PostDto;
import com.soccer.model.PostRequestDto;

public interface CustomPostRepository {
	
	Page<PostDto> findByPost(String keyword,String option,PostRequestDto postDto,Pageable pageable );
}