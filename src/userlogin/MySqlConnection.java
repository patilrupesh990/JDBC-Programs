package userlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection 
{
	private static Connection connection;
	static
	{
		try 
		{
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","1234Rp");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	private MySqlConnection()
	{	 }
	
	public static Connection getConnection()
	{
		return connection;
	}
	
	
}
