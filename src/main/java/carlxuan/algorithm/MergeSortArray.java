package carlxuan.algorithm;

import java.util.Arrays;

public class MergeSortArray {

	public static void main(String[] args) {
		int[] a = {1, 3,5,2,7,10,2,4};
		int[] b = new MergeSortArray().mergeSort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
	public int[] mergeSort(int[] arr)
	{
		int[] sorted = new int[arr.length];
		int sortedSize = 0;
		Start: for(int i=0; i < arr.length; i++)
		{
			for(int j = 0; j < sortedSize; j++)
			{
				if(arr[i] < sorted[j])
				{
					System.arraycopy(sorted, j, sorted, j+1, sortedSize-j);
					
					sorted[j] = arr[i];
					sortedSize++;
					continue Start;
				}
			}
			sorted[sortedSize] = arr[i];
			sortedSize++;
		}
		return sorted;
		
	}

}
