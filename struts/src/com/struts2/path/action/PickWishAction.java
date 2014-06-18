package com.struts2.path.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.user.model.Wish;
import com.hibernate.dao.WishDao;
import com.hibernate.dao.WishDaoImpl;

public class PickWishAction extends ActionSupport{
	public int wishId;
	public WishDao wishDao = new WishDaoImpl();
	public int getWishId() {
		return wishId;
	}

	public void setWishId(int wishId) {
		this.wishId = wishId;
	}

	@Override
	public String execute(){
		List<Wish> list = wishDao.getWishes(wishId);
		Wish wish = list.get(0);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("WISH_LOAD", wish);
		
		
		return SUCCESS;
	}
}
