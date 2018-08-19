package carlxuan.algorithm;

import java.util.Arrays;

public class SmallestSubset {

	static int[] arr = {1,2,3,10};

	public static void main(String[] args) {

		SmallestSubset ss = new SmallestSubset();
		//Solution 1
//		int[] allSumArr = ss.getAllSumValueArr(arr);
//		System.out.println(Arrays.toString(allSumArr));
//		System.out.println(ss.getSmallestValue(allSumArr));
		
		//Solution 2
		System.out.println(ss.smartWay(arr));
	}
	
	public int smartWay(int[] arr)
	{
		int smallestValue = 1;
		for(int i = 0; i < arr.length && smallestValue <= arr[i]; i++)
		{
			smallestValue += arr[i];
		}
		return smallestValue;
	}
	
	public int getSmallestValue(int[] allSumArr)
	{
		int x = 1;
		while(true)
		{
			boolean isFound = false;

			for(int i = 0; i < allSumArr.length; i++)
			{
				if(x == allSumArr[i])
				{
					isFound = true;
					break;
				}
			}
			if(!isFound)
			{
				return x;
			}else
			{
				x++;
			}
		}
		
	}
	
	public int[] getAllSumValueArr(int[] arr)
	{
		int[] sumArr = new int[1<<4];
		int length = 1<<4;
		for(int i = 0; i < length; i++)
		{
			int sum = 0;
			for(int j = 0; j < arr.length; j++)
			{
				int temp = 1 << j;
				if((i & temp)!=0)
				{
					sum += arr[j];
				}
			}
			sumArr[i] = sum;
		}
		return sumArr;
	}

}
