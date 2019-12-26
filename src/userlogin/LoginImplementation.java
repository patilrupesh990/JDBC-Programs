package userlogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.util.Utility;

public class LoginImplementation 
{
	static Connection connection=MySqlConnection.getConnection();
	UserDTO register=new UserDTO(); 
	public void getLoginData()
	{
		System.out.println("Enter Your UserName");
		register.setuName(Utility.InputString());
		System.out.println("Enter Your Password");
		register.setPassword(Utility.InputString());
	}
		
	public void Authentication() 
	{
			try 
			{
				PreparedStatement statement=connection.prepareStatement("select * from Register where UserName=? and password=?");
				statement.setString(1, register.getuName());
				statement.setString(2, register.getPassword());
				ResultSet resultset=statement.executeQuery();

				if(resultset.next())
					System.out.println(resultset.getString(1)+" Wellcome..");
				else 
					System.out.println("invalid UserName or password");
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}
}
