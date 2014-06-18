package com.hibernate.dao;

import java.util.List;

import com.struts2.user.model.Wish;

public interface WishDao {
	public void addWish(Wish wish);
	public int getMaxId();
	public List getAllWishes(String userName);
	public List getAllWishes();
	public void deleteWish(int id);
	public List getWishes(int id);
	public void updateWish(Wish wish);
	
//	public void changeWish(int id, String newContent);
	
	
}
