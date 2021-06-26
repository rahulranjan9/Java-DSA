
class SecondLargestElement {
	public static void main(String[] args) {
		int[] arr = {1,2,4,6,8,5,7,10,10,9,9,9,9,9,9,8}; 
		int size = arr.length;
		
		Solution ob = new Solution();
		ob.sol(arr, size);
	}
}

class Solution
{
	public void sol(int[] arr, int size)
	{
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=1; i<size; i++)
		{
			if(arr[i] > largest)
			{
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondLargest && arr[i] != largest)
			{
				secondLargest =arr[i];
			}
		}
		System.out.println(secondLargest);
	}
}