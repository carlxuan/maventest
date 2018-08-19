package carlxuan.algorithm.easy;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer val = Integer.parseInt(s.nextLine());
		System.out.println(reverseInteger(val));
		System.out.println(Integer.MAX_VALUE);
	}

	public static int reverseInteger(int value) {
		long reversed = 0L;
		while(value > 0) {
			reversed = reversed*10 + value%10;
			value /= 10;
		}
		if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
			return -1;
		}
		return (int)reversed;
	}
}
