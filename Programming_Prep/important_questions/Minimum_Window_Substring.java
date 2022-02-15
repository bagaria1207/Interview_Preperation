package important_questions;

import java.util.Map;
import java.util.HashMap;

public class Minimum_Window_Substring {

    public static String minWindow(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();
        for(int i=0;i<t.length();i++) {
        	freq.put(t.charAt(i), freq.getOrDefault(t.charAt(i), 0)+1);
        }
        
        String res = "";
        int beg = 0;
        int end = 0;
        int counter = freq.size();
        int len = Integer.MAX_VALUE;
        while(end < s.length()){
            char aux = s.charAt(end);
            if(freq.keySet().contains(aux)) {
            	freq.put(aux, freq.get(aux)-1);
            	if(freq.get(aux) == 0) {
            		counter--;
            	}
            }
            System.out.println(freq + " " + counter + " " + res + " " + beg + " " + end);
            end++;
            while(counter == 0) {
            	
                System.out.println("Inside of inside " + res + " " + beg + " " + end + " " + len);

            	if(end-beg < len) {
            		len = end - beg;
            		res = s.substring(beg, end);
            	}
            	char start = s.charAt(beg);
            	if(freq.containsKey(start) && freq.get(start) == 1) {
            		freq.put(start, freq.get(start) + 1);
            		if(freq.get(start) > 0) {
            			counter++;
            		}
            	}
            	beg++;
            }
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		
		System.out.println(minWindow("ADOBECODEBANC", "ABC"));

	}

}
