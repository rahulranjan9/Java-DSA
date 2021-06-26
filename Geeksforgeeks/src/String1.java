
public class String1 {

	public static void main(String[] args) { 
		String s1="Rahul";
		String s2="Nitish";
		
		System.out.println(s2+40+s1+10+20);
		System.out.println(s1.concat(s2));
		System.out.println(String.join("and", s1,s2)); // join is a static method
		
		System.out.println(s1.substring(1,1));
		System.out.println(s1.subSequence(1, 5));
		
		System.out.println(s2.compareTo(s1)); // subtract s1 from s2(takes ascii value)
		System.out.println(s1.compareToIgnoreCase(s2)); //ignore the cases of letters
	}

}
