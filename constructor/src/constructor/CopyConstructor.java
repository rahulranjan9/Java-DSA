package constructor;

public class CopyConstructor {
	int id;
	String name;
	
	public CopyConstructor(int i, String s) {
		id=i;
		name=s;
	}
	
	public CopyConstructor(CopyConstructor c) {
		System.out.println(id=c.id);
		name=c.name;
		System.out.println(id+" "+name);
	}
	
	void Display() {
		System.out.println(id +" "+name);
	}
	
	public static void main(String args[]) {
		CopyConstructor cc=new CopyConstructor(1,"Java");
		CopyConstructor cc1=new CopyConstructor(cc);
		
		cc.Display();
		cc1.Display();
		cc1.id=2;
		cc1.name="python";
	}
}
