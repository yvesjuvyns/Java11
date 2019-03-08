package theCasino;

public class Deck {

	private Card[][] cards = new Card[4][13];
	
	{
		MakeDeck();
	}
	
	Deck(){
		
	}
	
	
	

	public Card[][] getCards() {
		return cards;
	}




	public void setCards(Card[][] cards) {
		this.cards = cards;
	}


public void printCardsDeck() {
		
		for(int i= 0; i<this.cards.length;i++) {
			for(int j = 0; j<this.cards[0].length; j++) {
				System.out.println(this.cards[i][j]);
			}
			
		}
	}

//	public void printCardsDeck(Card[][] packet) {
//		
//		for(int i= 0; i<packet.length;i++) {
//			for(int j = 0; j<packet[0].length; j++) {
//				System.out.println(packet[i][j]);
//			}
//			
//		}
//	}


	private void MakeDeck() {
		for(int i= 0; i<this.cards.length;i++) {
			for(int j = 0; j<this.cards[0].length; j++) {
				
				this.cards[i][j] = new Card(SuitType.GetValue(i),Value.GetValue(j));
				
			}
		}

	}
	
	

	}


