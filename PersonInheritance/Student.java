
public class Student {

	/**
	   A student is represented by the name, birth year, and major.
	   You must enter the class name, instance variable(s), and constructor below
	*/
	String inName;
	int birthyear;
	String collegeMajor;
	
	public Student extends Person(String name, int year, String major) {
		inName = name
		birthyear = year;
		collegeMajor = major;
	}



	   /**
	      Returns the string representation of the object.
	      @return a string representation of the object
	   */
	   public String toString()
	   {
	      return "Student[super=" + super.toString() + ",major=" + collegeMajor + "]";
	   }

}
