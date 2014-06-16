package com.struts2.path.action;

import java.util.Map;

import com.struts2.user.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.user.model.User;

public class ShowWishesAction extends ActionSupport {
	private User userLogin;
	
	public ShowWishesAction(){
		ActionContext actionContext = ActionContext.getContext();   //取到struts容器
	    Map session = actionContext.getSession();    //取得session
	    userLogin = (User)session.get("USER_LOGIN");       //从session取得用户
	    System.out.println("User Login is "+ userLogin.getName());
	}
	
	
	
	
}
