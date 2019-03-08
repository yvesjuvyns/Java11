package theCasino;

public class Test {

	public static void main(String[] args) {
		int[] positions = new int[2];
		

		
		int[] randNumbers = Lottery.randNumbers52();
		for (int i = 0; i < 52;i++) {				
			
			System.out.println(randNumbers[i]);
//			positions= Tools.posTypeValue(i);
//			System.out.println(positions[0] + " " + positions[1]);
			
		}
		
		
	
		
		

	}

}
