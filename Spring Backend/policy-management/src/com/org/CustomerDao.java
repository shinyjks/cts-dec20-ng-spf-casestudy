package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	@Transactional
	public Customer store(Customer customer) {
		String query = "insert into register (FirstName,LastName,Dob,Address,ContactNumber,Email,Password,Cnf_Password) values(?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(query,customer.getFirstName(), customer.getLastName(), customer.getDob(), customer.getAddress(), customer.getContactNumber(),
				customer.getEmail(), customer.getPassword(), customer.getCnf_Password());
		return fetchCustomer(customer.getFirstName());
		
	}
	public Customer fetchCustomer(String FirstName) {
		return jdbcTemplate.queryForObject("select * from register where FirstName = ?", new Object[] {FirstName},
				(rs,num) -> new Customer(rs.getString("FirstName"), rs.getString("LastName"), rs.getDate("Dob"), rs.getString("Address"),
						rs.getString("ContactNumber"), rs.getString("Email"), rs.getString("Password"),
						rs.getString("Cnf_Password")));
		
	}
	public List<AvailablePolicy> getAllPolicies(){
		return jdbcTemplate.query("select * from Availablepolicy", 
				(rs,num) -> new AvailablePolicy(rs.getInt("SNO"), rs.getString("PolicyName"), rs.getString("PolicyDetails")));
}
	public List<UserPolicies> getUserPolicy(String FirstName){
		return jdbcTemplate.query("select * from UserPolicy where FirstName = ?",new Object[] {FirstName},
				(rs,num) -> new UserPolicies(rs.getString("FirstName"), rs.getInt("PolicyNo"), rs.getString("PolicyName"), rs.getDouble("Amount"),
						rs.getDate("PolicyEndDate"), rs.getString("Valid")));
	}
}
