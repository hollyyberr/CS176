package edu.monmouth.cs176.s1299693.mp5;


public class Person {
	private String name;
	private int age;
	private double weight;
	private double height;
	private String gender;
	//Create and initialize constructor passing 5 parameters
	public Person(String scanName, String scanGender, double scanHeight, double scanWeight, int scanAge) {
		name = scanName;
		gender = scanGender;
		height = scanHeight;
		weight = scanWeight;
		age = scanAge;
		
	}
	//Create method to return name
	public String name() {
		return name;
	}
	//Create method to return gender
	public String gender() {
		return gender;
	}
	//Create method to return height
	public double height() {
		return height;
	}
	//Create method to return weight
	public double weight() {
		return weight;
	}
	//Create method to return age
	public int age() {
		return age;
	}
	//Print method to print these values from previous methods
	public void printData() {
		System.out.println("The tallest person's information is: Name: " + name + " Gender: " + gender + " Height: " + height + " Weight: " + weight + " Age " + age);
	}
}
