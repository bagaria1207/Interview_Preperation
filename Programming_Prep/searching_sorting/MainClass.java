package searching_sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
//		System.out.println("Result : " + SearchFuntion.binarySearch(new ArrayList<Integer>(Arrays.asList(1, 5, 8, 10, 15, 18, 22, 25, 28, 40)), 28 ));
		
//		System.out.println(SearchFuntion.searchInaSortedArray(new ArrayList<Integer>(Arrays.asList(4,5,6,7,0,1,2)), 0));
		
		int[] nums = new int[] {4,7,1,3,2};
		//SortFunction.bubbleSort(nums);
		//Arrays.stream(nums).forEach(aux -> System.out.print(aux + " "));
		
		SortFunction.insertionSort(nums);
		//Arrays.stream(nums).forEach(aux -> System.out.print(aux + " "));

	}

}
