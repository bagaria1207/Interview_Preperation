package druva;
/*
 * Input:  {2, 1, -5, 4, -3, 1, -3, 4, -1}
 *	       {4, -1, 2, 1}
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

// {2, 1, -5, 4, -3, 1, -3, 4, -1, 2, 1, -5, 4, -3, 1, -3, 4}
public class Max_Subarray {
	public static List<Integer> largestSum(int[] nums){
		int max_so_far = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		List<Integer> aux_Num = new ArrayList<Integer>();
		for(int i : nums){
			aux_Num.add(i);
		}
		for(int i = 0;i<nums.length-1;i++){
			aux_Num.add(nums[i]);
		}
		System.out.println(aux_Num);
		List<Integer> res = new ArrayList<Integer>();
		Stack<Integer> aux = new Stack<Integer>();
		for(int i=0;i<aux_Num.size();i++){
			if(max_so_far < 0){
				aux.clear();
				max_so_far = aux_Num.get(i);
				aux.push(aux_Num.get(i));
			} else {
				aux.push(aux_Num.get(i));
				System.out.println(aux);
				max_so_far += aux_Num.get(i);
			}
			if(max < max_so_far) {
				max = max_so_far;
			}
		}
		while(!aux.isEmpty()) {
			int a = aux.pop();
			res.add(a);
		}
		return res;
	}
	public static void main(String[] args){
		int[] num = new int[]{2, 1, -5, 4, -3, 1, -3, 4, -1};
		largestSum(num).forEach(i -> System.out.println(i +" " ));
	}
}