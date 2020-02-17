import java.util.Scanner;

public class IntegersClass {

	Scanner in = new Scanner(System.in);
	int count = 0;
	int[] integerArray;

	//create and initialize constructor
	public IntegersClass(int capacity) {
		count = capacity;
	}


	public void load() {
		int [] integers = new int[count];
		System.out.print("Enter an integer followed by 'enter' (or any letter to quit): ");
		count = 0;
		for (int i = 0; i < integers.length; i++) {
			if(in.hasNextInt()) {
				integers[i] = in.nextInt();
				count++;
			}
		}
		integerArray = new int[count];
		for (int i = 0; i < count; i++) {
			integerArray[i] = integers[i];
		}
	}

	//search method
	public boolean search(int Num) {
		boolean number = false;
		for (int i = 0; i < count; i++) {
			if (Num == integerArray[i]) {
				number = true;
			}
		}
		return number;
	}


	//finds max value
	public int findMax() {
		int maximum = Integer.MIN_VALUE;
		for (int i = 0; i < count; i++) {
			if (integerArray[i] > maximum) {
				maximum = integerArray[i];
			}
		}
		return maximum;
	}

	//finds min value
	public int findMin() {
		int minimum = Integer.MAX_VALUE;
		for (int i = 0; i < count; i++) {
			if (integerArray[i] < minimum) {
				minimum = integerArray[i];
			}
		}
		return minimum;
	}

	//finds max index
	public int findMaxPos() {
		int maximum = Integer.MIN_VALUE;
		int maxPos = 0;
		for (int i = 0; i < count; i++) {
			if (integerArray[i] > maximum) {
				maximum = integerArray[i];
				maxPos = i;
			}
		}
		return maxPos;
	}

	//finds min index
	public int findMinPos() {
		int minimum = Integer.MAX_VALUE;
		int minPos = 0;
		for (int i = 0; i < count; i++) {
			if (integerArray[i] > minimum) {
				minimum = integerArray[i];
				minPos = i;
			}
		}
		return minPos;
	}

}