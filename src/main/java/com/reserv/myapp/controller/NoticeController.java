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
	
	// ����(�����̵�, �������� ����Ʈ)
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
	
	// �������� �󼼺���
	@RequestMapping(value = "/notice", method = RequestMethod.GET)
	public String notice(Model model, HttpServletRequest request, int no) {
		
		//int no = Integer.parseInt(request.getParameter("no"));
		
		NoticeEntity sn = noticeRepository.findByNo(no);
		
		System.out.println("log : " + sn);
		
		model.addAttribute("sn", sn);		
		
		return "notice";		
		
	}
	
	
	// �������� ��� ������ ����
	@RequestMapping(value = "/insertNotice", method = RequestMethod.GET)
	public String inInsertNotice(Model model, HttpServletRequest request) {				
		
		return "insertNotice";		
		
	}
	
	
	// �������� ���
	@RequestMapping(value = "/insertNotice", method = RequestMethod.POST)
	public String insertNotice(Model model, HttpServletRequest request) {
		
		NoticeEntity entity = new NoticeEntity();
		
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
				
		entity.setTitle(title);
		entity.setContents(contents);
		entity.setDeleteFlg("0"); // ������
		entity.setBuildCd(2); // ������
		
		System.out.println("notice ���� �ڵ� ����");
		noticeRepository.save(entity);
		System.out.println("notice ���� �ڵ� ��");		
		
		return "redirect:/";
		
		
	}	


}
