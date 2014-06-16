package com.struts2.path.action;

import java.util.Map;

import com.hibernate.dao.UserDao;
import com.hibernate.dao.UserDaoImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.user.model.User;

public class RegisterAction extends ActionSupport{
	private User user;
	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public String execute(){
		
		if(userDao.hasUser(user.getName(), user.getPassword())!=null){
			ActionContext actionContext = ActionContext.getContext(); 
			Map session = actionContext.getSession();
			session.put("USER_LOGIN", user);
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
