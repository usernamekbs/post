package com.soccer.model;


import com.soccer.entity.Post;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentRequestDto {
	private Long cno;
	private Long pno;
    private String content;
    private String writer;
    private Long parent;
	private String message;
	private String del_status;

}