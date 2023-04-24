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

import com.simplilearn.entity.User;
import com.simplilearn.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	private UserService userservice;
	
	@GetMapping("/user")
	public List<User> getallusers()
	{
		return userservice.getalluser();
	}
	
	@GetMapping("/user/{id}")
	public User getoneuser(@PathVariable int id)
	{
		return userservice.finduserbyid(id);
	}
	
	@PostMapping("/user")
	public User adduser(@RequestBody User ref)
	{
		return userservice.saveuser(ref);
	}
	
	@PutMapping("/user/{id}")
	public void userupdate(@PathVariable int id,@RequestBody User ref)
	{
		userservice.updateuser(id, ref);
	}
	@DeleteMapping("/user/{id}")
	public void deleteuser(@PathVariable int id)
	{
		userservice.deleteuserbyid(id);
	}
}
