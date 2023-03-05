package com.soccer.controller;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soccer.model.MemberDto;
import com.soccer.model.MemberRequestDto;
import com.soccer.service.MemberService;

import lombok.RequiredArgsConstructor;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService memberService; 
	
	@GetMapping("/member/login/{username}")  
    public UserDetails login(@PathVariable String username) {
		
		return memberService.loadUserByUsername(username);  
    }
	
	@PostMapping("/member/create")  
    public MemberDto create(@RequestBody MemberRequestDto requestDto) {
		
		return memberService.save(requestDto);   
    }
	
	@GetMapping("/member/exists/{username}")   
    public MemberDto existsByMemberid(@PathVariable String username) {
		return memberService.existsByMemberid(username);  
    }
}
