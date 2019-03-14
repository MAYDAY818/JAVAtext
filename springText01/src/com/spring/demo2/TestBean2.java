package com.spring.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean2 {
	   public void test(){
	        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext2.xml");
	        BeanFactory beanFactory=(BeanFactory) ctx.getBean("beanFactroy");
	        beanFactory.Beantest(); 
	    }
	   
	   public static void main(String[] args) {
		   TestBean2 tb=new TestBean2();
		   tb.test();
	}
}
