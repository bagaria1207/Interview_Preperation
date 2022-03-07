package falabella;

/**
 * 
 * @author bagar
 * Input  -> ())
 * Output -> 1
 */

public class BalanceParenthesis {
	
	public static int getMin(String str) {
		int result = 0;
		int balance = 0;
		for(int i=0; i<str.length();i++) {
			balance += str.charAt(i) == '(' ? 1: -1;
			if(balance == -1) {
				result += 1;
				balance += 1;
			}
		}
		return balance + result;
	}
	
}
