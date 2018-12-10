
public class CardDeckTest {

	public static void main(String[] args) {
		CardDeck myCardDeck = new CardDeck();
		myCardDeck.shuffle();
		//Creating two players
		Card[] player = new Card[2];
		player[0] = myCardDeck.dealCard();
		player[1] = myCardDeck.dealCard();
		System.out.println("Player 1: " + player[0] );
		System.out.println("Player 2: " + player[1]);

	}

}
