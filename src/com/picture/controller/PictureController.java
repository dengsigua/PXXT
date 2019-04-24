package com.picture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.common.utils.PictureResult;
import com.picture.service.PictureService;

@Controller
@RequestMapping("/pic")
public class PictureController {
	@Autowired
	private PictureService serivice;
	
	@RequestMapping("upload")
	@ResponseBody
	public PictureResult uploadFile(MultipartFile uploadFile,String Filename){
		System.out.println(Filename);
		System.out.println(uploadFile);
		PictureResult result = serivice.uploadPic(uploadFile);
		return result;
	}
	
}
