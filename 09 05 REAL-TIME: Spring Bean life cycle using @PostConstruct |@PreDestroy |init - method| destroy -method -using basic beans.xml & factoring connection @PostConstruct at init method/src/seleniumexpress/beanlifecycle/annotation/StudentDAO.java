package seleniumexpress.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;

public class StudentDAO 
{
	
	private String driver ;	
	private String url ;
	private String userName;
	private String password;
	
	//my connection obj;
	Connection con;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException
	{
		System.out.println("Create connection with studentDB inside init method");
		createStudentDBConnection();
	}
		
	public void createStudentDBConnection() throws ClassNotFoundException, SQLException
	{
		
		//load driver
		Class.forName(driver);
		
		//get a connection
		con = DriverManager.getConnection(url, userName, password);		
	}
	
	public void closeConnection() throws SQLException
	{
		//closing the connection
		con.close();		
	}

	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		System.out.println("Getting all student data");

		
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

		
		
		//execute query
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("delete FROM esnew.hostelstudentinfo where Student_id = "+studentId);
		
		System.out.println("Record deleted with the id: "+studentId);
		

	}

}
