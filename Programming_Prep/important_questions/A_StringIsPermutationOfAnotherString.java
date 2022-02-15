package important_questions;

public class A_StringIsPermutationOfAnotherString {
	
	static String sort(String s) {
		char[] ar = s.toCharArray();
		java.util.Arrays.sort(ar);
		return new String(ar);
	}
	
	static boolean isPermutation(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		return sort(str1).equals(sort(str2));
	}
	
	/*----------------------------------------------------------------------------------------------------*/

	static boolean isPermutations(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		int[] set = new int[128];
		for(char c : str1.toCharArray()) {
			set[c]++;
		}
		for(int i=0; i<str2.length(); i++) {
			set[(int)str2.charAt(i)]--;
			if(set[(int)str2.charAt(i)] < 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPermutations("GOD ", "DOGH"));
		
	}

}
