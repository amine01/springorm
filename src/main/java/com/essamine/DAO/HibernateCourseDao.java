package com.essamine.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.essamine.models.Course;

public class HibernateCourseDao {

	private SessionFactory sessionFactory;

	public HibernateCourseDao() {
		Configuration config = new Configuration().configure();
		sessionFactory = config.buildSessionFactory();
	}

	public void store(Course course) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		try {

			tx.begin();
			session.saveOrUpdate(course);
			tx.commit();
		} catch (RuntimeException e) {

		} finally {
			session.close();
		}
	}

}
