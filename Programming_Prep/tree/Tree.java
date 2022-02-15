package tree;

public class Tree {

	
	public Node createBinaryTree(Integer[] arr) {
		return null;
	}
	public static void main(String[] args) {
		
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
		 *  Level Order: 10 6 15 4 3 14 18
		 */
		
		
		Node root = new Node(10);
		root.left = new Node(6);
		root.right = new Node(15);
		root.left.left = new Node(4);
		root.left.right = new Node(3);
		root.right.left = new Node(14);
		root.right.right = new Node(18);
		
		//Traversal
//		TreeTraversals.inOrderTraversalRecursive(root);
//		TreeTraversals.inOrderTraversalIterative(root);
//		TreeTraversals.postOrderTraversalRecursive(root);
//		TreeTraversals.postOrderTraversalIterativeTwoStack(root);
//		TreeTraversals.postOrderTraversalIterativeOneStack(root);
//		TreeTraversals.preOrderTraversal(root);
//		
//		System.out.println("Result : " + TreeTraversals.depthFirstSearchinBINARYTree(root, 14));
//		System.out.println("Result : " + TreeTraversals.depthFirstSearchBST(root, 4));
//		TreeTraversals.breadthFirstSearchinBINARYTree(root);
//		System.out.println("Level : " + TreeTraversals.countLevelsinATree(root));
		
		System.out.println("Result : " + TreeTraversals.rightView(root));
		
	}

}
