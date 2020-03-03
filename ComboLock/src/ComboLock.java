import java.util.Scanner;

public class ComboLock {
	//Declare and initialize local variables
	boolean open = false;
	private int current = 0;
	private int correct;
	private int correct2;
	private int correct3;
	private boolean zero = false;
	private boolean one = false;
	private boolean two = false;
	private boolean three = false;
	private int turn = 0;

	//Declare and initialize combo lock constructor
	public ComboLock(int secret, int secret2, int secret3) {

		correct = secret;
		correct2 = secret2;
		correct3 = secret3;
	}
	public void reset() {
		turn = 0;
		one = false;
		two = false;
		three = false;
	}
	
	//Checks to see if the second position is true and adjusts the tick marks
	public void turnLeft(int ticks) {
		turn = turn + 1;
		current = ((current + ticks) + 40) % 40;
		System.out.println("Current position is: " + current);
		if(turn == 2 && current == correct2){
			two = true;
		}
	}
	public void turnRight(int ticks) {
		//Check if first position is true and adjusts the tick marks
		turn = turn + 1;
		current = ((current - ticks) + 40) % 40;
		System.out.println("Current position is: " + current);
		if(turn == 1 && current == correct){
			one = true;
		}
		//Checks if third position is true and adjusts the tick marks
		if(turn == 3 && current == correct3){
			three = true;
		}
	}
	
	//If all conditions are met; opens the lock
	public boolean open() {
		if(one == true && two == true && three == true) {
			open = true;
			System.out.println("The lock has been successfully opened, congratulations!");
		}
		else {
			open = false;
		}
		return open;
	}

}
