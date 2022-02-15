package important_questions;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Function {

	/*----------------------------------------------------------------------------------------------------*/
	//Leetcode - 784 : LetterCase Permutation
	public List<String> letterCasePermutation(String s){
		List<String> result = new ArrayList<>();
		if(s.length() == 0) {
			result.add("");
			return result;
		}
		dfs(result, s.toCharArray(), 0, new StringBuilder());
		return result;
	}
	
	private void dfs(List<String> result, char[] arr, int index, StringBuilder aux) {
		if(index == arr.length) {
			result.add(aux.toString());
		} else if(index < arr.length) {
			if(arr[index] >= '0' && arr[index] <= '9') {
				aux.append(arr[index]);
				dfs(result, arr, index + 1, aux);
				aux.deleteCharAt(index);
			} else {
				aux.append(Character.toUpperCase(arr[index]));
				dfs(result, arr, index + 1, aux);
				aux.deleteCharAt(index);
				aux.append(Character.toLowerCase(arr[index]));
				dfs(result, arr, index + 1, aux);
				aux.deleteCharAt(index);
			}
		}
	}
	
	
	/*----------------------------------------------------------------------------------------------------*/
	//LeetCode - 46 : Permutations
	public List<List<Integer>> permutations(int[] input){
		List<List<Integer>> result = new LinkedList<>();
		boolean[] visited = new boolean[input.length];
		dfs(input, result, new LinkedList<>(), visited);
		return result;
	}

	private void dfs(int[] input, List<List<Integer>> res, List<Integer> curr, boolean[] visited) {
		if(curr.size() == input.length) {
			res.add(new LinkedList<>(curr));
			return;
		}
		for(int i=0;i<input.length;i++) {
			if(visited[i] == false) {
				visited[i] = true;
				curr.add(input[i]);
				dfs(input, res, curr, visited);
				curr.remove(curr.size() - 1);
				visited[i] = false;
			} 
		}
	}

	/*----------------------------------------------------------------------------------------------------*/
	//LeetCode - 78 : Subsets 
    List<List<Integer>> output = new ArrayList<>();
    int n;
    
    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        backTrack(0, new ArrayList<Integer>(), nums);
        return output;
    }
    
    private void backTrack(int first, ArrayList<Integer> curr, int[] nums){
    	if(output.containsAll(curr) == false) {
            output.add(new ArrayList<>(curr));
    	}
        for(int i=first;i<n;++i){
            curr.add(nums[i]);
            backTrack(i+1, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }
    
	/*----------------------------------------------------------------------------------------------------*/
    //LeetCode - 90 : Subsets II
    List<List<Integer>> outputSubset2 = new ArrayList<>();
    int nSubset2;
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    	nSubset2 = nums.length;
        Arrays.sort(nums);
        backTrackSubset2(0, new ArrayList<Integer>(), nums);
        return outputSubset2;
    }
    
    private void backTrackSubset2(int first, ArrayList<Integer> curr, int[] nums){
    	outputSubset2.add(new ArrayList<>(curr));

        for(int i=first;i<n;++i){
            if(i > first && nums[i-1] == nums[i]){
                continue;
            }
            curr.add(nums[i]);
            backTrack(i+1, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }

}
