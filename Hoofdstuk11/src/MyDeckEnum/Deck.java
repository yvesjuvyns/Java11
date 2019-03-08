package MyDeckEnum;

public class Deck {

	int cardCount = 0;

	Card[] cards = new Card[52];
	SuitType[] suits = SuitType.values();
	Value[] values = Value.values();

	{
		MakeDeck();
	}

	private void MakeDeck() {

		for (int i = 0; i < SuitType.values().length; i++) {

			for (int j = 0; j < Value.values().length; j++) {

				cards[cardCount] = new Card(suits[i], values[j]);

				System.out.println(cards[cardCount]);
			
				cardCount++;
			}

		}

	}

	public Card[] getDeck() {

		return cards;

	}

}
