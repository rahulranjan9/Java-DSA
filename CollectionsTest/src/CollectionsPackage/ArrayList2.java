package CollectionsPackage;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Guava");
		list.add("Strawberry");
		list.add("Chery");
		list.add("Mango");
		list.add("Apple");
		
		Collections.sort(list);
		
		for(String fruit : list)
		{
			System.out.println(fruit);
		}
		
		System.out.println("----------------");
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(9);
		list1.add(5);
		list1.add(4);
		list1.add(8);
		list1.add(7);
		list1.add(2);
		list1.add(11);
		
		System.out.println("list size : "+list.size());
		System.out.println("List1 size : "+list1.size());
		
		Iterator itr=list1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
