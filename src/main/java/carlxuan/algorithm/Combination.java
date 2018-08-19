package carlxuan.algorithm;

public class Combination {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
//		com(arr);
//		com1(arr);
		com2("abcd");
	}
	
	public static void com2(String arr) {
		for(int i = 0; i < arr.length(); i++) {
			for(int j = i + 1; j < arr.length()+1; j++) {
				System.out.println(arr.substring(i, j));
			}
		}
	}
	
	public static void com(int[] arr)
	{
		for(int i = 0; i < arr.length;i++)
		{
			System.out.println(arr[i]);
			for(int j = i + 1; j < arr.length; j++)
			{
				System.out.println(arr[i]+", "+arr[j]);
				for(int k = j + 1; k < arr.length; k++) {
					System.out.println(arr[i]+", "+arr[j]+", "+arr[k]);
					for(int l = k + 1; l < arr.length; l++) {
						System.out.println(arr[i]+", "+arr[j]+", "+arr[k]+", "+arr[l]);
						for(int m = l + 1; m < arr.length; m++) {							
							System.out.println(arr[i]+", "+arr[j]+", "+arr[k]+", "+arr[l]+", "+arr[m]);
						}
					}
				}
			}
		}
	}
	
	public static void com1(int[] arr) {
		int counter = 0;
		int comNumber = 1 << arr.length;
		for(int i = 0; i < comNumber; i++) {
			for(int j = 0; j < 5; j++) {
				int temp = 1 << j;
				if((i & temp) != 0) {
					System.out.print(arr[j]);
				}
			}
			System.out.println();
			counter++;
		}
		System.out.println("Totall="+counter);
	}

}
