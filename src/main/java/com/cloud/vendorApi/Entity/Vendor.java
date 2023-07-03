package com.cloud.vendorApi.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int Id;
 private String Name;
 private String gender;
 private long Number;
 
public Vendor() {
	super();
	// TODO Auto-generated constructor stub
}



public Vendor(int id, String name, String gender, long number) {
	super();
	Id = id;
	Name = name;
	this.gender = gender;
	Number = number;
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
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public long getNumber() {
	return Number;
}

public void setNumber(long number) {
	Number = number;
}
 
 
 
}
