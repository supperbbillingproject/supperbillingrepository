package com.wcs.app.sb.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productcategoryid;
	public int getProductcategoryid() {
		return productcategoryid;
	}
	public void setProductcategoryid(int productcategoryid) {
		this.productcategoryid = productcategoryid;
	}
	public int getProductcategoryname() {
		return productcategoryname;
	}
	public void setProductcategoryname(int productcategoryname) {
		this.productcategoryname = productcategoryname;
	}
	private int productcategoryname;
	
	
}
