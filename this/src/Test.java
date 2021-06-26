
public class Test {
	
	int i;
	
	void setValue(int i)
	{
		this.i=i;     //if local and instance variable is same then in that case  
	}              // this keyword is used to refer the current class instance var.
	
	void show()
	{
		System.out.println(i);
	}
	
	public static void main(String args[])
	{
		Test t=new Test();
		t.setValue(10);
		t.show();
	}
}
