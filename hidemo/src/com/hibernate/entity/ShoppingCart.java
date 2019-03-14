package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author MAYDAY
 *
 *	数据库 
 *
 *	总价 total_price
 *	数量 number
 */
@Embeddable
public class ShoppingCart {
	//购物车实体
	
	
	//总价
	private String totalPrice;
	//商品数量
	private String number;
	
	
	@Column(name="total_price")
	public String getTotalprice() {
		return totalPrice;
	}
	public void setTotalprice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public ShoppingCart(String totalPrice, String number) {
		super();
		this.totalPrice = totalPrice;
		this.number = number;
	}
	public ShoppingCart() {
		super();
	}
	@Override
	public String toString() {
		return "ShoppingCart [totalprice=" + totalPrice + ", number=" + number + "]";
	}
	
	
}
