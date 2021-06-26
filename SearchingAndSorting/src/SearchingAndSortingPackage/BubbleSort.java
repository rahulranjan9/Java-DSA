package SearchingAndSortingPackage;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int arr[] = {4,3,6,1,8,2};
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
			boolean swapped = false;
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j+1] < arr[j])
				{
					swapped = true;
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(!swapped)
			{
				break;
			}
		} 
	}
}
