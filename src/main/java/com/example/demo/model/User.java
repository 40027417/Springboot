package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int Id;
	private String Name;
	private String Gender;
	private String Location;
	private String Email;
	private String Password;
	
	public User() {
		super();
	}

	public User(int id,String name, String gender, String location, String email, String password) {
		super();
		Id = id;
		Name = name;
		Gender = gender;
		Location = location;
		Email = email;
		Password = password;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
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
	
	@Override
	public String toString() {
		return "Name=" + Name + ", Gender=" + Gender + ", Location=" + Location + ", Email=" + Email
				+ ", Password=" + Password;
	}
	
	

}
