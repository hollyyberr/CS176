package edu.monmouth.cs176.s1299693.mp5;

import java.util.ArrayList;

public class PersonList2 {

	ArrayList<Person> newPerson;

	public PersonList2() {
		newPerson = new ArrayList<Person>();
	}
	public void addPerson2(Person scanPerson) {
		newPerson.add(scanPerson);
	}
	public Person ReturnTallestPerson2() {
		Person tallest = newPerson.get(0);
		for(int i = 0; i < newPerson.size(); i++) {	
			if(newPerson.get(i).height() > tallest.height()) {
				tallest = newPerson.get(i);


			}
		}
		return tallest;
	}
	public void printPersonList2() {
        }
	}