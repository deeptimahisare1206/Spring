package com.mycompany;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mypackage")
public class Javaconfig {
	@Bean
	public Demo getDemo() {
		return new Demo();
	}

}
