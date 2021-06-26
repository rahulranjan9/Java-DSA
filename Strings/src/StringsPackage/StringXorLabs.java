package StringsPackage;

public class StringXorLabs {
	public static void main(String[] args)
	{
		String input = "a dead fox found";
		Solution.sol(input);
	}	
}

class Solution
{
	static void sol(String input)
	{
		String replaced = input.replaceAll("\\s", "");
		
		System.out.println(replaced);
		
		char arr[] = input.toCharArray();
		
		System.out.println(arr);
		
		for(int i=0; i<input.length(); i++)
		{
			for(int j=i+1; j<input.length(); j++)
			{
				if(arr[i] > arr[j])
				{
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] =  temp;
				}
			}			
		}
		System.out.println(arr);
		
		for(int i=0; i<input.length(); i++)
		{
			if(arr[i] >= 'a' || arr[i] <= 'z')
			{
				arr[i] = (char)((int)'a' + (int)'z' - (int)arr[i]);
			}
		}
		System.out.println(arr);
	}
}