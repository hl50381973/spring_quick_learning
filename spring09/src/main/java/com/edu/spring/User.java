package com.edu.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myUser")
public class User {
	
	//JSR 250
	@Resource
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
