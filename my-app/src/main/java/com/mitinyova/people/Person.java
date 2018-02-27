package com.mitinyova.people;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="persons")
public class Person {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="cell_phone")
	private String cellphone;
	    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public Person(String name) {
		this.name = name;
	}
	
	public Person() {
		
	}

	public void scream() {
		System.out.println(name + ": \"Oh, I see mouse!!!!!\"");
	}

	public void commandCatch() {
		System.out.println(name + ": \"Catch mouse immediately!\"");
	}

	public void reactWhenCatched() {
		System.out.println(name + ": \"Great! Mouse was caught and eaten by cat!\"");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
