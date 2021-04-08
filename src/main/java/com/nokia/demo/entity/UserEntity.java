package com.nokia.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="user_accounts")
public class UserEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id",nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="name",length=150,nullable=false)
	private String name;
	
	@Column(name="phone",nullable=false)
	private long phone;
	
	@Column(name="email",length= 200,nullable=false)
	private String email;
	
	@Column(name="address",length=200,nullable=true)
	private String address;
	
	@Column(name="country",length=56,nullable=false)
	private String country;
	
	@Column(name="department",length=50,nullable=false)
	private String department;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "UserEnity [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address="
				+ address + ", country=" + country + ", department=" + department + "]";
	}
	
	
	
}
