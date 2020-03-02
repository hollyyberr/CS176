import java.util.Scanner;

public class ComboLock {
	boolean open = false;
	private int current = 0;
	private boolean zero = false;
	private boolean one = false;
	private boolean two = false;
	private boolean three = false;

	private int secret; 
	private int secret2; 
	private int secret3; 

	public ComboLock(int secret, int secret2, int secret3) {


	}
	public void reset() {
		zero = true;
		one = false;
		two = false;
		three = false;
	}
	
	//Checks to see if the second position is true and adjusts the tick marks
	public void turnLeft(int ticks) {
		if(two == true){
			current = (current + ticks) % 40;
		}
		if(current == secret2){
			two = true;
			zero = false;
		}
		else{
			two = false; 
		}
	}

	public void turnRight(int ticks) {
		//Check if first position is true and adjusts the tick marks
		if(one == true){
			current = (current + ticks) % 40;
		}
		if(current == secret){
			one = true; 
			zero = false;
		}
		else{
			one = false; 
		}

		//Checks if third position is true and adjusts the tick marks
		if(three == true){
			current = (current + ticks) % 40;
		}
		if(current == secret3){
			three = true; 
			zero = false;
		}
		else{
			three = false; 
		}
	}
	
	//If all conditions are met; opens the lock
	public boolean open() {
		if(one == true && two == true && three == true) {
			open = true;
			System.out.print("The lock has been successfully opened, congratulations!");
			return true;
		}
		else {
			open = false;
			return false;
		}
	}

}
