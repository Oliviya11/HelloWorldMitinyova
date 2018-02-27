package com.mitinyova.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mitinyova.people.Person;

@Transactional
public class WorkWithPerson {
	@Autowired
	private PersonsDAO personsDAO;

	public Person addPerson(Person person) {
		personsDAO.addPerson(person);
		System.out.println("Person has been added " + person);
		return person;
	}

	public Person getPersonById(int id) {
		return personsDAO.getPersonById(id);
	}

	public void savePerson(Person person) {
		personsDAO.savePerson(person);
		System.out.println("Person has been saved " + person);
	}
}
