package com.ojas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="departments")
public class Department {
	@Id
	@Column(name = "department_id")
	private int id;
	
	@Column(name = "department_name")
	private String name;
	
	@Column(name = "department_location")
	private int location;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}
	
	

}
