package com.bae.person;

import java.util.Scanner;

public class Person {

	public String name;
	public int age;
	public String jobTitle;

	// Constructor
	public Person(int age, String name, String jobTitle) {
		this.age = age;
		this.name = name;
		this.jobTitle = jobTitle;
	}

	// Greeting Method
	public String greeting() {
		return "Hi! My name is " + name + " and my age is " + age + ". I work as a " + jobTitle + ".";
	}

	// Conversation Method
	public void conversation(Person person) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Hi! My name is " + name + ". What is your name?");
		String userName = myObj.nextLine();
		System.out.println("Hi " + userName + ". It's great to meet you. How old are you?");
		int userAge = myObj.nextInt();
		System.out.println("Wow! " + userAge + " is not too far from my own age. I'm " + age + ".");

	}

}
