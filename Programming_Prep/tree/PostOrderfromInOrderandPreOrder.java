package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import tree.Node;
import java.util.List;


/*
 *        10
 *      /    \
 *     6      15   
 *    / \    /  \
 *   4   3  14  18
 *  
 *  PreOrder   : 10 6 4 3 15 14 18 (DFS)
 *  In Order   : 4 6 3 10 14 15 18
 *  Post Order : 4 3 6 14 18 15 10
 */

public class PostOrderfromInOrderandPreOrder {
	
	Node root;
	static int preIndex = 0;
	
	public static List<List<Node>> breadthFirstSearch(Node root) {
		List<List<Node>> result = new ArrayList<>();
		if(root != null) {
			Queue<Node> visited = new ArrayDeque<>();
			visited.add(root);
			int level = 0;
			while(!visited.isEmpty()) {
				int size = visited.size();
				List<Node> auxRes = new ArrayList<>();
				while(size-- > 0) {
					Node aux = visited.poll();
					auxRes.add(aux);
					if(aux.left != null) {
						visited.add(aux.left);
					}
					if(aux.right != null) {
						visited.add(aux.right);
					}
				}
				result.add(new ArrayList<>(auxRes));
				auxRes.clear();
				level++;
			}
		}
		return result;
	}
	
	Node buildTree(int in[], int pre[], int start, int end) {
		if(start > end) {
			return null;
		}
		
		Node root = new Node(pre[preIndex++]);
		if(start == end) {
			return root;
		}
		
		int aux = search(in, start, end, root.data);
		root.left = buildTree(in, pre, start, aux - 1);
		root.right = buildTree(in, pre, aux + 1, end);
		return root;
	}
	
	int search(int in[], int start, int end, int val) {
		int i;
		for(i = start; i<=end; i++) {
			if(in[i] == val) {
				return i;
			}
		}
		return i;
	}
	
	public static void main(String[] args) {
		
		PostOrderfromInOrderandPreOrder obj = new PostOrderfromInOrderandPreOrder();
		int[] in = new int[] {4,6,3,10,14,15,18};
		int[] pre = new int[] {10,6,4,3,15,14,18};
		
		int len = in.length;
		Node root = obj.buildTree(in, pre, 0, len - 1);
		
		List<List<Node>> result = breadthFirstSearch(root);
		
		int size = result.size();
		for(int i=size-1; i>=0; i--) {
			for(int j=0; j<result.get(i).size(); j++) {
				System.out.print(result.get(i).get(j).data + " ");
			}
		}
	}

}
