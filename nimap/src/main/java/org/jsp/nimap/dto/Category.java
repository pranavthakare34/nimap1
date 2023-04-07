package org.jsp.nimap.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Category {
@Id
private int id;
private String name;
@OneToOne(cascade = CascadeType.ALL,mappedBy = "category")
private Product product;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}





@Override
public String toString() {
	return "Category [id=" + id + ", name=" + name + ", product=" + product + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}
}
