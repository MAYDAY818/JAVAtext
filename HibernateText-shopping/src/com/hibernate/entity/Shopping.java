package com.hibernate.entity;

public class Shopping {
	private int id;
	private int count;
	
	private User user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public Shopping() {
		super();
	}
	public Shopping(int count) {
		super();
		this.count = count;
	}
	
	

}
