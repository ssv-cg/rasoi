package dbutil;

import java.sql.*;

public class DBConnection {

	public static Connection getConnection()
	{
		Connection conn = null;
		try 
		{
			
			Class.forName("org.postgresql.Driver");
		    conn = DriverManager
		    		.getConnection("jdbc:postgresql://localhost:5432/rasoi","sid","12");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void closeConnection(Connection conn)
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
