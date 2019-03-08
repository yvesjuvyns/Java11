package theCasino;

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class Lottery {

	static public int[] randNumbers52() {
		int[] output = new int[52];

		Random ran = new Random();		
		int[] unique = new int[0];
		int guess;

		for (int i = 0; i < output.length; ) {

			guess = ran.nextInt(52);
			if(isNotInside(unique, guess)) {
				
				unique = insertElArray(unique, guess);
				output[i++] =guess;
			}
			

		}

		return output;

	}

	static public int[] numbers52() {

		int[] output = new int[52];
		ArrayList<Object> numbers = new ArrayList<Object>();
		for (int i = 0; i < 52; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);

		for (int j = 0; j < 52; j++) {
			output[j] = (int) numbers.get(j);

		}

		return output;
	}

	static public int[][] MakeShuffleNumbers(int[] numbers52) {
		int[][] numbers = new int[4][13];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {

				numbers[i][j] = numbers52[count++];

			}

		}
		return numbers;
	}

	static public int[] insertElArray(int[] arr, int elem) {
		int[] newArray = new int[(arr.length) + 1];
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}
		newArray[arr.length] = elem;

		return newArray;
	}
	
	static boolean isNotInside(int[] arr, int elem) {
		boolean output  = true;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==elem) {
				output = false;
			}
			
		}
		
		return output;
	}

//	public static void nothing() {
//	}
//
//	public static boolean printShuffleNumbers(int[][] arrayCards) {
//
//		for (int i = 0; i < arrayCards.length; i++) {
//			for (int j = 0; j < arrayCards[0].length; j++) {
//				System.out.println(
//						arrayCards[i][j] + " " + (int) ((arrayCards[i][j]) / 13) + " " + arrayCards[i][j] % 13);
//			}
//
//		}
//		return true;
//	}
}