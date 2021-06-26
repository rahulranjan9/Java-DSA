package StringsPackage;

public class Anagrams1 {

	public static void main(String[] args) {
		String s1 = "silent#@";
		String s2 = "listen@#";
		
		boolean isAnagram = true;
		
		int arr1[] =new int[256];
//		int arr2[] =new int[256];
		
		
		//Method 1
//		for(char c : s1.toCharArray())
//		{
//			int index = (int) c;
//			arr1[index]++; 
//		}
//		
//		for(char c : s2.toCharArray())
//		{
//			int index = (int) c;
//			arr2[index]++; 
//		}
//		
//		for(int i=0;i<256;i++)
//		{
//			if(arr1[i] != arr2[i])
//			{
//				isAnagram = false;
//				break;
//			}
//		}
		
		
		//Method 2
		for(char c : s1.toCharArray())
		{
			int index = (int) c;
			arr1[index]++; 
		}
		
		for(char c : s2.toCharArray())
		{
			int index = (int) c;
			arr1[index]--; 
		}
		
		for(int i=0;i<256;i++)
		{
			if(arr1[i] != 0)
			{
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not anagram");
	}

}
