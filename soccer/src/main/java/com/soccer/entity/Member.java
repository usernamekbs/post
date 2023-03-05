package com.soccer.entity;

import lombok.*;


import javax.persistence.*;

import com.soccer.model.common.Role;


@Entity
@Getter
@NoArgsConstructor
@Table(name="member") 
public class Member {


	@Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_no;

	@Column(name="member_id")
 	private String memberid;
  
	@Column
 	private String member_password;
 	
	@Column
 	private String member_nick;
	
	@Column
 	private String member_email;
 	
	@Column
	@Enumerated(EnumType.STRING) //이걸 해줘야 enum값에 0이아닌 member가 찍힘
	private Role member_role; 
 
	
	 public static Member createMember(String member_id,String member_password, String member_nick,String member_email, Role member_role ) {
    	Member member = new Member();
    	member.memberid 		= member_id;
    	member.member_password  = member_password;
    	member.member_nick		= member_nick;
    	member.member_email 	= member_email;
    	member.member_role		= Role.MEMBER;
    	System.out.println(member.member_role);
    	return member;
    }


	
}
