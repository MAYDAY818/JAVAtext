package com.spring.demo1;

public class Test {

	public static void main(String[] args) {
		UserServiceStaticProxy proxy=new UserServiceStaticProxy(new UserServiceImpl());
		proxy.login("adi", "123");
	}

}
