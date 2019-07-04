package com.wcs.app.sb.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
@Id
	private int cityid;
	private String cityname;
	private District district;
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	
}
