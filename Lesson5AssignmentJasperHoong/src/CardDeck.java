import java.security.SecureRandom;

public class CardDeck {
	private static final SecureRandom sr = new SecureRandom();
	private Card[] deck = new Card[52];
	private int currentcard = 0;
	public CardDeck(){
		String[] faces = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		String[] suits = {"Diamonds","Hearts","Spades","Clubs"};
		for(int i = 0; i < deck.length; i++	) {
			deck[i] = new Card(faces[i%13], suits[i/13]);
		}
	}
	public Card dealCard() {
		if(currentcard < deck.length) {
			return deck[currentcard++];
		}else {
			return null;
		}
	}

	public void shuffle() {
		currentcard = 0;
		for (int f = 0; f < deck.length; f++ ) {
			int s = sr.nextInt(52);
			Card temp = deck[f];
			deck[f] = deck[s];
			deck[s] = temp;
		}
	}

	

}
