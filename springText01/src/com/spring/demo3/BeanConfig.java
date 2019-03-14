package com.spring.demo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//定义了一个configuration管理器
@Configuration
public class BeanConfig {
	//提供一个beanFactory的方法 
	//返回类型与返回值对应接口与实现类
	//那么提供给这个方法一个标签@Bean 被标识为一个bean对象
	 @Bean
	    public BeanFactory beanFactory(){
	        return new BeanFactoryImp();
	    }
}
