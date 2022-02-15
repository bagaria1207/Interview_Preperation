package tree;

import java.util.List;
import java.util.ArrayList;

/*
 *        10                        6
 *      /    \                     / \
 *     6      15                  4   3
 *    / \    /  \
 *   4   3  14  18
 *  
 *  Pre-Order  : 10 6 4 3 15 14 18 (BFS)
 *  In Order   : 4 6 3 10 14 15 18
 *  
 *  Pre-Order  : 6 4 3 (BFS)
 *  In Order   : 4 6 3
 *  
 */

public class Tree_SubTree_Of_Another_Tree {

	public static void inOrder(Node root, List<Integer> inOrder) {
		if(root == null) {
			return;
		}
		inOrder(root.left, inOrder);
		inOrder.add(root.data);
		inOrder(root.right, inOrder);
	}
	
	public static void preOrder(Node root, List<Integer> preOrder) {
		if(root == null) {
			return;
		}
		preOrder.add(root.data);
		preOrder(root.left, preOrder);
		preOrder(root.right, preOrder);
	}
	
	public static boolean isSubarray(List<Integer> main, List<Integer> sub) {
		int n = main.size();
		int m = sub.size();
		
		int i = 0;
		int j = 0;
		while(i<n && j<m) {
			if(main.get(i) == sub.get(j)) {
				i++;
				j++;
				if(j==m) {
					return true;
				}
			} else {
				i++;
				j = 0;
			}
		}
		return false;
	}
	
	public static boolean isSubtree(Node root, Node subRoot) {
    	List<Integer> inOrderR1 = new ArrayList<>();
    	List<Integer> inOrderR2 = new ArrayList<>();
    	
    	List<Integer> preOrderR1 = new ArrayList<>();
    	List<Integer> preOrderR2 = new ArrayList<>();
    	
        return (isSubarray(inOrderR1, inOrderR2) && isSubarray(preOrderR1, preOrderR2));
    }
    
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(6);
		root.right = new Node(15);
		root.left.left = new Node(4);
		root.left.right = new Node(3);
		root.right.left = new Node(14);
		root.right.right = new Node(18);
		
		Node root2 = new Node(6);
		root2.left = new Node(4);
		root2.right = new Node(1);
		
		System.out.println(isSubtree(root, root2));

	}

}
