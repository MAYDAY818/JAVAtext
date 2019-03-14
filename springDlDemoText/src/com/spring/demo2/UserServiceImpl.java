package com.spring.demo2;

public class UserServiceImpl implements UserService{
	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		userDao.login();
	}
	
}
