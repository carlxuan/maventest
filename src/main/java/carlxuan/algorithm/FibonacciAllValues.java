package carlxuan.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciAllValues {

	public static void main(String[] args) {
		System.out.println(new FibonacciAllValues().getAllValues(10).toString());
		

	}
	
	public List<Integer> getAllValues(int n)
	{
		if(n == 0) return new ArrayList<Integer>();
		else if(n == 1) return Arrays.asList(0, 1);
		
		List<Integer> list = new ArrayList<>(n);
		list.add(0);
		n--;
		list.add(1);
		n--;
		
		while(n > 0)
		{
			int previousValue = list.get(list.size() - 1);
			int previousPreviousValue = list.get(list.size() - 2);
			list.add(previousValue + previousPreviousValue);
			n--;
		}
		return list;
		
	}

}
