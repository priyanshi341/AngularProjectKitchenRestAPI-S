package com.simplilearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Admin;
import com.simplilearn.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminrepo;
	
	public Admin getadmin(int id)
	{
		return adminrepo.findById(id).get();
	}
	
	public void updateadmin(Admin ref,int id)
	{
		Admin adminref=adminrepo.findById(id).get();
		adminref.setUsername(ref.getUsername());
		adminref.setAdminpassword(ref.getAdminpassword());
		adminrepo.save(adminref);
	}
}
