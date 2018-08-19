package carlxuan.algorithm.easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] arr = {"This", "That", "Thth", "a"};
		System.out.println(longestCommonPrefix(arr));
	}
	
	public static String longestCommonPrefix(String[] arr) {
		if(arr == null || arr.length ==0) return null;
		String longestPrefix = arr[0];
		int i = 1;
		while(i < arr.length) {
			while(arr[i].indexOf(longestPrefix) != 0) {
				longestPrefix = longestPrefix.substring(0, longestPrefix.length()-1);
			}
			i++;
		}
		return longestPrefix;
	}

}
