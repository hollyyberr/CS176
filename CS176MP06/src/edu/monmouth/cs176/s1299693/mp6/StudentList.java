package edu.monmouth.cs176.s1299693.mp6;

public class StudentList {

	//Create and initialize the array of type Student
	Student[] studentList;
	int count = 0; 
	
	public StudentList(int capacity){
		studentList = new Student[capacity];
	}
	
	//Add method which adds the student into the array
	public void addStudent(String name, String gender, int age, String major, double GPA) {
		Student newStudent = new Student(name, gender, age, major, GPA);
		studentList[count] = newStudent;
		count++;
	}
	//Print the students in the list
	public void printStudents() {
		for (int i = 0; i < count; i++)
			studentList[i].printStudent();
	}
}
