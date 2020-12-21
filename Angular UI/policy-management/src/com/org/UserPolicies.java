package com.org;

import java.util.Date;

public class UserPolicies {
private String FirstName;
private int PolicyNo;
private String PolicyName;
private double Amount;
private Date PolicyEndDate;
private String Valid;
public UserPolicies(String firstName, int policyNo, String policyName, double amount, Date policyEndDate,
		String valid) {
	super();
	FirstName = firstName;
	PolicyNo = policyNo;
	PolicyName = policyName;
	Amount = amount;
	PolicyEndDate = policyEndDate;
	Valid = valid;
}
public UserPolicies() {
	super();
	// TODO Auto-generated constructor stub
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public int getPolicyNo() {
	return PolicyNo;
}
public void setPolicyNo(int policyNo) {
	PolicyNo = policyNo;
}
public String getPolicyName() {
	return PolicyName;
}
public void setPolicyName(String policyName) {
	PolicyName = policyName;
}
public double getAmount() {
	return Amount;
}
public void setAmount(double amount) {
	Amount = amount;
}
public Date getPolicyEndDate() {
	return PolicyEndDate;
}
public void setPolicyEndDate(Date policyEndDate) {
	PolicyEndDate = policyEndDate;
}
public String getValid() {
	return Valid;
}
public void setValid(String valid) {
	Valid = valid;
}
@Override
public String toString() {
	return "UserPolicies [FirstName=" + FirstName + ", PolicyNo=" + PolicyNo + ", PolicyName=" + PolicyName
			+ ", Amount=" + Amount + ", PolicyEndDate=" + PolicyEndDate + ", Valid=" + Valid + "]";
}


}
