package searching_sorting;

import java.util.List;
public class SearchFuntion {
	
	//Works on Sorted Array
	public static boolean binarySearch(List<Integer> array, int k) {
		int beg = 0;
		int end = array.size() - 1;

		while(beg <= end) {
			int mid = beg + (end - beg) / 2;
			System.out.println(" Mid : " + mid + " Beg : " + beg + " End : " + end);
			if(array.get(mid) == k) {
				return true;
			} else {
				if(array.get(mid) > k) {
					end = mid - 1;
				} else {
					beg = mid + 1;
				}
			}
		}
		return false;
	}
	
//	(4,5,6,7,0,1,2), 0
	public static int searchInaSortedArray(List<Integer> array, int k) {
		if(array != null) {
			int beg = 0;
			int end = array.size() - 1;
			while(beg <= end) {
				int mid = beg + (end - beg) / 2;
				System.out.println(" Mid : " + mid + " Beg : " + beg + " End : " + end);
				if(array.get(mid) == k) {
					return mid;
				}
				if(array.get(beg) <= array.get(mid)) {
					if(array.get(beg) <= k && k < array.get(mid)) {
						end = mid - 1;
					} else {
						beg = mid + 1;
					}
				} else {
					if(array.get(mid) < k && k <= array.get(end)) {
						beg = mid + 1;
					} else {
						end = mid - 1;
					}
				}
			}
		}
		return -1;
	}
}
