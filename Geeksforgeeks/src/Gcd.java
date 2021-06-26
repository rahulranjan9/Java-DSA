
public class Gcd 
{
	public static void main(String[] args) 
	{
		int a=12, b=15;
		System.out.println(gcdSolution(a, b));

	}
	
	static int gcdSolution(int a, int b)
	{
		if(b==0)
			return a;
		
		return gcdSolution(b,a%b);
	}
}
