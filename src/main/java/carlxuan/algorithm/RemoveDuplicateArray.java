package carlxuan.algorithm;

import java.util.Arrays;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		int[] arr = {1,1,2,3,3,5};
		System.out.println(Arrays.toString(removeDuplicate(arr)));
	}
	
	public static int[] removeDuplicate(int[] arr) {
		Arrays.sort(arr);
		int cur = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == cur) {
				System.arraycopy(arr, i, arr, i-1, arr.length-i);
			}else {
				cur = arr[i];
			}
		}
		return arr;
	}

}
