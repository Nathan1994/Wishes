package com.struts2.path.action;

import com.hibernate.dao.UserDao;
import com.hibernate.dao.UserDaoImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.user.model.User;

public class RegisterAction extends ActionSupport{
	private User user;
	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public String execute(){
		
		if(userDao.hasUser(user.getName(), user.getPassword())!=null){
			return SUCCESS;
		}
		return "error";
		
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
