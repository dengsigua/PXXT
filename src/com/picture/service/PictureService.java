package com.picture.service;

import org.springframework.web.multipart.MultipartFile;

import com.common.utils.PictureResult;

public interface PictureService {
	public PictureResult uploadPic (MultipartFile picFile) ;
}
