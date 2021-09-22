package project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.Scanner;
import java.sql.SQLException;

public class UpdateRecord 
{  	
		static Statement st;
		static ResultSet rs; 
		static Connection con;
		static PreparedStatement pst;

		public UpdateRecord()
		{
			con = DBConnection.getConnection();
			System.out.println("Connection Acheived");
		}
		/*public int updateMember(int id,String name) 
		{
			int r=0;
			try(PreparedStatement pst = con.prepareStatement("update member set member_name = ? "
					+ "where member_id=?");)
			{
				pst.setString(1, name);
				pst.setInt(2, id);
			
			r = pst.executeUpdate();
			
			System.out.println("Number of rows updated : " + r);
			}
			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
		return r;
		}*/
		
		
		public int updateBook(int bookid,String catid) 
		{
			int r=0;
			try(PreparedStatement pst = con.prepareStatement("update books set category_id=?"
					+ "where book_id=?");)
			{
			pst.setString(1, catid);
			//pst.setInt(2, price);
			//pst.setInt(3, authorid);
			pst.setInt(2,bookid);

			r = pst.executeUpdate();
			
			System.out.println("Number of rows updated : " + r);
			}
			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
		return r;
		}
		
		
		
		
		public static void main(String[] args) throws SQLException {
			UpdateRecord d = new UpdateRecord();
			  
				//d.updateMember(12,"Neha");
			d.updateBook(55,"201");

		}
	

	
}