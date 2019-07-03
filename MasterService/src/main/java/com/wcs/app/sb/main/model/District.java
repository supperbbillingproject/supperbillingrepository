package com.wcs.app.sb.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class District {
@Id
    private int districtid;

	private String districtname;
	private State state;
	public int getDistrictid() {
		return districtid;
	}
	public void setDistrictid(int districtid) {
		this.districtid = districtid;
	}
	public String getDistrictname() {
		return districtname;
	}
	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
}
