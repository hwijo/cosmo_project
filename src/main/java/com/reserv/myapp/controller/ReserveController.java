package com.reserv.myapp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reserv.myapp.model.NoticeEntity;
import com.reserv.myapp.model.ReserveEntity;
import com.reserv.myapp.model.RoomInfoEntity;
import com.reserv.myapp.repository.ReserveRepository;
import com.reserv.myapp.repository.RoomInfoRepository;


@Controller
public class ReserveController {
	

	@Autowired 
	ReserveRepository reserveRepository;
	
	// ���� ������ ����
	@RequestMapping(value = "/reserve", method = RequestMethod.GET)
	public String intoReservePage(Model model, HttpServletRequest request, int no) {
		
		return "reservePage";		

	}
	
	// Ķ����
	@ResponseBody // �ڹ� ��ü�� HTTP ���� ������ ��ü�� ��ȯ
	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public List<ReserveEntity> calendar(Model model, HttpServletRequest request) {
		
		//Map<String, String> map = new HashMap<String, String>();
		
		List<ReserveEntity> list = reserveRepository.findAll();
				
		System.out.println(list);
		
		model.addAttribute("list", list);
		
		return list;		
		
	}



}
