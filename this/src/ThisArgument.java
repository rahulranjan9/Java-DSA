
public class ThisArgument 
{
	void m1(ThisArgument td)
	{
		
		System.out.println("im in m1 method");
	}
	
	
	void m2() 
	{
		m1(this);   //this keyword can be used to pass as an argument in the method call
		System.out.println("im in m2 method");
	}
	public static void main(String[] args) {
		ThisArgument ta=new ThisArgument();
		ta.m2();

	}

}
