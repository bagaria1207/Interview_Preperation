package important_questions;

import java.util.List;
import java.util.ArrayList;

public class Combination {
	
	/*----------------------------------------------------------------------------------------------------*/
	//Recursive Approach
	static List<List<Integer>> res = new ArrayList<>();
	
	public static void backTrack(int i, int k, int n, List<Integer> curr) {
		if(curr.size() == k) {
			res.add(new ArrayList<>(curr));
		}
		for(int j=i;j<=n;j++) {
			curr.add(j);
			backTrack(j+1, k, n, curr);
			curr.remove(curr.size() - 1);
		}
	}
	
	public static List<List<Integer>> combine(int n, int k){
		List<Integer> curr = new ArrayList<>();
		backTrack(1, k, n, curr);
		return res;
	}
	
	/*----------------------------------------------------------------------------------------------------*/
	// Iterative Approach
    public static List<List<Integer>> combineIterative(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (k > n || k < 0) {
            return result;
        }
        if (k == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        }
        result = combineIterative(n - 1, k - 1);
        for (List<Integer> list : result) {
            list.add(n);
        }
        result.addAll(combineIterative(n - 1, k));
        return result;
    }
	
	public static void main(String[] args) {
		
		combineIterative(4, 3).forEach(aux -> {
			aux.forEach(i -> System.out.print(i + " "));
			System.out.println();
		});
		
		/*combine(4, 3).forEach(aux -> {
			aux.forEach(i -> System.out.print(i + " "));
			System.out.println();
		});*/
		
	}

}
