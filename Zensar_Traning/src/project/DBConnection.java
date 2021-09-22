package project;

import java.sql.*;
import java.sql.SQLException;

public class DBConnection 
{
	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/library_database";
	
	public static final String USER="root";
	public static final String PASS="root";
	static Connection conn=null;
	
	public static Connection getConnection()
	{
		try
		{
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver Loaded.....");
			System.out.println("Connecting to Database.....");
			conn=DriverManager.getConnection(JDBC_URL, USER,PASS);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
			
	
	public static void main(String[] args)
	{
		Connection connection=DBConnection.getConnection();
		if(conn!=null)
		{
			System.out.println("Successfully Connected");
		}
		else
			System.out.println("Unsuccessful");
		// TODO Auto-generated method stub

	}

}
