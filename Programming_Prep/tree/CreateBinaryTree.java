package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *                1
 *               / \
 *              2	3
 *               \   \
 *                5   4
 */

public class CreateBinaryTree {
	private static Node createTree(List<Integer> arr, Node root, int i) {
		if(i >= arr.size()) {
			return root;
		}
		if(arr.get(i) != null) {
			Node temp = new Node(arr.get(i));
			root = temp;
			root.left = createTree(arr, root.left, 2*i+1);
			root.right = createTree(arr, root.right, 2*i+2);
		}
		return root;
	}
	public static void main(String[] args) {
//		"[1,2,3,null,5,null,4]";
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		String[] arr = value.substring(1, value.length()-1).split(",");
		List<Integer> nums = new ArrayList<>();
		for(String ar : arr) {
			if(ar.equalsIgnoreCase("null")) {
				nums.add(null);
			} else {
				nums.add(Integer.parseInt(ar));
			}
		}
		TreeTraversals.rightView(createTree(nums, new Node(), 0)).forEach(aux -> System.out.print(aux + " "));
	}

}
