
public class StringTester {

	public static void main(String[] args) {
		//testing strings
		Strings Tester = new Strings();

		Tester.load();

		System.out.println("Is the string 'holly' in the array:  " + Tester.search("holly"));
		System.out.println("The max in the lexicographic ordering is: " + Tester.findMax());

		System.out.println("The min in the lexicographic ordering is: " + Tester.findMin());



		System.out.println("The longest string is: " + Tester.findLongest());
		//		

		System.out.println("The shortest string is: " + Tester.findShortest());

	}

}
