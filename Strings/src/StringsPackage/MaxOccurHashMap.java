package StringsPackage;
import java.util.HashMap;
import java.util.Map;

public class MaxOccurHashMap {
	public static void main(String[] args) {
		
		String input = "aaaaaabbbccccddddd";
		Solutions ob = new Solutions();
		ob.sol(input);
	}
}

class Solutions
{
	void sol(String input) 
	{
		HashMap<Character, Integer> hm = new HashMap<>();
	
		char[] ch = input.toCharArray();
		
		for(char c : ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
				hm.put(c, 1);
		}
		
		int maxCount = 0;
		char maxChar = ' ';
		
		for(Map.Entry<Character, Integer> map : hm.entrySet())
		{
			if(maxCount < map.getValue())
			{
				maxCount = map.getValue();
				maxChar = map.getKey();
			}
		}
		System.out.println("maximum occuring character is "+ maxChar);
	}
}
