
public class Person {
	/**
	   A person is represented by the name and a birth year.
	   You must enter the class name, instance variable(s), and constructor below
	*/
	String inName;
	int birthyear
	
	public Person(String name, int year) {
		
		inName = name;
		birthyear = year;
		
	}



	/**
	      Returns the string representation of the object.
	      @return a string representation of the object
	*/
	   public String toString()
	   {
	      return "Person[name=" + inName + ",birthYear=" + birthyear + "]";
	   }


}
