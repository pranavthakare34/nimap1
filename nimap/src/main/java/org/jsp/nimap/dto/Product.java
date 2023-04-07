package org.jsp.nimap.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Product {
@Id
private int productid;
private String productname;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn
private Category category;
@Override
public String toString() {
	return "Product [productid=" + productid + ", productname=" + productname + "]";
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
}
