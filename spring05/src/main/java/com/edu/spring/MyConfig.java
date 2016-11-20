package com.edu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	
	@Bean(initMethod="init",destroyMethod="destroy")
	public Dog createDog(){
		return new Dog();
	}
}
