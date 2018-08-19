package carlxuan.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortList {

	public static void main(String[] args) {
//		int[] x = new int[8];
//		x[0] = 1;
//		x[1] = 2;
//		x[2] = 3;
//		x[3] = 4;
//		x[4] = 5;
//		x[5] = 6;
//		x[6] = 7;
//		int[] y = new int[9];
//		System.out.println(Arrays.toString(y));
//		System.arraycopy(x, 2, y, 3, y.length-3);
//		System.out.println(Arrays.toString(y));
		Integer[] x = {10,2,1,0,5,3,2};
		new MergeSortList().mergeSort(x);
	}
	
	public void mergeSort(Integer[] ori)
	{
		List<Integer> oriList = Arrays.asList(ori);
		ArrayList<Integer> newList = new ArrayList<>(oriList.size());
		
		start: for(Integer e : oriList)
		{
			for(int i = 0; i < newList.size(); i++)
			{
				if(e < newList.get(i))
				{
					newList.add(i, e);
					continue start;
				}
			}
			newList.add(newList.size(), e);
		}
		System.out.println(newList.toString());
	}

}
