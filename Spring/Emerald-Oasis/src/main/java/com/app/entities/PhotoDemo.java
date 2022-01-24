package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "photodemo")
public class PhotoDemo {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int picId;
	private String picName;
	private String picture;
	public PhotoDemo() {
		super();
	}
	public PhotoDemo(int picId, String picName, String picture) {
		super();
		this.picId = picId;
		this.picName = picName;
		this.picture = picture;
	}
	public int getPicId() {
		return picId;
	}
	public void setPicId(int picId) {
		this.picId = picId;
	}
	public String getPicName() {
		return picName;
	}
	public void setPicName(String picName) {
		this.picName = picName;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "PhotoDemo [picId=" + picId + ", picName=" + picName + ", picture=" + picture + "]";
	}

}
