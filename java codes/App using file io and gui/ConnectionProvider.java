import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider 
{
	public static Connection getConnection() 
	{
		Connection co = null;
		
		try 
		{
			co = DriverManager.getConnection
			 ("jdbc:mysql://localhost:3306/information_schema", 
					 "root", "1234");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace(); // line / cause of exception
		}
		
		return co;
	}
}
