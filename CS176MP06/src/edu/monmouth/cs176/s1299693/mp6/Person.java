package edu.monmouth.cs176.s1299693.mp6;

public class Person {
	/**
	   A person is represented by the name and a birth year.
	   You must enter the class name, instance variable(s), and constructor below
	 */
	String scanName;
	String scanGender;
	int scanAge;

	public Person(String name, String gender, int age) {

		scanName = name;
		scanAge = age;
		scanGender = gender;

	}



	/**
	      Returns the string representation of the object.
	      @return a string representation of the object
	 */
	public String getName(){
		return (scanName);
	}
	public String getGender() {
		return (scanGender);
	}
	public int getAge() {
		return scanAge;
	}


}


