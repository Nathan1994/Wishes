package com.hibernate.dao;

import com.struts2.user.model.Wish;

public interface WishDao {
	public void addWish(Wish wish);
	public int getMaxId();
}
