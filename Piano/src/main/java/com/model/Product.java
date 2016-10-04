package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 


@Entity
@Table(name = "PRODUCT")
public class Product {
  
    private String productcategory;
    @Id
    private String productid;
    private String productdescription;
    private String productmanufacture;
    private String productname;
    private String productprice;
    private String unitinstrength;
    
    public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public String getProductmanufacture() {
		return productmanufacture;
	}
	public void setProductmanufacture(String productmanufacture) {
		this.productmanufacture = productmanufacture;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	public String getUnitinstrength() {
		return unitinstrength;
	}
	public void setUnitinstrength(String unitinstrength) {
		this.unitinstrength = unitinstrength;
	}
	
}