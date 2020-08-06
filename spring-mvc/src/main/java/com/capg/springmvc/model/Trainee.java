package com.capg.springmvc.model;

public class Trainee {

	private int tId;
	private String tName;
	private String dept;
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	public Trainee(int tId, String tName, String dept) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.dept = dept;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Trainee [tId=" + tId + ", tName=" + tName + ", dept=" + dept + "]";
	}
	
}
