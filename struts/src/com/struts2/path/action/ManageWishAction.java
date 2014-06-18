package com.struts2.path.action;

import com.hibernate.dao.WishDao;
import com.hibernate.dao.WishDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

public class ManageWishAction extends ActionSupport {
	private int wishId;
	private WishDao wishDao = new WishDaoImpl(); 

	public int getWishId() {
		return wishId;
	}

	public void setWishId(int wishId) {
		this.wishId = wishId;
	}


	@Override
	public String execute(){
		System.out.println(wishId);
		wishDao.deleteWish(wishId);
		
		
		return SUCCESS;
	}

}
