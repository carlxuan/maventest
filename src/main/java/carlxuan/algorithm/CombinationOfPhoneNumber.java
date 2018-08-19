package carlxuan.algorithm;

import java.util.ArrayList;
import java.util.List;

public class CombinationOfPhoneNumber {

	public static void main(String[] args) {
		// System.out.println(forLoopSolution("23"));
		List<String> combinations = new ArrayList<>();
		combinations.add("");
		System.out.println(recursiveSolution("23", combinations));
	}

	public static List<String> recursiveSolution(String phoneNumber, List<String> combinations) {
		if (phoneNumber.length() == 1) {
			List<String> result = new ArrayList<>();
			for (String str : combinations) {
				for (char c : numberMapping(phoneNumber).toCharArray()) {
					result.add(str + c);
				}
			}
			return result;
		}
		List<String> result = new ArrayList<>();
		for(String str : combinations) {
			for(char ch : numberMapping(phoneNumber.substring(0, 1)).toCharArray()) {
				result.add(str + ch);
			}
		}
		return recursiveSolution(phoneNumber.substring(1, phoneNumber.length()), result);	
	}

	public static List<String> forLoopSolution(String phoneNumber) {
		List<String> result = new ArrayList<>();
		result.add(""); // This is important, or else below for(String str :
						// result) won't perform at beginning
		for (char c : phoneNumber.toCharArray()) {
			List<String> tmp = new ArrayList<>();
			// loop the result with "abc" or "def"..
			for (String str : result) {
				for (char ch : numberMapping(Character.toString(c)).toCharArray()) {
					tmp.add(str + ch);
				}
			}
			// update result list with one more round of combinations
			result = tmp;
		}
		return result;
	}

	private static String numberMapping(String ch) {
		switch (ch) {
		case "2":
			return "abc";
		case "3":
			return "def";
		case "4":
			return "ghi";
		case "5":
			return "jkl";
		case "6":
			return "mno";
		case "7":
			return "pqrs";
		case "8":
			return "tuv";
		case "9":
			return "wxyz";
		default:
			return "";
		}
	}

}
