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
public class ReserveController {
	

	@Autowired 
	RoomInfoRepository roomInfoRepository;
	
	// 예약 페이지 들어가기
	@RequestMapping(value = "/reserve", method = RequestMethod.GET)
	public String intoReservePage(Model model, HttpServletRequest request, int no) {
		
		return "reservePage";		

	}




}
