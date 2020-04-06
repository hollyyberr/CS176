package genetics;
public class Mother extends FamilyExpressions {

	//Create and initialize local variables
	public String [] mGenes;
	public String mName;
	int five  = 5;
	
	//Create constructor for the mother
 	public Mother(String[] characters, String[][] expressions, String[] combos) {
		super(characters, expressions, combos);
		mGenes = new String[five];
	}
 	public void motherName(String scanName) {
 	mName = scanName;
 	}
}
