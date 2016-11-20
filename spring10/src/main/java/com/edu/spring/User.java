package com.edu.spring;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component("myUser")
public class User {
	
	//JSR 330
	@Inject
	private UserService userService;
	
	public void  show() {
		System.out.println("==show");
		System.out.println(userService);
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}


}
