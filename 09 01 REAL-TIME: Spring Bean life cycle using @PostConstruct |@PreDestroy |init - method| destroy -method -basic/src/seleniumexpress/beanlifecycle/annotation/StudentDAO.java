package seleniumexpress.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO 
{
	
	private String driver = "com.mysql.jdbc.Driver";	
	private String url = "jdbc:mysql://localhost:3306/esnew";
	private String userName = "root";
	private String password = "root";
	
	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		//load driver
		Class.forName(driver);
		
		//get a connection
		Connection con = DriverManager.getConnection(url, userName, password);
		
		//execute query
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM esnew.hostelstudentinfo;");
		
		while(rs.next())
		{
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			double hostelFees = rs.getDouble(3);
			String foodType = rs.getString(4);
			
			System.out.println(studentId+" "+studentName+" "+hostelFees+" "+foodType);
		}
		
		
	}
	
	public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException
	{
		//load driver
		Class.forName(driver);
		
		//get a connection
		Connection con = DriverManager.getConnection(url, userName, password);
		
		//execute query
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("delete FROM esnew.hostelstudentinfo where Student_id = "+studentId);
		
		System.out.println("Record deleted with the id: "+studentId);
		
	}

}
