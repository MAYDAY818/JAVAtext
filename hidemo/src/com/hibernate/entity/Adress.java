package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author MAYDAY
 *
 *	数据库
 *
 *	id			id
 *	顾客id		customer_id
 *	省			province
 *	市			city
 *	县/区		county
 *	详细街道		detailed
 *	邮政编码		postal_code
 *	收货人姓名	consignee
 *	收货人电话	phone
 */
@Entity
public class Adress {
	//收货人地址信息实体
	
	private int id;
	//顾客id
	private int customerId;
	//省
	private String province;
	//市
	private String city;
	//县/区
	private String county;
	//详细街道
	private String detailed;
	//邮政编码
	private String postalCode;
	//收货人姓名
	private String consignee;
	//收货人电话
	private String phone;
	//获得顾客
	private Customer customer;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	@Column(name="customer_id")
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getDetailed() {
		return detailed;
	}
	public void setDetailed(String detailed) {
		this.detailed = detailed;
	}
	@Column(name="postal_code")
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//多对一关系
		@ManyToOne
		//映射外键
		@JoinColumn(name="custome_id")
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Adress(int id, int customerId, String province, String city, String county, String detailed,
			String postalCode, String consignee, String phone, Customer customer) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.province = province;
		this.city = city;
		this.county = county;
		this.detailed = detailed;
		this.postalCode = postalCode;
		this.consignee = consignee;
		this.phone = phone;
		this.customer = customer;
	}
	public Adress() {
		super();
	}
	@Override
	public String toString() {
		return "Adress [id=" + id + ", customerId=" + customerId + ", province=" + province + ", city=" + city
				+ ", county=" + county + ", detailed=" + detailed + ", postalCode=" + postalCode + ", consignee="
				+ consignee + ", phone=" + phone + ", customer=" + customer + "]";
	}
	
	
	
	
}
