package theCasino;

public class Card {
	SuitType suit;
	Value value;
	
public Card(SuitType suit ,Value value ) {
	this.suit = suit;
	this.value = value;
}

@Override
public String toString() {
	return "Card [suit=" + suit + ", value=" + value + "]";
}


}
