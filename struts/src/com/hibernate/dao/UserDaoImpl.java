package com.hibernate.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.struts2.user.model.User;

public class UserDaoImpl implements UserDao{
	HibernateSessionFactory hsf = new HibernateSessionFactory();
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		Session session = hsf.getSession();
		Transaction ts = null;
		try {
			ts = session.beginTransaction();
			session.save(user);
			ts.commit();
		} catch (Exception e) {
			System.out.println("UserDaoImpl.add()");
			e.printStackTrace();
		} finally {
			hsf.closeSession();
		}
		
	}

	@Override
	public User hasUser(String name, String password) {
		// TODO Auto-generated method stub
		Session session = hsf.getSession();
		try {
			String sql = "from User as u where u.name=? and u.password=?";
			// String sql = "from Users";
			Query query = session.createQuery(sql);
			query.setString(0, name);
			query.setString(1, password);
			List list = query.list();
			if (list != null && list.size() != 0) {
				Iterator itor = list.iterator();
				User user = (User) itor.next();
				return user;
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("UserDaoImpl.hasUser() ·½·¨·¢ÉúÒì³£:");
			e.printStackTrace();
			return null;
		} finally {
			hsf.closeSession();
		}
	}
	
	@Override
	public boolean hasSameName(String username) {
		Session session = hsf.getSession();
		try {
			String sql = "from User u where u.name=?";
			Query query = session.createQuery(sql);
			query.setString(0, username);
			List list = query.list();
			Iterator itor = list.iterator();
			while (itor.hasNext()) {
				User user = (User) itor.next();
				String name = user.getName();
				if (name.equals(username)) {
					return true;
				} else {
					return false;
				}
			}
		} catch (Exception e) {
			System.out.println("UserDaoImpl.hasSameName() ������������:");
			e.printStackTrace();
			return false;
		} finally {
			hsf.closeSession();
		}
		return false;
	}


}
