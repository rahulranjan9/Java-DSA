package parameterPassingTechnique;

public class CallByReference 
{
	int a;
	int b;
	
	public CallByReference(int x,int y) {
		a=x;
		b=y;
	}
	
	void ChangeValue(CallByReference object)
	{
		object.a += 100;
		object.b += 200;
	}
}

class Main
{
	public static void main(String args[])
	{
		CallByReference obj=new CallByReference(10, 20);
		
		System.out.println("Value of a " +obj.a+ " and b " +obj.b+".");
		
		obj.ChangeValue(obj);
		
		System.out.println("Value of a " +obj.a+ " and b " +obj.b+".");	
		
	}
}