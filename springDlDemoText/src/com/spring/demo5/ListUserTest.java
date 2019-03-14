package com.spring.demo5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class ListUserTest {

	@Test
	void test() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		ListUser list=(ListUser) ac.getBean("ListBean");
		
		//拿属性名为names的对象集合值
		for (int i = 0; i < list.getNames().size(); i++) {
			System.out.println(list.getNames().get(i));
		}
		
		//拿属性名为users的对象集合值，这个对象集合的泛型是User类
		for (int i = 0; i < list.getUsers().size(); i++) {
			System.out.println(list.getUsers().get(i).getName());
			System.out.println(list.getUsers().get(i).getPwd());
			System.out.println(list.getUsers().get(i).getId());
		}
			
		
	}

}
