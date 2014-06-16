package com.struts2.path.action;

import java.util.Map;

import com.hibernate.dao.UserDao;
import com.hibernate.dao.UserDaoImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.user.model.Operation;
import com.struts2.user.model.User;
import com.struts2.user.dto.UserDTO;


public class IndexAction extends ActionSupport{	
	private UserDao userDao = new UserDaoImpl();
	private User user=new User();
	private UserDTO userDTO=new UserDTO();
	
	public String add() {
		System.out.println(userDTO.getPassword().compareTo(userDTO.getPasswordConfirming()));
		if(userDTO.getPassword().compareTo(userDTO.getPasswordConfirming())==-1){
			System.out.println("error");
			return "error";
		}
		if(userDao.hasSameName(userDTO.getEmail())){
			return "false";
		}
		user.setName(userDTO.getEmail());
		user.setPassword(userDTO.getPassword());
		System.out.println("user=" + user.getName());
		System.out.println("password=" + user.getPassword());
		userDao.addUser(user);
		
		ActionContext actionContext = ActionContext.getContext(); 
		Map session = actionContext.getSession();
		session.put("USER_LOGIN", user);
		 
		
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