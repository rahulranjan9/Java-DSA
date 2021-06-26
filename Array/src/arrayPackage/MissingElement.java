package arrayPackage;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6};
		int n = arr.length;
		
		int miss=missing(arr,n);
		System.out.println(miss);
	}
	static int missing(int[] arr,int n)
	{
//		int count = 11;
//		for(int i=0;i<n;i++)
//		{
//			if(count != arr[i])
//			{
//				return count;
//			}
//			count++;
//		}
//		return count;
		
		
//		int num = n+1;
//		
//		int total = num*(num+1)/2;
//		int sum = 0;
//		for(int i=0;i<n;i++)
//		{
//			sum = sum + arr[i];
//		}
//		int res = total-sum;
//		return res;
		
		int xor1 = arr[0];
		
		for(int i=1;i<n;i++)
		{
			xor1 = xor1 ^ arr[i];
		}
		
		int xor2 = 1;
		
		for(int i=2;i<=6;i++)
		{
			xor2 = xor2 ^ i;
		}
		return xor1^xor2;
	}
}
