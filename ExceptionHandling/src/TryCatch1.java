
public class TryCatch1 {

	public static void main(String[] args) 
	{
		try
		{
			int a=100, b=0, c=0;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
			
//			System.out.println(e);
//			System.out.println(e.toString());
			
//			System.out.println(e.getMessage());
		}
		System.out.println("hola");
	}

}
