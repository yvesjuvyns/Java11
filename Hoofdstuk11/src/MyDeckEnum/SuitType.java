package MyDeckEnum;

public enum SuitType {

	CLUBS(1), DIAMONDS(2), SPADES(3), HEARTS(4);

	private int value;

	private SuitType(int value) {
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static SuitType[] GetValue(int i) {

		return null;
	}

}
