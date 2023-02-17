package SerializationAndDeserializtion;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class DeserializeXML {

	public static void main(String[] args) 
	{
		try 
		{
			XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("myCollege.xml")));
			
			College c = (College)x.readObject();
			
			List<Student> s = c.getStudent();
			
			for (Student values : s)
			{
				System.out.println(values);
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

}
