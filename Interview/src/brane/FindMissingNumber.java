package brane;

public class FindMissingNumber {

	public static int binarySearch(int nums[], int size) {
		int beg = 0, end = size - 1;
		while(beg <= end) {
			int mid = (beg + end)/2;
			if(nums[mid] != mid + 1 && nums[mid - 1] == mid) {
				return mid+1;
			}
			if(nums[mid] != mid+1) {
				end = mid - 1;
			} else {
				beg = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] test1 = new int[] {1, 2, 3, 4, 6, 7};
		int[] test2 = new int[] {1, 3, 4, 5, 6, 7};
		int[] test3 = new int[] {1, 2, 3, 4, 5, 7};
		System.out.println("Missing Number is : " + binarySearch(test1, test1.length));
		System.out.println("Missing Number is : " + binarySearch(test2, test2.length));
		System.out.println("Missing Number is : " + binarySearch(test3, test3.length));
	}

}
