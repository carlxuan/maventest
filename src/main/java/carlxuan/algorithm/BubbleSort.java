package carlxuan.algorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] x = {10,1,3,5,1,4,2};
		new BubbleSort().bubbleSort(x);

	}
	
	public void bubbleSort(int[] ori)
	{
		for(int i = 0; i < ori.length -1; i++)
		{
			for(int j = 0; j < ori.length -1 -i; j++)
			{
				if(ori[j] > ori[j+1])
				{
					int temp = ori[j];
					ori[j] = ori[j+1];
					ori[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ori));
	}

}

