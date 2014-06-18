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

	@Override
	public List getAllWishes(String userName) {
		// TODO Auto-generated method stub
		Session session = hsf.getSession();
		try{
			String sql = "from Wish as w where w.username=?";
			Query query = session.createQuery(sql);
			query.setString(0, userName);
			List list = query.list();
			return list;
		}catch (Exception e) {
			System.out.println("WishDaoImpl.getAllWishes(name)");
			e.printStackTrace();
			return null;
		} finally {
			hsf.closeSession();
		}
	}

	@Override
	public List getAllWishes() {
		// TODO Auto-generated method stub
		Session session = hsf.getSession();
		try{
			String sql = "from Wish";
			Query query = session.createQuery(sql);
			List list = query.list();
			return list;
		}catch (Exception e) {
			System.out.println("WishDaoImpl.getAllWishes()");
			e.printStackTrace();
			return null;
		} finally {
			hsf.closeSession();
		}
	}

	@Override
	public void deleteWish(int id) {
		// TODO Auto-generated method stub
		Session session = hsf.getSession();
		Transaction ts = null;
		try{
			ts = session.beginTransaction();
			String sql = "delete from Wish where id=?";
			Query query = session.createQuery(sql);
			query.setInteger(0, id);
			query.executeUpdate();
			ts.commit();
		}catch(Exception e){
			System.out.println("WishDaoImpl.deleteWish()");
			e.printStackTrace();
		}finally{
			hsf.closeSession();
		}

	}

	@Override
	public List getWishes(int id) {
		// TODO Auto-generated method stub
		Session session = hsf.getSession();
		try{
			String sql = "from Wish as w where w.id=?";
			Query query = session.createQuery(sql);
			query.setInteger(0, id);
			List list = query.list();
			return list;
		}catch (Exception e) {
			System.out.println("WishDaoImpl.getWish(id)");
			e.printStackTrace();
			return null;
		} finally {
			hsf.closeSession();
		}
	}

	@Override
	public void updateWish(Wish wish) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Session session = hsf.getSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			session.update(wish);
			ts.commit();
		} catch (Exception e) {
			System.out.println("WishDaoImpl.update()");
			e.printStackTrace();
		} finally {
			hsf.closeSession();
		}
		
	}


	

	
	

}
