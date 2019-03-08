package MyDeckEnum;

import java.util.Arrays;

public class Card {

	private SuitType suit;
	private Value value;

	public Card() {

	}

	public Card(SuitType suit, Value value) {

		this.suit = suit;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", value=" + value + "]";
	}

}
