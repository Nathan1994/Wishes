package com.hibernate.dao;

import java.util.List;

import com.struts2.user.model.Wish;

public interface WishDao {
	public void addWish(Wish wish);
	public int getMaxId();
	public List getAllWishes(String userName);
}
