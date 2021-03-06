package com.spring.demo5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class MapUserTest {

	@Test
	void test() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		MapUser map=(MapUser) ac.getBean("mapBean");
		System.out.println(map.getNames().get("name1"));
		System.out.println(map.getNames().get("name2"));
		System.out.println(map.getNames().get("name3"));
			
		
		Map<String,User> users=map.getUsers();
		
			System.out.println(users.get("user1").getName()+users.get("user1").getId());
			System.out.println(users.get("user2").getName()+users.get("user2").getId());
			System.out.println(users.get("user3").getName()+users.get("user3").getId());
	}

}
