package carlxuan.algorithm.review;

public class PalindromeTest {

	public static void main(String[] args) {
//		System.out.println(isStringPalindrome("levvel"));
		System.out.println(isIntegerPalindrome(12321));
		System.out.println(isIntegerPalindrome(123321));
	}
	
	private static boolean isIntegerPalindrome(int in) {
		int halfInt = 0;
		while(halfInt < in) {
			halfInt = halfInt * 10 + in%10;
			in = in/10;
		}
		System.out.println("halfInt = "+halfInt);
		System.out.println("in = "+in);
		if(halfInt == in || halfInt == in/10) return true;
		return false;
	}
	
	private static boolean isStringPalindrome(String str) {
		char[] arr = str.toCharArray();
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
			if(arr[start] != arr[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
