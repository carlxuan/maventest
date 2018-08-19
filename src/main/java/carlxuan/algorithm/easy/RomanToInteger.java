package carlxuan.algorithm.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
	public static void main(String[] args) {
		System.out.println(ramonToInteger("IX"));
	}
	
	public static int ramonToInteger(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int sum=0;
		for(int i = 0; i < s.length(); i++) {
			sum += map.get(s.charAt(i));
		}
		if(s.contains("IV") || s.contains("IX")) {
			sum -= 2;
		}
		if(s.contains("XL") || s.contains("XC")) {
			sum -= 20;
		}
		if(s.contains("CD") || s.contains("CM")) {
			sum -= 200;
		}
		return sum;
	}
}
