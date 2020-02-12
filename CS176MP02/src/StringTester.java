
public class StringTester {

	public static void main(String[] args) {
		//testing strings
		Strings Tester = new Strings();
		String arbitraryArray = "AA";
		boolean array = false;

		Tester.load();
		String longest = " ";
		String shortest = " ";
		
		array = Tester.search(arbitraryArray);
		if (array == true)
			System.out.println("The string " + arbitraryArray + " is in the array.");
		else
			System.out.println("The string " + arbitraryArray + " is not in the array.");
		
		Tester.findMax();
		Tester.findMin();
		
		longest = Tester.findLongest();
		System.out.println("The longest string is: " + longest);
		
		shortest = Tester.findShortest();
		System.out.println("The shortest string is: " + shortest);

	}

}
