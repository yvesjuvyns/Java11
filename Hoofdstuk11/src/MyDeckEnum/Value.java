package MyDeckEnum;

public enum Value {

	ACE("Ace", 0), TWO("Two", 1), THREE("Three", 2), FOUR("Four", 3), FIVE("Five", 4), SIX("Six", 5),
	SEVEN("Seven", 6), EIGHT("Eight", 7), NINE("Nine", 8), TEN("Ten", 9), JACK("Jack", 10), QUEEN("Queen", 11),
	KING("King", 12);

	private String name;
	private int Value;

	private Value(String name, int value) {
		this.name = name;
		Value = value;
	}

	public int getValue() {

		return Value;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Value[] GetValue(int j) {

		return null;

	}

}
