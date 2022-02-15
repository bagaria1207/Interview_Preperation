package tree;

public class Node {
	Node left;
	Node right;
	int data;
	Node() {
		this.left = this.right = null;
	}
	Node(int data){
		left = null;
		right = null;
		this.data = data;
	}
	
}
