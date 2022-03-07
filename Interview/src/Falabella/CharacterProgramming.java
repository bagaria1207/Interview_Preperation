package falabella;

import java.util.Stack;

/**
 * 
 * @author bagar
 * Inptut -> UDRR
 * Output -> RR
 */
public class CharacterProgramming {
	
	public static int getMaxDeletions(String str) {
		Stack<Character> upDown = new Stack<>();
		Stack<Character> rightLeft = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c == 'U' || c == 'D') {
				if(upDown.isEmpty() || upDown.peek() == c) {
					upDown.push(c);
				} else if(!upDown.isEmpty()) {
					upDown.pop();
				}
			} else {
				if(c == 'L' || c == 'R') {
					if(rightLeft.isEmpty() || rightLeft.peek() == c) {
						rightLeft.push(c);
					} else {
						rightLeft.pop();
					}
				}
			}
		}
		return (str.length() - (upDown.size() + rightLeft.size()));
	}
	
}
