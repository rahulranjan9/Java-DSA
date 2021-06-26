import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite 
{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}
	
	void writeFile() throws FileNotFoundException
	{
		String s="Hi there";
		FileOutputStream fis = new FileOutputStream("d:/abc.txt");
		
	}
}

class Test
{
	public static void main(String args)
	{
		ReadAndWrite raw= new ReadAndWrite();
		try
		{
			raw.readFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			raw.writeFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
