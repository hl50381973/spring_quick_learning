package com.edu.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Dog {

	
	public void init() {
		System.out.println("=========init()=========");
	}

	public void destroy() {
		System.out.println("=========destroy()=========");
	}
}
