package carlxuan.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

	public static void main(String[] args) {
		Integer[] arr = {10,2,1,5,3,6,2};
//		Arrays.sort(arr, new Comparator<Integer>(){
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1;
//			}	
//		});
//		System.out.println(Arrays.toString(arr));
		List<Integer> listTemp = new ArrayList<>();
		listTemp.addAll(Arrays.asList(arr));
		System.out.println(new QuickSort().quickSort(listTemp).toString());
	}
	
	public List<Integer> quickSort(List<Integer> ori)
	{
		if(ori.size() < 2)
		{
			return ori;
		}
		
		Integer first = ori.get(0);

		List<Integer> leftArr = new ArrayList<>();
		List<Integer> rightArr = new ArrayList<>();
		for(int i = 1; i < ori.size(); i++)
		{
			if(ori.get(i)>=first)
			{
				rightArr.add(ori.get(i));
			}else
			{
				leftArr.add(ori.get(i));
			}
		}
		
		List<Integer> result = quickSort(leftArr);
		result.add(first);
		result.addAll(quickSort(rightArr));
		return result;
	}

}
