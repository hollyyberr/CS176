
public class Instructor {
	/**
	   An instructor is represented by a name, a birth year, and a salary.
	   You must enter the class name, instance variable(s), and constructor below
	*/
	
	String inName;
	int birthyear;
	double income;

	Public Instructor extends Person(String name, int year, double salary) {
		inName = name;
		birthyear = year;
		income = salary;
	}




	   /**
	      Returns the string represention of the object.
	      @return a string representation of the object
	   */
	   public String toString()
	   {
	      return "Instructor[super=" + super.toString() + ",salary=" + income + "]";
	   }


}
