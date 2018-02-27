package com.mycompany.app;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mitinyova.animals.Cat;
import com.mitinyova.hibernate.WorkWithPerson;
import com.mitinyova.myjdbc.WorkWithCats;
import com.mitinyova.people.Person;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
		Cat catMurka = (Cat) context.getBean("catMurka");
		catMurka.mew();
		catMurka.eatSnack();
		catMurka.play();
		Cat catMurluk = (Cat) context.getBean("catMurluk");
		catMurluk.mew();
		catMurluk.eatSnack();
		catMurluk.play();
		Cat catVaska = (Cat) context.getBean("catVaska");
		catVaska.mew();
		catVaska.eatSnack();
		catMurluk.play();
		WorkWithCats worker = (WorkWithCats) context.getBean("worker");
		// new WorkWithCats();
		Cat testCat = new Cat("Tom", 2);
		worker.saveCatToDb(testCat);
		System.out.println("Cat: " + worker.getCatById(31));
		WorkWithPerson workWithPerson = (WorkWithPerson) context.getBean("personsWorker");
		Person person = new Person();
		person.setName("Anastasia Mitinova");
		person.setCellphone("1234");
		person = workWithPerson.addPerson(person);
		person.setBirthDate(new Date(20));
		workWithPerson.savePerson(person);
		System.out.println(workWithPerson.getPersonById(1));

	}
}
