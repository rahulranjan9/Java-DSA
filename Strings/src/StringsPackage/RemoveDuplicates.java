package StringsPackage;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		char[] arr = str.toCharArray();
		int length = str.length();
		
		RemoveDuplicatesSolution obj = new RemoveDuplicatesSolution();
		System.out.println(obj.removeCharacters(arr, length));
	}
}

class RemoveDuplicatesSolution
{
	String removeCharacters(char[] str, int n)
	{
		int index = 0;
		
		for(int i=0; i<n; i++)
		{
			int j;
			for(j=0; j<n; j++)
			{
				if(str[i] == str[j])
				{
					break;
				}
			}
			
			if(i==j)
			{
				str[index++] = str[i];
			}
		}
		
		return String.valueOf(Arrays.copyOf(str, index));
	}
}