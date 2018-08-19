package carlxuan.algorithm;

public class LongestNonRepeatedSubString {

	public static void main(String[] args) {
//		String str = "abcdaxcuioop123456789";
		String str = "abcde";
		
		
//		System.out.println(str.length());
		getLongestNonRepeatedStringAllCombination(str);
	}
	
	public static void getLongestNonRepeatedStringAllCombination(String str){
		int counter = 0;
		for(int i = 0; i < str.length()-2; i++) {
			for(int j = i+1; j < str.length()-1; j++){
				for(int k = j+1; k < str.length(); k++){
				counter++;
				System.out.println(str.substring(i,  j));
				}
			}
		}
		System.out.println(counter);
	}
	
	public static void getLongestNonRepeatedString(String str){
		int max = 0;
		String maxSubStr = "";
		for(int i=0; i < str.length()-1; i++) {
			StringBuffer buf = new StringBuffer();
			buf.append(str.charAt(i));
			int c = 1;
			if(c > max) {
				max = c;
				maxSubStr = buf.toString();
			}
			for(int j = i+1; j < str.length(); j++) {
				if(buf.indexOf(str.charAt(j)+"") == -1) {
					buf.append(str.charAt(j));
					c++;
					if(c>max){
						max = c;
						maxSubStr = buf.toString();
					}
				}else
				{
					break;
				}
			}
		}
		System.out.println(maxSubStr);
	}

}
