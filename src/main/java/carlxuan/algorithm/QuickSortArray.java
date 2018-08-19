package carlxuan.algorithm;

import java.util.Arrays;

public class QuickSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quickSort(0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	static int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 10 };

	public static void quickSort(int low, int high) {
		System.out.println("low=" + low + ", high=" + high);
		int i = low;
		int j = high;

		int povit = low + (high - low) / 2;
		while (i < j) {
			while (arr[i] < arr[povit]) {
				i++;
			}

			while (arr[j] > arr[povit]) {
				j--;
			}

			// Here "=" is required, or else infinite loop will happen
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		// it has to be j here, or else i++ will never be smaller than low
		if (low < j) {
			quickSort(low, j);
		}

		if (high > i) {
			quickSort(i, high);
		}
	}

	public static void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
