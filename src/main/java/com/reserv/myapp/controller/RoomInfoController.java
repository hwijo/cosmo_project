package com.reserv.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reserv.myapp.model.NoticeVO;
import com.reserv.myapp.model.RoomInfoVO;
import com.reserv.myapp.repository.RoomInfoRepository;


@Controller
public class RoomInfoController {
	

	@Autowired 
	RoomInfoRepository roomInfoRepository;
	
	// 방 리스트
	@RequestMapping(value = "/roomList", method = RequestMethod.GET)
	public String roomList(Model model, HttpServletRequest request) {
		
		List<RoomInfoVO> roomList = roomInfoRepository.findAll();
		System.out.println("log : " + roomList);
		
		model.addAttribute("roomList", roomList);		
		
		return "roomList";
		

	}
	
	// 방 정보
	@RequestMapping(value = "/roomInfo", method = RequestMethod.GET)
	public String roomInfo(Model model, HttpServletRequest request, int no) {
		
		RoomInfoVO roomInfo = roomInfoRepository.findByNo(no);
		System.out.println("log : " + roomInfo);
		
		model.addAttribute("roomInfo", roomInfo);		
		
		return "roomInfo";		

	}
	
	// 슬라이드
/*	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String slide(Model model, HttpServletRequest request) {
		
		List<RoomInfoVO> roomList = roomInfoRepository.findAll();
		System.out.println("log : " + roomList);
		
		model.addAttribute("roomList", roomList);		
		
		return "home";		

	}
	*/
	




}
