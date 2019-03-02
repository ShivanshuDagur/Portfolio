import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class TestConnection {
public static void main(String[] args) {

	try {

		// load driver class
	//	Class.forName("com.mysql.jdbc.Driver");
		
		// get the connection
		Connection conn = DriverManager.getConnection
			("jdbc:mysql://127.0.0.1:3306/sep16","root","root");
		
		// get the statement
		Statement st = conn.createStatement();
		
		// execute sql statement
		st.executeUpdate("create table bookss(id int,topic varchar(40)"
				+ ",author varchar(40),price float,publisher varchar(50))");
		
		
		// close onnection
		conn.close();
	
		System.out.println("huraay");		
	} 
	
	catch (Exception e) {
		System.out.println("error "+e);
	}
	}


}
