package edu.monmouth.cs176.s1299693.mp6;

public class Instructor extends Person {

	//Create and initialize local variables
	String scanName;
	String scanGender;
	int scanAge;
	String scanDepartment;
	String scanRank;

	//Create instructor constructor using the superclass
	public Instructor(String name, String gender, int age, String department, String rank) {
		super(name, gender, age);
		scanDepartment = department;
		scanRank = rank;

	}
	//print the instructors
	public void printInstructor() {

		System.out.println("Name: " + this.getName() + " Gender: " + this.getGender() + " Age: " + this.getAge() + " Department: " + scanDepartment + " Rank: " + scanRank);
	}


}


