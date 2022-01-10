package com.reserv.myapp.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.reserv.myapp.model.NoticeEntity;
import com.reserv.myapp.model.RoomInfoEntity;
import com.reserv.myapp.repository.RoomInfoRepository;
import com.reserv.myapp.repository.UserSha256;


@Controller
public class RoomInfoController {
	

	@Autowired 
	RoomInfoRepository roomInfoRepository;

	
	// �� ����Ʈ
	@RequestMapping(value = "/roomList", method = RequestMethod.GET)
	public String roomList(Model model, HttpServletRequest request) {
		
		List<RoomInfoEntity> roomList = roomInfoRepository.findAll();
		System.out.println("log : " + roomList);
		
		model.addAttribute("roomList", roomList);		
		
		return "roomList";
		

	}
	
	// �� ����
	@RequestMapping(value = "/roomInfo", method = RequestMethod.GET)
	public String roomInfo(Model model, HttpServletRequest request, int no) {
		
		RoomInfoEntity roomInfo = roomInfoRepository.findByNo(no);
		System.out.println("log : " + roomInfo);
		
		model.addAttribute("roomInfo", roomInfo);		
		
		return "roomInfo";		

	}
	
	
	// �� ��� ������ ����
	@RequestMapping(value = "/insertRoom", method = RequestMethod.GET)
	public String inInsertRoom() {				
		
		return "insertRoom";		
		
	}
	
	
	// �� ���
	@RequestMapping(value = "/insertRoom", method = RequestMethod.POST)
	public String insertRoom(HttpServletRequest request, @RequestParam("image") MultipartFile uploadFile) {
		
		RoomInfoEntity entity = new RoomInfoEntity();
			
		String roomNum = request.getParameter("roomNum");
		String roomTitle = request.getParameter("roomTitle");
		int maxpeople = Integer.parseInt(request.getParameter("maxpeople"));
		int adultCost = Integer.parseInt(request.getParameter("adultCost"));
		int childCost = Integer.parseInt(request.getParameter("childCost"));
		String explanation = request.getParameter("explanation");
		String colorCd = request.getParameter("colorCd");
		
		// ���� ���ε� ó��
		String fileName = null; // ���� �̸�
		if (!uploadFile.isEmpty()) {
			String originalFileName = uploadFile.getOriginalFilename(); // �����̸� ���ϱ�
			String ext = FilenameUtils.getExtension(originalFileName); // Ȯ���� ���ϱ�
			String images = UserSha256.encrypt(originalFileName); // sha256 ��ȣȭ
			System.out.println(originalFileName);
			fileName = images + "." + ext;
			try {
				uploadFile.transferTo(new File("C:\\Users\\1\\git\\cosmo_project\\src\\main\\webapp\\WEB-INF\\images\\" + originalFileName)); // �̹��� ���� ���
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}   
				
		entity.setRoomNum(roomNum);		
		entity.setRoomTitle(roomTitle);
		entity.setMaxpeople(maxpeople);
		entity.setAdultCost(adultCost);
		entity.setChildCost(childCost);
		entity.setExplanation(explanation);
		entity.setImages(fileName);
		entity.setColorCd(colorCd);
		
		entity.setDeleteFlg("0"); // ������
		entity.setBuildCd(2); // ������
		
		roomInfoRepository.save(entity);
		
		System.out.println("�̹��� ���� �Ϸ�");
		
		return "redirect:/";
		
		
	}	
	
	
	





}
