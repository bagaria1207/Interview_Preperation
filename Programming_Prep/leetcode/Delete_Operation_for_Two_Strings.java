package leetcode;

import java.util.HashSet;
public class Delete_Operation_for_Two_Strings {

    public static int minDistance(String word1, String word2) {
    	int w1 = word1.length();
    	int w2 = word2.length();
        HashSet<Character> word1Set = new HashSet<>();
        for(char c : word1.toCharArray()){
            word1Set.add(c);
        }
        HashSet<Character> word2Set = new HashSet<>();
        for(char c : word2.toCharArray()){
            word2Set.add(c);
        }        
        
        System.out.println(word1Set.retainAll(word2Set));
        System.out.println(word1Set);
        
        return w1-word1Set.size() + w2-word1Set.size();
        
    }
	public static void main(String[] args) {
		
		System.out.println(minDistance("sea", "eat"));
		System.out.println(minDistance("leetcode", "etco"));

	}

}
