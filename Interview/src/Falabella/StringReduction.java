package falabella;

/**
 * 
 * @author bagar
 * Input  -> abab
 * Output -> ab
 */

public class StringReduction {
	
	public static int getMinDeletions(String s) {
		int n = s.length();
		int distinct_count = 0;
		int count[] = new int[26];
		for(int i=0;i<n;i++) {
			if(count[s.charAt(i) - 'a'] == 0) {
				distinct_count++;
			}
			count[s.charAt(i)-'a']++;
		}
		return n-distinct_count;
	}
	
}
