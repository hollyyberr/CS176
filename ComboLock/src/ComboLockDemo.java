import java.util.Scanner;

public class ComboLockDemo {

	public static void main(String[] args) {
		
		//Create and initialize scanner class
		Scanner scan = new Scanner(System.in);
		
		//Create Tester
		ComboLock Demo = new ComboLock(10,20,30);
		
		//Create and initialize local variables
		int zero = 0;
		int ticks = 0;
		int count = 0;
		int forty = 40;
		
		//Call the reset method
		Demo.reset();
	
		//Start loop for reading input
		System.out.println("Enter a number of ticks to turn to the right or any invalid number to quit: ");
		while(scan.hasNextInt()) {
			ticks = scan.nextInt();
			Demo.turnRight(ticks);
			count++;
			if(ticks > 0 && ticks < forty) {
				System.out.println("Enter a number of ticks to the left or any invalid number to quit: ");
				ticks = scan.nextInt();
				Demo.turnLeft(ticks);
				count++;
				System.out.print("Enter a number of ticks to the right or any invalid number to quit: ");
				ticks = scan.nextInt();
				Demo.turnRight(ticks);
				count++;
			}
			if(count == 3) {
				break;
			}
			else if(ticks < zero || ticks > forty) {
				break;
			}
		
		}
		
		System.out.println(Demo.open());

	}

}
