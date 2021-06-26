
public class ThisConstructor 
{
	ThisConstructor() 
	{
		this(100);
		System.out.println("no arg constructor");
	}
	
	ThisConstructor(int i)
	{
		//this();    //this() keyword can be used to invoke current class constructor
		System.out.println("parameterised constructor");
		System.out.println(i);
	}
	
	public static void main(String args[])
	{
		ThisConstructor tc=new ThisConstructor(10);
	}
}
