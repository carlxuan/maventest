package carlxuan.algorithm;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
//		int[] x = new int[8];
//		x[0] = 1;
//		x[1] = 2;
//		x[2] = 3;
//		x[3] = 4;
//		x[4] = 5;
//		x[5] = 6;
//		x[6] = 7;
//		int[] y = new int[8];
//		System.out.println(Arrays.toString(y));
//		System.arraycopy(x, 0, y, 0, x.length);
//		System.out.println(Arrays.toString(y));
//		System.out.println(Arrays.toString(x));
//		System.arraycopy(x, 2, x, 3, x.length-2-1);
//		System.out.println(Arrays.toString(x));
		int[] x = {10,2,1,0,5,3,2};
		new MergeSort().mergeSort(x);
		
	}
	
	public void mergeSort(int[] ori)
	{
		int[] newArr = new int[ori.length];
		int size = 0;
		start: for(int e : ori)
		{
			for(int i = 0; i < newArr.length; i++)
			{
				if(e < newArr[i])
				{
					System.arraycopy(newArr, i, newArr, i+1, newArr.length-i-1);
					newArr[i] = e;
					size++;
					continue start;
				}
			}
			newArr[size++] = e;
		}
		System.out.println(Arrays.toString(newArr));
	}

}
