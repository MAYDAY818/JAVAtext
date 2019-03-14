package com.hibernate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;


/**
 * @author MAYDAY
 *
 *
 *	数据库
 *	id	   id
 *	用户名  name
 *	密码	   pwd
 *	手机	   phone
 *
 */
@Entity
public class Customer {
	//用户实体
	
	
	//用户id
	private int id;
	//用户名
	private String name;
	//密码
	private String pwd;
	//收货地址
	private List list=new ArrayList<Adress>();
	//手机
	private String phone;
	//购物车
	private ShoppingCart shoppingCart;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	//映射一对多关系
		@OneToMany(mappedBy="customer",targetEntity=Adress.class,
				cascade = CascadeType.ALL)
		@OrderColumn(name="order_index")
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Embedded
	@AttributeOverrides(value= {
			@AttributeOverride(
					name="totalPrice",
					column=@Column(name="total_price")),
			@AttributeOverride(
					name="number",
					column=@Column(name="number"))
	})
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public Customer(int id, String name, String pwd, List list, String phone, ShoppingCart shoppingCart) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.list = list;
		this.phone = phone;
		this.shoppingCart = shoppingCart;
	}
	public Customer() {
		super();
	}
	
	
	
	
	
	
}
