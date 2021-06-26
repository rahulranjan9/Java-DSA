package CollectionsPackage;

import java.util.*;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<String> queue= new PriorityQueue<>();
		queue.add("Ram");
		queue.add("Bharat");
		queue.add("Shyam");
		queue.add("Sita");
		queue.add("Laxman");
		
		System.out.println("head "+queue.element());
		System.out.println("peek: "+queue.peek());
		
		Iterator itr = queue.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("added elements : "+ itr.next());
		}
		
		System.out.println(queue.remove());
		System.out.println(queue.poll());
		
		Iterator itr2 = queue.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println("new elements : " + itr2.next());
		}
	}

}
