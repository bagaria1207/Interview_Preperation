package important_questions;

public class UniqueCharaterInAString {

	static boolean isUnique(String str) {
		if(str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for(int i=0; i<str.length(); i++) {
			int val = (int)str.charAt(i);
			if(char_set[val]) {
				return false;
			} else {
				char_set[val] = true;
			}
		}
		return true;
	}
	
	static boolean isUniqueCharacter(String str) {
		int checker = 0;
		for(int i=0; i<str.length(); i++) {
			int val = (int) str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) {
				return false;
			}
			checker = checker | (1 << val);
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isUnique("STRONG"));
		System.out.println(isUniqueCharacter(new String("STRONGs").toLowerCase()));

	}

}
