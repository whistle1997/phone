package com.wsl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wsl.service.MobileService;
import com.wsl.util.ReturnDate;

@Controller
public class MobileController {
	
	@Autowired
	private MobileService service;
	
	@RequestMapping("/getLocal")
	public @ResponseBody ReturnDate getLocal(String num){
		
		//System.out.println(newnum);
		
		String info = service.getOneByMobileNumber(num);
		ReturnDate rd = new ReturnDate();
		rd.setMsg(info);
		return rd;
	}
	
	
	public String TestThis(String num){
		return num;
	}
	
}
