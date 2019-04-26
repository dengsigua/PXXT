package com.picture.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.common.utils.FastDfsClient;
import com.common.utils.PictureResult;
import com.picture.service.PictureService;

@Service
public class PictureServiceImpl implements PictureService {

	@Override
	public PictureResult uploadPic(MultipartFile picFile)  {
		PictureResult result = new PictureResult();
		if(picFile.isEmpty()){
			result.setError(1);
			result.setMessage("图片为空");
			return result;
		}
		//上传到图片服务器
		try {
			//取图片扩展名
			String originalFilename =picFile.getOriginalFilename();
			//取扩展名不要 "."
			String extName = originalFilename.substring(originalFilename.lastIndexOf(".")+1);
			FastDfsClient client = new FastDfsClient("classpath:properties/client.conf");
			String[] str = client.uploadFile(picFile.getBytes(),extName);
			for (String string : str) {
				System.out.println(string);
			}
			result.setError(0);
			String url = "192.168.80.133/"+str[0]+"/"+str[1];
			System.out.println(url);
			result.setUrl(url);
		} catch (Exception e) {
			e.printStackTrace();
			result.setError(1);
			result.setMessage("上传失败");
		}
		return result;
	}
	
}
