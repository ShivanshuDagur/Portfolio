import java.util.Scanner;
import java.sql.*;
public class JDBC
{
	public static void main(String args[])
	{
		int roll_no,hindi,english,maths,physics,chemistry,totalMarks=0;
		double percentage=0.0;
		String name,mobileNumber,remark;
		
		Scanner sc = new Scanner(System.in);
		
		//load the driver file by calling the public static void forname(String ClassName)
		class.forName("com.mysql.jdbc.Driver");
		
		//get the connection by calling public static Connection getConnection(String url,String name,String password) method of DriverManager class
		Connection con = DriverManager.getConnection("jdbc:mysql://loacalhost:3306/school","root","root");
		
		//create statement
		Statement Stmt = con.creatStatement();
		
		System.out.println("enter roll number");
		roll_no=sc.nextInt();
		
		System.out.println("enter name");
		name=sc.nextLine();
		
		System.out.println("enter mobile number");
		mobileNumber=sc.next();
	    
		System.out.println("enter marks in maths");
		maths=sc.nextInt();
		
		System.out.println("enter marks in hindi");
		hindi = sc.nextInt();
		
		System.out.println("enter marks in english");
		english=sc.nextInt();
		
		System.out.println("enter marks in physics");
		Physics=sc.nextInt();
		
		System.out.println("enter marks in chemistry");
		chemistry=sc.nextInt();
		
		totalMarks=hindi+english+maths+physics+chemistry;
		
		percentage= (totalMarks/500)*100;
		
		if(percentage<40)
			grade="F";
		else if(percentage>=40 && percentage<=60)
			grade="D";
		else if(percentage>60&& percentage<=80)
		grade="C";
	    else if(percentage>80&&percentage<=90)
			grade="B";
		else if(percentage>90&&percentage<=100)
			grade="A";
		System.out.println("Obtained Grade:"+grade);
		System.out.println("Give Remarks");
		remarks=sc.nextLine();
		
		//execute the query using executeupdate method()
		stmt.executeUpdate("insert into students"+"('"+roll_no+"','"+name+"','"+mobile+"','"+mobile+"','"+hindi+"','"+english+"','"+physics+"','"+chemistry+"','"+maths+"','"+totalMarks+"','"+percentage+"','"+grade+"','"+remark+"');
		con.close();
}
}

		
		
		
		
	
		
		
		