package important_questions;

/*
 * Three operations can be performed insertion, removal, replacement 
 * check if other string can be made from first string with one edit
 *  or zero edit.
 *
 *  pale,  ple  -> true
 *  pales, pale -> true
 *  pale,  bale -> true
 *  pale,  bae  -> false
*/

public class OneEditAway {

	static boolean oneEditAway(String first, String second) {
		if(first.length() == second.length()) {
			System.out.println("Ran 1");
			return oneEditReplace(first, second);
		} else if(first.length() + 1 == second.length()) {
			System.out.println("Ran 2");
			return oneEditInsert(first, second);
		} else if(first.length()-1 == second.length()) {
			System.out.println("Ran 3");
			return oneEditInsert(second, first);
		}
		return false;
	}
	
	static boolean oneEditReplace(String first, String second) {
		boolean foundDifference = false;
		for(int i=0; i<first.length(); i++) {
			if(first.charAt(i) != second.charAt(i)) {
				if(foundDifference) {
					return false;
				}
				foundDifference = true;
			}
		}
		return true;
	}
	
	static boolean oneEditInsert(String first, String second) {
		int index1 = 0;
		int index2 = 0;
		while(index2 < second.length() && index1 < first.length()) {
			System.out.println(index1 + " " + index2);
			if(first.charAt(index1) != second.charAt(index2)) {
				if(index1 != index2) {
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(oneEditAway("pale", "bale"));

	}

}
