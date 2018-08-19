package carlxuan.algorithm.review;

public class MaxSubArray_Kaden {

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(arr));
	}

	private static int maxSubArray(int[] arr) {
		int currMax = arr[0];
		int globalMax = currMax;
		for (int i = 1; i < arr.length; i++) {
			currMax = Math.max(arr[i], currMax + arr[i]);
			globalMax = Math.max(globalMax, currMax);
		}
		return globalMax;
	}
}
