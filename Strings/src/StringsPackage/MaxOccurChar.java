package StringsPackage;

public class MaxOccurChar {
	public static void main(String[] args) {
		String input = "aaaaaaaaaabbdddddddccceeee";
		int size = input.length();
		
		Result ob = new Result();
		ob.sol(input, size);
		
	}
}
class Result
{
	public void sol(String input, int size)
	{
		int[] arr = new int[127];
		
		for(int i=0; i<size; i++)
		{
			arr[input.charAt(i)] = arr[input.charAt(i)] + 1;
		}
		
		int max = -1;
		char c = ' ';
		
		for(int i=0; i<size; i++)
		{
			if(max < arr[input.charAt(i)])
			{
				max = arr[input.charAt(i)];
				c = input.charAt(i);
			}
		}
		
		for(int i=0; i==8; i++)
		{
			
		}
		System.out.println("Maximum occuring character is "+c);
	}
}
