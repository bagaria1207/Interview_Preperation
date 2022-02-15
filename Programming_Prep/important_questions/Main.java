package important_questions;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Function function = new Function();
		
		
		List<List<Integer>> resultPermutation = function.permutations(new int[] {1, 2, 3, 4});
		
		resultPermutation.forEach(
				(aux) -> {
					aux.forEach(i -> System.out.print(i+ " "));
					System.out.println();
				});
		
		
		/*
		List<List<Integer>> resultSubset = function.subsets(new int[] {1,2,2});
		resultSubset.forEach(
				(aux) -> {
					aux.forEach(i -> System.out.print(i + " "));
					System.out.println();
				});
		*/
		
		/*
		List<String> resultLetterCasePermutation = function.letterCasePermutation("a1b2");
		resultLetterCasePermutation.forEach(aux -> System.out.println(aux));
		*/
	
	}

}
