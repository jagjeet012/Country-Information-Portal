package org.jagjeet.hibernate.basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jagjeet.hibernate.model.City;
import org.jagjeet.hibernate.model.Country;
import org.jagjeet.hibernate.model.Language;
import org.jagjeet.hibernate.model.Sport;

public class AppTest {

	public static void main(String[] args) {

		System.out.println("Hello Hibernate!");

		Country country = new Country();
		country.setCountryName("India");

		Language language = new Language();
		language.setLangageName("Hindi");

		City city = new City();
		city.setCityName("New Delhi");

		Sport sport = new Sport();
		sport.setSportName("Hockey");

		country.getLangauge().add(language);
		country.getSport().add(sport);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.save(country);
		session.save(language);
		session.save(city);
		session.save(sport);
		session.getTransaction().commit();

		session.close();

		System.out.println("Record Persisted");

	}

}
