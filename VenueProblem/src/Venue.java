import java.util.ArrayList;

public class Venue {
	private boolean[][][] allSeats;

	public Venue(int section, int row, int seats) {
		allSeats = new boolean[section][row][seats];
		for(int i = 0; i < section; i++) {
			for(int j = 0; j < row; j++) {
				for(int k = 0; k < seats; k++) {
					allSeats[i][j][k] = false;
				}
			}
		}
	}
	public boolean seatLookup(int sectionLookup, int rowLookup, int seatsLookup) {
		if(allSeats[sectionLookup-1][rowLookup-1][seatsLookup-1] == true) {
			return false;
		}
		else {
			if(allSeats[sectionLookup-1][rowLookup-1][seatsLookup-1] ==  false) {
				allSeats[sectionLookup-1][rowLookup-1][seatsLookup-1] = true;
			}
			return true;
		}
	}
}


