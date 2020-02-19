import java.util.Random;

public class VenueTester {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int one = 1;
		final int SENTINEL = 100;
		int section = 0;
		int row = 0;
		int seat = 0;
		int count = 0;
		Venue PrudentialCenter = new Venue(4,5,10);
		
		while(count!= SENTINEL){
			section = rand.nextInt(4) + one;
			row = rand.nextInt(5) + one;
			seat = rand.nextInt(10) + one;
			if(PrudentialCenter.seatLookup(section,row,seat) == true) {
				System.out.println("Your seat has been awarded! Your seat location is: Section; " + section + "; Row: " + row + "; Seat: " + seat + ".");
				count++;
				
				}
			else if((PrudentialCenter.seatLookup(section,row,seat) == false)) {
				System.out.println("You did not win an awarded seat, better luck next time!");
			}
			
		}
		System.out.print("Awards: " + count);
	}
}
