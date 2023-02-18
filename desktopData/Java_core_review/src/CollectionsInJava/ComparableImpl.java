package CollectionsInJava;

import java.util.*;

public class ComparableImpl 
{
	public static void main(String[] args) 
	{
		List<Student> s1 = new ArrayList<Student>();
		s1.add(new Student(1,64));
		s1.add(new Student(2,42));
		s1.add(new Student(3,98));
		s1.add(new Student(4,73));
		s1.add(new Student(5,86));
	
		Collections.sort(s1);
		
		for(Student s: s1)
		{
			System.out.println(s);
		}
	
	}
}

class Student implements Comparable<Student>
{
	int rollno;
	int marks;
	
	public Student(int rollno, int marks) 
	{
		super();
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student s) {
		
		return this.marks>s.marks?1:this.marks<s.marks?-1:0;
	}
	
	
}