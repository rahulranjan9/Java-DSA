


public class Strings1 
{
	public static String reverse(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
	
}

class main
{
	public static void main(String[] args)
	{
		System.out.println(Strings1.reverse("I am string"));
		
	}
}
