package amazon;

public class HouseRobber {
	/*At each house we have the choice of robbing it or leaving it.
	 
	case 1 – if we pick last house:
	then, we can't pick (n-1) house, hence f(n)= An + f(n-2)
	
	case 2 – if we leave last house:
	then, we will stick with the max profit till (n-1) house, hence f(n)= f(n-1)

	Let us see base cases.
	n = 0, clearly f(0) = A0.
	n = 1, then f(1) = max(A0, A1).

	Hence we can summarize the formula as following :
	f(n)= max( An + f(n-2) , f(n-1) )
	
	*/
	
	
    public static int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);
        
        for(int i=2;i<nums.length;i++){
            arr[i] = Math.max(nums[i] + arr[i-2], arr[i-1]);
        }
        return arr[nums.length-1];
    }
    
	public static void main(String[] args) {
		
		System.out.println(rob(new int[] {2, 1, 1, 4}));

	}

}
