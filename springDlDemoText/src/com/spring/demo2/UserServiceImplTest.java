package com.spring.demo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserServiceImplTest {

	@Test
	void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) ctx.getBean("UserServiceImpl2");
		userService.login();
	}

}
