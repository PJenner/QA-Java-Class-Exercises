package com.bae.person;

public class PersonApp {

	public static void main(String[] args) {

		Person Smith = new Person(22, "Smith", "window cleaner");

		Person John = new Person(34, "John", "police officer");

		Person Sarah = new Person(24, "Sarah", "line manager");

		System.out.println(Smith.greeting());
		System.out.println(John.greeting());
		System.out.println(Sarah.greeting());

		Smith.conversation(Smith);

	}

}
