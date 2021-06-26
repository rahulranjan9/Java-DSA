package CollectionsPackage;

import java.util.*;

public class Dequeqe1 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();	
		deque.add("Hare");
		deque.add("Rama");
		deque.add("Krishna");
		deque.add("Hanuman");
		
		for(String s : deque)
		{
			System.out.println(s);
		}
		
	}

}
