package com.reserv.myapp.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reserv.myapp.model.NoticeEntity;
import com.reserv.myapp.model.RoomInfoEntity;
import com.reserv.myapp.model.SliderimagesEntity;
import com.reserv.myapp.repository.NoticeRepository;
import com.reserv.myapp.repository.RoomInfoRepository;
import com.reserv.myapp.repository.SliderimagesRepository;


@Controller
public class NoticeController {
	

	@Autowired 
	NoticeRepository noticeRepository;
	
	@Autowired 
	RoomInfoRepository roomInfoRepository;
	
	@Autowired
	SliderimagesRepository sliderimagesRepository;
	
	// 메인(슬라이드, 공지사항 리스트)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String noticeList(Model model, HttpServletRequest request) {
		
		List<NoticeEntity> notice = noticeRepository.findAll();
		System.out.println("log : " + notice);
		
		model.addAttribute("notice", notice);		
		
		/*
		 * List<RoomInfoEntity> roomList = roomInfoRepository.findAll();
		 * System.out.println("log : " + roomList);
		 * 
		 * model.addAttribute("roomList", roomList);
		 */
		
		return "home";	

		
	}
	
	// 공지사항 상세보기
	@RequestMapping(value = "/notice", method = RequestMethod.GET)
	public String notice(Model model, HttpServletRequest request, int no) {
		
		//int no = Integer.parseInt(request.getParameter("no"));
		
		NoticeEntity sn = noticeRepository.findByNo(no);
		
		System.out.println("log : " + sn);
		
		model.addAttribute("sn", sn);		
		
		return "notice";		
		
	}
	
	
	// 공지사항 등록 페이지 들어가기
	@RequestMapping(value = "/insertNotice", method = RequestMethod.GET)
	public String inInsertNotice(Model model, HttpServletRequest request) {				
		
		return "insertNotice";		
		
	}
	
	
	// 공지사항 등록
	@RequestMapping(value = "/insertNotice", method = RequestMethod.POST)
	public String insertNotice(Model model, HttpServletRequest request) {
		
		NoticeEntity entity = new NoticeEntity();
		
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
				
		entity.setTitle(title);
		entity.setContents(contents);
		entity.setDeleteFlg("0"); // 고정값
		entity.setBuildCd(2); // 고정값
		
		System.out.println("notice 저장 코드 시작");
		noticeRepository.save(entity);
		System.out.println("notice 저장 코드 끝");		
		
		return "redirect:/";
		
		
	}	


}
