package controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import model.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("asdfg","lis");
//	List<User> ls= new ArrayList<User>();
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = null;
		try {
			t=s.beginTransaction();
//			Query query = s.createQuery("from User u where password=1");
//			java.util.List list = query.list();
//			System.out.println(list);
//			s.contains(user);
			s.save(user);
			t.commit();
			System.out.println("done");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
