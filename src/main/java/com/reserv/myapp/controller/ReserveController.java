package com.reserv.myapp.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.reserv.myapp.model.NoticeEntity;
import com.reserv.myapp.model.ReserveEntity;
import com.reserv.myapp.model.RoomInfoEntity;
import com.reserv.myapp.repository.ReserveRepository;
import com.reserv.myapp.repository.RoomInfoRepository;
import com.reserv.myapp.repository.UserSha256;


@Controller
public class ReserveController {
	

	@Autowired 
	ReserveRepository reserveRepository;
	
	
	// 캘린더
	//@ResponseBody // 자바 객체를 HTTP 응답 본문의 객체로 변환
	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public List<ReserveEntity> calendar(Model model, HttpServletRequest request) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<ReserveEntity> list = reserveRepository.findAll();
				
		System.out.println(list);
		
		/*
		 * map.put("roomInfo_No", list.get(0).getRoomInfo_No()); map.put("startDate",
		 * list.get(0).getStartDate()); map.put("endDate", list.get(0).getEndDate());
		 * map.put("totalCost", list.get(0).getTotalcost());
		 */
		
		map.put("list", list);
		
		System.out.println(map);
		
		//model.addAttribute("list", list);
		
		return list;		
		
	}	
	
	// 예약페이지 들어가기
	@RequestMapping(value = "/reserve", method = RequestMethod.GET) // 해당 방을 타고 들어가야
	public String inReserve() {				
		
		return "reserve";		
		
	}
	
	
	// 예약
	@RequestMapping(value = "/reserve", method = RequestMethod.POST)
	public String reserve(HttpServletRequest request) {
		
		ReserveEntity entity = new ReserveEntity();
				
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String adult = request.getParameter("adult"); // 성인 수
		String child = request.getParameter("child"); // 소인 수
		String startDate = request.getParameter("startDate"); // 숙박 시작 날짜
		String endDate = request.getParameter("endDate"); // 숙박 끝 날짜
		//int totalcost = Integer.parseInt(request.getParameter("totalcost"));
		String bankName = request.getParameter("bankName");
		String bankBranchCde = request.getParameter("bankBranchCde"); // 지점번호
		String bankNo = request.getParameter("bankNo");	// 계좌번호	
		
		entity.setName(name);		
		entity.setPhone(phone);
		entity.setAdult(adult);
		entity.setChild(child);
		entity.setStartDate(startDate);
		entity.setEndDate(endDate);
		//entity.setTotalcost(totalcost);
		entity.setBankName(bankName);
		entity.setBankBranchCde(bankBranchCde);
		entity.setBankNo(bankNo);
		
		// 고정값
		entity.setOptions("없음");
		entity.setPaymentFlg("0");
		entity.setCancelFlg("0");
		entity.setDeleteFlg("0"); 
		entity.setBuildCd(2); 
		
		reserveRepository.save(entity);
		
		
		return "redirect:/";
		
		
	}		



}
