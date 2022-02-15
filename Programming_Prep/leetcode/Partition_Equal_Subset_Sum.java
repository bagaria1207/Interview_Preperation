package leetcode;

public class Partition_Equal_Subset_Sum {

    public static boolean helper(int target, int i, int[] nums){
        if(target == 0){
            return true;
        }
        if(i>= nums.length || target < 0){
            return false;
        }
        boolean including_ith = helper(target-nums[i], i+1, nums);
        boolean excluding_ith = helper(target, i+1, nums);
        
        return including_ith || excluding_ith;
    }
    
    public static boolean canPartition(int[] nums) {
        int target = 0;
        for(int i : nums){
            target += i;
        }
        if(target % 2 != 0){
            return false;
        }
        return helper(target/2, 0, nums);
    }
	public static void main(String[] args) {
		
		System.out.println(canPartition(new int[] {1,5,11,5}));
		
	}

}
