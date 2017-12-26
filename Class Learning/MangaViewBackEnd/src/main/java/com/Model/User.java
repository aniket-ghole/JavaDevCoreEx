package com.Model;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.stereotype.Component;



@Component
@Entity

public class User implements Serializable
{	
	@Id
	private int id;
	private String name;
	private String password;
	private String email;
	private String role;
	private String address;
	private boolean enables;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isEnables() {
		return enables;
	}
	public void setEnables(boolean enables) {
		this.enables = enables;
	}
	
	
	
	

}
