package com.wcs.app.sb.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {
@Id
	private int stateid;
	public int getStateid() {
	return stateid;
}
public void setStateid(int stateid) {
	this.stateid = stateid;
}
public String getStatename() {
	return statename;
}
public void setStatename(String statename) {
	this.statename = statename;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
	private String statename;
	private Country country;
	
}
