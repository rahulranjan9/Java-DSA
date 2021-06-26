
public class Main 
{
	public static void main(String[] args) {
		First_Thread thread1 = new First_Thread();
		thread1.setName("My_First_Thread");
		thread1.start();
		
		First_Thread thread2 = new First_Thread();
		thread1.setName("My_Second_Thread");
		thread1.start();

	}

}
