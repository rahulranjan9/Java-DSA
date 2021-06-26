

public class Array3 
{
	    static int print2largest(int arr[], int n) 
	    {
	        
	        int first=Integer.MIN_VALUE;
	        int second=Integer.MIN_VALUE;
	        
	        if(n<2)
	        	return -1;
	        
	        for(int i=0; i<n; i++)
	        {
	            if(arr[i]>first)
	            {
	                second = first;
	                first = arr[i];
	            }
	            if(arr[i]<first && arr[i]>second)
	            {
	                second = arr[i];
	            }
	        }
	        
	        if(second == Integer.MIN_VALUE)
	        	return -1;
	        
	        return second;
	    }
	    
	    public static void main(String args[])
	    {
	    	int[] arr = {1,3,7,5,6,8};
	    	print2largest(arr,6);
	    }
}
