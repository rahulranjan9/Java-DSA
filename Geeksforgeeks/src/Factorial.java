
public class Factorial {
	
	void fact(int input)
	{
		int fact = 1;
		for(int i=1; i<=input; i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		new Factorial().fact(5);
	}
}
