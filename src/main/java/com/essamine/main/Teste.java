package com.essamine.main;

import java.util.GregorianCalendar;

import com.essamine.DAO.HibernateCourseDao;
import com.essamine.models.Course;

public class Teste {
	public static void main(String... args) {
		HibernateCourseDao courseDao = new HibernateCourseDao();
		Course c = new Course();
		c.setBeginDate(new GregorianCalendar(2005, 5, 16).getTime());
		c.setEndDate(new GregorianCalendar(2005, 5, 16).getTime());
		c.setTitle("title");

		courseDao.store(c);

	}

}
