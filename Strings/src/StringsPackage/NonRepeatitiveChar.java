package StringsPackage;

public class NonRepeatitiveChar {

	public static void main(String[] args) {
		String input = "geeks";
		boolean visited = false;
		
		for(int i=0; i<input.length();i++)
		{
			for(int j=0;j<input.length();j++)
			{
				if(i!=j && input.charAt(i)!=input.charAt(j))
				{
					System.out.print(input.charAt(j));
					break;
				}
			}
		}

	}

}
