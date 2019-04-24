package com.place.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.utils.PageBean;
import com.common.utils.result;
import com.place.pojo.Place;
import com.place.service.PlaceService;

@Controller
@RequestMapping("/place")
public class PlaceController {
	@Autowired
	private PlaceService service;
	
	private int page;
	private int rows;//
	
	
	public void setPage(int page) {
		this.page = page;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	/**
	 * 场地列表
	 * @return
	 */
	@RequestMapping("place_list2")
	public String Place_list2(){
		return "place/place_list2";
	}
	
	/**
	 * 场地发布
	 * @return
	 */
	@RequestMapping("place_release")
	public String Place_release(){
		return "place/place_release";
	}
	
	@RequestMapping("findplace")
	@ResponseBody
	public PageBean findPlace(Place place, @RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="10") Integer rows){		
		    int index = (page-1)*rows;
		    System.out.println("xxxxxx:"+place.getPlaceName());
			List<Place> list = service.findPlace(place, index, rows);
			System.out.println(page+"......"+rows+"xxxx");
			if(list==null||list.size()==0){
				System.out.println("null");
			}
			for (Place place1 : list) {
				System.out.println(place1);
			}
			int total = service.selectCount(null);
			PageBean bean = new PageBean();
			bean.setRows(list);
			bean.setTotal(total);
			return bean;
	}
	
	
	
	
	/*@RequestMapping("editplace")
	public String editplace(HttpSession session,Model model,Place place){
		System.out.println("222");
		System.out.println(place);
		try{
			System.out.println("b");	
			service.updatePlaceInfo(place);
			return "company/palce_list2";
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg", "�༭ʧ�ܣ�");
			model.addAttribute("Place", place);
	
			return "place/findplace";
		}
	}
	*/
	
	@RequestMapping("editplace")
	@ResponseBody
	public result editplace(HttpSession session,Model model,Place place,String id){
		System.out.println("111");
		System.out.println(place);
		result result = new result();
		try{
			System.out.println("b");
			System.out.println("xxxxxx:"+place.getPlaceName());
			service.updatePlaceInfo(place);
			//return "sign_up/findsignup";
			result.setSuccess(true);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg", "�༭ʧ�ܣ�");
			model.addAttribute("Place", place);
			result.setSuccess(false);
			result.setErrorMsg("�༭ʧ��");	
			//return "sign_up/findsignup";
		}
		return result;
	}
	
	@RequestMapping("deleteplace")
	@ResponseBody
	public result deleteplace(String ids){
		 System.out.println(ids);
		 String[] str = ids.split(",");
		 result result = new result();
		 try{
			 for(int i=0;i<str.length;i++){
				 System.out.println(str[i]);
				 Long id = Long.parseLong(str[i]);
				 service.deletePlaceById(id);
			 }
			 result.setSuccess(true);
		 }catch(Exception e){
			 e.printStackTrace();
			 result.setSuccess(false);
			 result.setErrorMsg("ɾ��ʧ��");
		 }
		 return result;
	}
	
	
	@RequestMapping("addplace")
	@ResponseBody
	public result addplace(HttpSession session,Model model,Place place,String id){
		System.out.println("111");
		System.out.println(place);
		result result = new result();
		try{
			System.out.println("b");	
			service.insertPlace(place);
			//return "place/findpalce";
			result.setSuccess(true);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("c");
			model.addAttribute("msg", "���ʧ�ܣ�");
			model.addAttribute("Place", place);
			result.setSuccess(false);
			result.setErrorMsg("�༭ʧ��");	
			//return "place/findplace";
		}
		return result;
	}
	
	@RequestMapping("release")
	public String release(HttpSession session,Model model,Place place,String id){
		System.out.println("��������");
		System.out.println("xxxxxx:"+place.getPlaceId()+"xxxxxx:"+place.getPlaceName());		
		try{			
			System.out.println("b");
			service.insertPlace(place);
			return "place/place_release";
		}catch (Exception e){
			e.printStackTrace();
			model.addAttribute("msg", "�ύʧ��");
			model.addAttribute("place", place);
			return "place/place_release";
		}	
	}
	

}
