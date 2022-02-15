package basic;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(4);
		pq.add(2);
		pq.add(3);
		pq.add(10);
		pq.add(7);
		pq.add(9);
		pq.add(13);
		
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
