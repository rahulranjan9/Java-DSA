package SearchingAndSortingPackage;

public class SelectionSort 
{

	public static void main(String[] args) 
	{
		int[] arr = {4,1,9,2,3,6};
		int n = arr.length;
		sorting(arr,n);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sorting(int[] arr, int n)
	{
		for(int i=0; i<n-1; i++)
		{
			int min = i;
			for(int j=i+1; j<n; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			if(min != i)
			{
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}	
	}
}
