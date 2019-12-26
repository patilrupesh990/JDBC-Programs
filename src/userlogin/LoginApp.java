package userlogin;

import com.bridgelabz.util.Utility;

public class LoginApp 
{
	static LoginImplementation login;
	static RegisterImplementation register;
	static ForgotPassword forgot;
	public static void start()
	{
		System.out.println("1.Login 2.Register 3.Forgot Password??");
		int choice=Utility.InputInt();
		
		switch (choice) {
		case 1:
			login=new LoginImplementation();
			login.getLoginData();
			login.Authentication();
			break;
		case 2:
			register=new RegisterImplementation();
			register.getUserData();
			register.Register();
			break;
		case 3:
				forgot=new ForgotPassword();
				forgot.getData();
				forgot.restPassword();
		default:
			try {
				throw new LoginException("Invalid Choice:");
			} catch (LoginException e) {
			}
		}
		
	}
}
