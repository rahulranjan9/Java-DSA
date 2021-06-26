import java.io.*;
import java.util.*;
public class SmallestPositiveInteger
{
	public static void main(String[] args) throws IOException 
	{
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		while(t>0)
		{
		    int n=ob.nextInt();
		    long[] array= new long[n];
		    for(int i=0;i<n;i++)
		        array[i]=ob.nextLong();
		    
		    Solution sol=new Solution();
		    System.out.println(sol.smallestpositive(array,n));      
		    t--;
		}
	}
}
class Solution { 
    long smallestpositive(long[] array, int n){ 
        Arrays.sort(array);
        
        long res =1;
        
        for (int i = 0; i < n && array[i] <= res; i++)
            res = res + array[i];
        
        return res;
        
        
        
    }
} 

