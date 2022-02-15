package tree;

import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversals {

	/*
	 *        10
	 *      /    \
	 *     6      15   
	 *    / \    /  \
	 *   4   3  14  18
	 *  
	 *  Pre-Order  : 10 6 4 3 15 14 18 (BFS)
	 *  In Order   : 4 6 3 10 14 15 18
	 *  Post Order : 4 3 6 14 18 15 10
	 */
	
	/*----------------------------------------------------------------------------------------------------*/

	public static void inOrderTraversalRecursive(Node root) {
		if (root == null) {
			return;
		}
		inOrderTraversalRecursive(root.left);
		System.out.print(root.data + " ");
		inOrderTraversalRecursive(root.right);
	}

	public static void inOrderTraversalIterative(Node root) {
		if(root != null) {
			Stack<Node> visited = new Stack<>();
			Node curr = root;
			while(curr != null || visited.size() > 0) {
				while(curr != null){
					visited.push(curr);
					curr = curr.left;
				}
				curr = visited.pop();
				System.out.print(curr.data + " ");
				curr = curr.right;
				
			}
		}
	}
	
	/*----------------------------------------------------------------------------------------------------*/

	public static void postOrderTraversalRecursive(Node root) {
		if (root == null) {
			return;
		}
		postOrderTraversalRecursive(root.left);
		postOrderTraversalRecursive(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void postOrderTraversalIterativeTwoStack(Node root) {
		if(root != null) {
			Stack<Node> stk1 = new Stack<>();
			Stack<Node> stk2 = new Stack<>();
			stk1.push(root);
			while(!stk1.isEmpty()) {
				Node curr = stk1.pop();
				if(curr.left != null)
					stk1.add(curr.left);
				if(curr.right != null)
					stk1.add(curr.right);
				stk2.add(curr);
			}
			while(!stk2.isEmpty()) {
				System.out.print(stk2.pop().data+ " ");
			}
		}
	}
		
	public static void postOrderTraversalIterativeOneStack(Node root) {
		if(root != null) {
			Stack<Node> visited = new Stack<>();
			Node curr = root;
			while(curr != null || visited.size() > 0) {
				if(curr != null) {
					visited.push(curr);
					curr = curr.left;
				} else {
					Node temp = visited.peek().right;
					if(temp == null) {
						temp = visited.pop();
						System.out.print(temp.data + " ");
						while(!visited.isEmpty() && temp == visited.peek().right) {
							temp = visited.pop();
							System.out.print(temp.data + " ");
						}
					} else {
						curr = temp;
					}
				}
			}
		}
	}

	/*----------------------------------------------------------------------------------------------------*/

	public static void preOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

	// Below method is used to find a element in a Binary Tree
	public static boolean depthFirstSearchinBINARYTree(Node root, int k) {
		if (root != null && root.data != k) {
			Stack<Node> visited = new Stack<>();
			visited.push(root);
			while (!visited.isEmpty()) {
				Node aux = visited.pop();
				if (aux.data == k) {
					return true;
				}
				if (aux.right != null) {
					visited.push(aux.right);
				}
				if (aux.left != null) {
					visited.push(aux.left);
				}
				System.out.print(aux.data + " ");
			}
		}
		return false;
	}

	/*----------------------------------------------------------------------------------------------------*/

	// Below method is used to find a element in a BST
	public static boolean depthFirstSearchBST(Node root, int k) {
		if (root != null) {
			Stack<Node> visited = new Stack<>();
			visited.push(root);
			while (!visited.isEmpty()) {
				Node aux = visited.pop();
				System.out.println(aux.data);
				if (aux.data == k) {
					return true;
				}
				if (aux.data < k && aux.right != null) {
					visited.push(aux.right);
				}
				if (aux.data > k && aux.left != null) {
					visited.push(aux.left);
				}
			}
		}
		return false;
	}
	
	/*----------------------------------------------------------------------------------------------------*/

	public static void breadthFirstSearchinBINARYTree(Node root) {
		if (root != null) {
			Queue<Node> visited = new ArrayDeque<>();
			visited.add(root);
			while (!visited.isEmpty()) {
				Node aux = visited.poll();
				System.out.print(aux.data + " ");
				if (aux.left != null) {
					visited.add(aux.left);
				}
				if (aux.right != null) {
					visited.add(aux.right);
				}

			}
		}
	}
	
	/*----------------------------------------------------------------------------------------------------*/

	public static int countLevelsinATree(Node root) {
		int level = 0;
		if (root != null) {
			Queue<Node> visited = new ArrayDeque<>();
			visited.add(root);
			level = 1;
			while (!visited.isEmpty()) {
				int size = visited.size();
				while(size-- > 0) {
					Node aux = visited.poll();

					if (aux.left != null) {
						visited.add(aux.left);
					}
					if (aux.right != null) {
						visited.add(aux.right);
					}
				}
				level++;
			}
			return level;
		}
		return level;
	}

	/*----------------------------------------------------------------------------------------------------*/

	public static List<Integer> rightView(Node root){
		if(root == null) {
			return null;
		}
		List<Integer> result = new ArrayList<>();
		Queue<Node> visited = new ArrayDeque<>();
		visited.add(root);
		int level = 1;
		while(!visited.isEmpty()) {
			int size = visited.size();
			for(int i=0;i<size;i++) {
				Node aux = visited.poll();
				if(i == size - 1) {
					result.add(aux.data);
				}
				if(aux.left != null) {
					visited.add(aux.left);
				}
				if(aux.right != null) {
					visited.add(aux.right);
				}
			}
			level++;
		}
		return result;
	}
	
	/*----------------------------------------------------------------------------------------------------*/

}
