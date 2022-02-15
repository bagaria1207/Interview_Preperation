package linkedList;

public class Main {
	
	static ListNode head;
	
    public static ListNode rotateRight(ListNode head, int k){
        int size = listSize(head);
        k = k % size;
        ListNode afterNodes = head;
        ListNode beforeNodes = head;
        for(int i=0;i<k;i++) {
        	beforeNodes = beforeNodes.next;
        }        
        while(beforeNodes.next != null) {
        	beforeNodes = beforeNodes.next;
        	afterNodes = afterNodes.next;
        }
        beforeNodes.next = head;
        ListNode result = afterNodes.next;
        afterNodes.next = null;
    	return result;
    }
    
	public static ListNode insert(ListNode head, int data) {
		ListNode temp = new ListNode(data);
		temp.next = null;
		
		if(head == null) {
			head = temp;
			return head;
		} else {
			ListNode aux = head;
			while(aux.next != null) {
				aux = aux.next;
			}
			aux.next = temp;
		}
		return head;
	}
	
	public static void printList(ListNode head) {
		ListNode temp = head;
		while(temp != null) {
			if(temp.next == null) {
				System.out.print(temp.val);
			}else {
				System.out.print(temp.val + "->");
			}
			temp = temp.next;
		}
	}
	
	public static int listSize(ListNode head) {
		int size = 0;
		ListNode temp = head;
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}
	
	
	public static void main(String[] args) {
		
		head = insert(head, 1);
		head = insert(head, 2);
		head = insert(head, 3);
		head = insert(head, 4);
		head = insert(head, 5);
		
		System.out.println(listSize(head));
		printList(rotateRight(head, 3));
	}

}