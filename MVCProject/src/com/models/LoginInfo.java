package com.models;

public class LoginInfo {
	String username;
	String password;
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
	public boolean checkLogin()//Business Logic
	{
		if(username.equals("Digital") && password.equals("789456"))
			return true;
		else
			return false;
	}

}
