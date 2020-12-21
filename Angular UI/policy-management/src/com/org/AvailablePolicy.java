package com.org;

public class AvailablePolicy {
private int SNO;
private String PolicyName;
private String PolicyDetails;
public AvailablePolicy() {
	super();
	// TODO Auto-generated constructor stub
}
public AvailablePolicy(int sNO, String policyName, String policyDetails) {
	super();
	SNO = sNO;
	PolicyName = policyName;
	PolicyDetails = policyDetails;
}
public int getSNO() {
	return SNO;
}
public void setSNO(int sNO) {
	SNO = sNO;
}
public String getPolicyName() {
	return PolicyName;
}
public void setPolicyName(String policyName) {
	PolicyName = policyName;
}
public String getPolicyDetails() {
	return PolicyDetails;
}
public void setPolicyDetails(String policyDetails) {
	PolicyDetails = policyDetails;
}
@Override
public String toString() {
	return "AvailablePolicy [SNO=" + SNO + ", PolicyName=" + PolicyName + ", PolicyDetails=" + PolicyDetails + "]";
}


}
