package com.spring.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean1 {
	   public void test(){
	        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
	        BeanFactory beanFactory=(BeanFactory) ctx.getBean("beanFactroy");
	        beanFactory.Beantest(); 
	    }
	   
	   public static void main(String[] args) {
		   TestBean1 tb=new TestBean1();
		   tb.test();
	}
}
