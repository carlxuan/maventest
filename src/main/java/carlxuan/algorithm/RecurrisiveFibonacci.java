package carlxuan.algorithm;

import java.util.HashMap;
import java.util.Map;

public class RecurrisiveFibonacci {

	public static void main(String[] args) {
		long start = System.nanoTime();
		System.out.println(new RecurrisiveFibonacci().fibonacciCached(40));
		long end = System.nanoTime() - start;
		System.out.println(end/1000/1000);
	}
	
	public int fibonacci(int n)
	{
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	Map<Integer, Integer> map = new HashMap<>();
	public int fibonacciCached(int n)
	{
		if(map.get(n) != null)
		{
			return map.get(n);
		}
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		int result = fibonacci(n-1) + fibonacci(n-2);
		map.put(n, result);
		return result;
	}

}
