package SearchingAndSortingPackage;

public class QuickSorting 
{
	static void quickSortSol(int arr[], int low, int high)
	{
		int mid = (low+high)/2;
		int pivot = arr[mid];
		int i = low;
		int j = high;
		
		while(i<=j)
		{
			while(arr[i] < pivot)
				i++;
			
			while(arr[j] > pivot)
				j--;
			
			if(i <= j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if(low < j)
			quickSortSol(arr, low, j);
		
		if(high > i)
			quickSortSol(arr, i, high);
	}
	
	
	public static void main(String[] args) 
	{ 
		int[] arr = {2,7,5,9,1,10,8};
		System.out.println("Before Sorting...");
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		quickSortSol(arr, 0, arr.length-1);
		
		System.out.println('\n' + "After sorting...");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}
