package important_questions;

public class Rain_Water_Trapping {
	
//	Creating LeftMax and RightMax and then calculating Trapped Water
	public static int trappedWaterApproach1(int[] nums) {
		int[] lMax = new int[nums.length];
		int[] rMax = new int[nums.length];
		//Given Array      -> {2, 1, 3, 1, 0, 2}
		
		//calculating lMax -> {2, 2, 3, 3, 3, 3}
		lMax[0] = nums[0];
		for(int i=1;i<nums.length;i++) {
			if(lMax[i-1] < nums[i]) {
				lMax[i] = nums[i];
			} else {
				lMax[i] = lMax[i-1];
			}
		}
		
		//calculating rMax -> {3, 3, 3, 2, 2, 2}
		rMax[nums.length - 1] = nums[nums.length - 1];
		for(int i=nums.length - 2; i>=0; i--) {
			if(rMax[i + 1] < nums[i]) {
				rMax[i] = nums[i];
			} else {
				rMax[i] = rMax[i+1];
			}
		}

		//Calculate Water Stored
		int water = 0;
		for(int i=1;i<nums.length-1;i++) {
			water += (Math.min(lMax[i], rMax[i]) - nums[i]);
			System.out.println("LMax " + lMax[i] + " RMax " + rMax[i] + " Nums " + nums[i] + " Water " + water + " ");
		}
		return water;
	}
	
//	Two Pointer Approach
	public static int trappedWaterApproach2(int[] nums) {
		int leftMax = nums[0];
		int rightMax = nums[nums.length - 1];
		int water = 0;
		int leftP = 1;
		int rightP = nums.length - 2;
		while(leftP <= rightP) {
			if(leftMax < rightMax) {
				if(nums[leftP] >= leftMax) {
					leftMax = nums[leftP];
				} else {
					water += leftMax - nums[leftP];
				}
				leftP += 1;
			} else {
				if(nums[rightP] >= rightMax) {
					rightMax = nums[rightP];
				} else {
					water += rightMax - nums[rightP];
				}
				rightP -= 1;
			}
		}
		return water;
	}
	public static void main(String[] args) {
		
		System.out.println("Water Stored -> " + trappedWaterApproach1(new int[] {2, 1, 3, 1, 0, 2}));
		System.out.println("Water Stored -> " + trappedWaterApproach1(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
		System.out.println("Water Stored -> " + trappedWaterApproach1(new int[] {4,2,0,3,2,5}));
		System.out.println("Water Stored -> " + trappedWaterApproach2(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
	}

}
