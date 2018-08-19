package carlxuan.algorithm.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumAllResults {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 7, 3, 6, 11, 15 };
		twoSum2(arr, 9);
	}

	public static void twoSum(int[] arr, int target) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i] + ", " + arr[j]);
				}
			}
		}
	}

	public static void twoSum1(int[] arr, int target) {
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] == target) {
				System.out.println(arr[i] + ", " + arr[j]);
				i++;
				j--;
			} else if (arr[i] + arr[j] > target) {
				j--;
			} else {
				i++;
			}
		}
	}
	
	public static void twoSum2(int[] numbers, int target){
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < numbers.length; i++){
			if(map.containsKey(target - numbers[i])) {
				result[1] = i;
				result[0] = map.get(target-numbers[i]);
				System.out.println(numbers[i]+", "+(target-numbers[i]));
			}
			
			map.put(numbers[i], i);
		}
	}

}
