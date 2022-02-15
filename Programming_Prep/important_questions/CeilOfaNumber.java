package important_questions;

public class CeilOfaNumber {

	public static int ceilOfaNumber(int[] arr, int target) {
		int beg=0; int end=arr.length - 1;
		while(beg <= end) {
			int mid = (beg + end)/2;
			if(arr[mid] == target || arr[mid] > target && arr[mid-1] < target) {
				return arr[mid];
			}
			if(arr[mid] < target) {
				beg = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
	
    public static int floorOfaNumber(int[] arr, int target) {
        int beg=0; int end=arr.length - 1;
		while(beg <= end) {
			int mid = (beg + end)/2;
			if(arr[mid] == target || arr[mid] < target && arr[mid+1] > target) {
				return arr[mid];
			}
			if(arr[mid] < target) {
				beg = mid + 1;
			} else {
				end = mid - 1;
			}
		}
        return -1;
    }
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 3, 4, 5, 8, 14, 16, 19};
		System.out.println(ceilOfaNumber(arr, 15));
		System.out.println(floorOfaNumber(arr, 13));
		
	}

}
