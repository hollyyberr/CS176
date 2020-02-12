import java.util.Scanner;
public class Strings {
	//create and initialize local scanner
	Scanner scan = new Scanner(System.in);

	//create and initialize local variables
	int count = 0;
	final int MAX_SIZE = 100;
	private String [] strings;
	final String BREAK = "DONE";
	String input;
	String max = "";
	String min = "";
	int one = 1;
	int zero = 0;
	int shortCount = 0;
	String multipleShortest;



	//creates the class 1 constructor
	public Strings()
	{
		strings = new String [MAX_SIZE];
	}

	//Load method calling the scanner and prompts user to enter strings
	public void load() {
		System.out.print("Enter a series of strings or -'DONE' to stop: ");

		while(scan.hasNext()) {
			input = scan.next();
			if(input.equals(BREAK)) {
				count--;
				break;
			}

			else {
				strings[count] = input;
				if(count == one) {
					if(strings[count].compareTo(strings[count - one]) == zero) {
						max = strings[count];
						min = strings[count - one];
						count++;
					}
					else {
						min =strings[count - one];
						max = strings[count];
						count++;
					}
				}//if
				else if (count > one) {
					if (strings[count].compareTo(min) < zero){
						min = strings[count];
					}//if
					if (strings[count].compareTo(max) > zero){
						max = strings[count];
					}
					count++;
				}
				else
					count++;
			}
		}
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
	public void findMax(){
		System.out.println("The max of this set of strings is: " + max);
	}
	//find and print min function
	public void findMin() {
		System.out.println("The min of this set of strings is: " + min); 
	}
	//method for finding the longest string
	public String findLongest() {
		String longest = "";
		for(int i = zero; i < count; i++) {
			if(strings[i].length() > longest.length()) {
				longest = strings[i];
			}

		}
		return longest;
	}

	//method for finding the shortest of the strings
	public String findShortest() {
		String shortest = "";
		for(int i = zero; i < count; i++) {
			if (i == 0) {
				shortest = strings[i];
				shortCount++;
				multipleShortest = strings[i];
			}
			else if (strings[i].length() < shortest.length()) {
				shortest = strings[i];
				count++;
			}
			else if (strings[i].length() == shortest.length()) {
				multipleShortest = multipleShortest + ", and " + strings[i];
				shortCount++;
			}
		}
		if (shortCount == 1)
			return shortest;
		else
			return multipleShortest;
	}

	//prints the content of the array
	public void print() {
		boolean print = false;
		while(print == false) {
			if(count >= zero) {
				input = strings[count];
				System.out.println(input);
				count--;
			}
			else {
				print = true;
			}
		}
	}
}

