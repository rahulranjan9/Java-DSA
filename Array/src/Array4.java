import java.util.*;

public class Array4 {

	public static void main(String[] args) {
		int i;
			    
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();    
		int[] a = new int[n];    
		int sum=0;
			    
		for(i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
			
		System.out.println(sum);
		sc.close();
	}
		
}
