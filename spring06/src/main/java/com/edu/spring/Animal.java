package com.edu.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Animal {

	@PostConstruct
	public void init() {
		System.out.println("=========init()=========");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("=========destroy()=========");
	}
}
