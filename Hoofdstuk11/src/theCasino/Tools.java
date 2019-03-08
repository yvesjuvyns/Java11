package theCasino;

public class Tools {
	
	public static int[]  posTypeValue(int value){
		int[] output = new int[2];
		output[0] =value/ 13;
		output[1] =value % 13;
		return output;
		
		
	}
	
	

}
