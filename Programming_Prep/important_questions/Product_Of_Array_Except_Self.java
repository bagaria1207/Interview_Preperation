package important_questions;

public class Product_Of_Array_Except_Self {

    public static int[] productExceptSelf(int[] nums) {
        int output[] = new int[nums.length];
        output[0] = 1;
        // left prefix product
        for(int i=1;i<nums.length;i++){
             output[i] = output[i-1] * nums[i-1];
        }
        for(int aux : output) {
        	System.out.print(aux + " ");
        }
        System.out.println();
        int product = 1;
        for(int i=nums.length-1;i>=0;i--){
            output[i] = output[i] * product;
            System.out.println(" I " + i + " " + output[i]);
            product*= nums[i];
        }
        return output;
    }
    
	public static void main(String[] args) {
		for(int aux : productExceptSelf(new int[] {1, 2, 3, 4})) {
			System.out.print(aux + " ");
		}
	}

}
