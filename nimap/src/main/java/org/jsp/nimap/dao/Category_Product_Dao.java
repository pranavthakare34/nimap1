package org.jsp.nimap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.nimap.dto.Category;
import org.jsp.nimap.dto.Product;

public class Category_Product_Dao {
EntityManagerFactory entityManagerFactory=null;
EntityManager entityManager=null;
EntityTransaction entityTransaction=null;

public EntityManager getEntityManager() {
	entityManagerFactory=Persistence.createEntityManagerFactory("t2");
	return entityManager=entityManagerFactory.createEntityManager();
}






public void saveCategory(Category category) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(category);
	entityTransaction.commit();
}

public void saveProduct(Product product) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(product);
	entityTransaction.commit();
}
public void updateCategory(Category category) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.merge(category);
	entityTransaction.commit();
}
public void updateProduct(Product product) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.merge(product);
	entityTransaction.commit();
}
public void findByid(int id) {
	entityManager=getEntityManager();
	Category category=entityManager.find(Category.class, id);
	
	if (category!=null) {
		System.out.println(category);
	} else {
System.out.println("not enterd correct pk");
	}
}


public void findByid2(int id) {
	Product product=entityManager.find(Product.class, id);
	
		if (product!=null) {
			System.out.println(product);
		} else {
	System.out.println("not enterd correct pk");
		}
	}


public void DeleteById(int id) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.remove(id);
	entityTransaction.commit();
}

}
