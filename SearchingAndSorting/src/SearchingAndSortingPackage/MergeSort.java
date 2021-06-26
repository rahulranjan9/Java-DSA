package SearchingAndSortingPackage;

public class MergeSort 
{
	int[] arr;
	int[] tempMergeArr;
	int length;
	
	public static void main(String[] args) 
	{
		int[] inputArr = {23,12,22,17,18,20,26};
		MergeSort obj = new MergeSort();
		obj.sort(inputArr);
		
		for(int i : inputArr)
		{		 
			System.out.print(i+" ");
		}
	}
	
	
	public void sort(int[] inputArr)
	{
		this.arr = inputArr;
		this.length = inputArr.length;
		this.tempMergeArr = new int[inputArr.length];
		
		divideArray(0, length-1);
	}
	
	
	public void divideArray(int lowerIndex, int higherIndex)
	{
		if(lowerIndex<higherIndex)
		{
			int middleIndex = lowerIndex+(higherIndex-lowerIndex)/2;
			
			//it will divide the left side of an array
			divideArray(lowerIndex, middleIndex);
			
			
			//it will divide the left side of an array
			divideArray(middleIndex+1, higherIndex);
			
			mergeArray(lowerIndex, middleIndex, higherIndex);
		}
	}
	
	
	public void mergeArray(int lowerIndex, int middleIndex, int higherIndex)
	{
		for(int i=lowerIndex; i<=higherIndex; i++)
		{
			tempMergeArr[i] = arr[i];
		}
		
		int i=lowerIndex;
		int j=middleIndex+1;
		int k=lowerIndex;
		
		while(i<=middleIndex && j<=higherIndex)
		{
			if(tempMergeArr[i] <= tempMergeArr[j])
			{
				arr[k] = tempMergeArr[i];
				i++;
			}
			else
			{
				arr[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		
		while(i<=middleIndex)
		{
			arr[k] = tempMergeArr[i];
			k++;
			i++;
		}
		
	}
	
}
