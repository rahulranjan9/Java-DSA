package arrayPackage;

public class TripletIsZero {
	
	static void triplet(int[] arr, int n)
	{
		//time complexity O(n^2)
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k] == 0)
					{
						System.out.print(arr[i]+" ");
						
						System.out.print(arr[j]+" ");
						System.out.println(arr[k]+" ");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {0,-1,2,-3,1};
		int n =arr.length;
		 triplet(arr, n);

	}

}
