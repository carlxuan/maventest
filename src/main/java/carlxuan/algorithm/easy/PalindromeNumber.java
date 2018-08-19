package carlxuan.algorithm.easy;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(palindromeNumber(Integer.parseInt(s.next())));
		
	}
	
	public static boolean palindromeNumber(int value){
		int halfReversed= 0;
		while(halfReversed < value) {
			halfReversed = halfReversed * 10 + value%10;
			value /= 10;
		}
		// halfReversed == value is for even case 12344321
		// halfReversed/10 == value is for odd case 1234321, halfReversed= 1234
		if(halfReversed == value || halfReversed/10 == value) {
			return true;
		}
		return false;
	}

}
