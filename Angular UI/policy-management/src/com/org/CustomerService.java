package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao dao;
	
	public Customer save(Customer c) {
		return dao.store(c);
	}
	
	public Customer login(String FirstName, String password) {
		Customer c = dao.fetchCustomer(FirstName);
		if(c.getFirstName().equals(FirstName) && c.getPassword().equals(password)) {
			return c;
		}
		else 
			return null;
	}
	
	public List<AvailablePolicy> fetchAllPolicies(){
		List<AvailablePolicy> list = dao.getAllPolicies();
		return list;
	}
	
	public List<UserPolicies> fetchUserPolicy(String firstname){
		List<UserPolicies> list =dao.getUserPolicy(firstname);
		return list;
	}
}
