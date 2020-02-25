package edu.monmouth.cs176.s1299693.mp5;

import java.util.Scanner;

public class PersonList1 {

	//Create and initialize scanner
	Scanner scan = new Scanner(System.in);
	int count  = 0;

	//Create string type person
	Person [] person;

	//Create and initialize constructor and declare person array
	public PersonList1(int capacity){
		person = new Person[capacity];
	}
	//Add method which adds the person into the array
	public void addPerson1(Person scanPerson) {
		{
			person[count] = scanPerson;
			count++;

		}
	}
	//Return tallest double method
	public Person ReturnTallestPerson1() {
		Person tallest = person[0];
		for(int i = 0; i < count; i++) {
			if(person[i].height() > tallest.height()) {
				tallest = person[i];
			}
		}
		return tallest;
	}
	//Create and initialize print method to print output
	public void printPersonList1() {
		for(int i = 0; i < count; i++) {
			System.out.print((person.toString()));
		}
		
	}

}
