import java.util.Random;

public class RollDice {	
	public int roll() {
		Random sr = new Random();
		int value = 1 + sr.nextInt(6);
		return value;
	}
}
