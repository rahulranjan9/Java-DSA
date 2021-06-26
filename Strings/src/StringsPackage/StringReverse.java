package StringsPackage;

public class StringReverse {

	public static void main(String[] args) {
		String input = "Rahul is a good boy.";
		char[] tempArr = input.toCharArray();
		
		int right = input.length()-1;
		
		for(int left=0;left<right;left++)
		{
			char temp = tempArr[left];
			tempArr[left] = tempArr[right];
			tempArr[right] = temp;
			right--;
		}
		
		
		//using StringBuffer class and method
//		StringBuffer sb = new StringBuffer("Geeks For Geeks");
//		sb.reverse();
//		
//		System.out.println(sb);
		
		for(char c : tempArr)
		{
			System.out.print(c);
		}
		
		

	}

}
