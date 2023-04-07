package org.jsp.nimap.controller;

import java.util.Scanner;

import org.jsp.nimap.dao.Category_Product_Dao;
import org.jsp.nimap.dto.Category;
import org.jsp.nimap.dto.Product;

public class Category_Product_Controller {
public static void main(String[] args) {
	Category category=new Category();
	category.setId(1);
	category.setName("Groceries");
	
	Product product=new Product();
	product.setProductid(1);
	product.setProductname("oil");
	product.setCategory(category);
	category.setProduct(product);
	
	Category_Product_Dao dao =new Category_Product_Dao(); 
	
	System.out.println("enter 1 for saving the data");
	System.out.println("enter 2 for saving data from product");
	System.out.println("enter 3 for update the category");
	System.out.println("enter 4 for update the product");
	System.out.println("enter 5 for delete by id from category");
	System.out.println("enter 6 to find th id from product");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if (a==1) {
		dao.saveCategory(category);
	} else if(a==2) {
dao.saveProduct(product);
	}
	else if(a==3) {
		dao.updateCategory(category);
	}else if(a==4) {
		dao.updateProduct(product);
	}
	else if(a==5) {
		System.out.println("enter the id");
		int b=sc.nextInt();
		dao.DeleteById(b);
	}else if(a==6) {
		System.out.println("enter id to find");
		int c=sc.nextInt();
		dao.findByid(c);
	}
}
}
