package important_questions;

import java.util.Stack;
import java.util.HashMap;

public class NextGreaterElement {
	
	public static int[] ngrQueries(int[] query, int[] nums) {
		int res[] = ngr(nums);
		int[] finalResult = new int[query.length];
		HashMap<Integer, Integer> mapped = new HashMap<>();
		for(int i=0;i<res.length;i++) {
			mapped.put(nums[i], res[i]);
		}
		System.out.println(mapped);
		for(int i=0;i<query.length;i++) {
			if(mapped.containsKey(query[i])) {
				finalResult[i] = mapped.get(query[i]);
			}
		}
		return finalResult;
	}
	
//	{1, 3, 4, 2}
	public static int[] ngr(int[] nums) {
		int[] res = new int[nums.length];
		Stack<Integer> aux = new Stack<>();
		for(int i=nums.length-1; i>=0; i--) {
			if(aux.isEmpty()) {
				res[i] = -1;
			} else if(aux.size() > 0 && nums[i] < aux.peek()) {
				res[i] = aux.peek();
			} else if(aux.size() > 0 && nums[i] > aux.peek()) {
				while(aux.size() > 0 && aux.peek() <= nums[i]) {
					aux.pop();
				}
				if(aux.size() == 0) {
					res[i] = -1;
				} else {
					res[i] = aux.peek();
				}
			}
			aux.push(nums[i]);
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		for(int aux : ngr(new int[] {1, 3, 4, 2})) {
			System.out.print(aux + " ");
		}
		
		System.out.println();
		
		for(int aux : ngrQueries(new int[] {4, 1, 2}, new int[] {1, 3, 4, 2})) {
			System.out.print(aux + " ");
		}
		
		

	}

}
