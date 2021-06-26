

class NormalClass
{
	static int a=5;
}
public class StaticClass extends NormalClass {
	public static void main(String[] args) {
		//NormalClass obj1 = new NormalClass();
		//StaticClass obj2 = new StaticClass();
		System.out.println(NormalClass.a);
		System.out.println(StaticClass.a);
	}
}

