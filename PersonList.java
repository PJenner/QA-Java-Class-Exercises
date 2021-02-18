package com.bae.person;

import java.util.ArrayList;

public class PersonList {

	private ArrayList<Person> people = new ArrayList<>();

	public Person findPersonByName(String name) {
		for (Person person : people) {
			if (person.name == name) {
				return person;
			}
		}
		System.out.println("Could not find person with name");
		return null;
	}

	public void addPerson(Person person) {
		people.add(person);
	}
}
