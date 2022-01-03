package com.reserv.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reserv.myapp.model.Member;
//import com.reserv.myapp.service.MemberService;
import com.reserv.myapp.repository.MemberRepository;
import com.reserv.myapp.service.MemberService;

@RestController
public class MemberController {
	
	//@Autowired 
	//MemberService memberService;
	
	@Autowired 
	MemberRepository memberRepository;
	
	@RequestMapping(value = "/")
	public String list() {
		return "main page";
		
		/*
		 * List<Member> members = memberService.findMembers();
		 * model.addAttribute("members", members);
		 * 
		 * System.out.println("아무거나 : " + members);
		 * 
		 * return "home";
		 */
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public List<Member> findAll() {
		return memberRepository.findAll();
		
	}


}
