package carlxuan.algorithm;

import java.util.Arrays;

public class BinarySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int t[] = {3,12,6,7,2,1,23,4,5,7,8,4,2,5,365};
		int t[] = {3,12,6,7, 2, 1};
		test(t);
		System.out.println(buf.toString());

	}
	
	
	public static int[] test(int[] t) {
		 if(t.length <= 1){
		        return t;
		    }

		return apply( test(Arrays.copyOfRange(t, 0, t.length / 2)), 
				test(Arrays.copyOfRange(t, t.length / 2, t.length )));
	}
	static StringBuffer buf = new StringBuffer();
	public static int[] apply(int[] t, int[] u) {

	    int[] result = new int[t.length + u.length];

	    for (int i = 0, j = 0, k = 0; i < result.length; i++){

	        if( j == t.length){
	            result[i] = u[k++];
	        } else if (k == u.length) {
	            result[i] = t[j++];
	        } else {
	            result[i] = t[j] < u [k] ? t[j++] : u[k++];
	        }

	        buf.append(result[i]+", ");
	    }
	    return result;
	}}
