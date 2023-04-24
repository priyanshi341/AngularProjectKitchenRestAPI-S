package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.Product;
import com.simplilearn.service.ProductService;



@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@GetMapping("/product")
	public List<Product> getall()
	{
		return productservice.getallproduct();
	}
	
	@GetMapping("/product/{id}")
	public Product getproductbyid(@PathVariable int id)
	{
		return productservice.findbyid(id);
	}
	
	@PostMapping("/product")
	public Product savedata(@RequestBody Product ref)
	{
		return productservice.saveproduct(ref);
	}
	
	@PutMapping("/product/{id}")
	public void updatedata(@RequestBody Product ref,@PathVariable int id)
	{
		productservice.updateproduct(id, ref);
	}
	
	@DeleteMapping("/product/{id}")
	public void deletebyid(@PathVariable int id)
	{
		productservice.deletebyid(id);
	}
	
}
