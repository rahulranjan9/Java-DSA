package StringsPackage;

public class Anagrams 
{
	public static void main(String[] args) 
	{
		String s1="silent";
		String s2="listen";
		boolean visited[] = new boolean[s2.length()];
		boolean isAnagram = false;
		
		if(s1.length() == s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				isAnagram = false;
				char c1 = s1.charAt(i);
				for(int j=0;j<s2.length();j++)
				{
					if(s2.charAt(j) == c1 && !visited[j])
					{
						visited[j] = true;
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram)
					break;
			}
		}
		
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
