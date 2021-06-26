import java.util.*;

public class StudentComparable1 implements Comparable<StudentComparable1> 
{
	int roll;
	String name;
	int age;
	
	public StudentComparable1(int roll, String name, int age)
	{
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(StudentComparable1 s)
	{
		if(age==s.age)
			return 0;
		else if(name==s.name)
			return 1;
		else
			return -1;
	}
	
}


class Test
{
	public static void main(String[] args) {
		ArrayList<StudentComparable1> list = new ArrayList<> ();
		list.add(new StudentComparable1(101,"Rahul", 22));
		list.add(new StudentComparable1(102,"Ram", 23));
		list.add(new StudentComparable1(103,"Sita", 24));
		
		Collections.sort(list);
		
		for(StudentComparable1 st : list)
		{
			System.out.println(st.roll +" "+st.name+" "+ st.age);
		}
	}
}
