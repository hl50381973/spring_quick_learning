package com.edu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	
	@Bean
	public CarFactory createJeepFactory(){
		return new CarFactory();
	}
	
	@Bean
	public Car createCar(CarFactory factory){
		return factory.create();
	}
}
