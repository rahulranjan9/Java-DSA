/*
class Linearsearch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] array = {2,4,6,8,10,12};
		int item = 8;
		int i;
		
		for(i=0; i<array.length; i++)
		{
			if(array[i] == item)
			{
				System.out.println(i);
			}
		}
	}

}
*/


public class Linearsearch
{
	public static void main(String args[])
	{
		int[] arr = {2,4,6,8,10,12};
		int item=8;
		
		int result = search(arr, item);
		if(result == -1)
		{
			System.out.print("item not found");
		}
		else
		{
			System.out.print("item is present on the index position" +result+"");
		}
			
		
		
	}
	
	public static int search(int arr[], int item)
	{
		int i;
		for(i=0; i<arr.length; i++)
		{
			if(arr[i] == item)
				return i;
		}
		return -1;
	}
}