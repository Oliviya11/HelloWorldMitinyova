package com.mitinyova.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mitinyova.people.Person;

@Repository
public class HibernatePersonDAO implements PersonsDAO {
	@Autowired
	private SessionFactory sessionFactory;

	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addPerson(Person person) {
		currentSession().save(person);
	}

	public Person getPersonById(int id) {
		return (Person) currentSession().get(Person.class, id);
	}

	public void savePerson(Person person) {
		currentSession().update(person);
	}

}
