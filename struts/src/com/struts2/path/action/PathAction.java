package com.struts2.path.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.user.model.User;
import com.struts2.user.dto.UserDTO;


public class PathAction extends ActionSupport{	
	
	private User user=new User();
	private UserDTO userDTO=new UserDTO();
	
	public String add() {
		user.setName(userDTO.getName());
		user.setAge(userDTO.getAge());
		System.out.println("name=" + user.getName());
		System.out.println("age=" + user.getAge());
		return SUCCESS;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}


//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
	

	
	
	
	
}