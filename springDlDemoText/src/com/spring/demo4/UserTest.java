package com.spring.demo4;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserTest {

	@Test
	public void test() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext3.xml");
		User user=(User) ac.getBean("user");
		System.out.println(user);
	}
//	@Test
//	public void test() {
//		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext2.xml");
//		User user=(User) ac.getBean("user2");
//		System.out.println(user);
//	}
//	@Test
//	public void test() {
//		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext2.xml");
//		User user=(User) ac.getBean("user3");
//		System.out.println(user);
//	}
//	@Test
//	public void test() {
//		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext2.xml");
//		User user=(User) ac.getBean("user4");
//		System.out.println(user);
//	}
//	@Test
//	public void test() {
//		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext2.xml");
//		User user=(User) ac.getBean("user5");
//		System.out.println(user);
//	}
//	@Test
//	public void test() {
//		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext2.xml");
//		User user=(User) ac.getBean("user6");
//		System.out.println(user);
//	}

}
