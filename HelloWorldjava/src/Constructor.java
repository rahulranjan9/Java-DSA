
public class Constructor 
{
	int i;
	Constructor(int x)
	{
		i=x;
	}
	
	Constructor()
	{
		System.out.println("default constructor");
	}
	
	public static void main(String args[])
	{
		Constructor c = new Constructor(20);
		
	}

}
