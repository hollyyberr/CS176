package edu.monmouth.cs176.s1299693.mp4;

import java.util.ArrayList;

public class StringsSequence {

	private ArrayList<String> strings;
	//Create and initialize constructor and the array list 
	public StringsSequence() {
		strings = new ArrayList<String>();
	}
	//Create and initialize the add method
	public void add(String string) {
		strings.add(string);
	}
	//Create and initialize toString method
	public String toString(){
		return strings.toString();
	}
	//Create Sequences Constructor
	public StringsSequence append(StringsSequence other) {
		StringsSequence Appended = new StringsSequence();
		Appended.strings.addAll(strings);
		Appended.strings.addAll(other.strings);
		return Appended;
	}
}
