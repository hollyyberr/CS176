package edu.monmouth.cs176.s1299693.mp6;

public class InstructorList {

	//Create and initialize the array of type Student
		Instructor[] instructorList;
		int count = 0; 
		
		public InstructorList(int capacity){
			instructorList = new Instructor[capacity];
		}
		
		//Add method which adds the student into the array
		public void addInstructor(String name, String gender, int age, String department, String rank) {
			Instructor newInstructor = new Instructor(name, gender, age, department, rank);
			instructorList[count] = newInstructor;
			count++;
		}
		//Print the instructors in the list
		public void printInstructors() {
			for (int i = 0; i < count; i++)
				instructorList[i].printInstructor();
		}
	}
