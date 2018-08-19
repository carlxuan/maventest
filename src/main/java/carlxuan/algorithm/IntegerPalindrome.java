package carlxuan.algorithm;

public class IntegerPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindromeHalf(123321));
	}
	
	public static boolean isPalindrome(int x) {
		int ori = x;
		long reverse = 0;
		while(x > 0) {
			reverse = reverse*10+x%10;
			x = x/10;
		}
		System.out.println(reverse);
		System.out.println(x);
		return ori==reverse;
	}

	
	public static boolean isPalindromeHalf(int x) {
		long reverse = 0;
		while( x > reverse) {
			reverse = reverse*10+x%10;
			x = x/10;
		}
		System.out.println(reverse);
		System.out.println(x);
		// reverse/10 == x is for odd number 12321
		// x== reverse is for even number 123321
		return x==reverse || reverse/10 == x;
	}
}
