import java.util.Scanner;
public class Array 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		
		int[][] array = {
						{10,20,30,40},
						{1,2,3,4},
						{5,6,7,8}
						};
		System.out.println(array.length);
		
		for(int r=0;r<array.length;r++)
			for(int c=0;c<array[r].length;c++)
			{
				System.out.println(array[r][c]);
			}
		System.out.println();
	}

}
