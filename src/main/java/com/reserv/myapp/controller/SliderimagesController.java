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
import com.reserv.myapp.model.SliderimagesEntity;
import com.reserv.myapp.repository.RoomInfoRepository;
import com.reserv.myapp.repository.SliderimagesRepository;
import com.reserv.myapp.repository.UserSha256;


@Controller
public class SliderimagesController {
	
	@Autowired
	SliderimagesRepository sliderimagesRepository;

	
	// 슬라이드 이미지 등록 들어가기
	@RequestMapping(value = "/insertSliderimages", method = RequestMethod.GET)
	public String inInsertSliderimages() {				
		
		return "insertSliderimages";		
		
	}
	
	
	// 슬라이드 이미지 
	@RequestMapping(value = "/insertSliderimages", method = RequestMethod.POST)
	public String insertSliderimages(HttpServletRequest request, @RequestParam("image") MultipartFile uploadFile) {
		
		SliderimagesEntity entity = new SliderimagesEntity();
					
		// 파일 업로드 처리
		String fileName = null; // 파일 이름
		if (!uploadFile.isEmpty()) {
			String originalFileName = uploadFile.getOriginalFilename(); // 파일이름 구하기
			String ext = FilenameUtils.getExtension(originalFileName); // 확장자 구하기
			String images = UserSha256.encrypt(originalFileName); // sha256 암호화
			System.out.println(originalFileName);
			fileName = images + "." + ext;
			try {
				uploadFile.transferTo(new File("C:\\Users\\1\\git\\cosmo_project\\src\\main\\webapp\\WEB-INF\\sliderimages\\" + originalFileName)); // 이미지 저장 경로
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}   
				
		entity.setFilename(fileName);	
		entity.setActivity("0");
		entity.setDeleteFlag("0"); // 고정값
		
		sliderimagesRepository.save(entity);
		// sort는 select할때 해주자
		
		System.out.println("이미지 저장 완료");
		
		return "redirect:/";
		
		
	}		





}
