package carlxuan.algorithm;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] x = {0,1,2,3,4,5,6,7,8,9, 10,11,12};
		System.out.println(new BinarySearch().binarySearch(20, x));

	}

	public int binarySearch(int value, int[] ori)
	{
		if(ori.length == 0)
		{
			throw new RuntimeException("Not Found");
		}
		if(value == ori[ori.length/2])
		{
			return ori[ori.length/2];
		}
		else if(value < ori[ori.length/2])
		{
			int[] leftSubArr = new int[ori.length/2];
			System.arraycopy(ori, 0, leftSubArr, 0, leftSubArr.length);
			System.out.println("Searched left: "+Arrays.toString(leftSubArr));
			return binarySearch(value, leftSubArr);
		}
		int[] rightSubArr = new int[ori.length - ori.length/2 -1];
		System.arraycopy(ori, ori.length/2+1, rightSubArr, 0, rightSubArr.length);
		System.out.println("Searched right: "+Arrays.toString(rightSubArr));
		return binarySearch(value, rightSubArr);
	}
}
