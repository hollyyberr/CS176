import java.util.Scanner;

public class ComboLockDemo {

	public static void main(String[] args) {
		
		//Create and initialize scanner class
		Scanner scan = new Scanner(System.in);
		
		//Create Tester
		ComboLock Demo = new ComboLock(10,20,30);
		
		//Create and initialize local variables
		int zero = 0;
		int turn = 0;
		int count = 0;
		int thirtyNine = 39;
		
		Demo.reset();
		
		
	
		
		
		//Start loop for reading input
		System.out.println("Enter a number of ticks to turn to the right or any invalid number to quit: ");
		while(scan.hasNextInt()) {
			turn = scan.nextInt();
			Demo.turnRight(30);
			if(turn > 0 && turn < thirtyNine) {
				count++;
				System.out.println("Enter a number of ticks to the left or any invalid number to quit: ");
				turn = scan.nextInt();
				Demo.turnLeft(10);
				count++;
				System.out.print("Enter a number of ticks to the right or any invalid number to quit: ");
				turn = scan.nextInt();
				Demo.turnRight(30);
				count++;
				Demo.open();
			}
			if(count == 3) {
				break;
			}
			else if(turn < zero || turn > thirtyNine) {
				break;
			}
		}

	}

}
