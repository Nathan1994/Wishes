package com.hibernate.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.struts2.user.model.User;
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

	@Override
	public int getMaxId() {
		// TODO Auto-generated method stub
		Session session = hsf.getSession();
		try {
			String sql = "select max(w.id) from Wish w";
			Integer id = (Integer) session.createQuery(sql).uniqueResult();
			return id.intValue();
		} catch (Exception e) {
			System.out.println("WishDaoImpl.getMaxId");
			e.printStackTrace();
			return 0;
		} finally {
			hsf.closeSession();
		}
	}

}
