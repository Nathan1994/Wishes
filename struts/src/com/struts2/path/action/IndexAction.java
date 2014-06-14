package com.struts2.path.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.user.model.Operation;
import com.struts2.user.model.User;
import com.struts2.user.dto.UserDTO;


public class IndexAction extends ActionSupport{	
	
	private User user=new User();
	private UserDTO userDTO=new UserDTO();
	
	public String add() {
		user.setName(userDTO.getEmail());
//		user.setPassword(userDTO.getPassword());
		user.setId(1);
		System.out.println("user=" + user.getEmail());
		System.out.println("password=" + user.getPassword());
		Operation op = new Operation();
		op.dataSave(user);
		return SUCCESS;
	}
	public String signIn(){
		//检测user password
		
		return SUCCESS;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}



	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	
	
	
	
}