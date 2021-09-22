package project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.Scanner;
import java.sql.SQLException;

public class DeleteRecord {
	
		static Statement st;
		static ResultSet rs; 
		static Connection con;
		static PreparedStatement pst;
		
		public DeleteRecord()
		{
			con = DBConnection.getConnection();
			System.out.println("Connection Acheived");
		}
		
		public int deleteMember (int i) //throws SQLException
		{
		
			 int r=0;
			try(PreparedStatement pst = con.prepareStatement("delete from member where member_id=?");  	)
			{
				pst.setInt(1,i);						
				 r = pst.executeUpdate();
			    
			   System.out.println(r +   " Record Delete successfully!");
			}
			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
			
			return r;
		}
		
		
		
		public int deleteBook (int i) //throws SQLException
		{
		
			 int r=0;
			try(PreparedStatement pst = con.prepareStatement("delete from books where book_id=?");  	)
			{
				pst.setInt(1,i);						
				 r = pst.executeUpdate();
			    
			   System.out.println(r +   "  Book Delete successfully!");
			}
			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
			
			return r;
		}

		
		public static void main(String[] args) throws SQLException {
			DeleteRecord d = new DeleteRecord();
			  
				//d.deleteMember(12);
				d.deleteBook(53);


		}

	}
	
