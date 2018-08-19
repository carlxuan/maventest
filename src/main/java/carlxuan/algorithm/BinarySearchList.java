package carlxuan.algorithm;

import java.util.Arrays;
import java.util.List;

public class BinarySearchList {

	public static void main(String[] args) throws Exception {
		Integer[] x = {0,1,2,3,4,5,6,7,8,9, 10,11,12};
		System.out.println(new BinarySearchList().binarySearch(8, Arrays.asList(x)));
		

	}

	public int binarySearch(int value, List<Integer> ori) throws Exception
	{
		if(ori.size() == 0)
		{
			throw new Exception("Not found");
		}
		if(value == ori.get(ori.size()/2))
		{
			return value;
		}else if(value < ori.get(ori.size()/2))
		{
			System.out.println(ori.subList(0, ori.size()/2).toString());
			return binarySearch(value, ori.subList(0, ori.size()/2));
		}
		System.out.println(ori.subList(ori.size()/2 + 1, ori.size()));
		return binarySearch(value, ori.subList(ori.size()/2 + 1, ori.size()));
	}
}
