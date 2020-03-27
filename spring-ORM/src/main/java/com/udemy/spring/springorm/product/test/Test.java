package com.udemy.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udemy.spring.springorm.product.dao.ProductDao;
import com.udemy.spring.springorm.product.entity.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		//		Product product = new Product();
		//		product.setId(1);
		//		product.setName("Iphone");
		//		product.setDesc("It's Awesome");
		//		product.setPrice(800);
		//		productDao.create(product);
		//		productDao.update(product);
		//		productDao.delete(product);// it will delete based on id
		//		Product product = productDao.find(2);
		//		System.out.println("product Details : " + product);
	List<Product> products = productDao.findAll();
	System.out.println("products Details : " + products);
	}
}
