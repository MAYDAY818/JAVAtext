package com.spring.demo3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {

	@Test
	public void test() {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
	        UserService userService = (UserService) ctx.getBean("UserServiceImpl2");
	        userService.login();
	}

}
