package com.soccer.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soccer.entity.Comment;
import com.soccer.entity.Post;
import com.soccer.model.CommentDto;
import com.soccer.model.PostDto;
import com.soccer.model.PostRequestDto;
import com.soccer.model.PostViewDto;
import com.soccer.repository.PostRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {
	
	private final PostRepository postRepository;
	
	@Transactional
	public PostViewDto save(PostRequestDto requestDto) {
		Post post = postRepository.save(
				Post.createPost(
						requestDto.getPno(), 
						requestDto.getTitle(),
						requestDto.getWriter(),
						requestDto.getContent()
                		)
        );
		
		return PostViewDto.convertPostToDto(post);
		
	}

    @Transactional
    public PostViewDto findById(Long pno) {
        Post post = postRepository.findById(pno)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. pno=" + pno));
        post.addView();
        
        return PostViewDto.convertPostToDto(post);
    }

	
	@Transactional(readOnly=true)
	public Page<Object> findAllDesc(String keyword,String option,PostRequestDto postDto,Pageable pageable) {
		return postRepository.findByPost(keyword,option,postDto,pageable)
                .map(r -> PostDto.convertPostToDto(r));
	}

	@Transactional
	public PostViewDto delete(Long pno) {
		PostViewDto dto = new PostViewDto();
		postRepository.deleteById(pno);
		return dto;
	}

	@Transactional
	public PostViewDto update(PostRequestDto postRequestDto) {
		Post post  = postRepository.findById(postRequestDto.getPno())
				.orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. pno =" +postRequestDto.getPno()));
		
		 post.update(postRequestDto.getTitle(),postRequestDto.getContent(),postRequestDto.getWriter());
		 return PostViewDto.convertPostToDto(post);
	}

	

 
}

