package searching_sorting;

import java.util.Arrays;

public class SortFunction {

	public static void bubbleSort(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
//	{4,7,1,3,2}
	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j = i - 1;
			while( j >= 0 && arr[j] > temp ) {
				Arrays.stream(arr).forEach(aux -> System.out.print(aux + " "));
				System.out.println();
				System.out.println("While " + i + " " + j + " " + arr[j] + " " + temp);
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			Arrays.stream(arr).forEach(aux -> System.out.print(aux + " "));
			System.out.println("After "+ i);
		}
	}
	
}
