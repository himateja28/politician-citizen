package com.platform.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Feedback")
public class FeedBack {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(name="email")
	String email;
	@Column(name="issuename")
	String issuename;
	@Column(name="issuedept")
	String issuedept;
	@Column(name="description")
	String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIssuename() {
		return issuename;
	}
	public void setIssuename(String issuename) {
		this.issuename = issuename;
	}
	public String getIssuedept() {
		return issuedept;
	}
	public void setIssuedept(String issuedept) {
		this.issuedept = issuedept;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
