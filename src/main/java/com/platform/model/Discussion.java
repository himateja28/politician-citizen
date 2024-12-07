package com.platform.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="discussions")
public class Discussion {
	@Id
	Long id;
	String dtopic;
	String discription;
//	String comments;
	List<String> comments;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDtopic() {
		return dtopic;
	}
	public void setDtopic(String dtopic) {
		this.dtopic = dtopic;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public List<String> getComments() {
		return comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}
}
