package com.simplilearn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String username;
private String userpassword;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUserpassword() {
	return userpassword;
}
public void setUserpassword(String userpassword) {
	this.userpassword = userpassword;
}
public User(int id, String username, String userpassword) {
	super();
	this.id = id;
	this.username = username;
	this.userpassword = userpassword;
}
public User(String username, String userpassword) {
	super();
	this.username = username;
	this.userpassword = userpassword;
}
public User() {
	
}

}
