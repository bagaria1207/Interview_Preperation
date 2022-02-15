package druva;

/*          
 * Input:  {2, 1, -5, 4, -3, 1, -3, 4, -1}
 *         {4, -1, 2, 1}
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Modified_Max_Sum_SubArray {

	public static List<Integer> largestSum(List<Integer> nums){
		int max_so_far = 0;
		int max = Integer.MIN_VALUE;
		int beg = 0;
		int end = 0;
		int aux = 0;
		while(aux < 2*nums.size()) {
			int i = aux % nums.size();
			if(max_so_far < 0){
				max_so_far = nums.get(i);
				beg = i;
			} else {
				max_so_far += nums.get(i);
			}
			if(max < max_so_far) {
				end = i;
				max = max_so_far;
			}
			aux++;
		}
		List<Integer> res = new ArrayList<>();
		if(end < beg) {
			res.addAll(nums.subList(beg, nums.size()));
			res.addAll(nums.subList(0, end + 1));
		} else {
			res.addAll(nums.subList(beg, end + 1));
		}
		System.out.println("Maximum Sum -> " + max);
		return res;
	}
	public static void main(String[] args){
		largestSum(new ArrayList<>(Arrays.asList(2, 1, -5, 4, -3, 1, -3, 4, -1))).forEach(i -> System.out.print(i+ " "));
	}
}
