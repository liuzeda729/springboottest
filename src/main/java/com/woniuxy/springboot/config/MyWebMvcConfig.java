package com.woniuxy.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



//@Configuration
//public class MyWebMvcConfig implements WebMvcConfigurer{
//	
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		//注册自定义的映射路径
//		registry.addViewController("/").setViewName("login");
//		registry.addViewController("/index.html").setViewName("login");
//	}
//}

@Configuration
public class MyWebMvcConfig {
	
	@Bean
	public WebMvcConfigurer mvcConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				//注册自定义的映射路径
				registry.addViewController("/").setViewName("index");
				registry.addViewController("/index.html").setViewName("index");
				registry.addViewController("/toIndex").setViewName("index");
			}
			
			
		};
	}
}