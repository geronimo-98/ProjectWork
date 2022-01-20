package com.app.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Role")
public class Role {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int role_id;
	private String role_name;
	@OneToMany(mappedBy = "role")
	private List<User> userList;
	public Role(int role_id, String role_name, List<User> userList) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
		this.userList = userList;
	}
	public Role(int role_id) {
		super();
		this.role_id = role_id;
	}
	public Role() {
		super();
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	@JsonIgnore
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role_name=" + role_name;
	}
	
	

}
