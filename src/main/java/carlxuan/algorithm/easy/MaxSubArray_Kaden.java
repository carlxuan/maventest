package carlxuan.algorithm.easy;

public class MaxSubArray_Kaden {

	public static void main(String[] args) {
		int[] arr = {-2, 1,-3, 4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}
	
	public static int maxSubArray(int[] arr) {
		int globalMax = arr[0];
		int curMax = globalMax;
		for(int i = 1; i < arr.length; i++) {
			curMax = Math.max(arr[i], arr[i] + curMax);
			globalMax = Math.max(globalMax, curMax);
		}
		return globalMax;
	}

}
