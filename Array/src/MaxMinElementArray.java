
public class MaxMinElementArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {8,6,36,345,5,34};
		solution(arr,6);
	}
	static void solution(int arr[], int size)
	{
		int max=arr[0];
		
		for(int i=1;i<size;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				
			}
		}
		System.out.print(max);
	}

}
