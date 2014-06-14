package com.struts2.user.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Operation {
	Configuration cfg =  new Configuration();;
	SessionFactory sf;
	Session session;
	
	
	public void dataSave(User user)
	{
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.getTransaction().begin();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
	
	public User dataGet(int key)
	{
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.getTransaction().begin();
		User user = (User)session.get(User.class, key);
		session.getTransaction().commit();
		session.close();
		sf.close();
		return user;
	}
	
	public void dataDelete(User user)
	{
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.getTransaction().begin();
		session.delete(user);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
	

	public void dataUpdate(User user)
	{
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.getTransaction().begin();
		session.update(user);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
	
	
	
	
	
}

