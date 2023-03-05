package com.soccer.repository;

import java.util.List;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.soccer.entity.Comment;
import static com.soccer.entity.QComment.comment;
import lombok.RequiredArgsConstructor; 
   
@RequiredArgsConstructor
public class CommentRepositoryImpl implements CustomCommentRepository{

	private final JPAQueryFactory queryFactory;
	
	@Override  
	public List<Comment> findByComment(long pno) {
		List<Comment> results=queryFactory.selectFrom(comment)
				.leftJoin(comment)
				.fetchJoin() 
				.where(
						comment.pno.eq(pno), 
						comment.del_status.eq("N") 
				)
				.orderBy(comment.cno.asc().nullsFirst())
				.fetch();
		return results;
	} 

}
