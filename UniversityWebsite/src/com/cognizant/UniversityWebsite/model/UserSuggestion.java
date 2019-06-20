package com.cognizant.UniversityWebsite.model;

public class UserSuggestion {

	private String Name;
	private String Email;
    private String Suggestion;
    private String User_Id;
  
	public String getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(String User_Id) {
		this.User_Id = User_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getSuggestion() {
		return Suggestion;
	}
	public void setSuggestion(String Suggestion) {
		this.Suggestion = Suggestion;
	}	
}
