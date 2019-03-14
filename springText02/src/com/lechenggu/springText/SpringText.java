package com.lechenggu.springText;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lechenggu.springDemo1.User;

public class SpringText {
public static void main(String[] args) {
	ApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
	User user = (User) ac.getBean("user");
	System.out.println(user.getName());
	user.setName("111111");
	System.out.println(user.getName());
	User user2 = (User) ac.getBean("user");
	System.out.println(user.getName());
}
}
