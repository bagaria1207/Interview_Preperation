package important_questions;

public class Maximum_SubArray {

	public static int maximumSubarray(int[] nums) {
		int max_so_far = nums[0];
		int max = nums[0];
		for(int i=1;i<nums.length;i++) {
    		System.out.println("Max_So_Far " + max_so_far +"\t" + "Max " + max);
			if(max_so_far <= 0) {
				max_so_far = nums[i];
			} else {
				max_so_far += nums[i];
			}
			if(max_so_far >= max) {
				max = max_so_far;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println(maximumSubarray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
//		System.out.println(maximumSubarray(new int[] {5,4,-1,7,8}));
	}

}
