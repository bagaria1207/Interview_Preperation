package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
* Output: [[1,6],[8,10],[15,18]]
* Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
*/

public class Merge_Interval {
	public static int[][] mergeInterval(int[][] arr) {
		if(arr.length <= 1) {
			return arr;
		}
		
		Arrays.sort(arr, (num1, num2) -> Integer.compare(num1[0], num2[0]));
		List<int[]> result = new ArrayList<>();
		int[] oldInterval = arr[0];
		result.add(oldInterval);
		for(int[] newInterval : arr) {
			if(newInterval[0] <= oldInterval[1]) {
				oldInterval[1] = Math.max(oldInterval[1], newInterval[1]);
			} else {
				oldInterval = newInterval;
				System.out.println("OldInterval " + oldInterval[0] + " " + oldInterval[1]);
				result.add(oldInterval);
			}
		}
		
		return result.toArray(new int[result.size()][]);
	}
	public static void main(String[] args) {
		
		int[][] result = mergeInterval(new int[][] {{1, 3},
												    {2, 6},
												    {8, 10},
												    {15, 18}});
		for(int[] i : result) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
