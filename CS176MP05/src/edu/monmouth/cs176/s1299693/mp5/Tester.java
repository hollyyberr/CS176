package edu.monmouth.cs176.s1299693.mp5;

public class Tester {

	public static void main(String[] args) {

		//Constructs a person
		Person Person1 = new Person("Holly;", "Female;", 5.5, 170, 20);
		Person Person2 = new Person("Alex;", "Male;", 5.9, 180, 23);
		Person Person3 = new Person("Brandon;", "Male;", 6.0, 160, 21);
		Person Person4 = new Person("Susan;", "Female;", 4.8, 130, 53);
		Person Person5 = new Person("Joe;", "Male;", 5.9, 150, 25);

		PersonList1 PersonList1Tester = new PersonList1(100);
		PersonList1Tester.addPerson1(Person1);
		PersonList1Tester.addPerson1(Person2);
		PersonList1Tester.addPerson1(Person3);
		PersonList1Tester.addPerson1(Person4);
		PersonList1Tester.addPerson1(Person5);

		PersonList2 PersonList2Tester = new PersonList2();

		PersonList2Tester.addPerson2(Person1);
		PersonList2Tester.addPerson2(Person2);
		PersonList2Tester.addPerson2(Person3);
		PersonList2Tester.addPerson2(Person4);
		PersonList2Tester.addPerson2(Person5);
		
		System.out.print("The tallest person in the array is: ");
		PersonList1Tester.ReturnTallestPerson1().printData();
		System.out.print("The tallest person in the array list is: ");
		PersonList2Tester.ReturnTallestPerson2().printData();
	}

}
