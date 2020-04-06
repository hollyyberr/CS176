package genetics;
public class Father extends FamilyExpressions{
	
	//Create and initialize local variables
	public String fName;
	public String [] fGenes;
	int five = 5;
	
	//Create the father constructor extending family expressions
	public Father(String[] characters, String[][] expressions, String[] combos) {
		super(characters, expressions, combos);
		fGenes = new String [five];
	}
	public void fatherName(String scanName) {
		fName = scanName;
	}
}
