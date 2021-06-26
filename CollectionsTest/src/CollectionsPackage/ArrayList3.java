package CollectionsPackage;

import java.util.*;

public class ArrayList3 {
	public static void main(String args[])
	{
		Student s1=new Student(1,"Ram",12);
		Student s2=new Student(2,"Shyam",15);
		Student s3=new Student(3,"Bharat",32);
		
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.roll+"     "+st.name+"     "+st.age);
		}
		
	}
}

class Student
{
	int roll;
	String name;
	int age;
	
	Student(int roll,String name, int age)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
	}
}