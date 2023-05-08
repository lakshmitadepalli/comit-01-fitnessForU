package com.comit.fitnessForU.bean;

import java.util.Date;

public class UserBean {
   int userId;
   String userFname;
   String userLname;
   String username;
   String password;
   Date birth;
   String status;
   String termsAcceptance;
   
   
  




public UserBean() {
	
}






public UserBean(int userId, String userFname, String userLname, String username, String password, Date birth,
		String status, String termsAcceptance) {
	super();
	this.userId = userId;
	this.userFname = userFname;
	this.userLname = userLname;
	this.username = username;
	this.password = password;
	this.birth = birth;
	this.status = status;
	this.termsAcceptance = termsAcceptance;
}






public int getUserId() {
	return userId;
}




public void setUserId(int userId) {
	this.userId = userId;
}




public String getUserFname() {
	return userFname;
}




public void setUserFname(String userFname) {
	this.userFname = userFname;
}




public String getUserLname() {
	return userLname;
}




public void setUserLname(String userLname) {
	this.userLname = userLname;
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




public String getStatus() {
	return status;
}




public void setStatus(String status) {
	this.status = status;
}




public String getTermsAcceptance() {
	return termsAcceptance;
}




public void setTermsAcceptance(String termsAcceptance) {
	this.termsAcceptance = termsAcceptance;
}




@Override
public String toString() {
	return "UserBean [userId=" + userId + ", userFname=" + userFname + ", userLname=" + userLname + ", username="
			+ username + ", password=" + password + ", birth=" + birth + ", status=" + status + ", termsAcceptance="
			+ termsAcceptance + "]";
}





  
  
  
}