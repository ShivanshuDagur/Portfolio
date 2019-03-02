package jdbc;
import java.sql.*;
public class Testingjdbc {
	public static void main(String args[])
	{
		System.out.print("Response 200");
		try
		{
			Class.forName("com.msql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql:"//localhost:3306/school","root","root");
		Statement stmt = con.createStatement();
		System.out.print("Response 200");
		ResultSet rs=stmt.executeQuery("select * from students");  
		  
		con.close();  
	}
	catch(Exception e)
		{System.out.print("error-->"+e);}
	}
	

}
