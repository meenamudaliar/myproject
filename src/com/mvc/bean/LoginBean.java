package com.mvc.bean;
 
public class LoginBean
{
     private String userName;
     private String password;
     private String newpass;
     private String email;
     private String city;
     private Double phno;
 
     public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getPhno() {
		return phno;
	}
	public void setPhno(Double phone) {
		this.phno = phone;
	}
	
    public String getNewpass() {
		return newpass;
	}
	public void setNewpass(String newpass) {
		this.newpass = newpass;
	}
	public String getUserName() {
        return userName;
     }
    public void setUserName(String userName) {
        this.userName = userName;
     }
     public String getPassword() {
        return password;
     }
     public void setPassword(String password) {
        this.password = password;
     }
}