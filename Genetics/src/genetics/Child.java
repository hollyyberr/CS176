package genetics;
import java.util.Random;
import java.util.Scanner;

public class Child {


	public static String nameGenerator(String scanGender) {
		String name;
		Random Generator = new Random();
		String[] maleName = { "Alex", "Brandon", "Frank", "Paul", "Roger", "Luke", "Joe", "John", "Mark",
		"Tom" };
		String[] femaleName = { "Holly", "Isabella", "Veronica", "Susan", "Jackie", "Sara", "Silvana", "Loredana", "Sam",
		"Tara" };
		int index = Generator.nextInt(9);
		if (scanGender.equals("Male"))
			name = maleName[index];
		else
			name = femaleName[index];
		return name;
	}
	public static String pronoun(String scanName){
		String pronoun = "She";
		String[] maleNames = { "Alex", "Brandon", "Frank", "Paul", "Roger", "Luke", "Joe", "John", "Mark",
		"Tom" };
		for (int i = 0; i < maleNames.length; i++) {
			if (maleNames[i].equals(scanName))
				pronoun = " He ";
		}
		return pronoun;
	}

	public static String[] geneGeneration() {
		int one = 1;
		int hundred = 100;
		int fifty = 50;
		String[] parents = new String[5];
		Random Generator = new Random();
		for (int i = 0; i < parents.length; i++) {
			int gene = Generator.nextInt(hundred) + one;
			if (gene <= fifty) {
				parents[i] = "D";
			}
			else
				parents[i] = "R";
		} 
		return parents;
	}

	public static String[] childGenes(String[] scanMother, String[] scanFather) {
		int five = 5;
		String[] childGenes = new String[five];
		for (int i = 0; i < five; i++) {
			childGenes[i] = scanMother[i] + scanFather[i];
		}
		return childGenes;
	}

	public static int expression(String[] child, String[] combination, int characteristic) {
		int slot = 0;
		for (int i = 0; i < combination.length; i++) {
			if (child[characteristic].equals(combination[i]))
				slot = i;
		} 
		return slot;
	}

	public static String gender(String[] genes) {
		if (genes[3].equals("DD") || genes[3].equals("RD")) {
			return "Male";
		} else
			return "Female";
	}

	public static String vision(String[] scanChildGenes, String[] scanCombination, String[][] scanExpression) {
		String output = null;
		if (expression(scanChildGenes, scanCombination, 4) == 0) {
			output = "normal vision";
		}
		else if (expression(scanChildGenes, scanCombination, 4) == 1
				|| (expression(scanChildGenes, scanCombination, 4) == 2))
			output = scanExpression[4][expression(scanChildGenes, scanCombination, 4)];
		else
			output =  scanExpression[4][expression(scanChildGenes, scanCombination, 4)];
		return output;

	}


	public static void main(String[] args) {
		//Initialize scanner
		Scanner scan = new Scanner(System.in);

		//Create and initialize local variables
		String input = null;
		boolean complete = false;
		String [] child = new String[5];
		String[][] expressions = { { "Brown", "Blue", "Green", "Grey" }, { "Brown", "Black", "Blonde", "Red" },
				{ "Male", "Female", "Female", "Male" }, { "6 foot 5 inches", "6 foot", "5 foot 5 inches", "5 foot" },
				{ "normal-sighted", "near-sighted", "far-sighted", "color-blind" } };
		String[] combos = { "DD", "RR", "DR", "RD" };
		String[] characteristics = { "Eye Color", "Hair Color", "Sex", "Height", "Vision" };

		//Construct the parents
		Mother mother = new Mother(characteristics, expressions, combos);
		Father father = new Father(characteristics, expressions, combos);

		boolean alternate = true;

		//Loop to print the data of the child
		while(complete == false){
			mother.motherName(nameGenerator("Female"));
			mother.mGenes = geneGeneration();
			father.fatherName(nameGenerator("Male"));
			father.fGenes = geneGeneration();
			child = childGenes(mother.mGenes, father.fGenes);
			String childName = nameGenerator(gender(child));
			System.out.println("Name: " + childName);
			System.out.println("Parents Names: " + mother.mName + " and " + father.fName);
			System.out.println("Eye Color: " + expressions[0][expression(child, combos, 0)]);
			System.out.println("Hair Color: " + expressions[1][expression(child, combos, 1)]); 
			System.out.println("Height: " + expressions[3][expression(child, combos, 3)]);
			System.out.print("Vision: " + vision(child, combos, expressions));
			System.out.println();
			System.out.println();

			//While loop to check if they want to do the simulation again
			System.out.println("Would you like to repeat the process and make a new child? Please type 'Y' or 'N': ");
			input = scan.next();
			if (input.equals("Y")) {
				complete = false;
			}
			else if (input.equals("N")) {
				complete = true;
				System.out.println("Simulation Complete!");
			}
		}
		System.out.println();
	}
}
