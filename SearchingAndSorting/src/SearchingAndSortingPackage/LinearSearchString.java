package SearchingAndSortingPackage;

public class LinearSearchString {

	public static void main(String[] args) {
		String[] str = {"rahul", "kumar", "ranjan", "abc", "xyz"};
		String item = "xyz";
		int temp = 0;
		for(int i=0;i<str.length;i++)
		{
			if(item.equals(str[i]))
			{
				System.out.println("Element is found on "+ i+ " index.");
				temp = temp+1;
			}
		}
		if(temp == 0) {
			System.out.println("Element is not found.");
		}
	}

}
