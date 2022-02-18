package leetcode;

public class Partition_Equal_Subset_Sum {
	
	/*----------------------------------------------------------------------------------------------------*/
	
    public static boolean canPartitionIterative(int[] nums) {
        if(nums == null || nums.length < 2){
            return false;
        }
        int target = 0;
        for(int i : nums){
            target += i;
        }
        if(target % 2 != 0){
            return false;
        }
        target /= 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            for(int j=target;j>=num;j--){
            	System.out.println("dp[j] " + dp[j] + " j " + j + " Target " + target + " num " + num);
                dp[j] = dp[j] || dp[j-num];
            }
        }
        return dp[target];
    }
    
	/*----------------------------------------------------------------------------------------------------*/

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
    
	/*----------------------------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		System.out.println(canPartitionIterative(new int[] {1,2,3}));
	}

}
