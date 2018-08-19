package carlxuan.algorithm;

public class AllCombinations {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		// all possible type: 000, 001, 010, 011,100,101,110,111
		for(int i = 0; i < (1 << a.length); i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				// can be 001(a), 010(b), 100(c)
				int tmp = 1 << j;
				if((tmp & i) != 0)
				{
					System.out.print(a[j]);
				}
			}
			System.out.println();
		}

	}

}
