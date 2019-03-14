package entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user")
public class User {
	private int id;
	private String userName;
	private String userPassword;
	@Id
	@GenericGenerator(name="my_gen", strategy="increment")
	@GeneratedValue(generator="increment_generator")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Id
	@GenericGenerator(name="my_gen", strategy="increment")
	@GeneratedValue(generator="increment_generator")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public User(int id, String userName, String userPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	public User() {
		super();
	}
	

}
