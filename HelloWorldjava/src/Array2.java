import java.util.Scanner;

public class Array2 
{
	public static void main(String[] args) 
	{
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values");
		int num = sc.nextInt();
		
		String[] arr = new String[num];
		
		System.out.println("Enter values of array");
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.next(); */
		
		
		  int[] arr = {1,2,3,4};
		  int sum = 0;
		  for (int i=0; i<arr.length; i++)
		  {
		      sum = sum + arr[i];
		  }
		  System.out.println(sum);
		  }

}
