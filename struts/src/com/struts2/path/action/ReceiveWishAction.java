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

public class ReceiveWishAction extends ActionSupport {
	private String receiver;
	private int wishId;
	private WishDao wishDao = new WishDaoImpl();
	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public int getWishId() {
		return wishId;
	}

	public void setWishId(int wishId) {
		this.wishId = wishId;
	}

	@Override
	public String execute(){
		Wish wish = (Wish)wishDao.getWishes(wishId).get(0);		
		wish.setReceiver(receiver);
		wishDao.updateWish(wish);
		
		
		
		return SUCCESS;
	}

}
