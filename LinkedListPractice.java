package program;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		link.add(10);
		link.add(20);
		link.add(30);

		System.out.println(link);
		link.addFirst(20);
		link.addLast(30);
		link.add(3, 100);
		System.out.println(link);
		//		LinkedList link_2=new LinkedList();
		//		link_2.add(9);
		//		link_2.add(8);
		//		link.addAll(4, link_2);
		//		System.out.println(link_2);
		//		System.out.println(link);
		//		link_2.add(link);
		//		System.out.println(link_2);
		//		System.out.println(link.element());
		//		System.out.println(link);
		//System.out.println(link.getFirst());	
		//System.out.println(link.getLast());		
		////		link.get(0);
		//System.out.println(link.peekLast());	
		//System.out.println(link.peekFirst());
		//System.out.println(link.poll());	
		//System.out.println(link.pollFirst());	
		//	link.pollLast();
		//	link.removeFirst();
		//	link.removeFirst();
		link.removeLastOccurrence(30);
		link.removeFirstOccurrence(20);
		//	
		System.out.println(link);
		
		Iterator itr= link.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(link);
		System.out.println(link);
	//	Collections.sort(Collections.reverseOrder());
		Collections.shuffle(link);
		System.out.println(link);
		
	}

}
