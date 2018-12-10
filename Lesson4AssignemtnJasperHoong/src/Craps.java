
public class Craps {

	
	public boolean playGames(int die1, int die2) {
		int sum = die1 + die2;
		
		switch(sum) {
		case 7:
		case 11:
			return true;
		case 2:
		case 12:
		case 3:
			return false;
		default:
			return true;
		}
		
	}

	
	
}
