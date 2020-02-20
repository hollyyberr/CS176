package edu.monmouth.cs176.s1299693.mp4;

public class Tester {

	public static void main(String[] args) {
		
		//Call integers Sequences
		IntegersSequence IntegersSequence1 = new IntegersSequence();
		IntegersSequence IntegersSequence2 = new IntegersSequence();
		IntegersSequence IntegersSequence3 = new IntegersSequence();

		//Call Strings Sequences
		StringsSequence StringsSequence1 = new StringsSequence();
		StringsSequence StringsSequence2 = new StringsSequence();
		StringsSequence StringsSequence3 = new StringsSequence();

		//Add to the integers array lists
		IntegersSequence1.add(1);
		IntegersSequence1.add(4);
		IntegersSequence1.add(9);
		IntegersSequence1.add(16);

		//Add integers list 2
		IntegersSequence2.add(9);
		IntegersSequence2.add(7);
		IntegersSequence2.add(4);
		IntegersSequence2.add(9);
		IntegersSequence2.add(11);

		//append the lists
		IntegersSequence3 = IntegersSequence1.append(IntegersSequence2);

		//print the new list and the old lists unchanged
		System.out.println("Sequence 3: " + IntegersSequence3.toString());
		System.out.println("Sequence 1 Unchanged: " + IntegersSequence1.toString());
		System.out.println("Sequence 2 Unchanged: " + IntegersSequence2.toString());
		System.out.println();

		//add strings to the sequences
		StringsSequence1.add("Holly");
		StringsSequence1.add("Bernich");
		StringsSequence1.add("Sophomore");
		StringsSequence1.add("s1299693");
		
		//add strings to second sequences
		StringsSequence2.add("School: Monmouth University");
		StringsSequence2.add("Major: Computer Science");
		StringsSequence2.add("Minor: Mathematics");
		StringsSequence2.add("Interests: Technology, punk music, cryptography, anarchy");
		StringsSequence2.add("Age: 20");
		
		//append the sequences into sequence 3
		StringsSequence3 = StringsSequence1.append(StringsSequence2);
		
		//print sequences
		System.out.println("Sequence 3: " + StringsSequence3.toString());
		System.out.println("Sequence 1 Unchanged: " + StringsSequence1.toString());
		System.out.println("Sequence 2 Unchanged: " + StringsSequence2.toString());


	}

}
