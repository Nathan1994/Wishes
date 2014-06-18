package com.struts2.path.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.struts2.user.model.User;
import com.struts2.user.model.Wish;
import com.hibernate.dao.WishDao;
import com.hibernate.dao.WishDaoImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.user.model.User;

public class ShowWishesAction extends ActionSupport {
	private User userLogin = new User();
	private WishDao wishDao = new WishDaoImpl();
	@Override
	public String execute(){
		ActionContext actionContext = ActionContext.getContext();   //取到struts容器
	    Map session = actionContext.getSession();    //取得session
	    userLogin = (User)session.get("USER_LOGIN");       //从session取得用户
		List<Wish> wishList = wishDao.getAllWishes(userLogin.getName());	
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("userWishes", wishList);
		

		
		
		
		
		
		return SUCCESS;
		
	}
	
	
}
