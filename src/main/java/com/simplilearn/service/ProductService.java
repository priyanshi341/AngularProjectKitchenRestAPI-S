package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Product;
import com.simplilearn.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productref;
	
	public Product saveproduct(Product ref)
	{
		 return productref.save(ref);
	}
	
	public void updateproduct(int id,Product updateref)
	{
		Product refrence=productref.findById(id).get();
		refrence .setProductname(updateref.getProductname());
		refrence.setProductprice(updateref.getProductprice());
		productref.save(refrence);
	}
	
	public Product findbyid(int id)
	{
		return productref.findById(id).get();
	}
	
	public List<Product> getallproduct()
	{
		return productref.findAll();
	}
	
	public void deletebyid(int id)
	{
		productref.deleteById(id);
	}
}
