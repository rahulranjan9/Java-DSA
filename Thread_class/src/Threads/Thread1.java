package Threads;

public class Thread1 extends Thread {
	@Override
	public void run()
	{
		System.out.println("Thread task");
	}
}
class main
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		t1.start();
	}
}
