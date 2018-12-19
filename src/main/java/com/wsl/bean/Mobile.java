package com.wsl.bean;

public class Mobile {
	private Integer id;
	private String MobileNumber;
	private String MobileArea;
	private String MobileType;
	private String AreaCode;
	private String PostCode;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getMobileArea() {
		return MobileArea;
	}
	public void setMobileArea(String mobileArea) {
		MobileArea = mobileArea;
	}
	public String getMobileType() {
		return MobileType;
	}
	public void setMobileType(String mobileType) {
		MobileType = mobileType;
	}
	public String getAreaCode() {
		return AreaCode;
	}
	public void setAreaCode(String areaCode) {
		AreaCode = areaCode;
	}
	public String getPostCode() {
		return PostCode;
	}
	public void setPostCode(String postCode) {
		PostCode = postCode;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", MobileNumber=" + MobileNumber + ", MobileArea=" + MobileArea + ", MobileType="
				+ MobileType + ", AreaCode=" + AreaCode + ", PostCode=" + PostCode + "]";
	}
	
	
}
