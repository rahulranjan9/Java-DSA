package SearchingAndSortingPackage;

public class LinearSearchInteger {

	public static void main(String[] args) {
		int[] arr = {2,5,3,7,8,6,9};
		int item = 12;
		int temp=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == item)
			{
				System.out.println("Element is present on the "+i+" index.");
				temp = temp+1;
			}
		}
		if(temp == 0)
			System.out.println("Element not found.");

	}

}
