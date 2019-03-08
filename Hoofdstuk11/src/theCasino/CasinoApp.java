package theCasino;



public class CasinoApp {

	public static void main(String[] args) {
		//Deck deck = new Deck();
		//CardDealer.shuffleDeck(deck.getCards());
		//deck.setCards(CardDealer.shuffleDeck(deck.getCards()));
		
		//deck.printCardsDeck();
		
		//CardDealer.printCardDealed(CardDealer.dealCard(2));
		
		CardDealer cd = new CardDealer();
		cd.shuffleDeck();
		
		Deck d = cd.getDeck();
		d.printCardsDeck();
		System.out.println("*******************************");
		Card[] deal1 = cd.dealCard(2);
		CardDealer.printCardDealed(deal1);
		Card[] deal2 = cd.dealCard(2);
		CardDealer.printCardDealed(deal2);
	
		
	}

}
