package com.soccer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.soccer.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{

	@Query("SELECT m FROM Member m WHERE m.memberid =:member_id")
	Member findByMemberid(@Param("member_id") String member_id);

	boolean existsByMemberid(String member_id);

}
  