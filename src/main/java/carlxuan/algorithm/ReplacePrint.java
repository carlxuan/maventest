package carlxuan.algorithm;

import java.util.ArrayList;
import java.util.List;

public class ReplacePrint {

	public static void main(String[] args) {
		int[] x = {0,1,2,3,4,5,6,7,8,9, 10,11,12, 15,16};
		System.out.println(new ReplacePrint().print(x).toString());
		
		System.out.println(new ReplacePrint().print(x).size());
		

	}
	
	public List<String> print(int[] x)
	{
		List<String> result = new ArrayList<>(x.length);
		for(int i : x)
		{
			String replacement = check(3, i, "Fizz") + check(5, i, "Replace");
			if("".equals(replacement))
			{
				result.add(String.valueOf(i));
			}else
			{
			result.add(replacement);
			}
		}
		return result;
	}
	
	public String check(int x, int e, String replacement)
	{
		return e%x == 0? replacement:"";
	}

}
