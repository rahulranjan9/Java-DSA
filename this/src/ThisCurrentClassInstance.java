
public class ThisCurrentClassInstance 
{
	ThisCurrentClassInstance m1()
	{
		System.out.println("ThisCurrentClassInstance");
		return this;   //this keyword can be used to return the current class instance from the method
	}
	public static void main(String[] args)
	{
		ThisCurrentClassInstance tcci=new ThisCurrentClassInstance();
		tcci.m1();
	}

}
