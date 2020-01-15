package com.stma.medical.util;

public class Contact {
	private String city;
	private String country;
	private long phone;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Contact(String city, String country, long phone) {
		super();
		this.city = city;
		this.country = country;
		this.phone = phone;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
}
