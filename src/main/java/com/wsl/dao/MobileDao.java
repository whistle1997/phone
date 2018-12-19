package com.wsl.dao;

import org.apache.ibatis.annotations.Param;

import com.wsl.bean.Mobile;

public interface MobileDao {
	public Mobile getOneByMobileNumber(@Param("num")String nuwnum);
}
