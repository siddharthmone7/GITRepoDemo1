package JDBCjavaLearning;
import java.sql.*;



public class Demo {

	public static void main(String[] args) throws Exception 
	{
		String url = "jdbc:mysql://localhost:3306/aliens";
		String uname = "root";
		String pass = "root";
		
//		String query = "select sname from student where rollno=3"; //dql
//		String query1 = "select * from student"; //dql
//		String query2 = "insert into student values (4,'Siddharth')"; //dml
		int rollno = 6;
		String sname = "shiva";
//		String query3 = "insert into student values (" +rollno +",'" +sname +"')"; //dml
		String query4 = "insert into student values (?,?)"; //dml
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
//		Statement st = con.createStatement();		
		PreparedStatement pst = con.prepareStatement(query4);
		pst.setInt(1, rollno);
		pst.setString(2, sname);
	//	ResultSet rs = st.executeQuery(query);
		//ddl - data defination lang used for defining data structure like making table etc; 
		// dml -  data manuplation language - used for manupilating data for inserting values or rows or coloumns ;
		// dql -data query lang = view data or query to retrive data
		
		//dml
		// int count = st.executeUpdate(query3);
		int count1 = pst.executeUpdate();
		System.out.println(count1 + " row/s affected. ");
		
		//dql
//		ResultSet rs1 = st.executeQuery(query1);		
////		rs.next();
////	    String printRS = rs.getString("sname");		
//		String printRS1 = "";
//	    while(rs1.next())
//	    {
//	    printRS1 =rs1.getInt(1) + " : " + rs1.getString(2);		
//		System.out.println(printRS1);
//		}
		
		pst.close();
		con.close();
		
	}

}
