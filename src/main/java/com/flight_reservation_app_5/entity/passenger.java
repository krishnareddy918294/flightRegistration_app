package com.flight_reservation_app_5.entity;

import javax.persistence.Entity;

@Entity
public class passenger extends AbstractEntity {
	private String firstname;
	private String lastname;
	private String email;
	private String  phone;
	public String getFirstname() {
		return firstname;
		
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	
	

}
