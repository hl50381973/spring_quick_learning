package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);		

		System.out.println(context.getBean(UserService.class));
		System.out.println(context.getBean(UserDao.class));
		
		User user = context.getBean("myUser",User.class);
		System.out.println(user);
		context.close();
	}
}
