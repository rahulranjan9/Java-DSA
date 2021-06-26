package CollectionsPackage;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<> ();
		map.put(110, "monkey");
		map.put(101, "rat");
		map.put(103, "cat");
		map.put(102, "Dog");
		map.put(108, "Elephant");
		
		map.putIfAbsent(104, "horse");
		
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.putAll(map);
		map2.putIfAbsent(null,"");
		
		System.out.println("key"+map.keySet());
		System.out.println("values"+map.values());
		
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+" "+ m.getValue());
		}
	}

}
