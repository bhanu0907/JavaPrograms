package program;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		LinkedList q=new LinkedList();
		q.add(1);
		q.offer(2);
		q.add(5);
		q.add(6);
		q.size();
		System.out.println(q);
		System.out.println(q.contains(6));
		//	q.clear();
		//	System.out.println(q.peek());
		//	System.out.println(q.element());


		System.out.println(q.remove(5));	
		System.out.println(q.size());
		
	//	q.remove(3);

//		Iterator ite=q.iterator();
//		while (ite.hasNext()) {
//			System.out.println(ite.next());
//			//q.remove("");
		System.out.println(q);
	}
		}
	
		
	
