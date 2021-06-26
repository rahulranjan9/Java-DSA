package constructor;

public class Employee 
{
	int empid;
	String name;
	
	Employee()
	{
		System.out.println("no arg constructor");
	}
	
	Employee(String name, int Empid)
	{
		this.empid=empid;
		this.name=name;
		//Employee e3=new Employee();
	}
	public static void main(String args[])
	{
		Employee e1=new Employee("abc", 1);
		Employee e2=new Employee("xyz", 2);
		
		System.out.println(e1.name + " " + e1.empid);
		System.out.println(e2.name + " " + e1.empid);
	}

}
