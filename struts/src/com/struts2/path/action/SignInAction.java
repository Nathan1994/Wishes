package com.struts2.path.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.user.model.User;

public class SignInAction extends ActionSupport{
	private User user;
	
	public String signin(){
		
//		System.out.println("user="+user.getEmail());
		return SUCCESS;
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
