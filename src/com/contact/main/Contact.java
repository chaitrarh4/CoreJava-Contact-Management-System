package com.contact.main;

public class Contact 
{
private int contact_id;
private String name;
private String mobileNumber;
private String email;
private String address;
public Contact()
{
	
}
public Contact(int contact_id, String name, String mobileNumber, String email, String address) {
	super();
	this.contact_id = contact_id;
	this.name = name;
	this.mobileNumber = mobileNumber;
	this.email = email;
	this.address = address;
}
public int getContact_id() {
	return contact_id;
}
public void setContact_id(int contact_id) {
	this.contact_id = contact_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Contact [contact_id=" + contact_id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email="
			+ email + ", address=" + address + "]";
}


}
