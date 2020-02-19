public class IntegersClassTester {

	public static void main(String[] args) {
		
		Integers IntegersTester = new Integers();

		IntegersTester.load();
		IntegersTester.search(1);
		IntegersTester.findMax();
		IntegersTester.findMin();
		IntegersTester.findMaxPos();
		IntegersTester.findMinPos();

		System.out.println("Was the number in the search found: " + IntegersTester.search(5));
		System.out.println("The maximum value in the array is: " + IntegersTester.findMax());
		System.out.println("The minimum value in the array is: " + IntegersTester.findMin());
		System.out.println("The maximum value index position is: " + IntegersTester.findMaxPos());
		System.out.print("The minimum value index position is: " + IntegersTester.findMinPos());

	}

}