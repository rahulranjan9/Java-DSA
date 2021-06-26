package SearchingAndSortingPackage;

public class BinarySearch {
	public static void main(String[] args) {
	int[] arr = {2,4,6,7,9,10,13,14,16,18,19};	//array should already be sorted before doing binary search   
			  // 0 1 2 3 4 5  6  7  8  9  10    
		int search = 10;
		int li = 0;
		int hi = arr.length - 1;
		int mi = (li + hi)/2;

		while(li <= hi)
		{
			
			if(search == arr[mi])
			{
				System.out.println("Element found on "+mi+ " index.");
				break;
			}
			else if(arr[mi] < search)
			{
				li = mi+1;
			}
			else
			{
				hi = mi-1;
			}
			mi = (li+hi)/2;
		}
		if(li>hi)
			System.out.println("Element not found.");
	} 
}
