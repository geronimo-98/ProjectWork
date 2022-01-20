package com.app.entities;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "User")
public class User {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int user_id;
	private String first_name;
	private String last_name;
	@Lob
	private byte[] profile_photo;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date birthdate;
	private String gender;
	private String email;
	private String password;
	private String phone_no;
	private String card_no;
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;
	
	
	
	public User() {
		super();
	}
	public User(int user_id, String first_name, String last_name, byte[] profile_photo, Date birthdate, String gender,
			String email, String password, String phone_no, String card_no, Role role) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.profile_photo = profile_photo;
		this.birthdate = birthdate;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.phone_no = phone_no;
		this.card_no = card_no;
		this.role = role;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public byte[] getProfile_photo() {
		return profile_photo;
	}
	public void setProfile_photo(byte[] profile_photo) {
		this.profile_photo = profile_photo;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getCard_no() {
		return card_no;
	}
	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", profile_photo=" + Arrays.toString(profile_photo) + ", birthdate=" + birthdate + ", gender="
				+ gender + ", email=" + email + ", password=" + password + ", phone_no=" + phone_no + ", card_no="
				+ card_no + ", role_id=" + role + "]";
	}
	
	

}
