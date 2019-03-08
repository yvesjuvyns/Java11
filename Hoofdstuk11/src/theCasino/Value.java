package theCasino;

public enum Value {
	ACE(0),TWO(1),THREE(2),FOUR(3),FIVE(4),SIX(5),
	SEVEN(6),EIGHT(7),NINE(8),TEN(9),
	JACK(10),QUEEN(11),KING(12);
	
	int order;
	Value(int order){
		this.order = order;
	}
	public int getOrder() {
		return order;
	}
	public boolean Compare(int i) {
		return order == i;
	}

	public static Value GetValue(int _id) {
		Value output = null;
		Value[] As = Value.values();
		for (int i = 0; i < As.length; i++) {
			if (As[i].Compare(_id))
				return output = As[i];
		}
		return output;
	}

}
