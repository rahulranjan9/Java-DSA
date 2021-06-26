package parameterPassingTechnique;

class Check
{
	public static void Example(int a,int b)
	{
		a++;
		b++;
	}
}

public class CallByValue {

	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		
		Check obj=new Check();
		
		System.out.println("value of x " + x + " and y " +y+".");
		
		obj.Example(x,y);
		
		System.out.println("value of x " + x + " and y " +y+".");
	}

}
