package com.spring.demo1;

import java.util.Date;
//静态代理类必须要实现与目标代理对象的同一个接口
public class UserServiceStaticProxy implements UserService {

	private UserService userService;

	public UserServiceStaticProxy(UserService userService) {
		this.userService = userService;
	}

	@Override
	public boolean login(String name, String password) {
		boolean isLogin = userService.login(name, password);
		System.out.println("日志：" + name + "于" + new Date().toLocaleString() + "登录");
		return isLogin;
	}

}
