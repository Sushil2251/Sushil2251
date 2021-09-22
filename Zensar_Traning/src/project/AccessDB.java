package project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
//import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccessDB {
	
	static Statement st;
	static ResultSet rs; 
	static Connection con;
	static PreparedStatement pst;
	public AccessDB()
	{
		con = DBConnection.getConnection();
		System.out.println("Connection Acheived");
	}
	public void fetchData() 
	{
		try( Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery("select * from member");	
				)
		{
		System.out.println("member_id"+"\t"+"member_name");
		while(rs.next())
		{	
			int memberid=rs.getInt(1);
			String s = rs.getString(2);
			System.out.println(memberid+"\t"+s+"\t");
		}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) throws SQLException {
		AccessDB o = new AccessDB();
		
		o.fetchData();//Fetching data Select * from query
		
		

	}
}
