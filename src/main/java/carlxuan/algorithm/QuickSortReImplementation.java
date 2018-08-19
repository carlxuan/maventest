package carlxuan.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortReImplementation {

	public static void main(String[] args) {
		Integer[] arr = {1,5,7,2,3,4,9,8,6};
//		System.out.println(new QuickSortReImplementation().quickSort(Arrays.asList(arr)));
		
		new QuickSortReImplementation().quickSort(arr, 0, arr.length -1 );
		System.out.println(Arrays.toString(arr));
	}
	
	private void quickSort(Integer[] arr, int low, int high)
	{
		int i = low;	
		int j= high;	
		int pivot = low+(high-low)/2;
		while(i <= j)
		{
			while(arr[i] < arr[pivot])
			{
				i++;
			}
			while(arr[j] > arr[pivot])
			{
				j--;
			}
			if(i <= j)
			{
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
			
		}
		if(low< j)
		{
			System.out.println("low :" +low+" ~ "+j);
			quickSort(arr, low, j);
		}
		if(high> i)
		{
			System.out.println("low :" +i+" ~ "+high);
			quickSort(arr, i, high);
		}
		System.out.println("low="+low+ ", high="+high+", i="+i+", j="+j);
	}

	
	private List<Integer> quickSort(List<Integer> list)
	{
		if(list.size() < 2) return list;
		List<Integer> left = new ArrayList<>(list.size());
		List<Integer> right = new ArrayList<>(list.size());
		for(int i = 1; i < list.size(); i++)
		{
			if(list.get(i) >= list.get(0))
			{
				right.add(list.get(i));
			}else
			{
				left.add(list.get(i));
			}
		}
		
		List<Integer> sortedList = new ArrayList<>(list.size());
		sortedList.addAll(quickSort(left));
		sortedList.add(list.get(0));
		sortedList.addAll(quickSort(right));
		return sortedList;
	}

}
