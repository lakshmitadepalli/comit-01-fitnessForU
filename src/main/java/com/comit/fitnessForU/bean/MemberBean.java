package com.comit.fitnessForU.bean;

import java.sql.Date;

public class MemberBean {
	int memberId;
	String memLastname;
	String memFirstname;
	String username;
	String password;
	Date birth;
	String payment;
	public MemberBean(int memberId, String memLastname, String memFirstname, String username, String password,
			Date birth, String payment) {
		super();
		this.memberId = memberId;
		this.memLastname = memLastname;
		this.memFirstname = memFirstname;
		this.username = username;
		this.password = password;
		this.birth = birth;
		this.payment = payment;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemLastname() {
		return memLastname;
	}
	public void setMemLastname(String memLastname) {
		this.memLastname = memLastname;
	}
	public String getMemFirstname() {
		return memFirstname;
	}
	public void setMemFirstname(String memFirstname) {
		this.memFirstname = memFirstname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "MemberBean [memberId=" + memberId + ", memLastname=" + memLastname + ", memFirstname=" + memFirstname
				+ ", username=" + username + ", password=" + password + ", birth=" + birth + ", payment=" + payment
				+ "]";
	}

	
	
}
