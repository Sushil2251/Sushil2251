package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.Scanner;
import java.sql.SQLException;



public class InsertAccess {
	static Statement st;
	static ResultSet rs; 
	static Connection connection;
	static PreparedStatement preparedstatement;
	
	public InsertAccess()
	{
		connection = DBConnection.getConnection();
		System.out.println("Connection Acheived");
	}
	
	
/*	insert in member table*/
	
	
	public int insertRecord(int id, String name ) //throws SQLException
	{
	
		 int r=0;
		try(PreparedStatement preparedstatement = connection.prepareStatement("insert into member values(?,?)");  	)
		{
			preparedstatement.setInt(1,id);
			preparedstatement.setString(2,name);
			 r = preparedstatement.executeUpdate();
		    
		   System.out.println(r + " Rows inserted successfully!");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		return r;
	}
	
	/*	insert in books table*/

	/*public int insertBook(int id, String name,int catid,int price,int authorid ) //throws SQLException
	{
	
		 int r=0;
		try(PreparedStatement preparedstatement = connection.prepareStatement("insert into books values(?,?,?,?,?)");  	)
		{
			preparedstatement.setInt(1,id);
			preparedstatement.setString(2,name);
			preparedstatement.setInt(3,catid);
			preparedstatement.setInt(4,price);
			preparedstatement.setInt(5,authorid);

			 r = preparedstatement.executeUpdate();
		    
		   System.out.println(r + " Book Added successfully!");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		return r;
	}*/
	
	
	
	
	public static void main(String[] args) throws SQLException {
		InsertAccess i = new InsertAccess();
		    //i.insertRecord(11,"Virat");
			i.insertRecord(14,"Sakshi");
		//i.insertBook(55,"Python",201,400,102);

	}

}
