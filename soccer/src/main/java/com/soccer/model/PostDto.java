package com.soccer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto{
		private Long pno;
		private String title;
	    private String content;
	    private String writer;
	    private int view;
	    private Long comment_cnt;

		public static Object convertPostToDto(PostDto post) {
			return new PostDto(post.getPno(),post.getTitle(), post.getContent(), post.getWriter(),post.getView(),post.getComment_cnt());
		}

		
}