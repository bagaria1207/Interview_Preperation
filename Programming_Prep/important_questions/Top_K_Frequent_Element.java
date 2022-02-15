package important_questions;

import java.util.HashMap;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Map;

public class Top_K_Frequent_Element {
	
    public static int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length){
            return nums;
        }
        
        //Creating Frequency Map O(N) time
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n: nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        System.out.println("Map " + freq);
        
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> freq.get(n1) - freq.get(n2));
        for(int n: freq.keySet()){
            heap.add(n);
            System.out.println("Before " + heap);
            if(heap.size() > k){
            	System.out.println("After " + heap);
                heap.poll();
            }
        }  
        System.out.println(heap);
        
        int[] res = new int[k];
        for(int i=k-1;i>=0;i--){
            res[i] = heap.poll();
        }
        return res;
    }
	
	public static void main(String[] args) {

		int[] res = topKFrequent(new int[] {4,1,-1,2,-1,2,3}, 2);
		
		for(int aux : res) {
			System.out.print(aux + " ");
		}

	}

}