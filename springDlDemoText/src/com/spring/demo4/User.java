package com.spring.demo4;

public class User {
	private String name;
	private String company;
	private int age;
	private boolean sex;

//	 public User(String name, String company, int age, boolean sex) {
//	 super();
//	 this.name = name;
//	 this.company = company;
//	 this.age = age;
//	 this.sex = sex;
//	 }
	// type
//	 public User(String name, String company) {
//	 this.name = name;
//	 this.company = company;
//	 }
//	 public User(String name, int age) {
//	 this.name = name;
//	 this.age = age;
//	 }
	// index
	public User( int age, String company) {
		this.company = company;
		this.age = age;
		}
		public User(String name, int age) {
		this.name = name;
		this.age = age;
		}

	@Override
	public String toString() {
		return "User [name=" + name + ", company=" + company + ", age=" + age
				+ ", sex=" + sex + "]";
	}

}
