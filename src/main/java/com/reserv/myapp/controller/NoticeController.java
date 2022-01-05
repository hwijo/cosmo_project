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

import com.reserv.myapp.model.NoticeVO;
import com.reserv.myapp.model.RoomInfoVO;
import com.reserv.myapp.repository.NoticeRepository;
import com.reserv.myapp.repository.RoomInfoRepository;


@Controller
public class NoticeController {
	

	@Autowired 
	NoticeRepository noticeRepository;
	
	@Autowired 
	RoomInfoRepository roomInfoRepository;
	
	// 메인(슬라이드, 공지사항 리스트)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String noticeList(Model model, HttpServletRequest request) {
		
		List<NoticeVO> notice = noticeRepository.findAll();
		System.out.println("log : " + notice);
		
		model.addAttribute("notice", notice);		
		
		List<RoomInfoVO> roomList = roomInfoRepository.findAll();
		System.out.println("log : " + roomList);
		
		model.addAttribute("roomList", roomList);		

		
		return "home";	

		
	}
	
	// 공지사항 상세보기
	@RequestMapping(value = "/notice", method = RequestMethod.GET)
	public String notice(Model model, HttpServletRequest request, int no) {
		
		//int no = Integer.parseInt(request.getParameter("no"));
		
		NoticeVO sn = noticeRepository.findByNo(no);
		
		System.out.println("log : " + sn);
		
		model.addAttribute("sn", sn);		
		
		return "notice";		
		
	}
	
	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public String calendar(Model model, HttpServletRequest request) {
		
		return "calendar";		
		
	}
	
	
	@RequestMapping(value = "/createNotice", method = RequestMethod.GET)
	public String inCreateNotice(Model model, HttpServletRequest request) {
				
		return "createNotice";		
		
	}
	
	@ResponseBody
	@RequestMapping(value = "/createNotice", method = RequestMethod.POST)
	public NoticeVO createNotice(Model model, HttpServletRequest request, @RequestBody NoticeVO vo) {
		//NoticeVO vo = new NoticeVO();		
		
		System.out.println(vo);
		
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		
		vo.setTitle(title);
		vo.setContents(contents);
		vo.setBuildCd(2);	
		
	    noticeRepository.save(vo);
	   
		return vo;	
		
	}	
	
		

	


}
