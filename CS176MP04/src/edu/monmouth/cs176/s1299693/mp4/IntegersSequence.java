package edu.monmouth.cs176.s1299693.mp4;

import java.util.ArrayList;

public class IntegersSequence {
	
	//Declare and initialize local variables
	private ArrayList<Integer> values;
	
	//Create and initialize constructor and the array list 
	public IntegersSequence() {
		values = new ArrayList<Integer>();
	}
	//Create and initialize the add method
	public void add(int number) {
		values.add(number);
	}
	//Create and initialize toString method
	public String toString(){
		return values.toString();
		}
	public IntegersSequence append(IntegersSequence other) {
		IntegersSequence Appended = new IntegersSequence();
		Appended.values.addAll(values);
		Appended.values.addAll(other.values);
		return Appended;
	}
}
