package com.mitinyova.people;

public class Person {
	private String name;

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
