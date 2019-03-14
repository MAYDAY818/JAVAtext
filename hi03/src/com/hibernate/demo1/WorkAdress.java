package com.hibernate.demo1;

public class WorkAdress {
	private String privoce;
	private String city;
	public String getPrivoce() {
		return privoce;
	}
	public void setPrivoce(String privoce) {
		this.privoce = privoce;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public WorkAdress(String privoce, String city) {
		super();
		this.privoce = privoce;
		this.city = city;
	}
	public WorkAdress() {
		super();
	}
}
