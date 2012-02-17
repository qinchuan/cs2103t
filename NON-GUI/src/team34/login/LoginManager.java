package team34.login;

import java.util.Hashtable;

public class LoginManager {

	Hashtable<String, UserAccount> userList;
	
	public LoginManager()
	{
		userList=new Hashtable<String, UserAccount>();
		
		
	}
	public boolean verifyPassword(String username, String password)
	{
		UserAccount temp=userList.get(username);
		
		if (temp.getPassword().equals(password))
		{
			return true;
		}
		return false;
	}
	public int getStudentID(String username)
	{
		return userList.get(username).getStudentID();
	}
}
