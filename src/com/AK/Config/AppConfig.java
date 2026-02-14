package com.AK.Config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.AK.SBeans")
public class AppConfig {
	
	public AppConfig() {
		IO.println("AppConfig:: 0-param constructor !");
	}
	
	@Bean(name = "ldate")
	public LocalDate createDate() {
		IO.println("AppConfig.createDate()");
		return LocalDate.now();
	}
}
