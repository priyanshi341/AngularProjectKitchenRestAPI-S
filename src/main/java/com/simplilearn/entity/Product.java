package com.simplilearn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String productname;
	private int productprice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	public Product(String productname, int productprice) {
		super();
		this.productname = productname;
		this.productprice = productprice;
	}
	public Product() {
		
	}
	public Product(int id, String productname, int productprice) {
		super();
		this.id = id;
		this.productname = productname;
		this.productprice = productprice;
	}
	
	

}
