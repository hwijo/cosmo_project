package com.reserv.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reserv.myapp.model.NoticeVO;
import com.reserv.myapp.repository.NoticeRepository;


@Controller
public class NoticeController {
	
	//@Autowired 
	//MemberService memberService;
	
	@Autowired 
	NoticeRepository noticeRepository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String list(Model model, HttpServletRequest request) {
		
		List<NoticeVO> notice = noticeRepository.findAll();
		System.out.println("log" + notice);
		
		model.addAttribute("notice", notice);		
		
		return "home";
		
		/*
		 * List<Member> members = memberService.findMembers();
		 * model.addAttribute("members", members);
		 * 
		 * System.out.println("아무거나 : " + members);
		 * 
		 * return "home"; */
		
		
	}
	
	
	//@ResponseBody
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public List<NoticeVO> find(Model model) {
		List<NoticeVO> notice = noticeRepository.findAll();
		System.out.println("log" + notice);
		
		model.addAttribute("notice", notice);
				
		return notice;
		
	}


}
