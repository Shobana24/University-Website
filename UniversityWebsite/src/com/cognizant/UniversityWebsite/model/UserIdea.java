package com.cognizant.UniversityWebsite.model;

public class UserIdea {

	private String Name;
	private String Email;
	private String Mobile_Number;
	private String Idea;
	private String User_Id; 
	public String getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobile_Number() {
		return Mobile_Number;
	}
	public void setMobile_Number(String mobile_Number) {
		Mobile_Number = mobile_Number;
	}
	public String getIdea() {
		return Idea;
	}
	public void setIdea(String idea) {
		Idea = idea;
	}
}
