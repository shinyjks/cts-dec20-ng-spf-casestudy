package com.org;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//@Entity
//@Table(name = "register")
public class Customer {
 //@Id
// @Column(name="FirstName")
 private String FirstName;
// @Column(name="LastName")
 private String LastName;
 //@Column(name="Dob")
 private Date Dob;
 //@Column(name="Address")
 private String Address;
 //@Column(name="ContactNumber")
 private String ContactNumber;
 //@Column(name="Email")
 private String Email;
 //@Column(name="Password")
 private String Password;
 //@Column(name="Cnf_Password")
 private String Cnf_Password;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(String firstName, String lastName, Date dob, String address, String contactNumber, String email,
		String password, String cnf_Password) {
	super();
	FirstName = firstName;
	LastName = lastName;
	Dob = dob;
	Address = address;
	ContactNumber = contactNumber;
	Email = email;
	Password = password;
	Cnf_Password = cnf_Password;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public Date getDob() {
	return Dob;
}
public void setDob(Date dob) {
	Dob = dob;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getContactNumber() {
	return ContactNumber;
}
public void setContactNumber(String contactNumber) {
	ContactNumber = contactNumber;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getCnf_Password() {
	return Cnf_Password;
}
public void setCnf_Password(String cnf_Password) {
	Cnf_Password = cnf_Password;
}
@Override
public String toString() {
	return "Customer [FirstName=" + FirstName + ", LastName=" + LastName + ", Dob=" + Dob + ", Address=" + Address
			+ ", ContactNumber=" + ContactNumber + ", Email=" + Email + ", Password=" + Password + ", Cnf_Password="
			+ Cnf_Password + "]";
}
 
 
}
 
 
 
