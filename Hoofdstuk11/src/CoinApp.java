
public class CoinApp {

	public static void main(String[] args) {
		int sum = 0;
		
		Coin[] listOfCoins;
		
		for (Coin c : Coin.values()) {
			
			
			System.out.println(c.name()); 
			System.out.println(c.ordinal());
			 
			sum += c.getValue();
			
			}
			System.out.println("The sum of this array is " + sum);
	}

}
