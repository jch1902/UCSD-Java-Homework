import java.util.Random;

public class CrapsTest {

	public static void main(String[] args) {
		System.out.println("Simulation of Game of Craps");
		RollDice rollDice = new RollDice();
		Craps craps = new Craps();
		int die1 = rollDice.roll();
		int die2 = rollDice.roll();
		int sum = die1 + die2;
	
		System.out.println(die1 + " " + die2);
		
		boolean win = craps.playGames(die1, die2);

		
		if(win == true) {
			System.out.println("YOU WIN!");
			
		}else {
			System.out.println("Next time!");
		}		
		

	}

}
