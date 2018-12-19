package com.wsl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsl.bean.Mobile;
import com.wsl.dao.MobileDao;
import com.wsl.service.MobileService;
@Service
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	private MobileDao dao;
	
	@Override
	public String getOneByMobileNumber(String nuwnum) {
		System.out.println("正在查询"+nuwnum);
		// TODO Auto-generated method stub
		String num = nuwnum.substring(0,7);
		Mobile mobile = dao.getOneByMobileNumber(num);
		String info = null;
		if(mobile !=null){
			info="该号码来自"+mobile.getMobileArea()+",是"+mobile.getMobileType()+"类型的号码";
		}else{
			info="号码在号段库暂时不存在";
		}
		
		return info;
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

}
