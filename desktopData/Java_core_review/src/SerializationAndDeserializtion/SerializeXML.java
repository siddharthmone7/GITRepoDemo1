package SerializationAndDeserializtion;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeXML
{

	public static void main(String[] args) 
	{
		
		try 
		{
			Student st1 = new Student();
			st1.setRollno(101);
			st1.setSname("Sid");
			
			Student st2 = new Student();
			st2.setRollno(102);
			st2.setSname("Laverne");
			
			List<Student> s = new ArrayList<Student>();
			s.add(st1);
			s.add(st2);
			
			College c = new College();
			c.setStudent(s);
			
			
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
			x.writeObject(c);
			x.close();			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
	}

}
