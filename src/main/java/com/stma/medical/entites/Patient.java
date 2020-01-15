package com.stma.medical.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;


@Entity
public class Patient implements Serializable{
	@Id @GeneratedValue
	private Long  id;
	private String firstName;
	private String lastName;
	private String gender;
	
	private int age;
	private String city;
	private String country;
	
	private String diabetic;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String firstName, String lastName, String gender, int age, String city, String country,
			String diabetic) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.city = city;
		this.country = country;
		this.diabetic = diabetic;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
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
	public String getDiabetic() {
		return diabetic;
	}
	public void setDiabetic(String diabetic) {
		this.diabetic = diabetic;
	}
	
	
}
