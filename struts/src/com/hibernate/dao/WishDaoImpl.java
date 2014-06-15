package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.struts2.user.model.Wish;

public class WishDaoImpl implements WishDao {
	HibernateSessionFactory hsf = new HibernateSessionFactory();

	public void addWish(Wish wish) {
		// TODO Auto-generated method stub
		Session session = hsf.getSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			session.save(wish);
			ts.commit();
		} catch (Exception e) {
			System.out.println("WishDaoImpl.add()");
			e.printStackTrace();
		} finally {
			hsf.closeSession();
		}
		
	}


}
