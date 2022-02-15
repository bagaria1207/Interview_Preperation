package leetcode;

public class Longest_Common_Subsequence {
	
	public static int[][] dp;
	
    public static int sizeLongestCommonSubsequence(String text1, String text2) {
        dp = new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<=text1.length();i++){
            for(int j=0;j<=text2.length();j++){
                if(i==0 || j==0){
                    continue;
                }
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
    
    public static String printLongestCommonSubsequence(String text1, String text2) {
    	int i = text1.length();
    	int j = text2.length();
    	int index = sizeLongestCommonSubsequence(text1, text2);
    	char[] lcs = new char[index];
    	while(i > 0 && j > 0) {
    		if(text1.charAt(i-1) == text2.charAt(j-1)) {
    			lcs[index-1] = text1.charAt(i-1);
    			i--;
    			j--;
    			index--;
    		} else if(dp[i-1][j] > dp[i][j-1]) {
    			i--;
    		} else {
    			j--;
    		}
    	}
    	return new String(lcs);
    }
    
    public static String printShortestSuperSubsequence(String text1, String text2) {
    	String lcs = printLongestCommonSubsequence(text1, text2);
    	String ans = "";
    	int p1 = 0;
    	int p2 = 0;
    	for(char c : lcs.toCharArray()) {
    		while(text1.charAt(p1)!=c) {
    			ans += text1.charAt(p1);
    			p1++;
    			System.out.println("P1 " + ans);
    		}
    		while(text2.charAt(p2)!=c) {
    			ans += text2.charAt(p2);
    			p2++;
    			System.out.println("P2 " + ans);
    		}
    		ans += c;
    		p1++;
    		p2++;
    	}
    	ans = text1.substring(p1) + ans + text2.substring(p2);
    	return ans;
    }
	public static void main(String[] args) {
		System.out.println(sizeLongestCommonSubsequence("sea", "eat"));
		System.out.println(printLongestCommonSubsequence("sea", "eat"));
		System.out.println(printLongestCommonSubsequence("acbcf", "abcdaf"));
		
		System.out.println(printShortestSuperSubsequence("sea", "eat"));
	}

}
