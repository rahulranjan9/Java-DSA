
public class ReverseArray1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		reverse(arr, 0, 5);
		System.out.println("Reversed array is : ");
		printArray(arr, 6);
	}
	
	static void reverse(int[] arr, int start, int end)
	{
		while(start<end)
		{
			int temp;
			
			temp=arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start = start+1;
			end = end-1;
		}
	}
	
	static void printArray(int[] arr, int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
