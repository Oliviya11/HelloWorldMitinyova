package com.mitinyova.hibernate;

import com.mitinyova.people.Person;

public interface PersonsDAO {
	
	void addPerson(Person person);
	
	Person getPersonById(int id);
	
	void savePerson(Person person);
}
