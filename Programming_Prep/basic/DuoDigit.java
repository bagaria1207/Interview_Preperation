package basic;

import java.util.HashMap;

public class DuoDigit {

	public static String isDuoDigit(int num) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		while(num > 0) {
			int temp = num % 10;
			if(!map.containsKey(temp)) {
				map.put(temp, 1);
				count++;
				if(count > 2) {
					return "N";
				}
			}
			num = num / 10;
		}
		return "Y";
	}
	
	public static void main(String[] args) {
		System.out.println(isDuoDigit(-2020));
		System.out.println(isDuoDigit(201));
	}
}
