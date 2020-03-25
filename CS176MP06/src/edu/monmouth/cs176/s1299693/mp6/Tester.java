package edu.monmouth.cs176.s1299693.mp6;

public class Tester {

	public static void main(String[] args) {
		//Constructs the students size 100
		StudentList StudentTester = new StudentList(100);
		StudentTester.addStudent("Holly", "Female", 20, "Computer Science ", 3.69);
		StudentTester.addStudent("Alex", "Male", 19, "Environmental Science ", 3.6);
		StudentTester.addStudent("Brandon", "Male", 22, "Criminal Justice", 3.0);
		StudentTester.addStudent("Susan", "Female", 25, "Psychology ", 3.5);
		StudentTester.addStudent("Joe", "Male", 21, "Mathematics ", 3.02);
		
		//Constructs the Instructor Size 100
		InstructorList InstructorTester = new InstructorList(100);
		InstructorTester.addInstructor("Gil Eckert", "Male", 50, "CSSE", "Specialist Professor");
		InstructorTester.addInstructor("Eugenio Cesario", "Male", 45, "CSSE", "Associate Professor");
		InstructorTester.addInstructor("Holly Bernich", "Female", 20, "Mathematics", "Assistant Professor");
		InstructorTester.addInstructor("John Doe", "Male", 30, "English", "Associate Professor");
		InstructorTester.addInstructor("Jane Doe", "Female", 40, "Psychology", "Chair Professor");
		
		System.out.println("Printed output for Student List: ");
		StudentTester.printStudents();
		System.out.println();
		System.out.println("Printed output for Instructor List: " );
		InstructorTester.printInstructors();
	}
	

}
