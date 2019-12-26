package userlogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.bridgelabz.util.Utility;

public class RegisterImplementation 
{
	static Connection connection=MySqlConnection.getConnection();
	UserDTO register=new UserDTO(); 
	public void Register()
	{
		try {
			PreparedStatement statement=connection.prepareStatement
					("insert into Register values(?,?,?,?,?,?,?,?,?,?)");
			statement.setString(1, register.getfName());
			statement.setString(2, register.getlName());
			statement.setString(3, register.getuName());
			statement.setString(4, register.getAddress());
			statement.setString(5, register.getCity());
			statement.setString(6, register.getState());
			statement.setInt(7, register.getPincode());
			statement.setString(8, register.getPassword());
			statement.setString(9, register.getGender());
			statement.setLong(10, register.getContact());
			int result=statement.executeUpdate();
			if(result>0)
				System.out.println(register.getfName()+register.getlName()+" Your Regisration successfully Done");
			else
			{
				try {
					throw new LoginException(register.getfName()+register.getlName()+" Sorry you could not Register yet! please try Again..");
				} catch (LoginException e) {
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Check your Sql Syntax");
		}
	}
	
	
	
	public void getUserData()
	{
		System.out.println("Enter Your Fisrt Name");
		register.setfName(Utility.InputString());
		System.out.println("Enter Your Last Name");
		register.setlName(Utility.InputString());
		System.out.println("Select Your Gender");
		System.out.println("1.Male 2.female 3.Other");
		int choice=Utility.InputInt();
		if(choice==1)
			register.setGender("Male");
		else if (choice==2)
			register.setGender("Female");	
		else if (choice==3)
			register.setGender("Other");
		else
		{
			try {
				throw new LoginException("Invalid Choice");
			} catch (LoginException e) {
			}
			getUserData();
		} //end if else
		
		System.out.println("Enter Your UserName Name");
		register.setuName(Utility.InputString());
		System.out.println("Enter Your Password Name");
		register.setPassword(Utility.InputString());
		System.out.println("Enter Your Address");
		register.setAddress(Utility.InputString());
		System.out.println("Enter your city");
		register.setCity(Utility.InputString());
		System.out.println("Enter your state");
		register.setState(Utility.InputString());
		System.out.println("Enter your Pincode");
		register.setPincode(Utility.InputInt());
		System.out.println("Enter your Contact/Mobile No.");
		register.setContact(Utility.inputLong());
	}
	
}
