import java.util.Arrays;
import java.util.Scanner;
public class Strings {
	//create and initialize local scanner
	Scanner scan = new Scanner(System.in);

	//create and initialize local variables
	int count = 0;
	final int MAX_SIZE = 100;
	final String BREAK = "DONE";
	String input;
	String max = "";
	String min = "";
	int one = 1;
	int zero = 0;
	String multipleShortest;
	String [] strings;
	boolean done = false;



	//creates the class 1 constructor
	public Strings()
	{
		strings = new String[MAX_SIZE];
	}

	//Load method calling the scanner and prompts user to enter strings
	public void load() {
		System.out.print("Enter a series of strings or -'DONE' to stop: ");

		while(done == false) {
			input = scan.next();
			if(input.equals("DONE")) {
				done = true;
				count--;
			}
			else {
				strings[count] = input;
				count++;
			}
		}
		//System.out.print(Arrays.toString(strings));
	}




	//search method to check if word is in the array
	public boolean search(String array) {
		boolean exists = false;
		for (int i = 0; i <= count; i++) {
			if (strings[i].contentEquals(array))
				exists = true;
		}
		return exists;
	}

	//find and print max function
	public String findMin(){
		for(int i = 0; i <= count; i++) {
			if(i == zero) {
				min = strings[i];
			}
			else {
				if(strings[i].compareTo(min) < 0) {
					min = strings[i];
				}
			}
		}
		return min;
	}

	//find and print min function
	public String findMax() {
		for(int i = 0; i <= count; i++) {
			if(i == 0) {
				max = strings[i];
			}
			else{
				if(strings[i].compareTo(max) > 0) {
					max = strings[i];
				}
			}
		}
		return max;
	}


	////method for finding the longest string
	public String findLongest() {
		String longest = strings[0];
		for(int i = one; i <= count; i++) {
			if(strings[i].length() > longest.length()) {
				longest = strings[i];
			}

		}
		return longest;
	}


	//method for finding the shortest of the strings
	public String findShortest() {
		String shortest = strings[0];
		for(int i = one; i <= count; i++) {
			if(strings[i].length() < shortest.length()) {
				shortest = strings[i];
			}

		}
		return shortest;
	}
}
////prints the content of the array
//public void print() {
//	boolean print = false;
//	while(print == false) {
//		if(count >= zero) {
//			input = strings[count];
//			System.out.println(input);
//			count--;
//		}
//		else {
//			print = true;
//		}
//	}
//}
//}
//
