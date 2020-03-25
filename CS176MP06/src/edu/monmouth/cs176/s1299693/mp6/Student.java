package edu.monmouth.cs176.s1299693.mp6;

public class Student extends  Person{

	String collegeMajor;
	double scanGPA;

	public Student (String name, String gender, int age, String major, double GPA) {
		super(name, gender, age);
		collegeMajor = major;
		scanGPA = GPA;
	}
//Method to print the data of the students
public void printStudent() {
	System.out.println("Name: " + this.getName() + " Gender: " + this.getGender() + " Age: " + this.getAge() + " Major: " + collegeMajor + " GPA: " + scanGPA);
}



}
