import java.util.Scanner;

public class Integers {
	Scanner scan = new Scanner(System.in);
	final int MAX_SIZE = 100;
	int count = 0;
	int input = 0;
	int max = 0;
	int min = 0;
	final int SENTINEL = -999;
	int [] integers;

	public Integers() {
		integers = new int[MAX_SIZE];
	}
	public void load () {
		System.out.println("Enter a series of integers and -999 to finish: ");

		while (scan.hasNextInt()) {
			input = scan.nextInt();
			if (input == SENTINEL) {
				break;
			} 
			else {
				integers[count] = input;
				count++;
			}
		}
	}
	public boolean search(int Num) {
		boolean found = false;
		for (int i = 0; i < count; i++) {
			if(integers[i] == Num)
				found = true;
		}
		return found;
	}
	public  int findMax() {
		max = 0;
		for (int i = 0; i <= count; i++) {
			if (i == 0)
				max = integers[i];
			else {
				if (integers[i] > max)
					max = integers[i];
			}	
		} 
		return max;
	}
	public int findMin() {
		min = 0;
		for (int i = 0; i < count; i++) {
			if (i == 0)
				min = integers[i];
			else {
				if (integers[i] < min)
					min = integers[i];
			}

		} 
		return min;
	}
	public int findMaxPos() {
		int max = Integer.MIN_VALUE;
		int maxPos = 0;
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] > max) {
				max = integers[i];
				maxPos = i;
			}
		}
		return maxPos;
	}
	public int findMinPos() {
		int min = Integer.MAX_VALUE;
		int minPos = 0;
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] > min) {
				min = integers[i];
				minPos = i;
			}
		}
		return minPos;
	}

}