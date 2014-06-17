package com.struts2.path.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.hibernate.dao.*;
import com.struts2.user.model.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



public class NewWishAction extends ActionSupport {
	private Wish wish;
	private User userLogin;
	private WishDao wishDao = new WishDaoImpl(); 
	
	@Override
	public String execute(){
		ActionContext actionContext = ActionContext.getContext();   //取到struts容器
	    Map session = actionContext.getSession();    //取得session
	    userLogin = (User)session.get("USER_LOGIN");       //从session取得用户
		wish.setUsername(userLogin.getName());
		int maxId = wishDao.getMaxId();
		wish.setId(maxId+1);
		Date d =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");   
		String str=sdf.format(d);
		wish.setDate(str);
		wishDao.addWish(wish);
		
		
		return SUCCESS;
	}
	public Wish getWish() {
		return wish;
	}
	public void setWish(Wish wish) {
		this.wish = wish;
	}
}
