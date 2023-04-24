package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.User;
import com.simplilearn.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userref;
	
	public  User saveuser(User ref)
	{
		return userref.save(ref);
	}
	
	
	
	public void updateuser(int id,User updateuser)
	{
		User refrence=userref.findById(id).get();
		refrence.setUsername(updateuser.getUsername());
		refrence.setUserpassword(updateuser.getUserpassword());
		userref.save(refrence);
	}
	
	public User finduserbyid(int id)
	{
		return userref.findById(id).get();
	}
	
	public List<User> getalluser()
	{
		return userref.findAll();
	}
	
	public void deleteuserbyid(int id)
	{
		userref.deleteById(id);
	}
}
