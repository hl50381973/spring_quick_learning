package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class);		

		System.out.println(context.getBean(User.class));
		System.out.println(context.getBeansOfType(User.class));
		context.close();
	}
}
