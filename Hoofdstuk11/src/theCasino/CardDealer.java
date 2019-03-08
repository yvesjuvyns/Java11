package theCasino;

public class CardDealer {

	private Deck deck = new Deck();
	private Card[][] cards = deck.getCards();
	private int begin = 0;
	private int end = 0;
	private int posType = 0;
	private int posValue = 0;

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public Card[][] getCards() {
		return cards;
	}

	public void setCards(Card[][] cards) {
		this.cards = cards;
	}

	public void shuffleDeck() {

		int[] randNumber = Lottery.randNumbers52();
		int[] positions = new int[2];
		int count = 0;

		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards[0].length; j++) {

				positions = Tools.posTypeValue(randNumber[count++]);

				cards[positions[0]][positions[1]] = cards[i][j];
			}
		}

	}

	public Card[] dealCard(int amount) {
		int count = 0;

		Card[] cardsReceived = new Card[amount];
		end = (begin + amount-1);
		
		int[] beginLoop = Tools.posTypeValue(begin);
		int[] endLoop = Tools.posTypeValue(end);
		
		
		for (int i = beginLoop[0]; i <= endLoop[0]; i++) {
			for (int j = beginLoop[1]; j <= endLoop[1]; j++) {				
				cardsReceived[count++] = cards[i][j];				
			}

			
		}
		begin +=amount;

		return cardsReceived;
	}

	public static void printCardDealed(Card[] cardDealed) {
		for (int i = 0; i < cardDealed.length; i++) {
			System.out.println(cardDealed[i]);
		}

		// return true;
	}

}
