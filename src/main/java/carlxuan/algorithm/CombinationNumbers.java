package carlxuan.algorithm;

public class CombinationNumbers {

	public static void main(String[] args) {
		System.out.println(combinationCount(5,2));
	}
	
	public static int combinationCount(int total, int number)
	{
		return count(total)/(count(total-number)*count(number)) ;
	}
	
	
	public static int count(int n)
	{
		if(n==2) return 2;
		else return n*count(n-1);
	}

}
