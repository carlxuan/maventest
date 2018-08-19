package carlxuan.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumFirstMatch {

	public static void main(String[] args) {
		int[] arr = {1, 2,7,3,6,11,15};
		System.out.println(Arrays.toString(twoSum(arr, 9)));
	}

	public static int[] twoSum(int[] numbers, int target){
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < numbers.length; i++){
			if(map.containsKey(target - numbers[i])) {
				result[1] = i+1;
				result[0] = map.get(target-numbers[i]);
				return result;
			}
			
			map.put(numbers[i], i+1);
		}
		return result;
	}
}
