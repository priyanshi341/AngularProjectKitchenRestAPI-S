package com.simplilearn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
@Id
private int id;
private String username;
private String adminpassword;
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
public String getAdminpassword() {
	return adminpassword;
}
public void setAdminpassword(String adminpassword) {
	this.adminpassword = adminpassword;
}
public Admin(int id, String username, String adminpassword) {
	super();
	this.id = id;
	this.username = username;
	this.adminpassword = adminpassword;
}

public Admin(String username, String adminpassword) {
	super();
	this.username = username;
	this.adminpassword = adminpassword;
}
public Admin() {
}

}
