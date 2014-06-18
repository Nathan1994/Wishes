package com.struts2.path.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import com.hibernate.dao.WishDao;
import com.hibernate.dao.WishDaoImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.user.model.User;
import com.struts2.user.model.Wish;

public class ShowAllWishesAction extends ActionSupport {
	private WishDao wishDao = new WishDaoImpl();
	@Override
	public String execute(){
		List<Wish> wishList = wishDao.getAllWishes();	
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("allWishes", wishList);
		
		
		return SUCCESS;
	}
	
	
}
