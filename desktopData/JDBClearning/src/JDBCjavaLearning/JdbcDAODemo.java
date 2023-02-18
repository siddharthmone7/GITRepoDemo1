package JDBCjavaLearning;
import java.sql.*;

public class JdbcDAODemo {

	public static void main(String[] args) 
	{
		StudentDAO dao = new StudentDAO();
		dao.connect();
		
//		Student s1 = dao.getStudent(4);  // dql
//		System.out.println(s1.sname);
		
		//dml
		Student s2 = new Student();
		s2.rollno = 7;
		s2.sname = "Pari";
		dao.addStudent(s2);
		
	}
}


class StudentDAO
{
	
	Connection con = null;
	
	public void connect()
	{	
		try 
		{
			String url = "jdbc:mysql://localhost:3306/aliens";
			String uname = "root";
			String pass = "root";	
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pass);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Student getStudent(int rNo)
	{	
		try 
		{
			String query = "select sname from student where rollno="+rNo;
					
			Student s = new Student();
			s.rollno = rNo;
			
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString(1);
			s.sname = name;
			return s;
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(e);
		}
		return null;
	}
	
	public void addStudent(Student s)
	{
		String query4 = "insert into student values (?,?)"; //dml
		try 
		{
			PreparedStatement pst = con.prepareStatement(query4);
			pst.setInt(1, s.rollno);
			pst.setString(2, s.sname);
			pst.executeUpdate();
		
		} 
		catch (Exception e) 
		{	
			e.printStackTrace();
		}
	}	
}

class Student
{
	int rollno;
	String sname;
}