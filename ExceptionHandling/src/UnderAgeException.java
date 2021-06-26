
public class UnderAgeException extends RuntimeException 
{
	public UnderAgeException() 
	{
		super("U r under age.");
	}
	
	public UnderAgeException(String msg)
	{
		super(msg);
	}
}

class Voting
{
	public static void main(String  args[])
	{
		int age=16;
		if(age<18)
		{
			throw new UnderAgeException();
		}
		else
		{
			System.out.println("voting successful");
		}
	}
}
