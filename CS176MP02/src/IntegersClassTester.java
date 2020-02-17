

public class IntegersClassTester {

	public static void main(String[] args) {
		
		IntegersClass class2test = new IntegersClass(100);

		class2test.load();
		class2test.search(1);
		class2test.findMax();
		class2test.findMin();
		class2test.findMaxPos();
		class2test.findMinPos();

		System.out.println("Was the number in the search found: " + class2test.search(5));
		System.out.println("The maximum value in the array is: " + class2test.findMax());
		System.out.println("The minimum value in the array is: " + class2test.findMin());
		System.out.println("The maximum value index position is: " + class2test.findMaxPos());
		System.out.print("The minimum value index position is: " + class2test.findMinPos());

	}

}