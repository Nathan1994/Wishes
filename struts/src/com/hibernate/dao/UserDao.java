package com.hibernate.dao;

import com.struts2.user.model.User;

public interface UserDao {
	public void addUser(User user);
	public User hasUser(String name, String password);
	
}

