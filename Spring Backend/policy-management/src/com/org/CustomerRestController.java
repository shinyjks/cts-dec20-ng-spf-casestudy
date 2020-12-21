package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerRestController {

	@Autowired
	private CustomerService service;
	
	@RequestMapping(value = "/save", 
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
			public Customer save(@RequestBody Customer customer) {
		return service.save(customer);
	}
	@RequestMapping(value = "/{FirstName}/{Password}", method = RequestMethod.POST,  produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer authenticate(@PathVariable("FirstName")String firstname, @PathVariable("Password")String password) {
		Customer c = service.login(firstname, password);
		return c;
	}
	
	@RequestMapping(value = "/policy", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AvailablePolicy> fetchAllPoliciesAvailable(){
		List<AvailablePolicy> list = service.fetchAllPolicies();
		return list;
	}
	@RequestMapping(value = "/{FirstName}", method = RequestMethod.GET,  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserPolicies> fetchUserPolicies(@PathVariable("FirstName")String firstname){
		List<UserPolicies> list =  service.fetchUserPolicy(firstname);
		return list;
	}
}
