class abc
{
	abc(ThisConstructorCall tc)
	{
		System.out.println("test class constructor");
	}
}
public class ThisConstructorCall
{
	void m1()
	{
		abc a=new abc(this);    //this keyword is used to pass as an argument in the constructor call
		System.out.println("method m1");
	}
	public static void main(String[] args) 
	{
		ThisConstructorCall tcc=new ThisConstructorCall();
		tcc.m1();

	}

}