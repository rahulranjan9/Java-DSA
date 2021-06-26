import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) 
	{
		String str = "geeksforgeeks";
		hashmap2.characterCount(str);
		
	}
}

class hashmap2
{
	static void characterCount(String input)
	{
		HashMap <Character, Integer> h = new HashMap<>();
		char arr[] = input.toCharArray();
		
		for(char c : arr)
		{
			if(h.containsKey(c))
			{
				h.put(c, h.get(c)+1);
			}
			else
				h.put(c, 1);
		}
		
		for(Map.Entry entry : h.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
