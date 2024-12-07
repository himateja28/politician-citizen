package com.platform.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="issues")
public class Issue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="issue_id")
	public Long iid;
	@Column(name="issue_name")
	public String iname;
	@Column(name="issue_discription")
	public String idiscription;
	@Column(name="issue_date")
	public String idate;
	@Column(name="links")
	public String links;
	@Column(name="postedby")
	public String postedby;
	@Column(name="issue_dept")
	public String idepartment;
	@Column(name="area")
	public String area;
	@Column(name="pincode")
	public String pincode;
	@Column(name="status")
	String status="processing";
	@Column(name="responses")
	String responses;
	public String getResponses() {
		return responses;
	}
	public void setResponses(String responses) {
		this.responses = responses;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getIid() {
		return iid;
	}
	public void setIid(Long iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getIdiscription() {
		return idiscription;
	}
	public void setIdiscription(String idiscription) {
		this.idiscription = idiscription;
	}
	public String getIdate() {
		return idate;
	}
	public void setIdate(String idate) {
		this.idate = idate;
	}
	public String getLinks() {
		return links;
	}
	public void setLinks(String links) {
		this.links = links;
	}
	public String getPostedby() {
		return postedby;
	}
	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}
	public String getIdepartment() {
		return idepartment;
	}
	public void setIdepartment(String idepartment) {
		this.idepartment = idepartment;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
