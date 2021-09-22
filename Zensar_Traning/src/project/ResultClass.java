package project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.sql.CallableStatement;
import java.sql.ResultSetMetaData;

public class ResultClass {
	Connection con;                                                  
	ResultSet rs;
	Statement st;
	PreparedStatement pst;


	public ResultClass() throws SQLException
	{
	
		con = DBConnection.getConnection();
		
		st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs = st.executeQuery("select * from books");
	}
	
	public void bookdetails() throws SQLException
	{
		rs.beforeFirst();
		System.out.println("*********************************************");

		System.out.println("Book_id" +"\t\t"+"book_name"+"\t\t"+"Book_Price");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3));
		}
	}
	
	public void bookDetailsReverseOrder() throws SQLException
	{
		System.out.println("*********************************************");
		System.out.println("********Reverse Order Of Books Tables********");
		System.out.println("*********************************************");
		System.out.println("Book_id" +"\t\t"+"book_name"+"\t\t"+"Book_Price");	
		System.out.println("__________________________________________________");
		rs.afterLast();
		while(rs.previous())
		{
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3));
		}
		
		
	}
	
	
	
	public static void main(String[] args) throws SQLException
	{
		ResultClass robj = new ResultClass();
		robj.bookdetails();
		robj.bookDetailsReverseOrder();
	}
}
