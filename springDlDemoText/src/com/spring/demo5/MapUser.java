package com.spring.demo5;

import java.util.Map;

public class MapUser {
private Map<String,String> names;

private Map<String,User> users;


public Map<String, String> getNames() {
	return names;
}
public void setNames(Map<String, String> names) {
	this.names = names;
}
public Map<String, User> getUsers() {
	return users;
}
public void setUsers(Map<String, User> users) {
	this.users = users;
}



}
