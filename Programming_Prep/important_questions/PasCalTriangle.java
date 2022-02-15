package important_questions;

import java.util.List;
import java.util.ArrayList;

public class PasCalTriangle {
		
	
	/*  	        	1    
	 *	 			1		1
	 * 			1		2		1
	 *		 1		3		3		1
	 *	 1		4		6		4		1		
	*/
	
	private static List<List<Integer>> pasCalTriangle(int numRow){
		List<List<Integer>> result = new ArrayList<>();
		for(int i=0;i<numRow;i++) {
			List<Integer> aux = new ArrayList<>();
			for(int j=0;j<=i;j++) {
				if(i==j || j==0) {
					aux.add(1);
				} else {
					aux.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
				}
			}
			result.add(aux);
		}
		return result;
	}
	
	public static List<Integer> getRow(int rowIndex){
		List<List<Integer>> result = pasCalTriangle(rowIndex+1);
		return result.get(result.size() - 1);
	}
	
	public static void main(String[] args) {
		/*
		pasCalTriangle(5).forEach(aux -> {
			aux.forEach(i -> System.out.print(i + " "));
			System.out.println();
		});
		*/
		
		getRow(3).forEach(aux -> System.out.print(aux + " "));

	}

}
