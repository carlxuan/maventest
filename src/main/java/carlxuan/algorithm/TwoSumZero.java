package carlxuan.algorithm;

import java.util.Arrays;

public class TwoSumZero {

	public static void main(String[] args) {
		int[] arr = { -3, -1, 0, 1, 2, 3 };
		calc(arr);
	}

	public static void calc(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			int k = arr.length - 1;
			while (j < k) {
				if (arr[i] + arr[k] == 0) {
					System.out.println(arr[i] + " + " + arr[k] + " = 0");
					j++;
					k--;
				} else if (arr[i] + arr[k] > 0) {
					k--;
				} else {
					j++;
				}
			}

		}
	}
}
