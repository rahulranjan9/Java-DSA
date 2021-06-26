
public class ThisDemo 
{
	
	void display()
	{
		System.out.println("Hello");
	}
	
	void show()
	{
		this.display();    //this method can be used to invoke(call) current class(implicitly) 
	}
	
	public static void main(String[] args) 
	{
		ThisDemo td= new ThisDemo();
		td.show();
		

	}

}
