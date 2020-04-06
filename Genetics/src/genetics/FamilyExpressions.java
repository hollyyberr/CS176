package genetics;

public class FamilyExpressions extends Characteristics{
	
	//Create and initialize local variables
	public String[][] Expressions;
	public String[] Combinations;
	int five = 5;
	int four = 4;

	//Construct the family expressions
	public FamilyExpressions(String[] characters, String[][] expressions, String[] combos) {
		super(characters);
		Expressions = new String[five][four];
		Expressions = expressions;
		Combinations = new String[four];
		Combinations = combos;
	}
}
