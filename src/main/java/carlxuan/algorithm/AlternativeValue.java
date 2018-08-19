package carlxuan.algorithm;

import java.util.Arrays;

public class AlternativeValue {

	public static void main(String[] args) {
		System.out.println(5/2);
		System.out.println(5%2);
		AlternativeValue anv = new AlternativeValue();
		int[] arr = {1, -2, -3, -4, 5, 6, 7};
		System.out.println(Arrays.toString(arr));
//		System.arraycopy(arr, 1, arr, 0, arr.length-1);
		anv.sortArray(arr);
		System.out.println(Arrays.toString(arr));
		anv.process(arr);
//		System.arraycopy(arr, 1, arr, 2, 5);
		System.out.println(Arrays.toString(arr));
	}
	
	public void process(int[] arr)
	{
		for(int i=0; isNegative(arr[arr.length-1]); i++)
		{
			if(i%2 !=0)
			{
				int temp = arr[arr.length-1];
				System.arraycopy(arr, i, arr, i+1, arr.length-1-i);
				arr[i] = temp;
				System.out.println(Arrays.toString(arr));
			}
		}
		
		
//		j-i+1 = len
//		i = j+1-len
//		j = i-1+len
		
	}
	
	private void sortArray(int[] arr)
	{
		int lastNIndex = arr.length - 1;
		for(int i = 0; i < arr.length; i++)
		{
			if(isNegative(arr[i]) && i < lastNIndex-1)
			{
				int temp = arr[i];
				System.arraycopy(arr, i+1, arr, i, lastNIndex-i);
				arr[lastNIndex] = temp;
				lastNIndex--;
				i--;
//				System.out.println(Arrays.toString(arr));
			}
		}
	}
	
	private boolean isNegative(int i)
	{
		return i<0;
	}

}
